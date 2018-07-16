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
 * 		좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로
 *		정렬한 다음 출력하는 프로그램을 작성하시오.
 * Point클래스 11650에 있음!
 */

public class Code_11651{

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
		
		//Collections.sort(list, new PointYComparator());
		

		Collections.sort(list, new Comparator<Point>() {
			@Override
			public int compare(Point p1, Point p2) {
				int r = p1.y - p2.y;
				if(r!=0) return r;
				return p1.x - p2.x;
			}
		});
	
		
		for(Point p : list)
			System.out.println(p.toString());
	}

}

class PointYComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1, Point p2) {
		int r = p1.y - p2.y;
		if(r!=0) return r;
		return p1.x - p2.x;
	}
}

