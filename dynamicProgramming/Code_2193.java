package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 03일
 * 내 용 : 이친수
 *    첫째 줄에 N자리 이친수의 개수를 출력한다.
 */
public class Code_2193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		dp = new long[num+1];
		
		dp[1] = 1;
		if(dp.length>3)
			dp[2] = 1;
		for(int i=3; i<dp.length; ++i) {
			dp[i] = dp[i-1]+dp[i-2];
		}
		System.out.println(dp[num]);
		
		/*
		dp[0][0]=0;
		dp[0][1]=1;
		for(int i=1; i<dp.length; ++i) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1];
			dp[i][1] = dp[i-1][0];		
		}
		System.out.println(dp[num-1][0]+dp[num-1][1]);
		*/
		
	}
	static long[] dp;

}
