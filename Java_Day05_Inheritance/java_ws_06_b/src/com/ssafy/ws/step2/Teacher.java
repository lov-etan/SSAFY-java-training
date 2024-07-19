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
public class Teacher extends Person {

	String track;
	String region;
	int classNumber;
	int studentCount;

	Teacher() {
		
	}
	

	Teacher(String track, String region, int classNumber, int studentCount) {
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
		this.studentCount = studentCount;
	}
	

	Teacher(String name, int age, String track, String region, int classNumber, int studentCount) {
		this.name = name;
		this.age = age;
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
		this.studentCount = studentCount;
	}
	
	// Q. 이름, 나이, 트랙, 지역, 반, 학생 수를 출력할 수 있는 showInformation() 메소드를 구현해 봅시다.
	@Override
	void showInformation() {
		System.out.println("Teacher 클래스의 showInformation() ");
		
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "입니다.");
		System.out.println("트랙은 " + track + "입니다.");
		System.out.println("지역은 " + region + "입니다.");
		System.out.println("반은 " + classNumber + "입니다.");
		System.out.println("학생 수는 " + studentCount + "입니다.");
	}
	
	
	// 생각해보기. Person, Student, Teacher 모두 showInformation이라는 메소드가 선언되어있습니다.
	//         Student와 Teacher 클래스는 모두 Person 클래스를 상속받는 상황이므로 showInformation() 메소드는 모두 오버라이딩 되어있습니다.
	//         개발자는 Student와 Teacher 클래스 내 구현된 메소드가 오버라이딩된 메소드인지 확인하기 어렵기 때문에,
	//         Annotation을 붙여 확인할 수 있도록 합니다. 
	//         위 showInformation() 메소드 위에 @Override 를 붙여봅시다.
	//         개발자는 @Override 를 확인하여 부모 클래스에도 구현되어있음을 파악할 수 있습니다.
	//         마찬가지로 Student의 showInformation에도 붙여봅시다.
	
}
