package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 20일
 * 내 용 : sum
 *	    1~n까지의 합을 출력한다.
 * */
public class Code_8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println((num*(num+1))/2);
	}

}
