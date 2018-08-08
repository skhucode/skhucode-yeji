package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 08일
 * 내 용 : 포도주 시식
 * 		첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.
 */
public class Code_2156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		int [][] dp = new int[n][3];
		
		for(int i=0; i<arr.length; ++i) {
			arr[i] = sc.nextInt();
		}
		
		dp[0][1] = arr[0]; //1번 연속일 때  
		dp[0][2] = arr[0]; //dp[1][2]일 때 dp[0][0],dp[0][1],dp[0][2] 중 최댓값이 들어가야하기 때문에
		//그리고 dp[0][2]이면 자신의 점수도 포함되기 때문에
		
		for(int i=1; i<n; ++i) {
			dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][1] = dp[i-1][0] + arr[i];
			dp[i][2] = dp[i-1][1] + arr[i];
		}
		
		System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
	}

}
