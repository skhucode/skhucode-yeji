package bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 15��
 * �� �� : �Ǻ���ġ �� 4 
 * 		n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 		 n�� 10,000���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 */
public class Code_10826 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigInteger[] d = new BigInteger[Math.max(num+1, 2)];
		d[0]=BigInteger.ZERO;
		d[1]=BigInteger.ONE;
		for(int i=2; i<=num; ++i) {
			d[i] = d[i-1].add(d[i-2]); 
		}
		System.out.println(d[num]);
	}
	
	/** ��ͷ��ߴٰ� ��Ÿ�� ���� ��� �߻�.. 
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
	**/
}
