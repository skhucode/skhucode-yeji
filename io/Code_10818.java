package io;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 20��
 * �� �� : �ּ�, �ִ�
 * 		N���� ������ �־�����. �� ��, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ�.
 */
public class Code_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<s.length; ++i) {
			int x = Integer.parseInt(s[i]);
			if(x>max) {
				max = x;
			}
			if(x<min) {
				min = x;
			}
		}
		System.out.println(min+" "+max);
	}
}
