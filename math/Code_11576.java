package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 01일
 * 내용 : Base Conversion
 */
public class Code_11576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();//n자리수 숫자
		
		int result = 0;
		
		for(int i=0; i<n; ++i) {
			int x = sc.nextInt();
			result = result*a + x; //a진법 수를 10진법 수로 바꿈.
		}
		
		convert(result, b);
		
	}
	
	//10진법 수 result를 b로 나누면서 b진법으로 변환하여 출력.
	static void convert(int result, int b) {
		if(result==0)
			return;
		convert(result/b, b);
		System.out.print(result%b+" ");
		//나머지를 출력하기 때문에 제일 마지막 재귀함수가 먼저 출력되어야함.
	}
}
