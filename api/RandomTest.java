package api;

import java.util.Random;

public class RandomTest {

	public RandomTest() {
		start();
	}
	
	public void start() {
		//Random : 난수 클래스
		Random ran = new Random();
		for (int i = 1; i < 1000; i++) {
			
			//논리형 : true , false
			//boolean ranBoo = ran.nextBoolean();// 논리형 : true , false
			//System.out.print(ranBoo + "\t");
			
			//double result = ran.nextDouble();
			//System.out.print(result + "\t");
			
			int result = ran.nextInt();
			result = ran.nextInt(100); //0~99
			result = ran.nextInt(31)+10; //10~40 -> 0~30 
			System.out.print(result + "\t");
			if(i%10 ==0) System.out.println();
		}
	}

	public static void main(String[] args) {
		new RandomTest();

	}

}
