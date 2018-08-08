package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 07��
 * �� �� : ������ �� 
 * 		ù° �ٿ� ���̰� N�� ������ ���� ������ 10,007�� ���� �������� ����Ѵ�.
 */
public class Code_11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //n�ڸ� ���� ������ �� ã��
		
		long [][] dp = new long[n+1][10]; //2�ڸ� ���� �迭�� 2���� �־���ϱ� ������
		//dp[N][L] = ������ ���� L�� N�ڸ� ������ ���� ����
		
	
		for(int l=0; l<=9; ++l) {
			dp[1][l] = 1; //������ ���� L�̰� 1�ڸ��� ������ ���� ����
		}
		
		//1 �̶� �ٸ� �� �Է��� �� �������Ѵ�
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
		//int���� ���� : -2147483648 ~ 2147483647
		//long���� ���� : -9223372036854775808 ~ 9223372036854775807
	}
}
