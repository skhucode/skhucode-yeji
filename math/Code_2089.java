package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 09�� 01��
 * ���� : -2����
 * 		�������� �� -2�� ���� ���� a�̸� ������ -a�� ������ �ΰ� ó��.��
 */
public class Code_2089 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num==0)
			System.out.println(0);
		else 
			function(num);
	}

	static void function(int num) {
		if(num==0)
			return;
		if(num%2==0) {//2�� ������ �������� ���
			function(-(num/2));
			System.out.print(0);
		}else {//2�� ������ �������� �ʴ� ���
			if(num>0)
				function(-(num/2));
			else
				function((-num+1)/2);
			System.out.print(1);
		}
	}
}
