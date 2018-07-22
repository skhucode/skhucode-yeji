package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 20일
 * 내 용 : 찍기 N
 * 		자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class Code_2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		num+=1;
		while(num-->1)
			System.out.println(num);
	}

}
