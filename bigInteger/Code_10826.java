package bigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * �ۼ��� : 2018�� 07�� 15��
 * �� �� : �Ǻ���ġ �� 4 
 * 		n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		 n�� 10,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 */
public class Code_10826 {
	
	static BigInteger[] arr = new BigInteger[10000];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(pibonacci(num));
		
	}

	static BigInteger pibonacci(int num) {
	
		if(arr[num]!=null) return arr[num];
		
		else {
			System.out.println(num);
			BigInteger i = new BigInteger(String.valueOf(num)); 
			if(i.equals(BigInteger.ZERO) || i.equals(BigInteger.ONE)) {
				return arr[num] = i;
			}
			else {
				BigInteger e = pibonacci(num-1).add(pibonacci(num-2));
				return arr[num] = e;
			}
		}
	}
	
}
