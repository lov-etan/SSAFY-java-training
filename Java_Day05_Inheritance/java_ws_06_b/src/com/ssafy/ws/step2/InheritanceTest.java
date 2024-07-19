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
public class InheritanceTest {
	public static void main(String[] args) {
		
		// Q. 기본 생성자를 호출하는 person1 객체를 생성해 봅시다.
		Person person1 = new Person();
		
		// Q. 이름은 "SSAFY", 나이는 25인 파라미터 생성자를 호출하는 person2 객체를 생성해 봅시다.
		Person person2 = new Person("SSAFY", 25);
		
		// Q. person1과 person2의 showInformation() 메소드를 호출해 봅시다.
		person1.showInformation();
		person2.showInformation();
		
		
		// Q. 기본 생성자를 호출하는 student1 객체를 생성해 봅시다.
		Student student1 = new Student();
		
		// Q. 트랙은 자바, 지역은 서울, 반은 1인 파라미터 생성자를 호출하는 student2 객체를 생성해 봅시다.
		Student student2 = new Student("자바", "서울", 1);
		
		// Q. 이름은 학생, 나이는 27, 트랙은 자바, 지역은 서울, 반은 1인 파라미터 생성자를 호출하는 stduent3 객체를 생성해 봅시다.
		Student student3 = new Student("학생",27,"자바","서울",1);
		
		// Q. student1, student2, student3의 showInformation() 메소드를 호출해 봅시다.
		student1.showInformation();
		student2.showInformation();
		student3.showInformation();
		
		
		// Q. 기본 생성자를 호출하는 teacher1 객체를 생성해 봅시다.
		Teacher teacher1 = new Teacher();
		
		// Q. 트랙은 자바, 지역은 서울, 반은 1, 학생 수는 25인 파라미터 생성자를 호출하는 teacher2 객체를 생성해 봅시다.
		Teacher teacher2 = new Teacher("자바","서울",1,25);
		
		// Q. 이름은 선생님, 나이는 35, 트랙은 자바, 지역은 서울, 반은 1, 학생수는 25인 파라미터 생성자를 호출하는 teacher3 객체를 생성해 봅시다.
		Teacher teacher3 = new Teacher("선생님",35,"자바","서울",1,25);
		
		// Q. teacher1과 teacher2의 showInformation() 메소드를 호출해 봅시다.
		teacher1.showInformation();
		teacher2.showInformation();
		teacher3.showInformation();
	}
}
