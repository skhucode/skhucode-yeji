package io;

import java.io.IOException;
import java.util.Scanner;

/*
 * 작성일 : 2018년 07월 23일
 * 내 용 : 2007년
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성.
 * */
public class Code_1924 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String[] s = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		String[] date = input.nextLine().split(" ");
		
		int month = Integer.parseInt(date[0]);
		int day = Integer.parseInt(date[1]);
		int daySum = 0;
				
		while(month-->1) {
			if(month==2) {
				daySum+=28;
			}
			else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				daySum+=31;
			}
			else {
				daySum+=30;
			}
		}
		daySum += day;
		daySum = daySum%7;
		System.out.println(s[daySum]);
		
	}
	/* 런타임 에러 발생!
	  public static void main(String[] args) throws NumberFormatException, IOException {
      // TODO Auto-generated method stub

      Scanner input = new Scanner(System.in);
      
      String[] s = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
      int [] monthDay= {31,28,31,30,31,30,31,31,30,31,30,31};
      
      String[] date = input.nextLine().split(" ");
      
      int month = Integer.parseInt(date[0]);
      int day = Integer.parseInt(date[1]);
      int daySum = 0;
      
      for(int i=0; i<month-1; ++i) {
         daySum +=monthDay[i];
      }
      
      daySum = (daySum+day)%7;
      
      System.out.println(s[daySum-1]);
      
   }

	 */
}
