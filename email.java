import java.util.Scanner;

import api.StringTokenizerTest;

public class email {

	Scanner sc = new Scanner(System.in);
	
	/*
	  이메일 유효성 검사후 아이디와 도메인 출력하기
	  이메일 입력 = ??????
	  ??????은 잘못입력된 메일입니다.
	  
	  이메일 입력 = kangsan.com@nate.com
	  kangsan.com@nate.com은 잘못입력된 메일입니다...
	  
	  이메일 입력 = goguma@naver.com
	  아이디 = goguma
	  도메인 = nate.com
	  
	 */
	public email() {
	
		while(true) {
			System.out.println("이메일 입력 =");
			String email = sc.next();
			
			if(email.equals("")||email.equals("")) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new StringTokenizerTest();
	}

}
