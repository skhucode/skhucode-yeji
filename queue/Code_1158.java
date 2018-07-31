package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

/*
 * �ۼ��� : 2018�� 07�� 27��
 * �� �� : �����۽� ����
 * 		 �����۽� ������ ����Ѵ�.
 */
public class Code_1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<Integer>();
		StringJoiner j = new StringJoiner(", ");
		
		String[] s = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(s[0]);//�� ��
		int m = Integer.parseInt(s[1]);//�� ��°

		for(int i=1; i<=n; ++i) 
			q.add(i);
		
		for(int i=0; i<n-1; ++i) {
			for(int z=0; z<m-1; ++z) {
				q.add(q.poll());
			}
			j.add(String.valueOf(q.poll()));
		}	
		j.add(String.valueOf(q.poll()));
		
		/* while�� ���� Ʋ�ȴٰ� ����. >> ���� : pollȽ���� ���� ��������� ������
		while(!q.isEmpty()) { 
			q.add(q.poll());
			q.add(q.poll());
			j.add(String.valueOf(q.poll()));
		}
		*/
		
		System.out.println("<"+j.toString()+">");

	}

}
