package sort;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 26일
 * 내 용 : 카드
 * 		가지고 있는 카드 중에서 가장 많이 가지고 있는 정수의 개수를 구하라.
 */
public class Code_11652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextLong();
		
		Arrays.sort(arr);
		
		int ans=1, cnt=1;
		long num=arr[0];
		//맨 처음 수는 항상 수가 1이기 때문에 ans=1,cnt=1로 해주고 for문 i=1부터 시작
		
		for(int i=1; i<n; ++i) {
			if(arr[i-1]!=arr[i]) {//앞의 수와 다른 수일 때
				cnt=1;
			}
			else //앞의 수와 같은 수면 +1,
				cnt+=1;  
			if(ans<cnt) {
				ans = cnt;
				num = arr[i];
			}
		}

		System.out.println(num);
		
	}

}
