package bigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * 작성일 : 2018년 07월 15일
 * 내 용 : 큰 수 A+B
 * 		A+B를 계산하시오.
 */
public class Code_10757 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr=br.readLine().split(" ");
		
		BigInteger a = new BigInteger(arr[0]);

		BigInteger b = new BigInteger(arr[1]);
		
		System.out.println(a.add(b));
		
		//Scanner를 이용하면 좀 더 편히 구현할 수 있다.
		// BigInteger a = sc.nextBigInteger(); 로 입력받는 순간 변수에 넣을 수 있음.

	}

}
