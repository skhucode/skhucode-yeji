package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * 작성일 : 2018년 09월 02일
 * 내용 : 연결 요소의 개수
 */
public class Code_11724 {

	static List<Integer>[] list;
	static int[] check;
	static Stack<Integer> s;
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //정점의 개수
		int m = sc.nextInt(); //간선의 개수
		
		check = new int[n+1];
		s = new Stack<Integer>();
		
		if(m==0) { //간선의 개수가 0일 때
			System.out.println(0);
			return;
		}
		
		list = new ArrayList[n+1];
		
		for(int i=0; i<=n; ++i) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<=m; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt(); //양 끝점 입력 받음.
			
			list[u].add(v);
			list[v].add(u);//무방향 그래프.
		}

		for(int i=1; i<=n; ++i) {
			if(check[i]==0) {
				dfs(i);
				count+=1;
			}
		}
		
		System.out.println(count);
		
	}

	static void dfs(int v) {
		if(check[v]==1)
			return;
		check[v]=1;
		for(int i : list[v]) {
			if(check[i]==0) { //방문하지 않은 정점
				dfs(i);
			}
		}
	}
	
}
