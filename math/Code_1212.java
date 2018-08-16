package math;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 15일
 * 내 용 : 8진수 2진수
 */
public class Code_1212 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String[] e = {"000","001","010","011","100","101","110","111"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean start = true;
		
		//입력받은 수가 0일 때
		if(s.length()==1 && s.charAt(0) == '0') {
			System.out.println(0);
		}else { //else 하지 않아도 n==0일 때 continue에서 거른다
			for(int i=0; i<s.length(); ++i) {
				int n = s.charAt(i)-'0';
				//1번째 자리 수를 나타내기 위한 if문
				if(start==true && n < 4) {
					if(n==0) {
						continue;
					}else if(n==1) {
						System.out.print("1");
					}else if(n==2) {
						System.out.print("10");
					}else if(n==3) {
						System.out.print("11");
					}
					start = false;
				}else {
					System.out.print(e[n]);
					start=false;
				}
			}
		}
		
	}
}
