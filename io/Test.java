package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
		
//		int n = input.nextInt();
		
		//System.out.println(); �̰ɷ��ϸ� �ȵȴ�.
//		input.nextLine(); //�Է� �� �ٹٲ� ����
		
	//	String s = input.nextLine();
		
		//System.out.println("n:"+n + "s : "+s);
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(bf.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=s; ++i)
			sb.append(i);
		
		System.out.print(sb);
		//int s = bf.read();
		
	//	System.out.println(s);
		
	//	String s = bf.readLine();
		
	//	StringTokenizer st = new StringTokenizer(s,",");
		
		//while(st.hasMoreTokens())
	//		System.out.println(st.nextToken());
		
	}

}
