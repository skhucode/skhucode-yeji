package io;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 23��
 * �� �� : ����� - 4
 * 		ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����(�������� �������� ����)
 */
public class Code_2441 {

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
		
		for(int i=num; i>=1; --i) {
			System.out.println(sb2.substring(0, num-i)+sb.substring(0, i));
		}
	}
}
