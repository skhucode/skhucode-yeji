package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 03일
 * 내 용 : 1,2,3 더하기
 *     각 테스트 케이스마다, n을 1,2,3의 합으로 나타내는 방법의 수를 출력한다.
 */
public class Code_9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//dp[n] = n을 1,2,3의 조합으로 나타내는 방법의수
		while(num-->0) {
		int n = sc.nextInt();
		dp = new int[n+1];
		System.out.println(function(n));
		}
	}
	static int [] dp;
	
	static int function(int n) {
		int sum=0;
		if(n==1 || n==0)
			return 1;
		if(dp[n]!=0)
			return dp[n];
		if(n>1)
			sum+=function(n-1);
		if(n>=2)
			sum+=function(n-2);
		if(n>=3)
			sum+=function(n-3);
		
		return dp[n]=sum;
	}
}
