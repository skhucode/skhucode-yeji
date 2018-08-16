package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 소수 구하기
 */
public class Code_1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		//m이상 n이하의 소수를 모두 출력.
		int m = Integer.parseInt(arr[0]);
		int n = Integer.parseInt(arr[1]);

		boolean[] b = new boolean[n+1]; //지워졌는지를 체크하기 위한 배열
		
		//i*i<=n일 때 n=1000000이면 i=1000까지 돈다.
		for(int i=2; i*i<=n; ++i) {
			if(b[i]==false) { //지워지지 않았으면
				for(int j=i*i; j<=n; j+=i) {
					b[j] = true; //그 수의 배수를 다 지운다.
				}
			}
		}
		//이 문제에서는 27line에서 i*i로해도 범위가 넘지 않기 때문에 i*i로 적었지만
		//범위가 넘어가는 경우를 생각해서 보통 i+i또는i*2를 사용한다.
		
		for(int i=m; i<=n; ++i) {
			if(b[i]==false&&i!=1)
				System.out.println(i);
		}
	}
}
