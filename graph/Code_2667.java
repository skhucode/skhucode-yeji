package graph;
/*
 * �ۼ��� : 2018�� 09�� 02��
 * �� �� : ������ȣ���̱�
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
		group = new int[n][n]; //�湮�� ��Ÿ��������
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				if(arr[i][j]==1 && group[i][j]==0)//���� �ְ�, �湮������ ������
					dfs(i, j, ++count); //x��ǥ,y��ǥ,������
			}
		}
		
		int[] result = new int[count];
		
		//�������� �� ���� ���� �ִ���
		for(int i=0; i<n; ++i) {
			for(int j=0; j<n; ++j) {
				if(group[i][j]!=0) {
					result[group[i][j]-1]+=1;
				}
			}
		}
		
		Arrays.sort(result); 
		
		System.out.println(count); //�� ������ �ִ���
		
		for(int i : result) //�������� �� ���� ���� �ִ���
			System.out.println(i);
		
	}
	
	//dfs���ؼ� ��� �������� ä����.
	static void dfs(int x, int y, int count) {
		group[x][y] = count;
		
		for(int i=0; i<4; ++i) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(0 <= nx && nx < n && 0 <= ny && ny < n) {//ǥ�� ������ �°�
				if(arr[nx][ny] == 1 && group[nx][ny]==0) //���� �ְ�, �湮���� ������
					dfs(nx, ny, count);
			}
		}
	}
	
}
