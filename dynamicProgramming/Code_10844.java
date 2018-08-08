package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 03일
 * 내 용 : 쉬운 계단 수
 * 		첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
 */
public class Code_10844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//dp[N][L] = 마지막 수가 L이고, N자리인 계단 수의 개수.
		
		long [][] dp = new long[n+1][10];
		
		//1자리인 계단 수의 개수
		for(int i=1; i<=9; ++i)
			dp[1][i] = 1;
		
		for(int i=2; i<=n; ++i) {
			for(int j=0; j<=9; ++j) {
				if(j==0) {
					dp[i][j] = dp[i-1][j+1];
				}else if(j==9) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
				}
				dp[i][j] %= 1000000000;
			}
		}
		
		long sum=0;
		for(int i=0; i<=9; ++i)
			sum+=dp[n][i];
		
		System.out.println(sum%1000000000);
	}

}
