package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 08��
 * �� �� : ����10824 
 * �� �ڿ��� A, B, C, D�� �־�����. 
 * �� ��, A�� B�� ���� ���� C�� D�� ���� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �� �� A�� B�� ��ġ�� ���� A�� �ڿ� B�� ���̴� ���� �ǹ��Ѵ�. 
 * ��, 20�� 30�� ���̸� 2030�� �ȴ�.
 */
public class Code_10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Long.parseLong(s[0]+s[1])+Long.parseLong(s[2]+s[3]));
		
	}
}
