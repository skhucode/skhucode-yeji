package sort;

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
 * 		��ǥ�� y��ǥ�� �����ϴ� ������, y��ǥ�� ������ x��ǥ�� �����ϴ� ������
 *		������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * PointŬ���� 11650�� ����!
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

