package stack;

import java.util.Scanner;
import java.util.Stack;
/*
 * 작성일 : 2018년 07월 26일
 * 내 용 : 괄호
 * 		 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력하시오.
 */
public class Code_9012 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		input.nextLine();
		
		Stack<String> stack = new Stack<String>();
		
		for (int j = 0; j<num; ++j) {
			String[] arr = input.nextLine().split("");
			stack = new Stack<String>();
			for (int i = 0; i < arr.length; ++i) {
				String t = arr[i];

				if (t.equals("(")) { 
					stack.push(t);
				} else {
					if (stack.isEmpty()) { //닫는 괄호가 남는 경우
						System.out.println("NO");
						break;
					} else {
						stack.pop();
					}
				}
				if (i == arr.length - 1) { 
					if (!stack.isEmpty()) {//열린 괄호가 남는 경우
						System.out.println("NO");
					} else {
						System.out.println("YES");
					}
				}
			}
		}
		
		/* 틀렸다고 나오는 코드 
		int cnt=0;
		
		for(int i=0; i<num; ++i) {
			String a = input.nextLine();
			a.trim();
			for(int j=0; j<a.length(); ++j) {
				if(a.charAt(j)=='(') {
					cnt++;
				}
				else {
					cnt--;
				}
			}
			System.out.println(cnt==0?"YES":"NO");
			cnt=0;
		}
		*/
	
	}
}
