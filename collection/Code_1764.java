package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * �ۼ��� : 2018�� 07�� 08��
 * �� �� : ����1764 -�躸���� ���� �� ����� ���������� ����Ѵ�.
 */
public class Code_1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String[] a = input.nextLine().split(" ");
		
		ArrayList<String> list = new ArrayList<String>();
		
		int hear = Integer.parseInt(a[0]);//�赵 ���� ����� �� 
		int see = Integer.parseInt(a[1]);//���� ���� ����� �� 
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		
		for(int i=1; i<=(hear+see); ++i) {
			String name = input.nextLine();

			
			if(map.containsKey(name)) {
				list.add(name);
			}
			else {
				map.put(name, 0);
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		
		for(String ss : list)
			System.out.println(ss);
	}

}
