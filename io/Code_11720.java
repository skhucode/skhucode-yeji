package io;


import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 19��
 * �� �� : ������ ��
 * 		N���� ���ڰ� ���� ���� ��������. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		sc.nextLine();

		String[] s = sc.nextLine().split("");

		for(int i=0; i<s.length; ++i) {
			sum+=Integer.parseInt(s[i]);
		}
		System.out.println(sum);
	}

}
