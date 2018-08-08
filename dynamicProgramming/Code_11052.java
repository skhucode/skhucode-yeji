package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 05일
 * 내 용 : 붕어빵 판매하기
 */
public class Code_11052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.nextLine();
		String[] p = sc.nextLine().split(" ");

		int [] dp = new int[num+1];
		//dp[n] n개 팔 때 최대 수익

		for(int i=1; i<=num; ++i) {
			for(int j=1; j<=i; ++j) {
				int x = dp[i-j]+Integer.parseInt(p[j-1]);
				if(x>dp[i])
					dp[i] = x;
			}
		}
		System.out.println(dp[num]);
	}
}
