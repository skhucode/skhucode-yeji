package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 팩토리얼
 */
public class Code_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt()+1;
		
		int result = 1;
		
		while(num-->1) {
			result*=num;
		}
		
		System.out.println(result);
	}

}
