package com.ssafy.ws.step1;

/**
 * 클래스 상속 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 상속은 기존의 클래스의 기능을 그대로 유지하면서 추가적인 기능을 구현하고자 할 때 사용할 수 있습니다.
 * 
 * 실습 순서
 * 1) Person 클래스 구현
 * 2) Student 클래스 구현
 * 3) Teacher 클래스 구현 
 */
// Q. 학생은 사람이므로 이름과 나이 정보를 저장해야합니다.
//    이름과 나이는 Person 클래스에 선언되어있으므로, 이를 상속 받아 봅시다.
//    상속은 extends 키워드를 이용하여 상속할 수 있습니다.
public class Student extends Person {
	/* 멤버 변수 선언하기 */
	
	// Q. 트랙, 지역, 반을 저장할 수 있는 멤버 변수를 선언해 봅시다.
	String track;
	String region;
	int classNumber;
	
	// Q. 기본 생성자를 생성해 봅시다.
	Student() {
		
	}
	
	// Q. 트랙, 지역, 반을 입력받아 객체를 생성할 수 있는 파라미터 생성자를 생성해 봅시다.
	Student(String track, String region, int classNumber){
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
	}
	
	// Q. 이름, 나이, 트랙, 지역, 반을 입력받아 객체를 생성할 수 있는 파라미터 생성자를 생성해 봅시다.
	Student(String name, int age, String track, String region, int classNumber) {
		// this는 this가 작성된 현재 클래스를 가리킵니다.
		// name과 age는 현재 Student 클래스에 존재하지 않지만 에러가 없는 것을 기억해야 합니다.
		// 현재 클래스에서 접근할 수 없다면 상속 받은 상위 클래스 올라가 찾게 됩니다.
		//this.name = name;
		//this.age = age;
		
		// 위 name과 age를 주석처리한 후, 아래 코드 주석을 제거해 봅시다.
		super.name = name;
		super.age = age;
		
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
	}

}
