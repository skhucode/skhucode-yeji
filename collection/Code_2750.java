package collection;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 08��
 * �� �� : ����2570 - N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Code_2750 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int num = input.nextInt();
		
		int[] arr=new int[num];
		
		for(int i=0; i<num; ++i) {
			arr[i] = input.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i : arr)
			System.out.println(i);
		
	/*
		int x = input.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=0; i<x; ++i) {
			int temp = input.nextInt();
			a.add(temp);
		}
		
		Collections.sort(a);
		
		for(int i : a)
			System.out.println(i);
	*/	
	}
}
