package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 09��
 * �� �� : �������� ��
 */
public class Code_1699 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] dp = new int[n+1];
		
		//�̹� n���� ���� �ε������� ������ ���� �Ǳ����� �ʿ��� ���� �ּ� ������ �������.
		for(int i=1; i<=n; ++i) {
			dp[i] = i; //�� 1�� ���� �� i�� 
			
			for(int j=1; j*j<=i; ++j) {
				if(dp[i] > dp[i-j*j]+1) //�� : dp[i-25]+1 i-������ + 1  
					dp[i] = dp[i-j*j]+1;
			}
		}
		
		System.out.println(dp[n]);
		
	}

}
