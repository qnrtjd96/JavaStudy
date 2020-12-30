package api;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	/*
	 	게임수를 입력받아 게임수 만큼 로또 번호를 생성하여 아래와 같이 출력하라
	 	- 중복번호 제거
	 	- 로또 번호는 오름차순으로 정렬
	 	- 보너스번호 생성
	 */
	
	//이강산
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public Lotto() {
		int replace = 1;
		while(replace == 1) {
			System.out.print("게임수 = ");
			int game = sc.nextInt();
			int g=1;
			while(g < game+1 ) { //무한루프 입력한 숫자만큼 루프를 돌리면됌
				int r_num[]= new int[7]; //랜덤 숫자 7개
				boolean swit[] = new boolean[46]; //스위치 만들기 로또번호 1~45니까 46자리 만듬
				
				for (int i = 0; i < swit.length; i++) {
					swit[i] = false; 
				}
				
				int w = 0;
				while(w<7) {  //랜덤숫자 7개
					int r = ran.nextInt(45)+1;  //랜덤숫자 45개
					if(swit[r] == false) {
						swit[r] = true;  
						r_num[w] = r+1; //1~45
						w++;
					}
				}
				
				int temp;
				for (int i = 0; i < r_num.length- 2; i++) {	// 0 ~6
					for (int j = i + 1; j < r_num.length-1; j++) { // 0~6
						if (r_num[i] > r_num[j]) { //오름
							//swap
							temp = r_num[i];
							r_num[i] = r_num[j];
							r_num[j] = temp;
						}
					}
				}
				
				// 요소값 복사후 대입
				int[] LottoNum = Arrays.copyOfRange(r_num, 0, 6);
				
				System.out.println(g +"게임=" + Arrays.toString(LottoNum) + ", bonus=" + r_num[6]); 

				g += 1;
			}
			System.out.print("계속하시겠습니까?(1:예, 2 아니요) ");
			replace = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		new Lotto();
	}

}
