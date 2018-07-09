package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준1764 -듣보잡의 수와 그 명단을 사전순으로 출력한다.
 */
public class Code_1764 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String[] a = input.nextLine().split(" ");
		
		ArrayList<String> list = new ArrayList<String>();
		
		int hear = Integer.parseInt(a[0]);
		int see = Integer.parseInt(a[1]);
		
		Map<String, String> map = new HashMap<String,String>();
		
		for(int i=1; i<=(hear+see); ++i) {
			if(i<=hear) {
				map.put(input.nextLine(), "hear");
			}
			else if(i>=hear+2) {
				String name = input.nextLine();
				if(map.containsKey(name))
					list.add(name);
			}
			else {
				String n = input.nextLine();
			}
		}
		
		System.out.println(list.size());
		
		Collections.sort(list);
		
		for(String t : list)
			System.out.println(t);
	}

}
