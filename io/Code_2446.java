package io;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 별찍기 - 9
 * 		첫째 줄부터 2*N-1번째 줄 까지 차례대로 별을 출력한다.
 */
public class Code_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int num2 = num;
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=1; i<=num; ++i) {
			sb.append("**");
			sb2.append(" ");
		}

		for(int i=num; i>=1; --i) {
			System.out.println(sb2.substring(0, num-i)+sb.substring(0, 2*i-1));
			//i가 감소할수록 공백은 커지고 별은 줄고
			if(i==1) {
				for(int j=i+1; j<=num; ++j) {
					System.out.println(sb2.substring(0, num-j)+sb.substring(0, 2*j-1));
					//j가 증가할수록 공백은 줄고 별은 커지고
				}
			}
		}
	}
}
