package greedy;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 09�� 16��
 * �� �� : ��ȸ or ����
 */
public class Code_2875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //���л�
		int m = sc.nextInt(); //���л�
		int k = sc.nextInt(); //���ϼ�
		
		int result=0;
		
	
		if (n >= 2 && m >= 1 && n + m >= k + 3) {
			for (int i = 0; i <= k; ++i) {
				int x = (n-i) / 2; //������, ���������� ������ ���� ���� �پ�� ���� ����� ��.
				int y = (m - (k - i));
				int max;
				if (x > y)
					max = y;
				else
					max = x;
				if (result < max) //����� ���� �� ���� ���� ���� ���� ��.
					result = max;
			}
		}
		
		
		System.out.println(result);
	}
}
