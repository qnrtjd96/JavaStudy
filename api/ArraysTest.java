package api;

import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		int data[] = {12,34,987,45,125,1234,124,5123,123,4,123,412,32415,4352,123,141254123,54123,4213};
		//배열객체의 데이터를 크기순으로 정렬
		//Arrays.sort(data); //오름차순으로 정렬
		Arrays.sort(data, 1, 5);  //index 1부터 5까지만 정렬
		System.out.println("정렬후 - > " + Arrays.toString(data));
		
		int data2[] = Arrays.copyOfRange(data, 0, 5); //1부터 5까지만 복사하기
		System.out.println("복사하기 ->" + Arrays.toString(data2));
		
		int data3[] = Arrays.copyOf(data2, 5); //5개까지만 복사하기
		System.out.println("복사하기2 -> " + Arrays.toString(data3));
		
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		int data4[] = new int[20];
		//data 배열의 index 5인 위치의 값부터 data4의 index 3의 위치에 6개를 복사하라
		System.arraycopy(data, 5, data4, 3, 4);
		System.out.println("복사하기3 -> "+ Arrays.toString(data4));
		
	}

	public static void main(String[] args) {
		new ArraysTest();
	}

}
