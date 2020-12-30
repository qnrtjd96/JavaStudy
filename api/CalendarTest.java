package api;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args){
		
	//현재 시스템의 날짜, 시간 관련 정보를 객체를 생성한다.
	Calendar now = Calendar.getInstance();
	//System.out.print(now);
	now.set(2021, 4, 28);
	// set(int field, int vlue)
	now.set(Calendar.YEAR, 2025);
	now.set(Calendar.MONTH, 0);
	now.set(Calendar.DAY_OF_MONTH, 0);
	
	// 2020-12-24 11:55(목)
	int y = now.get(Calendar.YEAR);//now.YEAR; //년
	int m = now.get(Calendar.MONTH);//now.MONTH+1; //월
	int d = now.get(Calendar.DAY_OF_MONTH); //now.DAY_OF_MONTH; //일
			
	int h = now.get(Calendar.HOUR_OF_DAY); //now.HOUR; //시 HOUR:12시간 기준 HOUT_OF_DAY:24시간기준
	int mi = now.get(Calendar.MINUTE); //now.MINUTE; //분
	
	int w = now.get(Calendar.DAY_OF_WEEK);//now.DAY_OF_WEEK; //요일 일요일:1, 월2, 화3, 수4, 토7
	
	String weekStr = "";
	//int보다 작은 정수, char, String
	switch(w){
		case 1: 
			weekStr = "일";
			 break;
	    case 2: 
	    	weekStr = "월";
	         break;
	    case 3: 
	    	weekStr = "화";
	         break;
	    case 4: 
	    	weekStr = "수";
	         break;
	    case 5: 
	    	weekStr = "목";
	         break;
	    case 6: 
	    	weekStr = "금";
	         break;
	    case 7: 
	    	weekStr = "토";
	         break;
	}
	System.out.printf("%d-%d-%d %d:%d(%s)\n", y, m, d, h, mi, weekStr);
	//System.out.println(y +" "+ m+ " "+ d+" "+ h+" "+ mi+" "+ weekStr);
	
	
	///////////////////////////////////////////
	int yearMax = now.getActualMaximum(Calendar.YEAR);
	System.out.println("MAX => "+ yearMax);
	
	int monthMax = now.getActualMaximum(Calendar.MONTH);
	System.out.println("monthMax = "+ monthMax);
	
	int dayMax = now.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println("dayMAx = " + dayMax);
 }
}