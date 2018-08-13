package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 13일
 * 내 용 : 진법 변환2
 *		10진법 수 N이 주어지면 이 수를 B진법으로 바꿔 출력.
 */
public class Code_11005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		//10진법을 넘어가는 진법은 알파벳으로 사용 - 숫자도 문자로 사용
		int n = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int r;
		StringBuilder sb = new StringBuilder(); //나머지를 저장하는 sb
		while(n!=0) {
			r = n%b;
			if(r<10) { //0~9도 문자로 
				sb.append((char)(r+'0'));
			}else {
				sb.append((char)(r+'A'-10));
			}
		
			n = n/b;				
		}
		
		sb.reverse();
		System.out.println(sb);
	}
}
