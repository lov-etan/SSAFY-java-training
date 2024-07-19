package com.ssafy.ws.step2;

/**
 * 연산자 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 */
public class Operators {

	public static void main(String[] args) {
		
		/* 대입 연산자 연습하기 */
		
		// Q. int형 value1에 8 int형 value2에 4를 저장해 봅시다.
		int value1 = 8;
		int value2 = 4;
		System.out.println("value1: " + value1 + ", value2: " + value2);
		System.out.println("-----------------------------------");
	
		
		/* 산술 연산자 연습하기 */
		
		// Q. int형 result 변수를 선언해 봅시다.
		int result = 0;
		
		// Q. value1과 value2를 더한 결과를 result에 저장해 봅시다.
		result = value1 + value2;
		System.out.println("value1과 value2를 더한 결과 : " + result);
		
		// Q. value1에 value2를 뺀 결과를 result에 저장해 봅시다.
		result = value1 - value2;
		System.out.println("value1에 value2를 뺀 결과 : " + result);
		
		// Q. value1과 value2를 곱한 결과를 result에 저장해 봅시다.
		result = value1 * value2;
		System.out.println("value1과 value2를 곱한 결과 : " + result);
		
		// Q. value1에 value2를 나눈 몫을 result에 저장해 봅시다.
		result = value1 / value2;
		System.out.println("value1에 value2를 나눈 몫 : " + result);
		
		// Q. value1에 value2를 나눈 나머지를 result에 저장해 봅시다.
		result = value1 % value2;
		System.out.println("value1에 value2를 나눈 나머지 : " + result);
		
		System.out.println("-----------------------------------");
		
		
		
		/* 복합 대입 연산자 연습하기 */
		
		// Q. value1에 1을 더한 후 그 결과를 출력해 봅시다.
		value1 += 1;
		System.out.println("value1에 1을 더하고 대입한 결과: " + value1);
		
		// Q. value1에 2를 뺀 후 그 결과를 출력해 봅시다.
		value1 -= 2;
		System.out.println("value1에 2를 뺀 후 대입한 결과: " + value1);
		
		// Q. value1에 오른쪽의 정수 3을 곱한 후 그 결과를 출력해 봅시다.
		value1 *= 3;
		System.out.println("value1에 3을 곱한 후 대입한 결과 : " + value1);
		
		// Q. value1에 오른쪽의 정수 4를 나눈 후 그 결과를 출력해 봅시다.
		value1 /= 4;
		System.out.println("value1에 4를 나눈 몫을 대입한 결과 : " + value1);
		
		System.out.println("-----------------------------------");
		
		
		
		/* 증감 연산자 연습하기 */
		
		// Q. 먼저 value2를 1 증가시킨 후에 4를 더한 결과를 result에 저장해 봅시다.
		result = ++ value2 + 4;
		System.out.println("먼저 value2를 1 증가시킨 후에 4를 더한 결과 : " + result);
		
		// Q. 먼저 4를 더하고 나서, value2의 값을 1 증가시킴
		result = value2 ++ + 4;
		System.out.println("먼저 4를 더하고 나서 value2의 값을 1 증가시킴 : " + result);
		
		// Q. 먼저 value2를 1 감소시킨 후에 3을 뺀 결과를 출력
		result = -- value2 - 3;
		System.out.println("먼저 value2를 1 감소시킨 후에 3을 뺀 결과 : " + result);
		
		// Q. 먼저 3을 빼고 나서, value2의 값을 1 감소시킴
		result = value2 -- - 3;
		System.out.println("먼저 3을 빼고 나서 value2의 값을 1 감소시킴 : " + result);

		System.out.println("-----------------------------------");
		
		
		
		/* 비교 연산자 연습하기 */
		
		// Q. int형 value3에 5를 int형 value4에 5을 저장해 봅시다.
		int value3 = 5;
		int value4 = 5;
		
		// Q. true, false 결과를 저장하기 위한 result2 변수를 선언해 봅시다.
		boolean result2 = false;
		
		// Q. value3과 value4가 동일한지 확인해 봅시다.
		result2 = value3 == value4;
		System.out.println("value3과 value4가 동일한가요? " + result2);
		
		// Q. value3과 value4가 다른지 확인해 봅시다.
		result2 = value3 != value4;
		System.out.println("value3과 value4가 다른가요? " + result2);
		
		// Q. value3이 value4보다 큰지 확인해 봅시다.
		result2 = value3 > value4;
		System.out.println("value3이 value4보다 큰가요? " + result2);
		
		// Q. value3이 value4보다 크거나 같은지 확인해 봅시다.
		result2 = value3 >= value4;
		System.out.println("value3이 value4보다 크거나 같나요? " + result2);
		
		System.out.println("-----------------------------------");
		
		
		
		
		/* 비트 연산자 연습하기 */
		// Q. int형 value5에 20를 int형 value6에 30을 저장해 봅시다.
		int value5 = 20;
		int value6 = 30;
		
		// Q. value5와 value6을 AND 연산해 봅시다.
		System.out.println("value5의 2진수: " + Integer.toBinaryString(value5));
		System.out.println("value6의 2진수: " + Integer.toBinaryString(value6));
		System.out.println("value5 AND value6 2진수: " + Integer.toBinaryString(value5 & value6));
		
		// Q. value5와 value6을 OR 연산해 봅시다.
		System.out.println("value5 OR value6 2진수: " + Integer.toBinaryString(value5 | value6));
		
		// Q. value5와 value6을 XOR 연산해 봅시다.
		System.out.println("value5 XOR value6 2진수: " + Integer.toBinaryString(value5 ^ value6));
				
		// Q. value5와 value6을 NOT 연산해 봅시다.
		System.out.println("value5 NOT 2진수: " + Integer.toBinaryString(~ value5));
		System.out.println("value6 NOT 2진수: " + Integer.toBinaryString(~ value6));
		
		// Q. value5를 왼쪽으로 1칸씩 비트를 옮겨봅시다.
		System.out.println("value5 LEFT SHIFT 1 2진수: " + Integer.toBinaryString(value5 << 1));
		
		// Q. value5를 오른쪽으로 1칸씩 비트를 옮겨봅시다.
		System.out.println("value5 RIGHT SHIFT 1 2진수: " + Integer.toBinaryString(value5 >> 1));
		
		System.out.println("-----------------------------------");
		
		
		/* 논리 연산자 연습하기 */
		
		int value7 = 10;
		int value8 = 20;
		
		// Q. value7의 값과 value8의 값을 생각해 봅시다.
		System.out.println( (value7 += 10) > 15 | (value8 -= 10) > 15 );
		System.out.println("예측: value7은 true 이고, value8은 false입니다.");
		System.out.println("정답: value7은 " + value7 + "이고, value8은 " + value8);
		
		// Q. value7의 값과 value8의 값을 생각해 봅시다.
		value7 = 10;
		value8 = 20;
		System.out.println( (value7 += 10) > 15 || (value8 -= 10) > 15 );
		System.out.println("예측: value7은 true 이고, value8은 false입니다.");
		System.out.println("정답: value7은 " + value7 + "이고, value8은 " + value8);
	}
}
