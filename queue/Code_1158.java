package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;

/*
 * 작성일 : 2018년 07월 27일
 * 내 용 : 조세퍼스 문제
 * 		 조세퍼스 순열을 출력한다.
 */
public class Code_1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<Integer>();
		StringJoiner j = new StringJoiner(", ");
		
		String[] s = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(s[0]);//몇 명
		int m = Integer.parseInt(s[1]);//몇 번째

		for(int i=1; i<=n; ++i) 
			q.add(i);
		
		for(int i=0; i<n-1; ++i) {
			for(int z=0; z<m-1; ++z) {
				q.add(q.poll());
			}
			j.add(String.valueOf(q.poll()));
		}	
		j.add(String.valueOf(q.poll()));
		
		/* while문 사용시 틀렸다고 나옴. >> 이유 : poll횟수를 내가 지정해줬기 때문에
		while(!q.isEmpty()) { 
			q.add(q.poll());
			q.add(q.poll());
			j.add(String.valueOf(q.poll()));
		}
		*/
		
		System.out.println("<"+j.toString()+">");

	}

}
