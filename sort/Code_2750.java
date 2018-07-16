package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 작성일 : 2018년 07월 14일
 * 내 용 : 백준2750 -N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
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
