import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	
	public Lotto() {
		
	}
	public void start() {
		
		do {
			System.out.print("몇게임 돌리시겠습니까? = ");
			int game = sc.nextInt();
			
			//입력한만큼 게임돌리기
			for (int i = 1; i < game+1; i++) {
				System.out.println(i +"게임 = [");
			}
			
			//변수 출력하기
			int lotto[] = new int[7]; //0,1,2,3,4,5,6
			lotto
			
			
			//계속하시겠습니까? 출력	
			System.out.print("계속하시겠습니까? (1: 예 , 2: 아니요) = "  );
			int replay = sc.nextInt();
			if (replay == 2) {
				break;
			}
		}while(true);
		System.out.println("종료 되었습니다.");
	}

	public static void main(String[] args) {
		new Lotto().start();
	}

}
