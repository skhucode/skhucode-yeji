package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 03��
 * �� �� : 1,2,3 ���ϱ�
 *     �� �׽�Ʈ ���̽�����, n�� 1,2,3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
 */
public class Code_9095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//dp[n] = n�� 1,2,3�� �������� ��Ÿ���� ����Ǽ�
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
