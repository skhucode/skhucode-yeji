package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 07일
 * 내 용 : 오르막 수 
 * 		첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.
 */
public class Code_11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //n자리 수의 오르막 수 찾기
		
		long [][] dp = new long[n+1][10]; //2자리 수면 배열이 2까지 있어야하기 때문에
		//dp[N][L] = 마지막 수가 L인 N자리 오르막 수의 개수
		
	
		for(int l=0; l<=9; ++l) {
			dp[1][l] = 1; //마지막 수가 L이고 1자리수 오르막 수의 개수
		}
		
		//1 이랑 다른 수 입력할 때 나눠야한다
		for(int i=2; i<=n; ++i) {
			for(int j=0; j<=9; ++j) {
				for(int z=0; z<=j; ++z) {
					dp[i][j] += dp[i-1][z];
					dp[i][j] %= 10007;
				}
			}
		  }

		long sum=0; 
		for(int i=0; i<=9; ++i)
			sum+=dp[n][i];
		System.out.println(sum%10007);
		//int형의 범위 : -2147483648 ~ 2147483647
		//long형의 범위 : -9223372036854775808 ~ 9223372036854775807
	}
}
