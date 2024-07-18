package com.ssafy.ws.step1;

/**
 * 메소드 오버로딩 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 오버로딩은 '같은 이름의 메소드'를 중복하여 정의하는 것을 말합니다.
 * '같은 이름'을 갖지만 반드시 '서로 다른 파라미터'가 존재해야만 합니다.
 * 
 * '서로 다른 파라미터'는 변수의 데이터 타입이 다르거나, 개수가 다른 것을 의미합니다.
 * '메소드 반환 타입'과 '변수 이름'은 오버로딩의 요소가 아님에 주의합니다.
 * 
 */
public class MethodOverloading {
	
	/* 메소드 오버로딩 확인하기 */
	static int add(int value1, int value2) {
		return value1 + value2;
	}
	
	// 아래 주석을 제거하면 에러가 발생합니다.
	// 위의 메소드와 다른 점은 '반환 타입'입니다.
	// 반환 타입은 오버로딩의 요소가 아님을 확인합니다.
//	static double add(int value1, int value2) {
//		return value1 + value2;
//	}
	
	// 반환 타입은 다르지만 파라미터가 다름을 확인할 수 있습니다.
	// 에러 없이 메소드 오버로딩을 사용할 수 있습니다.
	static double add(int value1, double value2) {
		return value1 + value2;
	}
	
	
	// 아래 주석을 제거하면 에러가 발생합니다.
	// 위의 메소드와 다른 점은 '변수 이름'입니다.
	// 변수 이름은 오버로딩의 요소가 아님을 확인합니다.
//	static double add(int value3, double value4) {
//		return value3 + value4;
//	}
	
	// 파라미터가 double, int 타입 순으로 정의되어있습니다.
	// 순서가 다르면 서로 다른 메소드임을 확인할 수 있고, 오버로딩이 가능함을 확인할 수 있습니다.
	static double add(double value1, int value2) {
		return value1 + value2;
	}
	
	static double add(double value1, double value2) {
		return value1 + value2;
	}
	
	// 파라미터의 개수가 다른 경우에도 오버로딩이 가능함을 확인합니다.
	static double add (double value1, double value2, double value3) {
		return value1 + value2 + value3;
	}
	
	
	public static void main(String[] args) {
	
		// System.out.println();
		// System 밑의 out 밑의 println 메소드가 존재합니다.
		System.out.println();
		
		// Q. 정수형 10을 출력해 봅시다.
		System.out.println(10);
		
		// Q. 실수형 10.0을 출력해 봅시다.
		System.out.println(10.0);
		
		// Q. 실수형 10.0f를 출력해 봅시다.
		System.out.println(10.0f);
		
		// 연습. 아래 println을 컨트롤 + 마우스 왼쪽 으로 클릭해 봅시다.
		//          vvvvvvv
		System.out.println();
		
		// println() 메소드 또한 다양한 데이터 타입의 파라미터를 전달받는 것을 확인합니다.
	}
}
