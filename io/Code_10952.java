package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 19��
 * �� �� : A+B - 5
 * 		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()) {
			String[] s = input.nextLine().split(" ");
			if(s[0].equals("0") && s[1].equals("0")) 
				break;
			else {
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
			}
		}
		
	}

}
