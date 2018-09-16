package greedy;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 09�� 16��
 * �� �� : ���� 0 - N������ ������ ����� K���� ���� ��, �ʿ��� ���� ������ �ּҰ��� ���ض�.
 */
public class Code_11047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int result=0;
		
		for(int i=n; i>=1; --i) {
			result += k/arr[i]; //���� �� ����.
			k = k%arr[i]; //������ ����.
		}
		
		System.out.println(result);
	}
	
	
}
