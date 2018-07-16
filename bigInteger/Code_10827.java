package bigInteger;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 15일
 * 내 용 : a^b
 * 		실수 a와 정수 b가 주어졌을 때, a의 b제곱을 정확하게 계산하는 프로그램을 작성.
 */

public class Code_10827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] arr = input.nextLine().split(" ");
		
		BigDecimal a = new BigDecimal(arr[0]);
		
		int b = Integer.parseInt(arr[1]);
		
		BigDecimal c = a.pow(b);
		System.out.println(c.toPlainString());
		//toPlainString() : BigDecimal를 표현할 때 과학적 표기를 사용하지 않음.
		//toString() :  BigDecimal를 표현할 때 과학적 표기를 사용함.
	}

}
