package com.ssafy.ws.step1;

/**
 * 클래스 개념 익히기
 * 
 * 객체 지향 프로그래밍(OOP, Object-Oriented Programming)은
 * 데이터를 객체(Object)로 취급하고 중심이 되는 프로그래밍 방식입니다.
 * 
 * 우리가 인식할 수 있는 모든 것을 객체로 표현할 수 있습니다.
 * 이러한 객체는 속성과 동작이 포함되어있습니다.
 * 
 */
public class ClassConcept {
	
	public static void main(String[] args) {
		
		System.out.println("클래스는 관련 있는 변수와 함수를 묶어서 만든 사용자 정의 데이터타입 입니다.");
		
		System.out.println("클래스의 속성(Attribute) == 멤버 변수");
		
		System.out.println("클래스의 동작(Behavior) == 멤버 메서드");
		
		System.out.println("클래스를 통해 생성된 객체를 인스턴스 라고 합니다.");
		
		System.out.println("클래스 선언 방법은 [접근제어자] [final|abstract] class 클래스이름 { ... } 과 같은 형식입니다.");
		
		System.out.println("사람을 객체로 표현 했을 때, 사람의 이름, 나이, 취미 같은 것들은 멤버 변수 라고 할 수 있습니다.");
		
		System.out.println("사람을 객체로 표현 했을 때, 자기 소개를 한다, 공부를 한다 같은 것들은 멤버 메서드 라고 할 수 있습니다.");
		
		System.out.println("메서드 선언 방법은 [접근제어자] [활용제어자] [반환타입] 메서드이름 ( [매개변수들] ) { ... } 과 같은 형식입니다. ");
		
		System.out.println("리턴타입은 메소드를 선언할 때 지정되고, 없으면 void 가 됩니다.");
		
		System.out.println("객체를 호출하기 위해서는 생성자가 선언되어 있는 클래스에 접근해야 합니다.");
		
		System.out.println("메소드를 호출하는 방법은 클래스/객체이름.메소드이름( [매개변수] ) 과 같은 형식으로 호출합니다.");
		
		System.out.println("생성자는는 객체를 생성할때 실행되는 메소드 입니다. new 키워드와 함께 호출되며 클래스 이름과 동일합니다.");
		
		System.out.println("생성자는 반환값을 갖지 않으며, 객체가 생성될 때 반드시 호출됩니다. 만약 하나도 정의되어 있지 않다면 default 생성자가 호출됩니다.");
		
		System.out.println("this.는 참조 변수로써 객체 자신을 가리킵니다.");
	}
	
}
