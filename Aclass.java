import java.util.Scanner;

public class Aclass {
	//멤버변수
	int num = 500;
	String username = "홍길동";
	
	Scanner sc = new Scanner(System.in);
	//생성자메소드
	//0. 클래스는 암묵적인룰로 맨앞글자에 대문자를 쓴다. / 단어+단어일때는 단어의 앞자리를 영어로쓴다.
	//1. 생성자 메소드는 클래스명 생정자 메소드 명이 같다.
	//2. 메소드는 반드시 ()가 있다.
	//3. 생성자 메소드는 반환값이 없다.
	//4. 매개변수(arguments)는 갯수의 제한이 없다.
	//5. 생성자메소드는 객체 생성시 한번만 실행됨
	//6. 객체 생성시 여러개의 생성자 메소드 호출하는 방법
	
	public Aclass(int num, String name) {
		//this : 지역변수와 멤버변수가 같을 때 멤버 변수를 지정하는 키워드
		this.num = num;
		username = name;
	}
	public Aclass() {
		System.out.println("Aclass()생성자 실행됨..");
		//total();//메소드 호출
	}
	public Aclass(int n) {
		//this: 다른 생성자 호출 실행
		//반드시 첫번째 실행문으로 처리해야한다.
		this(); //첫번쨰
		System.out.println("Aclass(int n)생성자 실행됨.." + n);
	}
	public Aclass(int x, int y, String name) {
		System.out.println("Aclass(int x, int y, String name)생성자 실행됨.." + x +" "+ y +" "+ name);
	}
	public Aclass(int a, int c, double fistName) {
		System.out.println("Aclass(int x, int y, double fistName name)생성자 실행됨.." + a +" "+ c +" "+ fistName);
	}
	
	//메소드: 1~100까지의 합
	//반환형	메소드명:소문자시작 , ()있다.
	public void total() {
		//구현
		int tot=0;
		for (int i = 0; i <=100; i++) {
			tot += i;
		}
		System.out.println("tot = "+ tot );
		System.out.printf("tot = %d\n", tot);
	}
	
	//메소드 : 임의의 값을 전달받아 그 수 까지의합
	public int sum(int max) {
		int sum=0;
		for (int i = 0; i < max; i++) {
			sum += i;
		}
		//System.out.println("sum = "+ sum);
		return sum;
	}
	public int sum() {
		return 1234;
	}
	
}
