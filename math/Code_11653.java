package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 16��
 * �� �� : ���μ�����
 */
public class Code_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=2; i*i<=num; ++i) {
			while(num%i==0) {
				System.out.println(i);
				num = num/i;
			}
		}
		if(num>1)
			System.out.println(num);
	}

}
