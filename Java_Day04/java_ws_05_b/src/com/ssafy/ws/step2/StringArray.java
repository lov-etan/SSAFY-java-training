package com.ssafy.ws.step2;

/**
 * 문자열 배열 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해봅시다.
 * 
 * Java에서는 문자열(String)도 객체입니다.
 * 아래 주어진 클래스를 통해 문자열을 여러개 만들어보고, 만들어진 문자열들을 저장하는 배열을 생성해봅시다.
 * 반복문을 통해 배열을 순회하면서 각 문자열의 메소드를 호출해봅시다. 그리고 문자열의 올바른 비교 방법을 알아봅니다.
 * 
 * 실습 순서
 * 1)String 객체를 4개 저장할 수 있는 배열 생성
 * 2)String 객체를 4개 생성후, 배열에 할당
 * 4)반복문을 통해 배열의 문자열에서 메소드 호출해보기
 * 
 */
public class StringArray {

	public static void main(String[] args) {
		
		// Q. String 객체를 4개 저장할 수 있는 배열 strArray를 생성합니다.
		String[] stringList = new String[4];
		
		// Q. String 객체를 4개 생성해봅시다. 각 객체의 정보는 다음과 같습니다.
		// 1) "banana"
		// 2) "apple"
		// 3) "tomato"
		// 4) "banana"
		String str1 = "banana";
		String str2 = "apple";
		String str3 = "tomato";
		String str4 = "banana";
		
		// Q. 위에서 만든 객체를 배열의 원소로 저장합니다. banana는 0번, apple은 1번, tomato는 2번 인덱스에 각각 할당합니다.
		stringList[0] = "banana";
		stringList[1] = "apple";
		stringList[2] = "tomato";
		stringList[3] = "banana";
		
		// Q. 반복문을 통해 strArray를 순회하면서 모든 문자열의 1번 인덱스에 있는 문자를 출력해봅니다.
		for(int i=0; i<stringList.length; i++) {
			System.out.println(stringList[i].charAt(1));;
		}
		
		
		// Q. str1부터 str4 까지 hashCode를 출력해 봅시다.
		System.out.println("str1 hashCode: " + str1.hashCode());
		System.out.println("str2 hashCode: " + str2.hashCode());
		System.out.println("str3 hashCode: " + str3.hashCode());
		System.out.println("str4 hashCode: " + str4.hashCode());
		
		
		// Q. 배열을 순환하면서 문자열 비교를 해봅시다. 아래 코드의 빈칸에 실행 결과를 예측해봅니다. 문자열을 비교할 때는 어떻게 하는게 맞을까요?
		
		// 1. equals 메소드를 사용한 비교
		System.out.println(stringList[0].equals("banana") + " / 실행 결과 : true");
		
		// 2. == 연산자를 이용한 비교 1
		System.out.println((stringList[0] == "banana") + " / 실행 결과 : true");
		
		// 3. == 연산자를 이용한 비교 2
		System.out.println((stringList[0] == new String("banana")) + " / 실행 결과 : false");
		
		// 4. == 연산자를 이용한 비교 3
		System.out.println((stringList[0] == stringList[3]) + " / 실행 결과 : true");
	
	}

}
