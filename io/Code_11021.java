package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 19��
 * �� �� : A+B - 7
 * 		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int count=1;
		
		input.nextLine();
		
		while(num-->0) {
			String[] s = input.nextLine().split(" ");
			System.out.println("Case #"+(count++)+": "+(Integer.parseInt(s[0])+Integer.parseInt(s[1])));
		}
		
	}

}
