package sort;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 26��
 * �� �� : ī��
 * 		������ �ִ� ī�� �߿��� ���� ���� ������ �ִ� ������ ������ ���϶�.
 */
public class Code_11652 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] arr = new long[n];
		
		for(int i=0; i<n; ++i)
			arr[i] = sc.nextLong();
		
		Arrays.sort(arr);
		
		int ans=1, cnt=1;
		long num=arr[0];
		//�� ó�� ���� �׻� ���� 1�̱� ������ ans=1,cnt=1�� ���ְ� for�� i=1���� ����
		
		for(int i=1; i<n; ++i) {
			if(arr[i-1]!=arr[i]) {//���� ���� �ٸ� ���� ��
				cnt=1;
			}
			else //���� ���� ���� ���� +1,
				cnt+=1;  
			if(ans<cnt) {
				ans = cnt;
				num = arr[i];
			}
		}

		System.out.println(num);
		
	}

}
