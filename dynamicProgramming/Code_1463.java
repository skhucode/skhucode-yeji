package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 03일
 * 내 용 : 1로 만들기
 *      첫째 줄에 연산을 하는 횟수의 최소값을 출력한다.
 */
public class Code_1463 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		dp = new int[num+1];
		//dp[i] = i를 1로 만드는데 필요한 최소 횟수
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
