package com.ssafy.ws.step1_1;

/**
 * 접근 제한자 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 접근 제한자는 상황에 따라 데이터의 접근을 제한하고자 사용하는 키워드입니다.
 * 접근 제한자로 public, protected, default(package), private가 있습니다.
 * 
 * 실습 순서
 * 1) AccessibilityClass 구현
 * 2) AccessibilityTest 구현
 */
public class AccessibilityTest {
	public static void main(String[] args) {
		
		// Q. AccessibilityClass 객체를 생성해 봅시다.
		AccessibilityClass accessibilityClass = new AccessibilityClass();
		
		// Q. getWeight에 접근해 봅시다.
		System.out.println("getWeight: " + accessibilityClass.getWeight());
		
		// Q. setWeight를 이용해 100으로 변경해 봅시다.
		accessibilityClass.setWeight(100);
		
		// Q. 다시 getWeight에 접근해 봅시다.
		System.out.println("getWeight: " + accessibilityClass.getWeight());
		
		// 생각해보기. 맴버 변수에 직접 접근하지 않고 getter와 setter 메소드를 이용하는 이유?
		//         setter 메소드를 활용하면 어떤 이점이 있을까요?
		// 1. 캡슐화/ 캡슐화는 객체 지향 프로그래밍에서 데이터와 그 데이터를 조작하는 메소드를 하나로 묶는 개념이다.
		// 클래스의 내부 상태를 외부에서 직접 접근하는 것을 막고, 데이터에 대한 접근과 수정을 제어할 수 있다. 
		// 객체의 일관성과 무결성을 유지할 수 있다. 
		//2. 유효성 검사 및 데이터 검증
		// setter 메소드를 사용하면 값을 설정하기 전에 유효성 검사를 수행할 수 있다.
		// 예를 들어, 나이 변수에 대해 음수 값을 허용하지 않는 것이 있다.
		
		
		
	}
}
