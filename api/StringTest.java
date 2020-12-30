package api;

public class StringTest {
	
	public StringTest() {
		String data = "서울시 마포구 백범로";
		String data2 = new String("서울시 마포구 백범로");
		
		if(data == data2) {
			System.out.println(data + " 과 " + data2 + " 같다");
		}else {
			System.out.println(data + " 과 " + data2 + " 다르다");
		}
		
		if(data.equals(data2)) {
			System.out.println(data + " 과 " + data2 + " 같다");
		}else {
			System.out.println(data + " 과 " + data2 + " 다르다");
		}
		
		//charAt() : index위치의 문자변환
		char result1 = data.charAt(5);
		System.out.println("charAt()= " + result1);
		
		//concat() : 문자열의 연결 data + data2
		String data3 = "Java OOP Programing...";
		String result2 =  data.concat(data3);
		
		String data4 = "java OOP Programing";
		data.concat(result2);
		
		//equals()
		boolean boo1 = data3.equals(data4);
		System.out.println("equals() = "+ boo1);
		boolean boo2 = data.equalsIgnoreCase(data4);
		System.out.println("equalsIgnoreCase() = "+ boo2);
		
		//getByte() : 문자열을 byte를 변환한다.
		byte result3[] = data3.getBytes();
		for(byte b : result3) {
			System.out.println((char)b);
		}
		
		//indexOf() :  특정문자의 위치 index를 구한다.
		//int result4 = data3.indexOf("OOP");
		//System.out.println("indexOf() = " + result4);
		
		int result4 = data3.indexOf("OOP", 10);
		System.out.println("indexOf() = " + result4);
		
		//length(): 문자수
		int result5 = data3.length();
		System.out.println("length() = " + result5);
		
		//replaceAll() : 특정위치의 문자열 변경
		String result6 = data3.replaceAll("OOP", "객체");
		System.out.println("replaceAll() = " + result6);
		
		
		//split 문자열 쪼게기
		String tel = "010-1234-5678";
		String result7[] = tel.split("-");
		for (int i = 0; i < result7.length; i++) {
			System.out.println("tel["+i + "] = " + result7[i]);
		}
		
		//문자열 일부 구하기
		String result8 = data3.substring(5); //index 5부터 끝까지의 문자열을 구한다.
		System.out.println("substring() = " + result8);
		String result9 = data3.substring(5, 10); //index 5부터 10앞 까지 문자열을 구한다.
		System.out.println("substring() = "+ result9);
		
		//대소문자 변환
		System.out.println("toLowerCase() = "+ data3.toLowerCase());
		System.out.println("toUpperwerCase() = "+ data3.toUpperCase());
		
		//문자열의 크기 비교
		String str1 = "홍길동";
		String str2 = "이순신";
		
		//0: 같다. 양수:왼쪽객체가 크다. 음수: 오른쪽 객체가 작다.
		int result10 = str1.compareTo(str2);
		System.out.println("result10 = " + result10);
		
		//trim 빈칸 없애는 메소드
		String str3 = "            JAVA Programing          ";
			System.out.println("str3 = " + str3.trim());
		
		//기본데이터타입 + char 배열을 문자열로 변환하는 메소드
		int num = 1234;
		String numTxt = String.valueOf(num);
		System.out.println(numTxt + 100);
		
		String num2 = "5678";
		
		Integer num2Int = Integer.valueOf(num2); //Integer , int
		
		//오토박싱 :  기본데이터형이 객체형으로 대입
		//오토 언박싱: 객체형데이터가 기본데이터형으로 대입을 자동으로 하는 것
		Integer numInt =1234;
		int num3 = Integer.valueOf(9999);
		
	}
	
	public static void main(String[] args) {
		new StringTest();

	}

}
