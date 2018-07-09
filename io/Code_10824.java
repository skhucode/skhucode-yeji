package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준10824 
 * 네 자연수 A, B, C, D가 주어진다. 
 * 이 때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
 * 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 
 * 즉, 20과 30을 붙이면 2030이 된다.
 */
public class Code_10824 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String[] s = input.nextLine().split(" ");
		
		System.out.println(Long.parseLong(s[0]+s[1])+Long.parseLong(s[2]+s[3]));
		
	}
}
