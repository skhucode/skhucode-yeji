package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 08일
 * 내 용 : 스티커
 * 		각 테스트 케이스 마다, 2n개의 스티커 중에서 두 변을 공유하지 않는 스티커 점수의 최대값을 출력한다.
 */
public class Code_9465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt(); //테스트 케이스 개수
		while(num-->0) {
		int n = sc.nextInt();
		//2 x n 스티커
		sc.nextLine();
		long [][] dp = new long[n][3];
		//n열의 상태에 따라 최고점을 나타냄.
		//상태 : 0 - x x , 1 - o x , 2 - x o
		long max;
		long score;
		String [] a1 = sc.nextLine().split(" ");
		String [] a2 = sc.nextLine().split(" ");
		
		dp[0][1] = Integer.parseInt(a1[0]);
		dp[0][2] = Integer.parseInt(a2[0]);
		
		for(int i=1; i<n; ++i) { //스티커의 열 
			for(int j=0; j<=2; ++j) {//스티커를 떼는 케이스
				if(j==0) {
					max = Math.max(dp[i-1][0],dp[i-1][1]);
					dp[i][j] = Math.max(max, dp[i-1][2]);
				}else if(j==1) {
					max = Math.max(dp[i-1][0],dp[i-1][2]);
					dp[i][j] = max + Integer.parseInt(a1[i]);
				}else {
					max = Math.max(dp[i-1][0],dp[i-1][1]);
					dp[i][j] = max + Integer.parseInt(a2[i]);
				}
			}
		}
		
		score = Math.max(dp[n-1][0], dp[n-1][1]);
		
		score = Math.max(dp[n-1][2], score);
		
		System.out.println(score);
		}
	}

}
