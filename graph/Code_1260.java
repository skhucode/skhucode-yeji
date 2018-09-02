package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * 작성일 : 2018년 08월 27일
 * 내 용 : DFS와 BFS
 */
public class Code_1260 {

	static List<Integer>[] list;
	static int[] check;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		int n = Integer.parseInt(s[0]); //정점의 개수
		int m = Integer.parseInt(s[1]); //간선의 개수
		int v = Integer.parseInt(s[2]); //탐색을 시작하는 정점의 번호
		
		list = (ArrayList<Integer>[])new ArrayList[n+1]; //정점의 개수만큼
		check = new int[n+1];
		//간점 입력
		  for (int i=1; i<=n; i++) {
	         list[i] = new ArrayList<Integer>();
	      }
		
		for(int i=1; i<=m; ++i) {
			String[] a =  br.readLine().split(" ");
			
			int x = Integer.parseInt(a[0]);
			int y = Integer.parseInt(a[1]);
			
			list[x].add(y);
			list[y].add(x);
		}
		
		for(int i=1; i<=n; ++i) {
			Collections.sort(list[i]);
		}
		
		dfs(v);
		System.out.println();
		check = new int[n+1];
		bfs(v);
	}
	
	static Stack<Integer> s = new Stack<Integer>();
	static void dfs(int v) {
		if(check[v]==1)
			return;
		System.out.print(v+" ");
		s.push(v);
		check[v]=1;
		for(int i : list[v])
			if(check[i]==0)
				dfs(i);
	}

	static Queue<Integer> q = new LinkedList<Integer>();
	static void bfs(int v) {
		
		q.add(v);
		check[v]=1;
		while(!q.isEmpty()) {
			int a = q.poll();
			System.out.print(a+" ");
			for(int i : list[a])
				if(check[i]==0) {
					q.add(i);
					check[i]=1;
				}
		}
	}
}
