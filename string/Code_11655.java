package string;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 30��
 * �� �� : ROT13
 * 		ROT13���� ��ȣȭ�ϴ� ���α׷��� ����� ����
 */
public class Code_11655 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); ++i) {
			char c =  s.charAt(i);
			if(97<=c && c<=122) {
				c = (char) (c+13);
				if(c>122)
					c = (char) ((c-122)+96);
			}else if(65<=c && c<=90) {
				c = (char) (c+13);
				if(c>90)
					c = (char) ((c-90)+64);
			}
			System.out.print(c);
		}
	}
}
