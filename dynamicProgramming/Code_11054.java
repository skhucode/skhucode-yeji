package dynamicProgramming;

import java.util.Scanner;

/*
 * 작성일 : 2018년 08월 09일
 * 내 용 : 가장 긴 바이토닉 부분 수열
 */
public class Code_11054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
				
		int [] arr = new int[num];
		
		int [] dp1 = new int[num]; //증가하는 부분의 길이를 나타냄
		int [] dp2 = new int[num]; //감소하는 부분의 길이를 나타냄
		
		for(int i=0; i<num; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int [] arr2 = arr;
		
		//자기 자신도 길이에 포함해야하기 때문에 첫 번째 원소의 길이는 1
		dp1[0]=1; 
		dp2[num-1]=1;
		
		//증가하는 부분의 길이 찾기 
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
