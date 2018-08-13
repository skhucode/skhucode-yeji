package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 08�� 13��
 * �� �� : ���� ��ȯ2
 *		10���� �� N�� �־����� �� ���� B�������� �ٲ� ���.
 */
public class Code_11005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		
		//10������ �Ѿ�� ������ ���ĺ����� ��� - ���ڵ� ���ڷ� ���
		int n = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int r;
		StringBuilder sb = new StringBuilder(); //�������� �����ϴ� sb
		while(n!=0) {
			r = n%b;
			if(r<10) { //0~9�� ���ڷ� 
				sb.append((char)(r+'0'));
			}else {
				sb.append((char)(r+'A'-10));
			}
		
			n = n/b;				
		}
		
		sb.reverse();
		System.out.println(sb);
	}
}
