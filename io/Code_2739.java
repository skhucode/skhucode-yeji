package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 20��
 * �� �� : ������
 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();

		for(int i=1; i<10; ++i) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
