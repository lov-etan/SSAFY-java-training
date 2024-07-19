package com.ssafy.ws.step2;

/**
 * 메소드 오버라이딩 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 메소드 오버라이딩은 상속 관계인 경우 부모 클래스에 정의한 메소드를 자식 클래스에서 '재정의'하는 것을 말합니다.
 * 
 * 실습 순서
 * 1) Person 클래스의 showInformation() 메소드 구현
 * 2) Student 클래스의 showInformation() 메소드 구현
 * 3) Teacher 클래스의 showInformation() 메소드 구현
 * 4) InheritanceTest 구현
 */
public class Student extends Person {

	String track;
	String region;
	int classNumber;
	
	Student() {
		
	}
	
	Student(String track, String region, int classNumber) {
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
	}
	
	Student(String name, int age, String track, String region, int classNumber) {
		this.name = name;
		this.age = age;
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
	}

	// Q. 이름, 나이, 트랙, 지역, 반을 출력할 수 있는 showInformation() 메소드를 구현해 봅시다.
	void showInformation() {
		System.out.println("Student 클래스의 showInformation() ");
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("트랙은 " + track + "입니다.");
		System.out.println("지역은 " + region + "입니다.");
		System.out.println("반은 " + classNumber + "입니다.");
	}
}
