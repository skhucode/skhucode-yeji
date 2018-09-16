package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 16일
 * 내 용 : 수 묶기 
 */
public class Code_1744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		ArrayList<Integer> plus = new ArrayList<Integer>();

		ArrayList<Integer> minus = new ArrayList<Integer>();

		int zero = 0;
		int one = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(); //1과 0은 따로 빼줌.
			if (x == 1) {
				one += 1; 
			} else if (x > 0) {
				plus.add(x);
			} else if (x < 0) {
				minus.add(x);
			} else {
				zero += 1;
			}
		}

		Collections.sort(plus);
		Collections.sort(minus);
		Collections.reverse(plus);

		if (plus.size() % 2 == 1) { //양수의 개수가 딱 맞아떨어지지않을때
			plus.add(1);
		}
		if (minus.size() % 2 == 1) { //음수의 개수가 딱 맞아떨어지지않을때
			minus.add(zero > 0 ? 0 : 1);
		}

		int ans = one; //1의 개수 저장(더한다고 생각하면된다.)

		for (int i = 0; i < plus.size(); i += 2) { //양수들끼리 묶어주기
			ans += plus.get(i) * plus.get(i + 1);
		}

		for (int i = 0; i < minus.size(); i += 2) { //음수들끼리 묶어주기
			ans += minus.get(i) * minus.get(i + 1);
		}

		System.out.println(ans);

	}
}
