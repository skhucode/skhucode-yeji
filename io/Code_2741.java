package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준2741 - 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class Code_2741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=1; i<=n; ++i) {
			System.out.println(i);
		}
		
		
	}

}
