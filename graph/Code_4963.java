package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 02일
 * 내 용 : 섬의 개수
 */

public class Code_4963 {
	
	static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
	static int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
	static int[][] arr;
	static int[][] group;
	static int w, h;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			
			if(w==0 && h==0)
				break;
			
			arr = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; ++j) {
					arr[i][j] = sc.nextInt(); 
				}
			}
			int count=0;
			
			group = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; ++j) {
					if(arr[i][j]==1 && group[i][j]==0)
						bfs(i, j, ++count);
				}
			}		
			System.out.println(count);
		}
	}

	static void bfs(int x, int y, int count) {
		Queue<Pair> q = new LinkedList<Pair>();
		
		q.add(new Pair(x, y));
		group[x][y] = count;
		
		while(!q.isEmpty()) {
			Pair p = q.remove();
			x = p.x;
			y = p.y;
			
			for(int i=0; i<8; ++i) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
               if (0 <= nx && nx < h && 0 <= ny && ny < w) {
            	   if (arr[nx][ny] == 1 && group[nx][ny] == 0) {
            		   q.add(new Pair(nx, ny));
            		   group[nx][ny] = count;
            	   }
               }
			}
		}
	}
}

	class Pair {

    int x;
    int y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}