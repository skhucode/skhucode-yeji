package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 20��
 * �� �� : sum
 *	    1~n������ ���� ����Ѵ�.
 * */
public class Code_8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println((num*(num+1))/2);
	}

}
