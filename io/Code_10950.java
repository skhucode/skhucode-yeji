package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 19일
 * 내 용 : A+B - 3
 * 		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성.
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
