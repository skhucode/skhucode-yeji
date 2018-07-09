package collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준10845 - 최소힙 구현.
 */
public class Code_1927 {

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
					int minValue = min(list);
					System.out.println(minValue);
					while(iterator.hasNext()) {
						if(iterator.next()==minValue)
							iterator.remove();
					}
				}
			}
			else {
				//list.add(a);
				iterator.add(a);
			}
		}
	}
	
	public static int min(ArrayList<Integer> list) {
		int min=Integer.MAX_VALUE;
		for(int i=0; i<list.size(); ++i) {
			int x = list.get(i);
			if(min>x)
				min=x;
		}
		return min;
	}
	
}
