package io;


import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 07�� 19��
 * �� �� : �� ���� ���� ����ϱ�
 * 		���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
		�� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ�.
 */
public class Code_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
	
		for(int i=0; i<=s.length()/10; ++i) {
			if(i==s.length()/10) {
				System.out.println(s.substring(i*10));
			}else {
				System.out.println(s.substring(i*10, i*10+10));
			}
		}
	}
}