package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 10��
 * �� �� : �ĵ��� ����
 */
public class Code_9461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int x;
		long [] dp;
		while(n-->0) {
			x = sc.nextInt();
			
			dp = new long[x];
			
			dp[0] = 1;
			
			for(int i=1; i<x; ++i) {
				if(i==1||i==2) {
					dp[i] = 1;
					continue;
				}
				dp[i] = dp[i-2]+dp[i-3];
			}
			
			System.out.println(dp[x-1]);
		}
	}

}
