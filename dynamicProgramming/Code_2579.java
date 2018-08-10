package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 09��
 * �� �� : ��� ������
 */
public class Code_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [][] dp = new int[n][3];
		
		int [] a = new int[n];
		
		for(int i=0; i<n; ++i) {
			a[i] = sc.nextInt();
		}
		
		dp[0][1] = a[0];
		dp[0][2] = a[0];
		dp[1][1] = a[1];
		dp[1][2] = dp[0][1]+a[1];
		//dp[0][1]=dp[0][2] , dp[1][1]=dp[1][2]
		//�� ���� ���Ұ��� ���� ������ ���� ��  �� �� �ϳ��� ������ ���Ƿ� �� �پ� ���� ����
		
		for(int i=2; i<n; ++i) {
			dp[i][1] = Math.max(dp[i-2][1], dp[i-2][2]) + a[i];
			dp[i][2] = dp[i-1][1] + a[i];
		}
		
		System.out.println(Math.max(dp[n-1][1], dp[n-1][2]));
	}

}
