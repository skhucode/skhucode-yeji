package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 19��
 * �� �� : A+B - 6
 * 		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_10953 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		input.nextLine();
		
		while(num-->0) {
			String[] s = input.nextLine().split(",");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
		
	}

}
