package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 작성일 : 2018년 08월 31일
 * 내 용 : 암호코드
 */
public class Code_2011 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();

		int[] dp = new int[s.length()];
		
		if(s.charAt(0)-'0'!=0) //0입력 시 0이 출력되어야 한다.
			dp[0]=1;
		
		for(int i=1; i<s.length(); ++i) {
			int x = s.charAt(i)-'0';
			int y = s.charAt(i-1)-'0';
			int z = 10*y+x;

			if(1<=x && x<=9) {
				dp[i] = (dp[i]+dp[i-1])%1000000;
			}
			
			if(i==1&&y!=0) {
				if(10<=z && z<=26)
					dp[i]+=1;
				continue;
			}
			
			if(y==0)
				continue;
						
			if(10<=z && z<=26)
				dp[i]=(dp[i]+dp[i-2])%1000000;
			
		}

		
        System.out.println(dp[s.length()-1]);

	}
}
