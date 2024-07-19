package com.ssafy.ws.step1;

/**
 * 변수 선언 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채워 프로그램을 완성해 봅시다.
 * 
 * 변수는 아래와 같은 형식으로 선언할 수 있습니다.
 * [데이터 타입] [변수 이름] = [값];
 * 
 */
public class VariablesAndTypes {
	
	public static void main(String[] args) {
		
		/* 기본형(Primitive Type) 연습하기 */

		// Q. 1 Byte 는 몇 Bit 인가요?
		System.out.println("1 Byte는 8 bits 입니다.");
		
		
		// Q. -128부터 127까지 저장할 수 있는 데이터 타입을 선언해 봅시다.
		byte value1 = 100;
		System.out.println("value1의 값: " + value1);
		
		
		// Q. -32768부터 32767까지 2 Byte를 저장할 수 있는 데이터 타입을 선언해 봅시다.
		short value2 = 30000;
		System.out.println("value2의 값: " +  value2);
		
		
		// Q. -2147483648부터 2147483647까지 저장할 수 있는 데이터 타입을 선언해 봅시다.
		//    정수 형태 데이터 중에서 기본으로 사용되는 데이터 타입입니다.
		int value3 = 2100000000;
		System.out.println("value3의 값: " + value3);
		
		
		// Q. -9223372036854775808부터 9223372036854775807까지 저장할 수 있는 데이터 타입을 선언해 봅시다.
		long value4 = 9000000000000000000L;
		System.out.println("value4의 값: " + value4);
		
		
		// Q. 0부터 65535까지 저장할 수 있는 데이터 타입을 선언해 봅시다.
		//    \u0000부터 \uffff로 저장할 수 있습니다.
		char value5 = '\u0041';
		System.out.println("value5의 값: " + value5);
		
		
		// Q. 4 Byte(32 Bit) 크기를 갖는 실수형 데이터 타입을 선언해 봅시다.
		float value6 = 0.123456789123456789f;
		System.out.println("value6의 값: " + value6);
		
		
		// Q. 8 Byte(64 Bit) 크기를 갖는 실수형 데이터 타입을 선언해 봅시다.
		//	    실수 형태 데이터 중에서 기본으로 사용되는 데이터 타입입니다.
		double value7 = 0.123456789123456789;
		System.out.println("value7의 값: " + value7);
		
		
		// Q. true와 false를 저장할 수 있는 데이터 타입을 선언해 봅시다.
		boolean value8 = true;
		System.out.println("value8의 값: " + value8);
		
		
		/* 참조형(Reference Type) 연습하기 */ 
		// 기본형을 제외한 모든 데이터 타입을 참조형이라 부릅니다.
		
		// Q. 문자열 데이터를 저장할 수 있는 변수를 선언해 봅시다.
		String value9 = "SSAFY";
		System.out.println("value9의 값: " + value9);
		
		
		
		
		/* 형 변환(Type Casting) 연습하기 */ 
		// 기본형은 기본형끼리, 참조형은 참조형끼리 형 변환이 가능합니다.
		// 형 변환에는 묵시적 형(Implicit) 변환과 명시적(Explicit) 형 변환이 있습니다.
		// 값의 크기, 타입의 크기가 아닌 표현 범위에 따라 형 변환이 이루어집니다./
		
		// Q. int형 value10을 실수형 value11에 저장해 봅시다.
		int value10 = 10;
		float value11 = value10;
		System.out.printf("실수형 변환이 이루어진 value11의 값: %f", value11);
		
		
		
		// Q. double형 value12를 정수형 value13에 저장해 봅시다.
		double value12 = 12.0;
		int value13 = (int) value12;
		System.out.printf("정수형 변환이 이루어진 value13의 값: %d", value13);
		
	}
}
