package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * 작성일 : 2018년 08월 16일
 * 내 용 : 나이순 정렬
 */
public class Code_10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<Person> list = new ArrayList<Person>();
		
		for(int i=0; i<n; ++i) {
			String[] s = br.readLine().split(" ");
			Person p = new Person();
			p.age = Integer.parseInt(s[0]);
			p.name = s[1];
			p.join = i;
			list.add(p);
		}
		
		Collections.sort(list);
		
		for(Person p : list)
			System.out.println(p);
	}

}
//1.가입한 순서를 person변수에 넣는다 2.stable sorting을 사용한다.
class Person implements Comparable<Person>{
	int age;
	String name;
	int join;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJoin() {
		return join;
	}
	public void setJoin(int join) {
		this.join = join;
	}
	
	@Override
	public String toString() {
		return this.getAge()+" "+this.getName();
	}
	
	@Override
	public int compareTo(Person p) {
		int r = this.age-p.age;
		if(r!=0) return r;
		return this.join-p.join;
	}
}