package com.ssafy.ws.step1;

/**
 * 예외 처리 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 예외 처리는 try ~ catch ~ finally 구문을 활용합니다.
 * 
 */
public class ExceptionHandling {
	public static void main(String[] args) {
		
		/* 예외 처리 연습하기 */
		
		// Q. 10 / 0 을 출력해 봅시다.
		//    실행 후 주석처리합니다.
		//System.out.println("10 / 0: " + 10 / 0);
		
		
		
		// Q. 10 / 0을 수행하면 어떤 에러가 발생하는지 작성해 봅시다.
		System.out.println("10 / 0을 수행하면 java.lang.ArithmeticException: / by zero 가 발생합니다.");
		
		// Q. try ~ catch 구문을 이용하여 다시 10 / 0을 출력해 봅시다.
		try {
			
			System.out.println("10 / 0: " + 10 / 0);
			
		}
		// Q. 여기에 예외 클래스를 작성해 봅시다.
		catch(ArithmeticException e) {
			
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		
		// Q. try ~ catch ~ finally 를 이용하여 다시 10 / 0을 출력해 봅시다.
		try {
			System.out.println("10 / 0 수행 전 출력문");
			System.out.println(10/0);
			
			// 아래 출력문이 실행되지 않음을 확인해봅니다.
			System.out.println("10 / 0 수행 후 출력문");
		}
		// Q. 여기에 예외 클래스를 작성해 봅시다.
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("무조건 실행됩니다.");
		}
	}
}
