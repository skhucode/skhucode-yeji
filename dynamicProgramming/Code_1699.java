package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 09일
 * 내 용 : 제곱수의 합
 */
public class Code_1699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] dp = new int[n+1];
		
		//이미 n보다 작은 인덱스에는 각자의 수가 되기위해 필요한 항의 최소 개수가 들어있음.
		for(int i=1; i<=n; ++i) {
			dp[i] = i; //다 1로 했을 때 i개 
			
			for(int j=1; j*j<=i; ++j) {
				if(dp[i] > dp[i-j*j]+1) //예 : dp[i-25]+1 i-제곱수 + 1  
					dp[i] = dp[i-j*j]+1;
			}
		}
		
		System.out.println(dp[n]);
		
	}

}
