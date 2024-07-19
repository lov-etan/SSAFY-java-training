package com.ssafy.ws.step1;

/**
 * 클래스 상속 연습하기
 * 상속은 기존의 클래스의 기능을 그대로 유지하면서 추가적인 기능을 구현하고자 할 때 사용할 수 있습니다.
 * 
 * 실습 순서
 * 1) Person 클래스 구현
 * 2) Student 클래스 구현
 * 3) Teacher 클래스 구현 
 */
public class Person {
	/* 멤버 변수 선언하기 */
	
	// Q. 이름과 나이를 저장할 수 있는 멤버 변수를 선언해 봅시다.
	String name;
	int age;
	
	// Q. 기본 생성자를 생성해 봅시다.
	Person(){
		
	}
	
	// Q. 이름과 나이를 입력받아 객체를 생성할 수 있는 파라미터 생성자를 생성해 봅시다.
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	
}
