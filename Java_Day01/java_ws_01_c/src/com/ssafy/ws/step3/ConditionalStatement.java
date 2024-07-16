package com.ssafy.ws.step3;

/**
 * 조건문 연습하기
 * 
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 조건문은 주어진 조건식의 결과에 따른 코드를 실행할 수 있는 명령문입니다.
 * Java에서 사용하는 조건문의 형태는 아래와 같습니다.
 * 
 * 1) if 문
 * 2) if ~ else 문
 * 3) if ~ else if ~ else 문
 * 4) switch ~ case 문
 * 
 * 위 4가지 조건문을 학습해 봅시다.
 */
public class ConditionalStatement {
	
	public static void main(String[] args) {
		
		/* if 문 연습하기 */
		// if 문은 조건식이 참(true)인 경우 Code Block (중괄호, {})에 작성된 코드를 실행하며, 거짓(false)면 실행하지 않습니다.
		
		char value1 = 'b';
		
		// Q. value1이 'a'보다 크거나 같고 'z'보다 작거나 같은 경우 출력해 봅시다.
		if (value1 >= 'a' && value1 <= 'z') {
			System.out.println("value1은 소문자입니다.");
		}
		
		// 실행되는 코드가 1줄이라면 Code Block을 생략할 수 있습니다.
		if (value1 >= 'a' && value1 <= 'z')
			System.out.println("value1은 소문자입니다.");
		
		
		
		/* if ~ else if ~ else 문 연습하기 */
		// 사용해야하는 조건식이 여러가지인 경우 사용할 수 있는 명령문입니다.
		// 어느 한 조건식이 만족한다면 이후 작성된 조건식은 확인하지 않습니다.
		
		char value2 = 'B';
		
		// Q. value2가 'a'보다 크거나 같고 'z'보다 작거나 같은 경우 출력해 봅시다.
		if (value2 >= 'a' && value2 <= 'z') {
			System.out.println("value2은 소문자입니다.");
		}
		// Q. value2이 'A'보다 크거나 같고 'Z'보다 작거나 같은 경우 출력해 봅시다.
		if (value2 >= 'A' && value2 <= 'Z') {
			System.out.println("value2은 대문자입니다.");
		}
		// Q. value2이 'A'보다 크거나 같고 'Z'보다 작거나 같은 경우 출력해 봅시다.
		if (value2 >= 'A' && value2 <= 'Z') {
			System.out.println("value2은 대문자입니다.");
			System.out.println("이 구문은 실행이 될까요?");
		}
		else {
			System.out.println("value2은 소문자도 대문자도 아닙니다.");
		}
		
		
		
		/* if ~ else 문 연습하기 */
		// 사용해야하는 조건식이 1가지이면서 참과 거짓에 따라 다른 코드를 실행해야하는 경우 사용할 수 있는 명령문입니다.
		
		char value3 = 'A';
		
		if (value3 >= 'a' && value3 <= 'z') {
			System.out.println("value3는 소문자입니다.");
		}
		else {
			System.out.println("value3는 소문자가 아닙니다.");
		}
		
		
		/* 삼항 연산자 연습하기 */
		// if ~ else 문을 보다 간결하게 사용할 수 있는 명령문입니다.
		// [조건식] ? [참인 경우 실행되는 위치] : [거짓인 경우 실행되는 위치] 로 표현할 수 있습니다.
		
		char value4 = 'S';
		System.out.println("value4는 " + (value4 >= 'A' & value4 <= 'Z' ? "대문자" : "소문자") + "입니다." );
		
		
		
		/* switch ~ case 연습하기 */
		// 값에 따라 다른 명령을 수행하도록하는 조건문입니다.
		
		int month = 3;
		int day = -1;
		
		switch(month) {
			case 2:
				day = 29;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			default:
				day = 31;
		}
		
		System.out.println("" + month + "월 달은 " + day + "일 입니다.");
	}
}
