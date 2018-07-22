package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 20일
 * 내 용 : 구구단
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성.
 */
public class Code_2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();

		for(int i=1; i<10; ++i) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
