package greedy;

import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 16일
 * 내 용 : 동전 0 - N종류의 동전을 사용해 K원을 만들 때, 필요한 동전 개수의 최소값을 구해라.
 */
public class Code_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int result=0;
		
		for(int i=n; i>=1; --i) {
			result += k/arr[i]; //나눈 몫 저장.
			k = k%arr[i]; //나머지 저장.
		}
		
		System.out.println(result);
	}
	
	
}
