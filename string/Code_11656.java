package string;

import java.util.Arrays;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 30��
 * �� �� : ���̻� �迭
 * 		ù° �ٺ��� S�� ���̻縦 ���������� �� �ٿ� �ϳ��� ����Ѵ�.
 */
public class Code_11656 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		String[] arr= new String[s.length()];
		
		for(int i=0; i<s.length(); ++i) {
			arr[i] = s.substring(i, s.length());
		}
		Arrays.sort(arr);
		
		for(String ss : arr)
			System.out.println(ss);
	}
}
