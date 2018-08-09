package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 09일
 * 내 용 : 가장 긴 감소하는 부분 수열
 */
public class Code_11722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		 
		sc.nextLine();
		//Scanner객체가 num + eneter에서 eneter부분을 다음 nextLine()에서 읽기때문에
		
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
