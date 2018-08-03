package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 03일
 * 내 용 : 2xn 타일링
 *     첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */
public class Code_11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//dp[i] = 2xn을 채우는 방법의 수
		
		dp = new int[num+1];
		System.out.println(function(num));
	}

	static int [] dp;
	
	static int function(int n) {
		if(n==1||n==0)
			return 1;
		if(dp[n]!=0)
			return dp[n];
		return dp[n]=(function(n-1)+function(n-2))%10007;
	}
	
}
