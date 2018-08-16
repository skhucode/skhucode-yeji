package math;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 08�� 15��
 * �� �� : 8���� 2����
 */
public class Code_1212 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String[] e = {"000","001","010","011","100","101","110","111"};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		boolean start = true;
		
		//�Է¹��� ���� 0�� ��
		if(s.length()==1 && s.charAt(0) == '0') {
			System.out.println(0);
		}else { //else ���� �ʾƵ� n==0�� �� continue���� �Ÿ���
			for(int i=0; i<s.length(); ++i) {
				int n = s.charAt(i)-'0';
				//1��° �ڸ� ���� ��Ÿ���� ���� if��
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
