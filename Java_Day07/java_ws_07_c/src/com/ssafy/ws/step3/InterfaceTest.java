package com.ssafy.ws.step3;

/**
 * 인터페이스 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 자바는 '단일 상속'을 원칙으로하는 프로그래밍 언어입니다.
 * '다중 상속'을 지원하지 않아 추가적인 기능을 구현할 수 없기 때문에 이를 해결하고자 '인터페이스'를 활용합니다.
 * 
 * 인터페이스는 클래스 구현 시 반드시 구현해야만 하는 틀을 제공하여 개발자가 놓치지 않고 구현할 수 있도록하는 장점이 있습니다.
 * 추상 클래스에서는 추상 메소드, 멤버 메소드, 멤버 변수가 포함될 수 있지만, 인터페이스는 오직 '상수'와 '추상 메소드'만 가질 수 있습니다.
 *  
 */

// Q. Animal 인터페이스를 생성해 봅시다.
interface Animal {
	
	// Q. void cry() 추상 메소드를 선언해 봅시다.
	public abstract void cry();
	
	// Q. 위에서 작성한 빈칸을 모두 지워봅시다.
	//    해당 빈칸을 지워도 기본적으로 포함됨을 확인합니다.
	
	
	// Q. 정수형 상수 ANIMAL_CODE를 선언해 봅시다.
	public static final int ANIMAL_CODE = 00;
	
	// Q. 위에서 작성한 빈칸을 모두 지워봅시다.
	//    해당 빈칸을 지워도 기본적으로 포함됨을 확인합니다.	
}

// Q. Pet 인터페이스를 생성해 봅시다.
interface Pet {
	
	// Q. void play() 추상 메소드를 선언해 봅시다.
	public abstract void play();

}

	// Q. Animal, Pet 인터페이스 모두를 구현받는 Dog 일반 클래스를 생성해 봅시다.

	class Dog implements Animal, Pet {
	
	// Q. cry() 추상 메소드를 Override 해 봅시다.
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	// Q. play() 추상 메소드를 Override 해 봅시다.
	@Override
	public void play() {
		System.out.println("산책가자");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		// Q. Dog 객체를 생성하여 cry()와 play() 메소드를 호출해 봅시다.
		Dog dog1 = new Dog();
		dog1.cry();
		dog1.play();
		
	}
}
