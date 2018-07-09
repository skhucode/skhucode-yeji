package collection;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준2570 - N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
public class Code_2750 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int num = input.nextInt();
		
		int[] arr=new int[num];
		
		for(int i=0; i<num; ++i) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i : arr)
			System.out.println(i);
		
	/*
		int x = input.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<x; ++i) {
			int temp = input.nextInt();
			a.add(temp);
		}
		
		Collections.sort(a);
		
		for(int i : a)
			System.out.println(i);
	*/	
	}
}
