import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoT {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	public LottoT() {
		
	}
	public void start() {
		do {
			System.out.print("게임수 = ");
			int game = scan.nextInt();
			
			//입력받은 게임 수 만큼 로또번호 처리
			for(int cnt=1; cnt<=game; cnt++) { //cnt->1,2,3,4, ....
				
				//1게임 저장할 배열생성
				int lotto[] = new int[7]; //0,1,2,3,4,5,6
				
				//난수만들기
				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = ran.nextInt(45)+1; //1~45
					
					//중복검사
					for (int check = 0; check < i; check++) { //
						if (lotto[check] == lotto[i]) { //중복값일때
							i--;
						}
					}
				}
				
				//정렬
				for (int j = 0; j < lotto.length-2; j++) {
					for (int i = 0; i < lotto.length-2; i++) {
						if(lotto[i]>lotto[i+1]) {
							int temp = lotto[i];
							lotto[i] = lotto[i+1];
							lotto[i+1] = temp;
						}
					}
				}
				//출력
				System.out.print(cnt + "게임 = [");
				for (int i = 0; i < lotto.length-1; i++) {
					System.out.print(lotto[i]);
					if(i==5) {
						System.out.print("],");
					}else {
						System.out.print(", ");
					}
				}
				//보너스
				System.out.println("bonus = " + lotto[lotto.length-1]);
			}
			//계속 여부 확인
			System.out.print("계속하시겠습니까?(1: 예 , 2: 아니요)");
			int que = scan.nextInt();
			if(que ==2) break; //반복문 중지
		}while(true);
		System.out.println("프로그램이 종료되었습니다..");
	}

	public static void main(String[] args) {
		new LottoT().start();
	}

}
