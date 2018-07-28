package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
 * 작성일 : 2018년 07월 26일
 * 내 용 : 에디터
 * 		 L : 커서를 왼쪽으로 한 칸 옮김
 * 		 D : 커서를 오른쪽으로 한 칸 옮김
 *  	 B : 커서 왼쪽에 있는 문자를 삭제함
 *  	 P $ : $라는 문자를 커서 왼쪽에 추가함
 */
public class Code_1406 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));;
		
		Stack<Character> first = new Stack<Character>(); //커서의 왼쪽 문자열
		Stack<Character> second = new Stack<Character>(); //커서의 오른쪽 문자열
		
		String s = br.readLine();
		
		for(int i=0; i<s.length(); ++i) {
			first.push(s.charAt(i));
		}
		
		int num = Integer.parseInt(br.readLine());
	
		while(num-->0) {
			String or = br.readLine();
				
			switch (or.charAt(0)) {
			case 'L':
				if (!first.isEmpty()) 
					second.push(first.pop());
				break;
			case 'D': 
				if (!second.isEmpty())
					first.push(second.pop());	
				break;
			case 'B': 
				if (!first.isEmpty())
					first.pop(); // 커서의 왼쪽 문자열 삭제
				break;
			case 'P': char p = or.charAt(2);
					  first.push(p);
				break;
			default:
				break;
			}
		}

		while(!first.isEmpty()) {
			second.push(first.pop());
		}
		StringBuilder sb = new StringBuilder();
		
		while(!second.isEmpty()) {
			sb.append(second.pop());
		}
		
		System.out.println(sb);
	}
}
