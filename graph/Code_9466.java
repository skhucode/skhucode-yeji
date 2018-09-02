package graph;


import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 02일
 * 내 용 : 텀 프로젝트 - 수정 필요
 */
public class Code_9466 {
	
	static int[] a;
	static int[] check;
	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0) {
			int l = sc.nextInt();
			int x=1;
			count = 0;
			a = new int[l+1];
			check = new int[l+1];
			for(int i=1; i<=l; ++i)
				a[i] = sc.nextInt();
			
			for(int i=1; i<=l; ++i) {
				if(check[i]==0) {
					function(i, x);
					x+=1;
				}
			}
			System.out.println(count);
		}
	}
	
	static void function(int v, int dfs) {
		if(check[v]!=0) {
			if(check[a[v]]!=dfs) { //어느 팀에도 속하지 않으면
				count+=1;
			}
			return;
		}
		check[a[v]] = dfs;
		function(a[v], dfs);
	}
	
}


