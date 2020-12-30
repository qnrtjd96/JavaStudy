package api;

import java.util.Scanner;

public class EmailCheck {
	
	Scanner sc = new Scanner(System.in);
	public EmailCheck() {
		do {
			System.out.print("이메일입력 = ");
			String email = sc.nextLine();
			int atMark = email.indexOf("@");  // @: at Mark
			int point = email.indexOf("."); //.위치
			
			int pointCnt = 0;
			for(int i = 0; i<email.length(); i++) { // i =0,1,2,3,4,5....
				if(email.charAt(i)== '.') {
					pointCnt++;
				}
			}
			if(atMark==-1 || point == -1 || atMark>point || (point-atMark)<3 || pointCnt > 2) {
				System.out.println(email + " 주소는 잘못된 이메일 주소입니다.");
			}else { //정상 이메일주소
				// goguma@nate.com : String.split, StringTokenizer
				//String emailResult[] = email.split("@");
				
				String id = email.substring(0, atMark);
				String domain = email.substring(atMark+1);
				
				System.out.println("아이디 = "+ atMark);
				System.out.println("도메인 = "+ domain);
			}
		}while(true);
	}

	public static void main(String[] args) {
		new EmailCheck();
	}

}
