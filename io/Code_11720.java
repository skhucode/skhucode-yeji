package io;


import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 19일
 * 내 용 : 숫자의 합
 * 		N개의 숫자가 공백 없이 쓰여있음. 이 숫자를 모두 합해서 출력하는 프로그램을 작성.
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
