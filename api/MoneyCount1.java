package api;

import java.util.Scanner;

public class MoneyCount1 {
	
	Scanner sc = new Scanner(System.in);
	int[] money = {50000, 10000, 1000, 500, 100, 10, 5 ,1};
	public MoneyCount1() {
		
		System.out.print("금액을 입력하세요 = ");
		int wonInt = sc.nextInt();
		
		System.out.println("money="+money);
			for(int i=0; i<money.length; i++) {
				int cnt = wonInt/money[i];
				if(cnt>0){
					System.out.print(money[i]+ "원 = " +cnt);
					if(money[i]>=1000) {
						System.out.println("장");
					}else {
						System.out.println("개");
					}
					wonInt -=(cnt*money[i]); //차액계산
				}
			}
	}

	public static void main(String[] args) {
		new MoneyCount1();
	}

}
