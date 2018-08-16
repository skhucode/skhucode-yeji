package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 소수 찾기
 */
public class Code_1978 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = num;
		int[] arr = new int[num];
		
		for(int i=0; i<num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; ++i) {
			int n = arr[i];
			if(n<=1)
				count--;
			for(int j=2; j*j<=n; ++j) {
				if(n%j==0) {
					count--;
					break;
				}
			}
		}
		
		System.out.println(count);
	}
}
