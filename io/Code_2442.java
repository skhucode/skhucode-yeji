package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 5
 * 		첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2*N-1개를 찍는 문제(별은 가운데를 기준으로 대칭)
 */
public class Code_2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=1; i<=num; ++i) {
			sb.append("**");
			sb2.append("  ");
		}

		for(int i=1; i<=num; ++i) {
			System.out.println(sb2.substring(0, num-i)+sb.substring(0, 2*i-1));
		}

	}
}
