package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 19��
 * �� �� : A+B - 3
 * 		�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_10950 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		while(num-->0) {
			String[] s = br.readLine().split(" ");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
		
		/**
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<num; ++i) {
			String[] s = sc.nextLine().split(" ");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1]));
		}
		***/
		
	}

}
