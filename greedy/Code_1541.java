package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;


/*
 * �ۼ��� : 2018�� 09�� 16��
 * �� �� : �Ҿ���� ��ȣ - �����ʿ�!
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
			
			System.out.println("���:"+result);

		}
		
	}

}
