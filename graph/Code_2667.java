package graph;
/*
 * 작성일 : 2018년 09월 02일
 * 내 용 : 단지번호붙이기
 */
import java.util.Arrays;
import java.util.Scanner;

public class Code_2667 {
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] arr;
	static int[][] group;
	static int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 n = sc.nextInt();
		sc.nextLine();
		
		 arr = new int[n][n];
		for(int i=0; i<n; ++i) {
			String s = sc.nextLine();
			for(int j=0; j<n; ++j) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		
		int count=0;
		group = new int[n][n]; //방문을 나타내기위한
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				if(arr[i][j]==1 && group[i][j]==0)//집이 있고, 방문경험이 없으면
					dfs(i, j, ++count); //x좌표,y좌표,단지수
			}
		}
		
		int[] result = new int[count];
		
		//단지마다 몇 개의 집이 있는지
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				if(group[i][j]!=0) {
					result[group[i][j]-1]+=1;
				}
			}
		}
		
		Arrays.sort(result); 
		
		System.out.println(count); //몇 단지가 있는지
		
		for(int i : result) //단지마다 몇 개의 집이 있는지
			System.out.println(i);
		
	}
	
	//dfs통해서 어느 단지인지 채워짐.
	static void dfs(int x, int y, int count) {
		group[x][y] = count;
		
		for(int i=0; i<4; ++i) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(0 <= nx && nx < n && 0 <= ny && ny < n) {//표의 범위에 맞고
				if(arr[nx][ny] == 1 && group[nx][ny]==0) //집이 있고, 방문경험 없으면
					dfs(nx, ny, count);
			}
		}
	}
	
}
