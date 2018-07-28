package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
 * �ۼ��� : 2018�� 07�� 26��
 * �� �� : ������
 * 		 L : Ŀ���� �������� �� ĭ �ű�
 * 		 D : Ŀ���� ���������� �� ĭ �ű�
 *  	 B : Ŀ�� ���ʿ� �ִ� ���ڸ� ������
 *  	 P $ : $��� ���ڸ� Ŀ�� ���ʿ� �߰���
 */
public class Code_1406 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));;
		
		Stack<Character> first = new Stack<Character>(); //Ŀ���� ���� ���ڿ�
		Stack<Character> second = new Stack<Character>(); //Ŀ���� ������ ���ڿ�
		
		String s = br.readLine();
		
		for(int i=0; i<s.length(); ++i) {
			first.push(s.charAt(i));
		}
		
		int num = Integer.parseInt(br.readLine());
	
		while(num-->0) {
			String or = br.readLine();
				
			switch (or.charAt(0)) {
			case 'L':
				if (!first.isEmpty()) 
					second.push(first.pop());
				break;
			case 'D': 
				if (!second.isEmpty())
					first.push(second.pop());	
				break;
			case 'B': 
				if (!first.isEmpty())
					first.pop(); // Ŀ���� ���� ���ڿ� ����
				break;
			case 'P': char p = or.charAt(2);
					  first.push(p);
				break;
			default:
				break;
			}
		}

		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		StringBuilder sb = new StringBuilder();
		
		while(!second.isEmpty()) {
			sb.append(second.pop());
		}
		
		System.out.println(sb);
	}
}
