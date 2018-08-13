package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 13일
 * 내 용 : 최대공약수와 최소공배수
 */
public class Code_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		//입력되는 두 자연수가 10,000이하이므로 두 수를 곱해도(1억) int의 범위(21억)에 포함된다. 
		
		for(int i=0; i<2; ++i) {
			arr[i] = sc.nextInt();
		}
		
		//최대공약수 : 유클리드 호제법 이용.
		int gcd = getGCD(arr[1], arr[0]%arr[1]);
		
		//최소공배수 : 최대공약수 이용.
		int lcm = arr[0]*arr[1]/gcd;

		System.out.println(gcd+"\n"+lcm);
	}

	static int getGCD(int b, int r) {
		if(r==0)
			return b;
		else
			return getGCD(r, b%r);
	}
	
}
