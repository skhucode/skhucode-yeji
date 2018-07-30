package string;

import java.util.Scanner; 
/*
 * 작성일 : 2018년 07월 28일
 * 내 용 : 단어 길이 재기
 * 		알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 */
public class Code_2743 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println(s.length());
	}
}
