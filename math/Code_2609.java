package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 13��
 * �� �� : �ִ������� �ּҰ����
 */
public class Code_2609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		//�ԷµǴ� �� �ڿ����� 10,000�����̹Ƿ� �� ���� ���ص�(1��) int�� ����(21��)�� ���Եȴ�. 
		
		for(int i=0; i<2; ++i) {
			arr[i] = sc.nextInt();
		}
		
		//�ִ����� : ��Ŭ���� ȣ���� �̿�.
		int gcd = getGCD(arr[1], arr[0]%arr[1]);
		
		//�ּҰ���� : �ִ����� �̿�.
		int lcm = arr[0]*arr[1]/gcd;

		System.out.println(gcd+"\n"+lcm);
	}

	static int getGCD(int b, int r) {
		if(r==0)
			return b;
		else
			return getGCD(r, b%r);
	}
	
}
