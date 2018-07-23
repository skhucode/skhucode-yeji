package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 16
 */
public class Code_10991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=1; i<=num; ++i) {
			sb.append("* ");
			sb2.append(" ");
		}

		for(int i=1; i<=num; ++i) {
			System.out.println(sb2.substring(0,num-i)+sb.substring(0,2*i-1));

		}
	}
}
