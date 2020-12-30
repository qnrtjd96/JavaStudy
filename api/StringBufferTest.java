package api;

public class StringBufferTest {

	public StringBufferTest() {
		//StringBuffer : 문자열을 비동기식으로 처리 . 문자열이 자주 바뀌는 경우 유용
		StringBuffer sb = new StringBuffer();
		sb.append(true);
		sb.append("Spring");
		//문자열 중간에 문자삽입
		sb.insert(5, "mybatis");
		//01234567890123456
		//trueSmybatispring
		sb.delete(4, 10); //4부터 10앞까지 문자열 삭제
		
		//trueisproing
		sb.reverse();
		
		System.out.println("sb = "+sb);
		System.out.println("capacity = "+ sb.capacity());
	}

	public static void main(String[] args) {
		new StringBufferTest();

	}

}
