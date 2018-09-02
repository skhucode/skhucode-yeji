package tree;

import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 08�� 29��
 * �� �� : Ʈ�� ��ȸ
 * 		���� Ʈ�� �Է� �� ���� ��ȸ, ���� ��ȸ, ���� ��ȸ�� ����� ���.
 */
public class Code_1991 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//����� ����
		
		sc.nextLine();
		
		int[][]  a = new int[26][2];//[A-Z][��,���ڽ�]
		
		//����� �ڽ� �Է�
		for(int i=0; i<num; ++i) {
			String[] s = sc.nextLine().split(" ");
			int x = s[0].charAt(0);
			char y = s[1].charAt(0);
			char z = s[2].charAt(0);
			
			if(y=='.') {
				a[x-'A'][0] = -1;
			}else {
				a[x-'A'][0] = y-'A';
			}
			if(z=='.') {
				a[x-'A'][1] = -1;
			}else {
				a[x-'A'][1] = z-'A';
			}
		
		}
		
		preorder(a, 0);
		System.out.println();
		inorder(a, 0);
		System.out.println();
		postorder(a, 0);
		System.out.println();
		
	}

	static void preorder(int[][] a, int x) {
		System.out.print((char)(x+'A'));
		if(a[x][0]!=-1)
			preorder(a, a[x][0]);
		if(a[x][1]!=-1)
			preorder(a, a[x][1]);
	}

	static void inorder(int[][] a, int x) {
		if(a[x][0]!=-1) {
			inorder(a, a[x][0]);
		}
		System.out.print((char)(x+'A'));		
		if(a[x][1]!=-1) {
			inorder(a, a[x][1]);
		}
	}
	
	static void postorder(int[][] a, int x) {
		if(a[x][0]!=-1) {
			postorder(a, a[x][0]);
		}
		if(a[x][1]!=-1) {
			postorder(a, a[x][1]);
		}
		System.out.print((char)(x+'A'));		

	}
	
}
