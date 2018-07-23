package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 8
 */
public class Code_2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = num;
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=1; i<=num; ++i) {
			sb.append("*");
			sb2.append("  ");
		}

		for(int i=1; i<=num; ++i) {
			System.out.println(sb.substring(0, i)+sb2.substring(0, 2*(num-i))+sb.substring(0, i));
			if(i==num) {//마지막까지 별을 찍고 역순으로 별을 찍기위해 while문 돌리기.
				int j=i-1;//4부터시작
				while(num2-->1) {//4부터시작
					System.out.println(sb.substring(0, j)+sb2.substring(0, 2*(num-j))+sb.substring(0, j));
					--j;
				}
			}
		}
	}
}
