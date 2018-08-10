package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 09��
 * �� �� : ���� �� ������� �κ� ����
 */
public class Code_11054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
				
		int [] arr = new int[num];
		
		int [] dp1 = new int[num]; //�����ϴ� �κ��� ���̸� ��Ÿ��
		int [] dp2 = new int[num]; //�����ϴ� �κ��� ���̸� ��Ÿ��
		
		for(int i=0; i<num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int [] arr2 = arr;
		
		//�ڱ� �ڽŵ� ���̿� �����ؾ��ϱ� ������ ù ��° ������ ���̴� 1
		dp1[0]=1; 
		dp2[num-1]=1;
		
		//�����ϴ� �κ��� ���� ã�� 
		for(int i=1; i<num; ++i) {
			for(int j=0; j<i; ++j) {
				if(arr[i]>arr[j])
					if(dp1[i]<dp1[j])
						dp1[i] = dp1[j];
			}
			dp1[i]+=1; 
		}
		for(int i=num-2; i>=0; --i) {
			for(int j=num-1; j>=i+1; --j) {
				if(arr2[i]>arr2[j])
					if(dp2[i]<dp2[j])
						dp2[i] = dp2[j];
			}
			dp2[i]+=1;
		}
		
		int max = 0;
		int x = 0;
		
		for(int i=0; i<num; ++i) {
			x = dp1[i]+dp2[i];
			if(x>max)
				max = x;
		}
		
		System.out.println(max-1);
		

	}
}
