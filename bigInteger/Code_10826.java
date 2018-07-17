package bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 15일
 * 내 용 : 피보나치 수 4 
 * 		n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 * 		 n은 10,000보다 작거나 같은 자연수 또는 0이다.
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
	
	/** 재귀로했다가 런타임 에러 계속 발생.. 
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
