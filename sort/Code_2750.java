package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * �ۼ��� : 2018�� 07�� 14��
 * �� �� : ����2750 -N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
public class Code_2750 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		
		int num = Integer.valueOf(br.readLine());
		
		for(int i=0; i<num; ++i) {
			list.add(Integer.valueOf(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(int i : list)
			System.out.println(i);
	}

}
