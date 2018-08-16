package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 25일
 * 내 용 : 조합 0의 개수
 */
public class Code_2004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		long e=0;
		long o=0;
		for(long i=2; i<=n; i*=2) {
			e+=n/i;
		}
		for(long i=2; i<=n-m; i*=2) {
			e-=(n-m)/i;
		}		
		for(long i=2; i<=m; i*=2) {
			e-=m/i;
		}
		
		for(long i=5; i<=n; i*=5) {
			o+=n/i;
		}
		for(long i=5; i<=n-m; i*=5) {
			o-=(n-m)/i;
		}
		for(long i=5; i<=m; i*=5) {
			o-=m/i;
		}
		System.out.println((e>o)?o:e);
	}
}
