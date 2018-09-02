package graph;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 작성일 : 2018년 09월 02일
 * 내 용 : 반복수열
 */
public class Code_2331 {
	
	static int p;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //처음 시작하는 수 
		 p = sc.nextInt(); //p번 곱하기
		
		map = new HashMap<Integer,Integer>();
		System.out.println(function(a,1));

		
	}
	
	static Map<Integer, Integer> map;
	
	static int function(int n, int cnt) {
		int x = 0;
		if(map.containsKey(n)) {
			return map.get(n)-1;
		}else {
			map.put(n, cnt);
			x = nextNum(n, p);
			return function(x, cnt+1);
		}
	}
	
	static int pow(int x, int p) {
		int result = 1;
		for(int i=0; i<p; ++i) {
			result = result * x;
		}
		return result;
	}
	
	static int nextNum(int a, int p) {
		int result = 0;
		while(a>0) {
			result += pow(a%10, p);
			a /= 10;
		}
		return result;
	}
}

