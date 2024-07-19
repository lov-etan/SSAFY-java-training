package com.ssafy.ws.step3;

/**
 * 객체 배열 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 아래 주어진 클래스를 통해 객체를 여러개 만들어보고, 만들어진 객체들을 저장하는 배열을 생성해 봅시다.
 * 반복문을 통해 배열을 순회하면서 각 객체의 메소드를 호출해봅시다.
 * 
 * 실습 순서
 * 1)Person 객체를 3개 저장할 수 있는 배열 생성
 * 2)Person 객체를 3개 생성후, 배열에 할당
 * 4)반복문을 통해 배열의 객체에서 메소드 호출해보기
 * 
 */

// 아래 클래스는 수정하지 않습니다.
class Person {
	String name;
	int age;
	
	//생성자 <- 기본 생성자가 없어지고 안에 무조건 들어가게끔 생성자가 설정됨
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void showInformation() {
		System.out.println("이름은 " + this.name + " 입니다.");
		System.out.println("나이는 " + this.age + " 입니다.");
	}
	
}

public class ObjectArray {

	public static void main(String[] args) {
		
		// Q. Person 객체를 3개 저장할 수 있는 배열 personArray를 생성합니다.
		Person[] personArray = new Person[3];
		
		// Q. Person 객체를 3개 생성해봅시다. 각 객체의 정보는 다음과 같습니다.
		// 클래스를 생성했으니 -> 클래스 이름으로 객체를 찍어내야 함
		// 1) name = "김민재", age = 27
		// 2) name = "손흥민", age = 31
		// 3) name = "이강인", age = 22
		Person p1 = new Person("김민재", 27);
		Person p2 = new Person("손흥민", 31);
		Person p3 = new Person("이강인", 22);
		
		// Q. 위에서 만든 객체를 배열의 원소로 저장합니다. 김민재는 0번, 손흥민은 1번, 이강인은 2번 인덱스에 각각 할당합니다.
		personArray[0] = p1;
		personArray[1] = p2;
		personArray[2] = p3;
		
		// Q. 반복문을 통해 personArray를 순회하면서 모든 객체의 showInformation() 메소드를 호출해 봅니다.
		for(int i=0; i< personArray.length ; i++) {
			personArray[i].showInformation();
		}
		
		// Q. p1 객체와 PersonArray[0] 에 있는 객체는 같은 객체일까요?? 한번 예측해보고, Object의 equals() 메소드를 사용해서 확인해 봅시다.
		System.out.println("정답 : " + p1.equals(personArray[0]));
	
	}

}
