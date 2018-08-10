package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 09��
 * �� �� : ���� ū �����ϴ� �κ� ����
 */
public class Code_11055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		 
		sc.nextLine();
		//Scanner��ü�� num + eneter���� eneter�κ��� ���� nextLine()���� �б⶧����
		
		String [] arr = sc.nextLine().split(" ");
		int [] a = new int[num];
		
		for(int i=0; i<num; ++i) {
			a[i] = Integer.parseInt(arr[i]);
		}
		
		int [] d = new int[num];
		
		d[0] = a[0];
		
		for(int i=1; i<num; ++i) { //���� d��ġ
			for(int j=0; j<i; ++j) { // �� ���� d���̶� ���ϸ鼭 �ִ밪 ����
				if(a[j]<a[i]) { //i��° �� > j��° ��
					if(d[j]>d[i]) // i��° ���� < j��° ����
						d[i]=d[j];
				}
			}
			d[i] += a[i]; //���� �ڽű��� ���̿� ����
		}
		
		int max = 0;
		
		for(int i : d)
			if(max<i) 
				max = i;
		
		System.out.println(max);
	}
}
