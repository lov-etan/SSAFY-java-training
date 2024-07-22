package com.ssafy.ws.step2;

/**
 * 추상 클래스와 추상 메소드 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 추상 클래스는 공통적으로 사용되는 기능(멤버 메소드)를 선언만하여 이를 상속받은 자식 클래스가 구현할 수 있도록하는 클래스입니다.
 * 선언만 이루어진 멤버 메소드는 반드시 'abstract' 키워드가 붙고 구현부가 없어야합니다. 이를 추상 메소드라 말합니다.
 * 
 * 추상 클래스를 상속받은 자식 클래스는 반드시 Override하여 기능을 구현해야만하며, 개발자가 반드시 구현할 수 있도록 강제화하여 안정성을 향상시킬 수 있습니다.
 * 
 */


// Q. Animal 추상 클래스를 선언해 봅시다.
abstract class Animal {
	
	// Q. void cry() 추상 메소드를 선언해 봅시다.
	//    추상 메소드는 구현부가 없음을 확인합니다.
	abstract void cry();
}

// Q. Dog 일반 클래스를 선언하고 Animal을 상속받아봅시다.
class Dog extends Animal {
	
	// Q. Dog 클래스 이름의 에러 메시지를 확인해 봅시다.
	//    1) Add unimplement methods
	//    2) Make type 'Dog' abstract
	
	// Q. cry() 추상 메소드를 Override 해 봅시다.
	@Override
	void cry() {
		// Q. 강아지가 우는 소리를 출력해 봅시다.
		System.out.println("멍멍");
	}
}


//Q. Cat 일반 클래스를 선언하고 Animal을 상속받아봅시다.
class Cat extends Animal{
	
	// Q. cry() 추상 메소드를 Override 해 봅시다.
	@Override
	void cry() {
		// Q. 고양이가 우는 소리를 출력해 봅시다.
		System.out.println("냐옹");
	}
}

// 생각해보기. 동물은 모두 울음 소리가 있다고 가정해 봅시다.
//         종에 따라 울음 소리가 다르기 때문에 그에 맞게 울음 소리가 발생해야합니다.
//         추상 클래스를 이용하여 울음 소리를 반드시 구현할 수 있도록 강제화하며, 각각의 동물마다 서로 다른 울음 소리를 구현할 수 있습니다.


public class AbstractClass {
	
	public static void main(String[] args) {
		// Q. 추상 클래스인 Animal 클래스의 객체를 생성해 봅시다.
		//    추상 클래스는 객체를 생성할 수 없음을 확인합니다.
		//Animal chipmunk = new Animal();
		
		// Q. Dog 객체를 생성하고, 울음 소리를 호출해 봅시다.
		Dog dog = new Dog();
		dog.cry();
		
		// Q. Cat 객체를 생성하고, 울음 소리를 호출해 봅시다.
		Cat cat = new Cat();
		cat.cry();
		
	}
}
