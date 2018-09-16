package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * �ۼ��� : 2018�� 09�� 16��
 * �� �� : ȸ�ǽǹ��� - ȸ�ǽ��� ����ϰ����ϴ� n���� ȸ�ǵ� �� ȸ�ǰ� ��ġ�� �ʰ� ���� ���� ȸ�ǽ��� ����ϴ� ���� ���ض�.
 */
public class Code_1931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Time> list = new ArrayList<Time>();
		
		for(int i=0; i<n; ++i) {
			Time t = new Time(sc.nextInt(), sc.nextInt());
			list.add(t);
		}
		
		//�迭 ����
		Collections.sort(list, new TimeCompare());
		
		int start=0;
		int result=0;
		
		for(int i=0; i<n; ++i) {
			if(start<=list.get(i).start) {
				start = list.get(i).end;
				result+=1;
			}
		}
		
		System.out.println(result);
			
	}
	
}

class Time {
	int start, end;
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
}

class TimeCompare implements Comparator<Time>{
	@Override
	public int compare(Time t1, Time t2) {
		if(t1.end==t2.end)
			return t1.start-t2.start;
		else
			return t1.end-t2.end;
	}
}