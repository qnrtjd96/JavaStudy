package api;

import java.util.Scanner;

public class MoneyCount2 {
	
	Scanner sc = new Scanner(System.in);
	public MoneyCount2() {
		
		int money = 5000;
		int div = 5;
		
		System.out.print("금액을 입력하세요 = ");
		int wonInt = sc.nextInt();
		
		while(wonInt>0) {
			int cnt = wonInt/money;
			if(cnt > 0) {
				String dan ="개";
				if(money>=1000) {
					dan = "장";
				}
				System.out.println(money + "원->" + cnt);
				wonInt -= (money * cnt);
			}
			money = money/div; //10000
					if(div ==5)
						div=2;
					else
						div=5;
			
		}

	}

	public static void main(String[] args) {
		new MoneyCount2();
	}

}
