package math;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 16��
 * �� �� : ���丮��
 */
public class Code_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt()+1;
		
		int result = 1;
		
		while(num-->1) {
			result*=num;
		}
		
		System.out.println(result);
	}

}
