package io;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 23��
 * �� �� : ����� - 2
 * 		ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����(�������� ��������)
 */
public class Code_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
	
		for(int i=1; i<=num; ++i) {
			sb.append("*");
			sb2.append(" ");
		}
		
		for(int i=1; i<=num; ++i) {
			System.out.println(sb2.substring(0, num-i)+sb.substring(0, i));
		}
	}
}
