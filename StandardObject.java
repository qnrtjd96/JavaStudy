import java.util.Scanner;

public class StandardObject {
	
	//전역변수(지역변수던가..?) 선언
	int age,sex,key,weight;
	double standrdweight,swindex;
	String index = null;
	
	public StandardObject() {
		//start();
	}
	
	//시작부분
	public void start() {
		//
		age = getInput("당신의 나이는? = ");
		sex = getInput("당신의 성별은? (남성1, 여성2) = ");
		key = getInput("당신의 키는? = ");
		weight = getInput("당신의 체중은? = ");
		
		double standrdweight = standrdPrint(age, sex); //표준체중
		double swindex = swindexPrint(weight, standrdweight);
		String index = indexPrint(swindex);
		titlePrint(age,sex,key,weight,standrdweight,swindex,index); //결과출력
	}
	
	//콘솔에서 정수를 입력받는 메소드 생성
	public int getInput(String msg) {
		Scanner Scan = new Scanner(System.in);
		System.out.print(msg);
		return Scan.nextInt();
	}
		
	//표준체중
	public double standrdPrint(int age, int sex){
		if (age <= 35) {
			if (sex == 1) {
				standrdweight =(int)((key-100)*0.90);
			}
			else {
				standrdweight = (int)((key-100)*0.85);
			}
		}else {
			if (sex == 1) {
				standrdweight =(int) ((key-100)*0.95);
			}
			else {
				standrdweight = (int)((key-100)*0.95);
			}
		}
		return standrdweight;
	}
	
	//표준체중지수
	public double swindexPrint(int weight, double Standrdeight) {
		swindex = (weight / standrdweight) * 100;
		return swindex;
	}
	
	//index부분
	public String indexPrint(double swindex) {
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
		return index;
	}
	
	//결과출력
	public void titlePrint(int age, int sex, int key, int weight, double standrdweight, double swindex, String index) {
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
