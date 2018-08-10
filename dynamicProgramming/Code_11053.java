package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 09일
 * 내 용 : 가장 긴 증가하는 부분 수열
 */
public class Code_11053 {

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
		
		d[0] = 1;
		
		for(int i=1; i<num; ++i) { //현재 d위치
			for(int j=0; j<i; ++j) { // 그 전의 d값이랑 비교하면서 최대값 삽입
				if(a[j]<a[i]) { //i번째 수 > j번째 수
					if(d[j]>d[i]) // i번째 길이 < j번째 길이
						d[i]=d[j];
				}
			}
			d[i] += 1; //현재 자신까지 길이에 포함
		}
		
		int max = 0;
		
		for(int i : d)
			if(max<i) 
				max = i;
		
		System.out.println(max);
	}
}
