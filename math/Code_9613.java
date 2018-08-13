package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 13��
 * �� �� : GCD(�ִ�����) ��
 * 		n���� ���� �־����� ��� ���� GCD�� ���� ���.
 */
public class Code_9613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0) {
			int x = sc.nextInt();
			
			int[] arr = new int[x];
			
			for(int i=0; i<x; ++i)
				arr[i] = sc.nextInt();
			
			long sum=0; //�ִ� ������� ���� �����ϴ� ����
			
			int gcd; 
			
			for(int i=0; i<x; ++i) {
				for(int j=i+1; j<x; ++j) {
					gcd = getGCD(arr[j], arr[i]%arr[j]);
					sum+=gcd;
				}
			}
			System.out.println(sum);
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
