package Calendar;

import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		/*달력만들기
		 	1. 마지막달 정리(31,28,31,30,31,30,31,31,30,31,30)
		 	2. 1~12월
		 	3. 1월을 입력하면 1월달 31일까지 보여줘야하고 나머지도 동일함
		 */
		int month;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보고싶은 달력은 몇월달인가요? = ");
		month = sc.nextInt();
		
			switch(month) {
			    case 1: 
			    	for (int i = 1; i <= 31; i++) {
						System.out.print(i + " ");
					}
			         break;
			    case 2: 
			         break;
			    case 3: 
			         break;
			    case 4: 
			         break;
			    case 5: 
			         break;
			    case 6: 
			         break;
			    case 7: 
			         break;
			    case 8: 
			         break;
			    case 9: 
			         break;
			    case 10: 
			         break;
			    case 11: 
			         break;
			    case 12: 
			         break;
			    default: 
			    	System.out.println("잘못된 숫자입니다.");
			         break;
			}
		
	}

	public static CalendarTest getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
