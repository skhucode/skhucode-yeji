package sort;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 수 정렬하기2
 */
public class Code_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
	
		for(int i : arr)
			System.out.println(i);
	}

}
