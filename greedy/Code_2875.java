package greedy;

import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 16일
 * 내 용 : 대회 or 인턴
 */
public class Code_2875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //여학생
		int m = sc.nextInt(); //남학생
		int k = sc.nextInt(); //인턴수
		
		int result=0;
		
	
		if (n >= 2 && m >= 1 && n + m >= k + 3) {
			for (int i = 0; i <= k; ++i) {
				int x = (n-i) / 2; //여자팀, 남자팀에서 인턴이 생겨 수가 줄어들 때의 경우의 수.
				int y = (m - (k - i));
				int max;
				if (x > y)
					max = y;
				else
					max = x;
				if (result < max) //경우의 수들 중 가장 많은 팀을 만들 때.
					result = max;
			}
		}
		
		
		System.out.println(result);
	}
}
