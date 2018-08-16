package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 16��
 * �� �� : �������� ����
 		4���� ū ��� ¦���� �� Ȧ�� �Ҽ��� ������ ��Ÿ�� �� �ִ�.
 */
public class Code_6588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean[] b = new boolean[1000000+1];
		//�Ҽ��� ã�Ƽ� �迭�� �����Ѵ�.
		
		List<Integer> list = new ArrayList<Integer>();
		
		b[0] = true;
		b[1] = true;
		
		for(int i=2; i*i<=1000000; ++i) { //�Ҽ��̸� false.
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
