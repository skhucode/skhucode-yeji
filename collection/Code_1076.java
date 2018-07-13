package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준1076 - 첫째 줄에 입력을 주어진 저항의 저항값을 출력한다.
 */

public class Code_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("black", 0);
		map.put("brown", 1);
		map.put("red", 2);
		map.put("orange", 3);
		map.put("yellow", 4);
		map.put("green", 5);
		map.put("blue", 6);
		map.put("violet", 7);
		map.put("grey", 8);
		map.put("white", 9);
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0; i<3; ++i) {
			list.add(input.nextLine());
		}
		String a = "";
		
	//	long value = 0;
		for(int i=0; i<list.size()-1; ++i) {
			//System.out.print(map.get(list.get(i)));
			a += map.get(list.get(i));
			// value = map.get(list.get(i))*10 + map.get(list.get(i));
		}
		
		long x = map.get(list.get(2));
		for(int i=0; i<x; ++i) {
			a+="0";
			//value *= 10;
		}
		System.out.println(Long.parseLong(a));
	}
}
