package io;


import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 19일
 * 내 용 : A+B - 7
 * 		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성.
 */
public class Code_11021 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int count=1;
		
		input.nextLine();
		
		while(num-->0) {
			String[] s = input.nextLine().split(" ");
			System.out.println("Case #"+(count++)+": "+(Integer.parseInt(s[0])+Integer.parseInt(s[1])));
		}
		
	}

}
