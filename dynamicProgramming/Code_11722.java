package dynamicProgramming;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 09��
 * �� �� : ���� �� �����ϴ� �κ� ����
 */
public class Code_11722 {

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
		
		d[num-1] = 1;
		
		for(int i=num-2; i>=0; --i) {
			for(int j=num-1; j>=i; --j) {
				if(a[i]>a[j]) {
					if(d[i]<d[j])
						d[i] = d[j];
				}
			}
			d[i] += 1;
		}
		
		int max = 0;
		
		for(int i : d)
			if(max<i) 
				max = i;
		
		System.out.println(max);
	}
}
