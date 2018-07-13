package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준1000 - 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Code_1000 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a+b);
	}
}
