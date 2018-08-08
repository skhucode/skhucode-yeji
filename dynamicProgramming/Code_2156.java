package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 08��
 * �� �� : ������ �ý�
 * 		ù° �ٿ� �ִ�� ���� �� �ִ� �������� ���� ����Ѵ�.
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
		
		dp[0][1] = arr[0]; //1�� ������ ��  
		dp[0][2] = arr[0]; //dp[1][2]�� �� dp[0][0],dp[0][1],dp[0][2] �� �ִ��� �����ϱ� ������
		//�׸��� dp[0][2]�̸� �ڽ��� ������ ���ԵǱ� ������
		
		for(int i=1; i<n; ++i) {
			dp[i][0] = Math.max(dp[i-1][0], Math.max(dp[i-1][1], dp[i-1][2]));
			dp[i][1] = dp[i-1][0] + arr[i];
			dp[i][2] = dp[i-1][1] + arr[i];
		}
		
		System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
	}

}
