package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 29일
 * 내 용 : 트리의 부모 찾기
 * 		루트 없는 트리가 주어졌을 때, 트리의 루트를 1이라고 정하고 각 노드의 부모를 구하라.
 */
public class Code_11725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
	
		int n = sc.nextInt();
	
		List<Integer>[] list = new ArrayList[n+1];
		
		for(int i=0; i<list.length; ++i) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<n; ++i) {
			int p = sc.nextInt();
			int c = sc.nextInt();
			
			list[c].add(p);
			list[p].add(c);
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
	
		int[] check = new int[n+1];
		int[] parent = new int[n+1];
		parent[1]=0;
		q.add(1);
		
		while(!q.isEmpty()) {
			int x = q.poll();
			for(int y : list[x])
				if(check[y]==0) {
					check[y]=1;
					q.add(y);
					parent[y] = x;
				}
		}
		
		for(int i=2; i<parent.length; ++i)
			System.out.println(parent[i]);
	}
	
}
