package bigInteger;

import java.math.BigDecimal;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 15��
 * �� �� : a^b
 * 		�Ǽ� a�� ���� b�� �־����� ��, a�� b������ ��Ȯ�ϰ� ����ϴ� ���α׷��� �ۼ�.
 */

public class Code_10827 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] arr = input.nextLine().split(" ");
		
		BigDecimal a = new BigDecimal(arr[0]);
		
		int b = Integer.parseInt(arr[1]);
		
		BigDecimal c = a.pow(b);
		System.out.println(c.toPlainString());
		//toPlainString() : BigDecimal�� ǥ���� �� ������ ǥ�⸦ ������� ����.
		//toString() :  BigDecimal�� ǥ���� �� ������ ǥ�⸦ �����.
	}

}
