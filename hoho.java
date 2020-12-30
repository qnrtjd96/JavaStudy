import java.util.Scanner;

public class hoho {
	
	/*
	 	임의의 홀수 입력하기 25입력하면
	 	가운데 25숫자오고 삼각형과 역삼각형만들기
	 */
	public hoho() {
		System.out.print("임의의 홀수 입력(1~49) = ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		new hoho();
	}

}
