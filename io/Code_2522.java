package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 12
 * 		  첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
 */
public class Code_2522 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = num;
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=1; i<=num; ++i) {
			sb.append("*");
			sb2.append(" ");
		}

		for(int i=1; i<=num; ++i) {
			System.out.println(sb2.substring(0,num-i)+sb.substring(0,i));
			if(i==num) { //i==3
				int j=i-1;
				while(num2-->1) {
					System.out.println(sb2.substring(0,num-j)+sb.substring(0,j));
					--j;
				}
			}
		}
	}
}
