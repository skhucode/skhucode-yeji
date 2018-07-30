package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
/*
 * 작성일 : 2018년 07월 28일
 * 내 용 : 알파벳 개수
 * 		 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 		각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 */
public class Code_10808 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		String s = sc.nextLine();
		
		for(char i='a'; i<='z'; ++i)
			for(int j=0; j<s.length(); ++j)
				if(i==s.charAt(j))
					if(map.containsKey(i)) {
						int a = map.get(i)+1;
						map.put(i, a);
					}else {
						map.put(i, 1);
					}
		
		for(char i='a'; i<='z'; ++i) {
			if(map.containsKey(i))
				System.out.print(map.get(i)+" ");
			else
				System.out.print("0 ");
		}
	}
}
