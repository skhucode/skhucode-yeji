package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 08일
 * 내 용 : 백준7785 - 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력한다.
 */
public class Code_7785 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		HashSet<String> set = new HashSet<String>();
		
		int num = input.nextInt();
		
		input.nextLine();
		
		String [] arr;
		
		for(int i=0; i<num; ++i) {
			arr = input.nextLine().split(" ");
			if(arr[1].equals("enter"))
				set.add(arr[0]);
			else
				set.remove(arr[0]);
		}
		
		Object[] array = set.toArray();
		Arrays.sort(array);
		
		for(int i=array.length-1; i>=0; --i)
			System.out.println(array[i]);
	}
}
