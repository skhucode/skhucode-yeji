package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 13��
 * �� �� : �ּҰ����
 */
public class Code_1934 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a,b,lcm;
		
		while(n-->0) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			lcm = a*b/getGCD(b,a%b);
			//�ּҰ���� = a * b / �ִ�����
			
			System.out.println(lcm);
		}
	}
	//�ִ������� ���ϴ� �޼ҵ� getGCD - ��Ŭ���� ȣ���� �̿�.
	public static int getGCD(int b, int r) {
		if(r==0)
			return b;
		else
			return getGCD(r, b%r);
	}
}
