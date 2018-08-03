package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 03��
 * �� �� : 1�� �����
 *      ù° �ٿ� ������ �ϴ� Ƚ���� �ּҰ��� ����Ѵ�.
 */
public class Code_1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		dp = new int[num+1];
		//dp[i] = i�� 1�� ����µ� �ʿ��� �ּ� Ƚ��
		System.out.println(minCount(num));
		
		
	}
	
	public static int[] dp;

	static int minCount(int num) {
		
		int x;
		
		if(num==1)
			return 0;
		if(dp[num]!=0)
			return dp[num];
		
		int min = minCount(num-1)+1;
		
		if(num%3==0) {
			x = minCount(num/3)+1;
			if(min>x)
				min = x;
		}
		if(num%2==0) {
			x = minCount(num/2)+1;
			if(min>x)
				min = x;
		}
	//	System.out.println("num = "+num+" min = "+min);
		return dp[num]=min;
	}
}
