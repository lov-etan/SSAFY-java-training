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
public class AccessibilityClass {

	/* 접근 제한자 연습하기 */
	
	// Q. 같은 클래스에서만 접근 가능한 제한자를 작성해 봅시다.
	private int weight = 83;
	
	
	
	// private 접근 제한자는 접근할 수 없음을 확인했습니다.
	// private 멤버 변수에 접근하기 위해서 getter와 setter 메소드를 이용합니다.
	
	/* getter 메소드 연습하기 */
	
	// Q. weight 값을 반환하는 getWeight 메소드 구현하기
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
