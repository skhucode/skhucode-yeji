package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 13일
 * 내 용 : GCD(최대공약수) 합
 * 		n개의 수가 주어지면 모든 쌍의 GCD의 합을 출력.
 */
public class Code_9613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0) {
			int x = sc.nextInt();
			
			int[] arr = new int[x];
			
			for(int i=0; i<x; ++i)
				arr[i] = sc.nextInt();
			
			long sum=0; //최대 공약수의 합을 저장하는 변수
			
			int gcd; 
			
			for(int i=0; i<x; ++i) {
				for(int j=i+1; j<x; ++j) {
					gcd = getGCD(arr[j], arr[i]%arr[j]);
					sum+=gcd;
				}
			}
			System.out.println(sum);
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
