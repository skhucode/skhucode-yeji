package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 08��
 * �� �� : ��ƼĿ
 * 		�� �׽�Ʈ ���̽� ����, 2n���� ��ƼĿ �߿��� �� ���� �������� �ʴ� ��ƼĿ ������ �ִ밪�� ����Ѵ�.
 */
public class Code_9465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt(); //�׽�Ʈ ���̽� ����
		while(num-->0) {
		int n = sc.nextInt();
		//2 x n ��ƼĿ
		sc.nextLine();
		long [][] dp = new long[n][3];
		//n���� ���¿� ���� �ְ����� ��Ÿ��.
		//���� : 0 - x x , 1 - o x , 2 - x o
		long max;
		long score;
		String [] a1 = sc.nextLine().split(" ");
		String [] a2 = sc.nextLine().split(" ");
		
		dp[0][1] = Integer.parseInt(a1[0]);
		dp[0][2] = Integer.parseInt(a2[0]);
		
		for(int i=1; i<n; ++i) { //��ƼĿ�� �� 
			for(int j=0; j<=2; ++j) {//��ƼĿ�� ���� ���̽�
				if(j==0) {
					max = Math.max(dp[i-1][0],dp[i-1][1]);
					dp[i][j] = Math.max(max, dp[i-1][2]);
				}else if(j==1) {
					max = Math.max(dp[i-1][0],dp[i-1][2]);
					dp[i][j] = max + Integer.parseInt(a1[i]);
				}else {
					max = Math.max(dp[i-1][0],dp[i-1][1]);
					dp[i][j] = max + Integer.parseInt(a2[i]);
				}
			}
		}
		
		score = Math.max(dp[n-1][0], dp[n-1][1]);
		
		score = Math.max(dp[n-1][2], score);
		
		System.out.println(score);
		}
	}

}
