package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 03��
 * �� �� : 2xn Ÿ�ϸ�
 *     ù° �ٿ� 2��n ũ���� ���簢���� ä��� ����� ���� 10,007�� ���� �������� ����Ѵ�.
 */
public class Code_11726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		//dp[i] = 2xn�� ä��� ����� ��
		
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
