package greedy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 09�� 16��
 * �� �� : ATM 
 */
public class Code_11399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result =0;
		int x=0;
		for(int i=0; i<n; ++i) { 
			x += arr[i];  //�� ������� atm�� ����� �� �ɷȴ� �ð� + ���� ����ϴ� ����� atm�� ����� �� �ɸ���  �ð�
			result += x; 
		}
		System.out.println(result);
	}

}
