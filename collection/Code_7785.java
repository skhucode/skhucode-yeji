package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 08��
 * �� �� : ����7785 - ���� ȸ�翡 �ִ� ����� �̸��� ���� ���� �������� �� �ٿ� �� �� ����Ѵ�.
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
