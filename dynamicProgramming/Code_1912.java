package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 09일
 * 내 용 : 연속합
 */
public class Code_1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int [] a = new int[num];
		int [] dp = new int[num];
		
		for(int i=0; i<num; ++i) {
			a[i] = sc.nextInt();
		}
		
		dp[0] = a[0]; //a[1]로 끝나는 최대 연속의 합  , 어쩌피 1개니까
		
		for(int i=1; i<num; ++i) {
			if(dp[i-1]+a[i]>a[i])
				dp[i] = dp[i-1]+a[i];
			else
				dp[i] = a[i];
		}
		
		int max=dp[0];
		
		for(int i=1; i<num; ++i)
			if(max<dp[i])
				max=dp[i];
		
		System.out.println(max);
	}
}
