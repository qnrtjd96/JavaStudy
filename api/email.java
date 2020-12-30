package api;
import java.util.Scanner;
import java.util.regex.Pattern;

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
	
	//시작
	public email() {
		while(true) {
			System.out.print("이메일 입력 = ");
			String email = sc.next();
			
			boolean str = isEmail(email);
			
			//오류발견 kangsan.com@kangsan.com하면 실패해야대는데 성공함
			if(str == true) {
				String result7[] = email.split("@");
					System.out.println("아이디 = " + result7[0]);
					System.out.println("도메인 = " + result7[1]);
			}else {
				System.out.println(email+"는 잘못입력된 메일입니다.");
			}
		}
	}
	
	//이메일 유효성검사
	public boolean isEmail(String str) {
		return Pattern.matches("^[a-z0-9A-Z._-]*@[a-z0-9A-Z]*.[a-zA-Z.]*$", str);
	}

	//실행
	public static void main(String[] args) {
		new email();
	}

}
