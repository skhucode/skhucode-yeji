package test;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * �ۼ��� : 2018�� 07�� 15��
 * �� �� : ����11650 -2���� ��� ���� �� N���� �־�����. 
 * 		��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������
 *		������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Code_11650_Comparator {

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
		
		Collections.sort(list, new PointComparator());
		
		for(Point p : list)
			System.out.println(p.toString());
	}

}

class Point{
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
}

 class PointComparator implements Comparator<Point>{
	@Override
	public int compare(Point p1, Point p2) {
		int r = p1.x - p2.x;
		if(r!=0) return r;
		else return p1.y-p2.y;
	}
}