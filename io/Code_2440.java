package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 3
 * 		첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 */
public class Code_2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		StringBuilder sb = new StringBuilder();
	
		for(int i=1; i<=num; ++i) {
			sb.append("*");
		}
		
		for(int i=num; i>=1; --i) {
			System.out.println(sb.substring(0, i));
		}
	}
}
