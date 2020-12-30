package api;
import java.util.Scanner;

public class StandardWeight {
	public static void main(String[] args) {
		/*
		 	표중체준 기준
		 	35세 이하
		 		남성 : (키 - 100) * 0.90
		 		여성 : (키 - 100) * 0.85
		 	
		 	36세 이상
		 		남성 : (키 - 100) * 0.95
		 		여성 : (키 - 100) * 0.95
		 		
		 	표준체중 지수 = (현재체중/표준체중) * 100
		 	
		 		표준체중지수 평가기준
		 		마른형 85이하
		 		조금마른형 86~95
		 		표준형 95~115
		 		조금 비만형 116~125
		 		비만형 126이상
		 */
		Scanner sc = new Scanner(System.in);
		double standrdweight; //표준체중
		double swindex; //표준체중지수
		String index = null;
		
		System.out.print("당신의 나이는? = ");
		int age = sc.nextInt();
		
		System.out.print("당신의 성별은? (남성1, 여성2) = ");
		int sex = sc.nextInt();
		
		System.out.print("당신의 키는? = ");
		int key = sc.nextInt();
		
		System.out.print("당신의 체중은? = ");
		int weight = sc.nextInt();
		 
		if (age <= 35) {
			if (sex == 1) {
				standrdweight =(double) ((key-100)*0.90);
			}
			else {
				standrdweight = (double)((key-100)*0.85);
			}
		}else {
			if (sex == 1) {
				standrdweight =(double) ((key-100)*0.95);
			}
			else {
				standrdweight = (double)((key-100)*0.95);
			}
		}
		swindex = (weight / standrdweight) * 100;
		
		/*  switch는 double변수가 안먹는다. 따라서 사용불가
		switch(swindex) {
			case ((int)swindex <= 85):
					
				break;
			case (86 < swindex && swindex<= 95):
						
				break;
			case (95 < swindex && swindex<= 115):
				
				break;
			case (116 < swindex && swindex<= 125):
				
				break;
			case(126 < swindex):
				
				break;
			
			default:
				 System.out.println("값을 잘못입력하셨습니다. 종료합니다.");
				break;
		}
		*/
		if (swindex <= 85) {
			index = "당신은 마른형입니다.";
		}
		if (86 < swindex && swindex<= 95) {
			index = "당신은 조금마른형입니다.";
		}
		if (95 < swindex && swindex<= 115) {
			index = "당신은 표준형입니다.";
		}
		if (116 < swindex && swindex<= 125) {
			index = "당신은 비만형입니다.";
		}
		if (126 < swindex) {
			index = "당신은 비만형입니다.";
		}
		
		
		System.out.println("===============================================");
		System.out.println("나이 = "+ age);
		System.out.println("성별(1:남성,2:여성) = "+ sex);
		System.out.println("키 = "+ key);
		System.out.println("현재체중 = " + weight);
		System.out.println("표준체중 = " + standrdweight);
		System.out.println("당신의 표준체중지수는 "+ swindex + "으로 " + index +"입니다.");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}
}
