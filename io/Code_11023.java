package io;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 08��
 * �� �� : ����11023 - �� N���� �־����� ��, N���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 */
public class Code_11023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		String [] s = input.nextLine().split(" ");
		
		for(String a : s)
			sum+=Integer.parseInt(a);
		
		System.out.println(sum);
			
	}

}
