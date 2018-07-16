package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준10845 - 큐 구현.
 */
public class Code_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
		
		Deque<Integer> q = new ArrayDeque<Integer>();
		
		int num = input.nextInt();
		
		input.nextLine();
		
		for(int i=0; i<num; ++i) {
			String s = input.nextLine();
			String[] arr = s.split(" ");
			if(arr[0].equals("push")){
				q.add(Integer.parseInt(arr[1]));
			}
			else if(arr[0].equals("pop")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}
				else {
					int x = q.poll();
					System.out.println(x);
				}
			}
			else if(arr[0].equals("size")) {
				System.out.println(q.size());
			}
			else if(arr[0].equals("empty")) {
				if(q.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			else if(arr[0].equals("front")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(q.peek());
				}
			}
			
			else if(arr[0].equals("back")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(q.peekLast());
				}
			}
			
		}
	}

}
