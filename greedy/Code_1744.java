package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 09�� 16��
 * �� �� : �� ���� 
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
			int x = sc.nextInt(); //1�� 0�� ���� ����.
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

		if (plus.size() % 2 == 1) { //����� ������ �� �¾ƶ�������������
			plus.add(1);
		}
		if (minus.size() % 2 == 1) { //������ ������ �� �¾ƶ�������������
			minus.add(zero > 0 ? 0 : 1);
		}

		int ans = one; //1�� ���� ����(���Ѵٰ� �����ϸ�ȴ�.)

		for (int i = 0; i < plus.size(); i += 2) { //����鳢�� �����ֱ�
			ans += plus.get(i) * plus.get(i + 1);
		}

		for (int i = 0; i < minus.size(); i += 2) { //�����鳢�� �����ֱ�
			ans += minus.get(i) * minus.get(i + 1);
		}

		System.out.println(ans);

	}
}
