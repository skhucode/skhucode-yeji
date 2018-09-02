package graph;

import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 02일
 * 내 용 : 순열 사이클
 */
public class Code_10451 {

	static int[] check ;
	static int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0) {
			int x = sc.nextInt();
			
			arr = new int[x+1];
			check = new int[x+1];
			int count = 0;
			
			for(int i=1; i<=x; ++i) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=1; i<=x; ++i) {
				if(check[i]==0) {
					dfs(i);
					count+=1;
				}
			}
			System.out.println(count);
		}
	}
	
	static void dfs(int v) {
		if(check[v]!=0)
			return;
		check[v]=1;
		if(check[arr[v]]==0)
			dfs(arr[v]);
	}

}
