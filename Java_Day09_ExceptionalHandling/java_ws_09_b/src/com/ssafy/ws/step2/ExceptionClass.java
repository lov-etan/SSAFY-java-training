package com.ssafy.ws.step2;

import java.io.IOException;

/**
 * 예외 처리 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 예외는 Checked Exception과 Unchecked Exception이 있습니다.
 * Checked Exception은 개발자가 코드를 이용하여 사전처리 할 수 없는 코드가 사용된 경우를 말합니다.
 * Unchecked Exception은 코드가 실행되면서 발생할 수 있는 예외를 말합니다. 이는 개발자가 사전에 코드를 이용하여 처리할 수 있습니다.
 * 
 */
public class ExceptionClass {
	public static void main(String[] args) throws IOException {
		
		/* Unchecked Exception 연습하기 */
		
		// Unchecked Exception은 코드가 실행되면서 발생할 수 있는 예외 이므로,
		// RuntimeException을 상속받고 있습니다.
		
		// Q. ArithmeticException 발생 시켜보기
		//    산술 연산 시 처리할 수 없는 경우를 말합니다.
		//    0으로 나눌 수 없기 때문에 ArithmeticException이 발생합니다.
		//    0이 아닌 다른 값을 입력받거나, 연산 과정 후 처리될 수 있으므로 RuntimeException에 속합니다.
		
		//int result = 10 / 0;
		
		
		// Q. NullPointerException 발생 시켜보기
		//    임의의 객체가 null인 경우 아무런 데이터가 존재하지 않기 때문에 발생하는 예외입니다.
		Object object = null;
		
		 //System.out.println(object.toString());
		 //출력 결과: java.lang.NullPointerException: Cannot invoke "Object.toString()" because "object" is null
		
		
		// Q. ArrayIndexOutOfBoundException 발생 시켜보기
		//    인덱스 범위를 초과하여 접근하는 경우에 발생하는 예외입니다.
		int[] numberList = new int[3];
		
		// numberList[3] = 1;
		//인덱스 0,1,2만 가능. 근데 얘는 numberList[3] 라고 명시하며 인덱스 3에 접근하고 있음
		
		
		
		/* Checked Exception 연습하기 */
		
		// Checked Exception은 코드를 이용하여 적절한 대처를 할 수 없는 경우에 발생하는 예외입니다.
		// Unchecked의 경우에는 나누는 수가 0인지, 객체가 null인지, 인덱스 범위를 벗어나는지 조건문 등을 이용하여 
		// 사전에 확인할 수 있도록 코드를 작성할 수 있지만,
		// Checked의 경우에는 사전 처리 할 수 없습니다.
		
		// Q. IOException 발생 시켜보기.
		byte[] charList = {'a', 'b', 'c'};
		
		// 아래 코드를 주석 해제 해 봅시다.
		// IOException이 발생할 수 있음을 확인합니다.
		 System.out.write(charList);
		 //출력결과: Unhandled exception type IOException
		 
		 
		
		
		// try ~ catch 구문을 이용한 처리를 확인해 봅시다.
		try {
			System.out.write(charList);
		} catch(IOException e) {
			e.printStackTrace();
		}
		//위에 throws IOException이라고 쓰여져 있기 때문에 catch문까지 가지 않는다.
		
		// Q. IOException 대신 Exception으로 변경해 봅시다.
		try {
			System.out.write(charList);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// IOException은 Exception을 상속받고 있어 가능함을 확인합니다.
		
		
		/* 예외 처리 순서 익히기 */
		
		// IOException, Exception 이 발생할 수 있는 경우 알맞는 예외를 작성해 봅시다.
		try {
			System.out.write(charList);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
