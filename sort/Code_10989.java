package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 수 정렬하기3
 */
public class Code_10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[10001];
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; ++i) {
			int x = Integer.parseInt(br.readLine());
			arr[x]+=1;
		}
		
		for(int i=1; i<=10000; ++i) {
			if(arr[i]>0) {
				for(int j=0; j<arr[i]; ++j)
					bw.write(i+"\n");
			}
		}
		bw.close();
	/*
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10001];
		
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		while(num-->0) {
			arr[sc.nextInt()]+=1;
		}
		
		for(int i=1; i<=10000; ++i) {
			if(arr[i]>0) {
				for(int j=0; j<arr[i]; ++j)
					sb.append(i+"\n");
			}
		}
		
		System.out.println(sb);
	*/
	}

}
