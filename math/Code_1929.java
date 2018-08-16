package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �ۼ��� : 2018�� 08�� 16��
 * �� �� : �Ҽ� ���ϱ�
 */
public class Code_1929 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		//m�̻� n������ �Ҽ��� ��� ���.
		int m = Integer.parseInt(arr[0]);
		int n = Integer.parseInt(arr[1]);

		boolean[] b = new boolean[n+1]; //������������ üũ�ϱ� ���� �迭
		
		//i*i<=n�� �� n=1000000�̸� i=1000���� ����.
		for(int i=2; i*i<=n; ++i) {
			if(b[i]==false) { //�������� �ʾ�����
				for(int j=i*i; j<=n; j+=i) {
					b[j] = true; //�� ���� ����� �� �����.
				}
			}
		}
		//�� ���������� 27line���� i*i���ص� ������ ���� �ʱ� ������ i*i�� ��������
		//������ �Ѿ�� ��츦 �����ؼ� ���� i+i�Ǵ�i*2�� ����Ѵ�.
		
		for(int i=m; i<=n; ++i) {
			if(b[i]==false&&i!=1)
				System.out.println(i);
		}
	}
}
