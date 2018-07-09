package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 09일
 * 내 용 : 백준10815 - 첫째 줄에 입력으로 주어진 M개의 숫자에 대해서, 각 숫자가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.
 */
public class Code_10815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		LinkedHashSet<Integer> setA = new LinkedHashSet<Integer>();
		
		LinkedHashSet<Integer> setB = new LinkedHashSet<Integer>();
		
		int a = input.nextInt();

		input.nextLine();
		
		String[] arr = input.nextLine().split(" ");
				
		for(int i=0; i<a; ++i)
			setA.add(Integer.parseInt(arr[i]));
		
		
		int b = input.nextInt();
		
		input.nextLine();
		
		String[] brr = input.nextLine().split(" ");
		
		for(int i=0; i<b; ++i)
			setB.add(Integer.parseInt(brr[i]));
		
		//setB를 돌면서 setA의 값이 있으면 1 없으면 0 
		for(int i : setB)
			if(setA.contains(i)) System.out.print("1 ");
			else System.out.print("0 ");
	}

}
