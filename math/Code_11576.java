package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 09�� 01��
 * ���� : Base Conversion
 */
public class Code_11576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();//n�ڸ��� ����
		
		int result = 0;
		
		for(int i=0; i<n; ++i) {
			int x = sc.nextInt();
			result = result*a + x; //a���� ���� 10���� ���� �ٲ�.
		}
		
		convert(result, b);
		
	}
	
	//10���� �� result�� b�� �����鼭 b�������� ��ȯ�Ͽ� ���.
	static void convert(int result, int b) {
		if(result==0)
			return;
		convert(result/b, b);
		System.out.print(result%b+" ");
		//�������� ����ϱ� ������ ���� ������ ����Լ��� ���� ��µǾ����.
	}
}
