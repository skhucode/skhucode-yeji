package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
/*
 * �ۼ��� : 2018�� 07�� 28��
 * �� �� : ���ĺ� ����
 * 		 ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * 		�� ���ĺ��� �ܾ �� ���� ���ԵǾ� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
