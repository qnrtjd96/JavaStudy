package api;

import java.util.Scanner;

public class MoneyCount {

	Scanner sc = new Scanner(System.in);
	
	/*
	 	실행
	 	금액을 입력하세요? = 254832
	 	50000원 = ?장
	 	10000원 = ?장
	 	500원 = ?개
	 	100원 = ?개
	 	10원 = 3개
	 	1원 = 2개
	 */
	//시작
	public MoneyCount() {
		int[] coinUnit = {50000, 10000, 500, 100, 10 ,1};
		System.out.print("금액을 입력하세요 = ");
		int money = sc.nextInt();
		
		System.out.println("money="+money);
			for(int i=0; i<coinUnit.length; i++) {
				System.out.println(coinUnit[i]+"원: "+ money / coinUnit[i]);
		        money %= coinUnit[i];
			}
	}

	//실행
	public static void main(String[] args) {
		new MoneyCount();
	}

}
