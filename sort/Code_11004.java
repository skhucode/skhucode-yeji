package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * �ۼ��� : 2018�� 08�� 26��
 * �� �� : K��° ��
 * 		�� N���� �־�����, ������������ �������� �� K��° ���� ���϶�.
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
		//StringTokenizer : �����ڰ� �����Ǿ����� ��� �⺻������ ������ �����ڰ� �ȴ�.

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
