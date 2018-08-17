package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 국영수
 */
public class Code_10825 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Student> list = new ArrayList<Student>();
		
		for(int i=0; i<n; ++i) {
			String[] s = br.readLine().split(" ");
			Student st = new Student();
			String name = s[0];
			int ko = Integer.parseInt(s[1]);
			int eng = Integer.parseInt(s[2]);
			int math = Integer.parseInt(s[3]);
			st.ko = ko;
			st.eng = eng;
			st.math = math;
			st.name = name;
			list.add(st);
		}
		
		Collections.sort(list);
		
		for(Student s : list)
			System.out.println(s.getName());
	}
}

class Student implements Comparable<Student>{
	int ko;
	int math;
	int eng;
	String name;
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Student s) {
		int r = s.ko - this.ko; //국어점수가 감소하는 순
		if(r==0) {
			r = this.eng - s.eng; //영어점수가 증가하는 순
			if(r==0)
				r = s.math - this.math; //수학점수가 감소하는 순
			if(r==0)
				r = this.name.compareTo(s.name);
		}
		return r;
	}
}