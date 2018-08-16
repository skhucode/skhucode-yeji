package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 진법 변환
 */
public class Code_2745 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] a = br.readLine().split(" ");
		
		int b = Integer.parseInt(a[1]); //진법을 나타내는 변수 b
		
		int result = 0;
		
		for(int i=0; i<a[0].length(); ++i) {
			char c = a[0].charAt(i);
			if('0'<= c && c <= '9') {
				result = result*b+(c-'0');
			}else {
				result = result*b+(c-'A'+10);
			}
		}
		System.out.println(result);
		
	}
}
