package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 15일
 * 내 용 : 2진수 8진수
 */
public class Code_1373 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		int sum=0, count=0;
		StringBuilder sb = new StringBuilder();
		double t;
		
		for(int i=a.length()-1; i>=0; --i) {
			t = (a.charAt(i)-'0'); //char형을 int형으로
			sum += t*Math.pow(2, count);
			count+=1;
			if(count==3||i==0) {
				count=0;
				sb.append(sum);
				sum=0;
			}
		}
		
		System.out.println(sb.reverse());
		
	}
}
