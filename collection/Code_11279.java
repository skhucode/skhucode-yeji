package collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준11279 - 최대힙 구현.
 */
public class Code_11279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare compare = new Compare();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(1, compare);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int x = sc.nextInt();
			if(x==0) {
				if(q.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(q.poll());
				}
			}
			else {
				q.offer(x);
			}
		}
	}
	
	static class Compare implements Comparator<Integer>{
	
		public int compare(Integer i1, Integer i2) {
			return i2.compareTo(i1);
		}
	}
	/***시간 초과 나옴.. 
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
				//list.add(a);
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
	****/
}