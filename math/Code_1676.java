package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 25��
 * �� �� : ���丮�� 0�� ����
 * 		N!���� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� �������� 0�� ������ ���ض�.
 */
public class Code_1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count=0;
		int z = 1; //������ ��Ÿ���� ����
		double a = Math.pow(5, z);
		
		while(a<=n) {
			count+=(n/a);
			z+=1;
			a = Math.pow(5, z);
		}
		/*
		 	for(int i=5; i<=n; i*5)
		  		count+=n/i;
		 */
		
		System.out.println(count);
	}

}
