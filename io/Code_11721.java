package io;


import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 19일
 * 내 용 : 열 개씩 끊어 출력하기
 * 		알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성.
 */
public class Code_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
	
		for(int i=0; i<=s.length()/10; ++i) {
			if(i==s.length()/10) {
				System.out.println(s.substring(i*10));
			}else {
				System.out.println(s.substring(i*10, i*10+10));
			}
		}
	}
}