package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 13일
 * 내 용 : 최소공배수
 */
public class Code_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a,b,lcm;
		
		while(n-->0) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			lcm = a*b/getGCD(b,a%b);
			//최소공배수 = a * b / 최대공약수
			
			System.out.println(lcm);
		}
	}
	//최대공약수를 구하는 메소드 getGCD - 유클리드 호제법 이용.
	public static int getGCD(int b, int r) {
		if(r==0)
			return b;
		else
			return getGCD(r, b%r);
	}
}
