package math;

import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 25일
 * 내 용 : 팩토리얼 0의 개수
 * 		N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지의 0의 개수를 구해라.
 */
public class Code_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		int z = 1; //지수를 나타내는 변수
		double a = Math.pow(5, z);
		
		while(a<=n) {
			count+=(n/a);
			z+=1;
			a = Math.pow(5, z);
		}
		/*
		 	for(int i=5; i<=n; i*5)
		  		count+=n/i;
		 */
		
		System.out.println(count);
	}

}
