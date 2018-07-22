package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 20일
 * 내 용 : 최소, 최대
 * 		N개의 정수가 주어진다. 이 때, 최솟값과 최댓값을 구하는 프로그램을 작성.
 */
public class Code_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<s.length; ++i) {
			int x = Integer.parseInt(s[i]);
			if(x>max) {
				max = x;
			}
			if(x<min) {
				min = x;
			}
		}
		System.out.println(min+" "+max);
	}
}
