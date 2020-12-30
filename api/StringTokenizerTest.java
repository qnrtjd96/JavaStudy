package api;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public StringTokenizerTest() {

	}
	
	public void start() {
		String hobby = "등산///쇼핑//////IT/축구,인터넷,야규";
		
		StringTokenizer st = new StringTokenizer(hobby , "/");
		
		System.out.println("token갯수 = " + st.countTokens());
		//토큰이 있으면 
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}
	
	public static void main(String[] args) {
		new StringTokenizerTest().start();
	}

}
