package collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준10845 - 최대힙 구현.
 */
public class Code_11279 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		input.nextLine();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListIterator<Integer> iterator;

		for(int i=0; i<num; ++i) {
			iterator = list.listIterator();
			int a = input.nextInt();
			
			if(a==0) {
				if(list.size()==0) {
					System.out.println("0");
				}
				else {
					int maxValue = max(list);
					System.out.println(maxValue);
					while(iterator.hasNext()) {
						if(iterator.next()==maxValue)
							iterator.remove();
					}
				}
			}
			else {
				iterator.add(a);
			}
		}
	}
	
	public static int max(ArrayList<Integer> list) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<list.size(); ++i) {
			int x = list.get(i);
			if(max<x)
				max=x;
		}
		return max;
	}
	
}