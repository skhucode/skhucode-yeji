package string;

import java.util.Scanner; 
/*
 * 작성일 : 2018년 07월 30일
 * 내 용 : 문자열 분석
 * 		첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서
 * 		 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다.
 */
public class Code_10820 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a,b,c,d;
		
		while(sc.hasNext()) {
			a=0;
			b=0;
			c=0;
			d=0;
		
		String s = sc.nextLine();
		
		for(int i=0; i<s.length(); ++i) {
			char ch = s.charAt(i);
			
			if('a'<=ch && ch<='z')
				a++;
			else if('A'<=ch && ch<='Z')
				b++;
			else if(32==ch) 
				d++;
			else
				c++;
		}
		
		System.out.println(a+" "+b+" "+c+" "+d);
		}
	}
}
