package com.ssafy.ws.step3;

/**
 * 객체 생성 연습하기
 * 
 * 이전 실습 '클래스 선언 연습하기'에서 작성한 Person 을 복사하여 동일한 패키지에 저장 후 실습을 진행합니다.
 * 
 */
public class PersonTest {
	
	public static void main(String[] args) {
		
		/* 객체 생성 연습하기 */
		
		/*
		 * 배열을 선언하는 경우,
		 * [데이터 타입] [변수 이름] = new [데이터 타입] 의 형태로 선언했습니다.
		 * 
		 * 객체 또한 참조형 변수이므로 동일하게 선언할 수 있습니다.
		 * 
		 */
		
		// Q. 데이터 타입은 Person, 변수 이름은 person1 으로 객체를 생성해 봅시다.
		Person person1 = new Person();
		
		// Q. person1의 showInformation 메소드를 호출해 봅시다.
		person1.showInformation();
		
		// Q. Person.java 에서 기본 생성자를 주석 처리 후 다시 showInformation 메소드를 호출해 봅시다.
		person1.showInformation();
		System.out.println("기본 생성자를 주척 처리하면 The constructor Person() is undefied 메시지가 출력됩니다.");
		
		// 연습. 파라미터 생성자를 추가로 주석 처리해 봅시다.
		//System.out.println("기본 생성자와 파라미터 생성자를 모두 주석처리하면 정상적으로 출력됩니다.");
		//System.out.println("이것은 기본 생성자가 생략될 수 있음을 알 수 있습니다.");
		
		// 다시, 기본 생성자와 파라미터 생성자를 모두 주석 해제합니다.
		
		// Q. 데이터 타입은 Person, 변수 이름은 person2로 객체를 생성해 봅시다.
		//    이때, 이름은 "SSAFY", 나이는 25, 키는 170.3, 취미는 "코딩"으로 객체를 생성합니다.
		Person person2 = new Person("SSAFY", 25, 170.3, "코딩");
		
		// Q. person2 객체의 showInformation 메소드를 호출해 봅시다.
		person2.showInformation();
		
		// Q. person2와 동일하게 person3로 바꾸어 객체를 생성해 봅시다.
		Person person3 = new Person("SSAFY", 25, 170.3, "코딩");
		
		// Q. person2와 person3의 hashCode를 호출해 봅시다.
		System.out.println("person2: " + person2.hashCode());
		System.out.println("person3: " + person3.hashCode());
		
		// 동일한 데이터를 주었지만 서로 다른 hashCode임을 확인할 수 있습니다.
	}
}
