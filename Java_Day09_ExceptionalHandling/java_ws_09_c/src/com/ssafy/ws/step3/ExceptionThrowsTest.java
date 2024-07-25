package com.ssafy.ws.step3;

/**
 * 예외 회피 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 이전 실습을 통해 예외가 발생하는 경우 try ~ catch ~ finally 구문을 이용해 처리할 수 있음을 확인했습니다.
 * 
 * 어느 한 메소드에서 예외가 발생하는 경우 해당 메소드에서 처리하는 것이 적절하지 않은 경우,
 * 해당 메소드를 호출한 위치에서 예외를 전달받아 처리할 수 있습니다.
 * 
 */
public class ExceptionThrowsTest {

	// Q. 두 수를 전달받아 나눈 결과를 반환하는 calc() 메소드를 선언해 봅시다.
	public static double calc(int value1, int value2) {
		return value1/value2;
	}
	
	// Q. 두 수를 전달받아 나눈 결과를 반환하는 calc2() 메소드를 선언해 봅시다.
	//    ArithmeticException이 발생할 수 있으므로 예외를 처리하는 코드를 포함합니다.
	public static double calc2(int value1, int value2) {
		try {
			return value1 / value2;
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		return -1;
	}
	
	// Q. 두 수를 전달받아 나눈 결과를 반환하는 calc3() 메소드를 선언해 봅시다.
	//    'throws' 키워드를 이용하여 main 함수에서 처리할 수 있도록 선언합니다.
	public static double calc3(int value1, int value2) throws ArithmeticException {
		return value1 / value2;
	}
	
	public static void main(String[] args) {
		
		// Q. calc 메소드에 10과 1을 전달하여 결과를 출력해 봅시다.
		System.out.println(calc(10, 1));
		
		// Q. calc 메소드에 10과 0을 전달하여 결과를 출력해 봅시다.
		//    ArithmeticException이 발생함을 확인합니다.
		//    확인 후 아래 코드를 주석처리 합니다.
		//System.out.println(calc(10, 0));
		// java.lang.ArithmeticException: / by zero
		
		
		
		// Q. calc2 메소드에 10과 1을 전달하여 결과를 출력해 봅시다.
		System.out.println(calc2(10, 1));
		
		// Q. calc2 메소드에 10과 0을 전달하여 결과를 출력해 봅시다.
		System.out.println(calc2(10, 0));
		
		
		
		// Q. calc3 메소드에 10과 1을 전달하여 결과를 출력해 봅시다.
		System.out.println("calc3 메소드에 10과 1을 전달하여 결과를 출력해 봅시다.");
		System.out.println(calc3(10, 1));
		
		// Q. calc3 메소드에 10과 0을 전달하여 결과를 출력해 봅시다.
		//    아래 코드에서 ArithmeticException이 발생함을 확인합니다. (코드 라인 확인 필수)
		//    확인 후 아래 코드를 주석처리 합니다.
		System.out.println("calc3 메소드에 10과 1을 전달하여 결과를 출력해 봅시다.");
//		System.out.println(calc3(10, 0));
//		
		
		// Q. calc3 메소드에 10과 0을 전달하여 결과를 출력해 봅시다.
		//    try ~ catch 구문을 이용하여 예외를 전달 받아 처리합니다.
		try {
			System.out.println(calc3(10, 0));
		}
		catch (ArithmeticException e) {
			System.out.println("main 메소드에서 호출된 예외 메시지입니다.");
			System.out.println("calc3 예외를 전달받아 출력합니다.");
		}
		
	}
}
