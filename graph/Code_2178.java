package graph;

import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 03일
 * 내용 : 미로 탐색
 */
public class Code_2178 {

	static int[][] arr;
	static int[][] group;
	static int n, m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 n = sc.nextInt();
		 m = sc.nextInt();
	
		arr = new int[n][m];
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				String s = sc.nextLine();
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		
		int count=0;
		group = new int[n][m];
		
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
			//	if(arr[i][j]==1 && group[n][m]==0)
					//bfs(i, j, ++count);
			}
		}
	}
}
	

