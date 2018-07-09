package collection;

import java.util.Scanner;
import java.util.Stack;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준10828 - 스택 구현.
 */
public class Code_10828 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int num = input.nextInt();
		
		input.nextLine();
		
		for(int i=0; i<num; ++i) {
			String s = input.nextLine();
			String[] arr = s.split(" ");
			if(arr[0].equals("push")){
				stack.push(Integer.parseInt(arr[1]));
			}
			else if(arr[0].equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}
				else {
					int x = stack.pop();
					System.out.println(x);
				}
			}
			else if(arr[0].equals("size")) {
				System.out.println(stack.size());
			}
			else if(arr[0].equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
			else if(arr[0].equals("top")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}
		}
	}

}
