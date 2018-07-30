package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
/*
 * �ۼ��� : 2018�� 07�� 28��
 * �� �� : ���ĺ� ã��
 * 		 ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * 		�� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Code_10809 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char i='a'; i<='z'; ++i)
			for(int j=0; j<s.length(); ++j)
				if(s.charAt(j)==i)
					if(!map.containsKey(i))
						map.put(i, j);
		
		for(char i='a'; i<='z'; ++i)
			if(map.containsKey(i))
				System.out.print(map.get(i)+" ");
			else
				System.out.print("-1 ");
	}
}
