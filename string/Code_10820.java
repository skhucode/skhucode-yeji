package string;

import java.util.Scanner; 
/*
 * �ۼ��� : 2018�� 07�� 30��
 * �� �� : ���ڿ� �м�
 * 		ù° �ٺ��� N��° �ٱ��� ������ ���ڿ��� ���ؼ�
 * 		 �ҹ���, �빮��, ����, ������ ������ �������� ������ ����Ѵ�.
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
