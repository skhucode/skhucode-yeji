package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 09��
 * �� �� : ����10815 - ù° �ٿ� �Է����� �־��� M���� ���ڿ� ���ؼ�, �� ���ڰ� ���� ���� ī�带 ����̰� ������ ������ 1��, �ƴϸ� 0�� �������� ������ ����Ѵ�.
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
		
		//setB�� ���鼭 setA�� ���� ������ 1 ������ 0 
		for(int i : setB)
			if(setA.contains(i)) System.out.print("1 ");
			else System.out.print("0 ");
	}

}
