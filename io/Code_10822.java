package io;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 08��
 * �� �� : ����10822 - ���ڿ� S�� ���ԵǾ� �ִ� �ڿ����� ���� ����Ѵ�.
 */
public class Code_10822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long sum = 0;
		
		String s = input.nextLine();
		
		String []a = s.split(",");
		
		for(String i : a)
			sum+=Long.parseLong(i);
		
		System.out.println(sum);
	}

}
