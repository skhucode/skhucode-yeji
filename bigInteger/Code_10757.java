package bigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * �ۼ��� : 2018�� 07�� 15��
 * �� �� : ū �� A+B
 * 		A+B�� ����Ͻÿ�.
 */
public class Code_10757 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr=br.readLine().split(" ");
		
		BigInteger a = new BigInteger(arr[0]);

		BigInteger b = new BigInteger(arr[1]);
		
		System.out.println(a.add(b));
		
		//Scanner�� �̿��ϸ� �� �� ���� ������ �� �ִ�.
		// BigInteger a = sc.nextBigInteger(); �� �Է¹޴� ���� ������ ���� �� ����.

	}

}
