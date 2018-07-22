package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 20일
 * 내 용 : 2007년
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성.
 * */
public class Code_1924 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();

		for(int i=1; i<10; ++i) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}

}
