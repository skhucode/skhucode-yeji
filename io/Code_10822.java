package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준10822 - 문자열 S에 포함되어 있는 자연수의 합을 출력한다.
 */
public class Code_10822 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long sum = 0;
		
		String s = input.nextLine();
		
		String []a = s.split(",");
		
		for(String i : a)
			sum+=Long.parseLong(i);
		
		System.out.println(sum);
	}

}
