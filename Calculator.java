//패키지
//import문 - 다른 클래스를 객체 또는 상속을 받아 사용할 때 클래스가 있는 위치를 알려준다.
import pac.AAA;
import java.lang.String;
import java.lang.System;
import java.util.Calendar;

public class Calculator {
	//멤버영역 - 실행문을 구현할수 없음
	
	//멤버 변수
	
	//생성자 메소드
	
	//메소드
	
	//메인메소드
	
	//내부클래스
	public static void main(String args[]) {
		//다른 클레스에서 구현한 기능을 사용할때
		//1. 객체(new): 생성자 메소드 2. 상속
		// 래퍼런스 변수
		Aclass obj = new Aclass();
		int num = 100;
		System.out.println("obj = " + obj);
		
		Aclass obj2 = new Aclass(10,5,"hong");
		
		Aclass obj3 = new Aclass(120);
		
		//객체내의 메소드 호출
		obj2.total();
		int result = obj.sum(100);
		System.out.println("result == " + result);
		
		String s  = new String();
		String ss = new String(new byte[] {65,66,67,68,69});
		System.out.println(ss);
		
		String sss = new String(new char[] {'T','E','S','T'});
		System.out.println(sss);
		
		//char c =sss.charAt(sss);
		//System.out.println(c);
		
		
	}
	/*
	public static void main(String arg[]) {
		
	}
	public static void main(String ss[]) {
		
	}
	public static void main(String args[]) {
		
	}
	*/
}
