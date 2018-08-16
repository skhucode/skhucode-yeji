package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 골드바흐의 추측
 		4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
 */
public class Code_6588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean[] b = new boolean[1000000+1];
		//소수를 찾아서 배열에 저장한다.
		
		List<Integer> list = new ArrayList<Integer>();
		
		b[0] = true;
		b[1] = true;
		
		for(int i=2; i*i<=1000000; ++i) { //소수이면 false.
			if(b[i]==false) {
				list.add(i);
				for(int j=i*i; j<=1000000; j+=i) {
					b[j] = true;
				}
			}
		}
		
		while(sc.hasNext()) {
			boolean result=false;
			int n = sc.nextInt();
			if(n==0)
				return;
			for(int i=1; i<list.size(); ++i) {
				int t = list.get(i);
				if(b[n-t]==false) {
					result = true;
					System.out.println(n+" = "+t+" + "+(n-t));
					break;
				}
			}
			if(result==false)
				System.out.println("Goldbach's conjecture is wrong.");
		}
	}
}
