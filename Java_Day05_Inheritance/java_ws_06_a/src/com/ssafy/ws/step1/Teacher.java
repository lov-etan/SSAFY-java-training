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
//Q. 선생님은 사람이므로 이름과 나이 정보를 저장해야합니다.
//   이름과 나이는 Person 클래스에 선언되어있으므로, 이를 상속 받아 봅시다.
//   상속은 extends 키워드를 이용하여 상속할 수 있습니다.
public class Teacher extends Person {
	/* 멤버 변수 선언하기 */
	
	// Q. 트랙, 지역, 반, 학생 수를 저장할 수 있는 멤버 변수를 선언해 봅시다.
	String track;
	String region;
	int classNumber;
	int studentCount;
	
	// Q. 기본 생성자를 생성해 봅시다.
	Teacher() {
		
	}
	
	// Q. 트랙, 지역, 반, 학생 수를 입력받아 객체를 생성할 수 있는 파라미터 생성자를 생성해 봅시다.
	Teacher(String track, String region, int classNumber, int studenCount){
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
		this.studentCount =studenCount;
		
	}
	
	// Q. 이름, 나이, 트랙, 지역, 반, 학생 수를 입력받아 객체를 생성할 수 있는 파라미터 생성자를 생성해 봅시다.
	Teacher(String name, int age, String track, String region, int classNumber, int studentCount) {
		// this는 this가 작성된 현재 클래스를 가리킵니다.
		// name과 age는 현재 Student 클래스에 존재하지 않지만 에러가 없는 것을 기억해야 합니다.
		// 현재 클래스에서 접근할 수 없다면 상속 받은 상위 클래스 올라가 찾게됩니다.
		this.name = name;
		this.age = age;
		
		this.track = track;
		this.region = region;
		this.classNumber = classNumber;
		this.studentCount =studentCount;
		
	}

	
	// 생각해보기. 학생과 선생님은 track, region, classNumber가 모두 사용됩니다.
	//         그렇다면 선생님도 학생을 상속받아 사용할 수 있지 않을까요?
	//         Person을 상속 받은 것 처럼 Student도 추가로 상속받아봅시다.
	//         extends Person, Student 작성해보기.
	//         된다면 왜 되는지, 안된다면 왜 안되는지 생각해 봅시다.
	// 자바에서 다중상속은 불가능하기 때문이다.
	
	
	// 생각해보기. Person 클래스로 돌아가 Object 클래스를 상속받아 봅시다.
	//         extends Object 작성 해보기.
	//         된다면 왜 되는지, 안된다면 왜 안되는지 생각해 봅시다.
	//Object는 모든 클래스의 부모 클래스로, 다중 상속이 아니라 상위 부모 클래스로 존재하기 때문이다	
	
}
