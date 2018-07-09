package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준11023 - 수 N개가 주어졌을 때, N개의 합을 구하는 프로그램을 작성하시오.
 *
 */
public class Code_11023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		String [] s = input.nextLine().split(" ");
		
		for(String a : s)
			sum+=Integer.parseInt(a);
		
		System.out.println(sum);
			
	}

}
