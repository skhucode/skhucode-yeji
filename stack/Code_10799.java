package stack;

import java.util.Scanner;
import java.util.Stack;
/*
 * 작성일 : 2018년 07월 26일
 * 내 용 : 쇠막대기
 * 		 잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.
 */
public class Code_10799 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		String s = sc.nextLine();
		
		int sum=0;
		
		for(int i=0; i<s.length(); ++i) {
			char c = s.charAt(i);
			if(c=='(') {
				stack.push(i);
			}
			else {
				if(i-stack.peek()==1) { //레이저
					stack.pop();
					sum+=stack.size();
				}
				else {//쇠막대기
					sum++;
					stack.pop();
				}
			}
		}
		System.out.println(sum);
	}
}
