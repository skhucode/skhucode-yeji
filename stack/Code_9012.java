package stack;

import java.util.Scanner;
import java.util.Stack;
/*
 * �ۼ��� : 2018�� 07�� 26��
 * �� �� : ��ȣ
 * 		 �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����Ͻÿ�.
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
					if (stack.isEmpty()) { //�ݴ� ��ȣ�� ���� ���
						System.out.println("NO");
						break;
					} else {
						stack.pop();
					}
				}
				if (i == arr.length - 1) { 
					if (!stack.isEmpty()) {//���� ��ȣ�� ���� ���
						System.out.println("NO");
					} else {
						System.out.println("YES");
					}
				}
			}
		}
		
		/* Ʋ�ȴٰ� ������ �ڵ� 
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
