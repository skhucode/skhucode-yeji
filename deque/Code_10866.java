package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 30일
 * 내 용 : Deque
 */
public class Code_10866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		int num = sc.nextInt()+1;
		
		while(num-->0) {
			String[] or = sc.nextLine().split(" ");
			
			if(or[0].equals("push_front")) {
				deque.offerFirst(Integer.parseInt(or[1]));
			}else if(or[0].equals("push_back")) {
				deque.offerLast(Integer.parseInt(or[1]));
			}else if(or[0].equals("pop_front")) {
				if(deque.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deque.pollFirst());
			}else if(or[0].equals("pop_back")) {
				if(deque.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deque.pollLast());
			}else if(or[0].equals("size")) {
				System.out.println(deque.size());
			}else if(or[0].equals("empty")) {
				if(deque.isEmpty())
					System.out.println("1");
				else
					System.out.println("0");
			}else if(or[0].equals("front")) {
				if(deque.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deque.peekFirst());
			}else if(or[0].equals("back")) {
				if(deque.isEmpty())
					System.out.println("-1");
				else
					System.out.println(deque.peekLast());
			}
		}
	}

}
