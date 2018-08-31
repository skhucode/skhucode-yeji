package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 작성일 : 2018년 08월 26일
 * 내 용 : K번째 수
 * 		수 N개가 주어지고, 오름차순으로 정렬했을 때 K번째 수를 구하라.
 */
public class Code_11004 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		//StringTokenizer : 구분자가 생략되어있을 경우 기본적으로 공백이 구분자가 된다.

		for(int i=0; i<n; ++i) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.parallelSort(arr);

		System.out.println(arr[k-1]);
/*
		  Scanner sc = new Scanner(System.in);
	      
	      int n = sc.nextInt();
	      int k = sc.nextInt();
	      
	      int[] a = new int[n];
	      
	      for(int i=0; i<n; ++i)
	         a[i] = sc.nextInt();
	      
	      Arrays.sort(a);
	      
	      System.out.println(a[k-1]);
*/
	}

}
