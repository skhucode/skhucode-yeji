package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;


/*
 * 작성일 : 2018년 09월 16일
 * 내 용 : 잃어버린 괄호 - 수정필요!
 */
public class Code_1541 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		boolean minus = false;
		int result=0;
		int x = 0;
		for(int i=0; i<s.length(); ++i) {
			char c = s.charAt(i);

			if(c=='+'||c=='-') {
				if(minus==true)
					result-=x;
				else
					result+=x;
				
				if(c=='-')
					minus=true;
				else
					minus=false;
				x=0;
			}else {
				x = (x*10)+(c-'0');
			}
			
			System.out.println("결과:"+result);

		}
		
	}

}
