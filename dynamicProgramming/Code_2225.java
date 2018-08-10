package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 10일
 * 내 용 : 합분해
 */
public class Code_2225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String [] s = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		long [][] dp = new long[b+1][a+1];
		
		dp[0][0] = 1;
		
		for(int k=1; k<=b; ++k) { //k번 더하기
			for(int n=0; n<=a; ++n) {
				for(int l=0; l<=n; ++l)
				dp[k][n] += dp[k-1][n-l];
				dp[k][n] %= 1000000000L;
			}
		}
		
		System.out.println(dp[b][a]);
	}

}
