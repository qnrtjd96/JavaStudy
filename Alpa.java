import java.util.Scanner;

public class Alpa {
	//이강산
	Scanner sc = new Scanner(System.in);
	
	public Alpa() {
		
		/*
		 	알파벳 다이아몬드 
		 		A
		 	   BCD
		 	  EFGHI
		 	 JKLMNOP
		 	    :
		 */	 
		
		System.out.print("홀수를 입력해주세요(1~49) = ");
		int num = sc.nextInt();
		
		//알파벳 출력을 위한 배열선언
		//char Alpabat[] = new char[2];
		char a = 'A';
		
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++){
			  //위쪽영역 출력하기
			     if (i<=num/2){
			    	//왼쪽 위에 공백찍기
			        if (i+j<=num/2-1) {
			           System.out.print(" ");
			        }
			        //오른쪽 위에 공백찍기
			        else if(num/2+1<= j-i) {
			        	System.out.print(" ");
			        }
			        else {
			           System.out.print(a++);// *찍기
			        }
			        if (a>'Z') {
						a = 'A'; 
					}
			     }
			     //아래쪽영역 출력하기
			     else if (i>num/2){
			    	 //왼쪽위에 출력하기
			        if (i-j>=num/2+1){
			        	System.out.print(" ");
			        }else if(num/2*3+1 <= i+j){ //오른쪽 밑 공백
			        	System.out.print(" ");
			        }
			        else {
			        	System.out.print(a++); // *찍기
			        }
			     }
		  }
		  System.out.println();//줄바꿈
		  if (a>'Z') {
			  a = 'A'; 
		  }
		}
	}

	public static void main(String[] args) {
		new Alpa();

	}

}
