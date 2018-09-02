package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 09월 01일
 * 내용 : -2진수
 * 		※주의할 점 -2로 나눈 몫이 a이면 다음은 -a를 몫으로 두고 처리.※
 */
public class Code_2089 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num==0)
			System.out.println(0);
		else 
			function(num);
	}

	static void function(int num) {
		if(num==0)
			return;
		if(num%2==0) {//2로 나누어 떨어지는 경우
			function(-(num/2));
			System.out.print(0);
		}else {//2로 나누어 떨어지지 않는 경우
			if(num>0)
				function(-(num/2));
			else
				function((-num+1)/2);
			System.out.print(1);
		}
	}
}
