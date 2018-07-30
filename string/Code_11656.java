package string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 30일
 * 내 용 : 접미사 배열
 * 		첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.
 */
public class Code_11656 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] arr= new String[s.length()];
		
		for(int i=0; i<s.length(); ++i) {
			arr[i] = s.substring(i, s.length());
		}
		Arrays.sort(arr);
		
		for(String ss : arr)
			System.out.println(ss);
	}
}
