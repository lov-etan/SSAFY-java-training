package com.ssafy.ws.step1;

/**
 * 1차원 배열 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 배열은 같은 타입의 변수들로 이루어진 유한 집합으로 정의할 수 있습니다.
 * 배열을 구성하는 각각의 값을 요소(Element)라 표현하며, 그 위치를 가리키는 숫자를 인덱스(Index)라 표현합니다.
 * 
 * 자바는 배열의 첫 위치(인덱스)는 0부터 시작하며, 0을 포함하여 양의 정수만을 인덱스로 사용할 수 있습니다.
 * 
 */
public class OneDimensionalArray {
	public static void main(String[] args) {
		
		// Q. int형 데이터를 3개 저장할 수 있는 1차월 배열을 선언과 동시에 생성해 봅시다.
		int[] grade1 = new int[3];
		
		
		// Q. 0, 1, 2번 인덱스의 값을 출력해 봅시다.
		System.out.println("0번 학생의 점수 : " + grade1[0]);
		System.out.println("1번 학생의 점수 : " + grade1[1]);
		System.out.println("2번 학생의 점수 : " + grade1[2]);
		
		// Q. int형 배열의 경우 배열을 생성하면 자동으로 초기화되는 값이 있습니다.
		//    아래 조건문이 실행되도록 조건식을 완성시켜봅시다.
		if(grade1[0] == 0) {
			System.out.println("int형 배열의 초기값은 " + grade1[0] + "입니다.");
		}
		
		
		// Q. grade1 배열에서
		//    0번 인덱스에 85를, 1번 인덱스에 70을 2번 인덱스에 90을 저장해 봅시다.
		grade1[0] = 85;
		grade1[1] = 70;
		grade1[2] = 90;
		
		System.out.println("0번 학생의 점수 : " + grade1[0]);
		System.out.println("1번 학생의 점수 : " + grade1[1]);
		System.out.println("2번 학생의 점수 : " + grade1[2]);
		
		// Q. grade1 배열에서 3번 인덱스에 100을 저장해 봅시다.
		//    다시 실행하는 경우 아래 코드를 주석 처리해주세요.
		grade1[3] = 100;
		
		// Q. 위 코드를 실행했을 때 나타나는 에러를 작성해 봅시다.
		System.out.println("배열의 길이가 N인 경우, 사용가능한 인덱스의 범위는 0 부터 N-1 입니다.");
		System.out.println("인덱스 범위를 벗어나는 경우, java.lang.ArrayIndexOutOfBoundsException이 발생합니다.");
		
		
		// Q. int형 배열 grade2를 선언하고, 동시에 70, 80, 90이 저장되도록 코드를 작성해 봅시다.
		//    2가지 방식으로 작성해 봅시다.
		int[] grade2 = new int[] {70, 80, 90}; // 첫 번째 방법.
		int[] grade3 = {70, 80, 90}; // 두 번째 방법.
		
		// Q. grade2의 길이를 출력해 봅시다.
		System.out.println("grade2의 길이는 " + grade2.length + "입니다.");
		
	}
}
