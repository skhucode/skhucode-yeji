package stack;

import java.util.Scanner;
import java.util.Stack;
/*
 * �ۼ��� : 2018�� 07�� 26��
 * �� �� : �踷���
 * 		 �߷��� ������ �� ������ ��Ÿ���� ������ �� �ٿ� ����Ѵ�.
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
				if(i-stack.peek()==1) { //������
					stack.pop();
					sum+=stack.size();
				}
				else {//�踷���
					sum++;
					stack.pop();
				}
			}
		}
		System.out.println(sum);
	}
}
