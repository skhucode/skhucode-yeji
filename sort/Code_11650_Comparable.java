package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 작성일 : 2018년 07월 15일
 * 내 용 : 백준11650 -2차원 평면 위의 점 N개가 주어진다. 
 * 		좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로
 *		정렬한 다음 출력하는 프로그램을 작성하시오.
 */
public class Code_11650_Comparable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Point> list = new ArrayList<Point>();
		
		String [] arr = new String[2];
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; ++i) {
			arr = br.readLine().split(" ");
			Point p = new Point(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]));
			list.add(p);
		}
		
		Collections.sort(list);
		
		/**
		 34줄과 같은 결과 
		Collections.sort(list, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				return p1.compareTo(p2);
			}
		});
		**/
		
		for(Point p : list)
			System.out.println(p.toString());
	}

}

class Point implements Comparable<Point>{
	int x; 
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + " " + y ;
	}
	
	@Override
	public int compareTo(Point p) {
		int r = this.x - p.x;
		if(r!=0) return r;
		else return this.y - p.y;
	}

}

