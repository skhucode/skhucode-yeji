package greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 16일
 * 내 용 : ATM 
 */
public class Code_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result =0;
		int x=0;
		for(int i=0; i<n; ++i) { 
			x += arr[i];  //앞 사람들이 atm을 사용할 때 걸렸던 시간 + 현재 사용하는 사람이 atm을 사용할 때 걸리는  시간
			result += x; 
		}
		System.out.println(result);
	}

}
