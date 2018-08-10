package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 09일
 * 내 용 : 계단 오르기
 */
public class Code_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] dp = new int[n][3];
		
		int [] a = new int[n];
		
		for(int i=0; i<n; ++i) {
			a[i] = sc.nextInt();
		}
		
		dp[0][1] = a[0];
		dp[0][2] = a[0];
		dp[1][1] = a[1];
		dp[1][2] = dp[0][1]+a[1];
		//dp[0][1]=dp[0][2] , dp[1][1]=dp[1][2]
		//두 개의 원소값이 같기 때문에 비교할 때  둘 중 하나의 값으로 들어가므로 한 줄씩 생략 가능
		
		for(int i=2; i<n; ++i) {
			dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2]) + a[i];
			dp[i][2] = dp[i-1][1] + a[i];
		}
		
		System.out.println(Math.max(dp[n-1][1], dp[n-1][2]));
	}

}
