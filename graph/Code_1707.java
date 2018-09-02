package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 02일
 * 내 용 : 이분 그래프
 */
public class Code_1707 {

	static int[] check;
	static List<Integer>[] list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();//테스트 케이스의 개수
		
		while(n-->0) {
			
			int v =  sc.nextInt(); //정점의 개수
			int e =  sc.nextInt(); //간선의 개수
		
			check = new int[v+1];
			list = new ArrayList[v+1];
			
			for(int i=0; i<=v; ++i)
				list[i] = new ArrayList<Integer>();
			
			for(int i=0; i<e; ++i) {
				int u1 = sc.nextInt();
				int u2 = sc.nextInt();
				list[u1].add(u2);
				list[u2].add(u1);
			}	
			
			for(int i=1; i<=v; ++i) {
				if(check[i]==0)
					function(i, 1);
			}
			
			boolean result=true;
			
			for(int i=1; i<=v; ++i) {
				for(int j : list[i])
					if(check[i]==check[j]) {
						result=false;
						break;
					}
			}
			
			System.out.println(result==true?"YES":"NO");
		}
		
	}
	
	static void function(int v, int c) {
		if(check[v]!=0)
			return;
		check[v] = c;
		for(int i : list[v]) {
			if(check[i]==0)
				function(i, 3-c);
		}
	}


}
