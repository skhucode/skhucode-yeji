package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*
 * �ۼ��� : 2018�� 09�� 02��
 * ���� : ���� ����� ����
 */
public class Code_11724 {

	static List<Integer>[] list;
	static int[] check;
	static Stack<Integer> s;
	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //������ ����
		int m = sc.nextInt(); //������ ����
		
		check = new int[n+1];
		s = new Stack<Integer>();
		
		if(m==0) { //������ ������ 0�� ��
			System.out.println(0);
			return;
		}
		
		list = new ArrayList[n+1];
		
		for(int i=0; i<=n; ++i) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=1; i<=m; ++i) {
			int u = sc.nextInt();
			int v = sc.nextInt(); //�� ���� �Է� ����.
			
			list[u].add(v);
			list[v].add(u);//������ �׷���.
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
			if(check[i]==0) { //�湮���� ���� ����
				dfs(i);
			}
		}
	}
	
}
