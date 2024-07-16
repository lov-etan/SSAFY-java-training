package com.ssafy.ws.step3;

import java.util.Arrays;

/**
 * 1차원 배열 복사 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 배열을 복사하는 경우 얕은 복사와 깊은 복사가 있습니다.
 * 얕은 복사와 깊은 복사의 차이를 학습해 봅시다.
 * 
 */
public class ArrayCopy {
	public static void main(String[] args) {
		
		/* 얕은 복사 연습하기 */
		
		int[] numberList1 = new int[] {1, 2, 3, 4, 5};
		
		// Q. numberList2를 선언하고 numberList1를 대입해 봅시다.
		int[] numberList2 = numberList1;
		
		System.out.print("numberList 출력: ");
		for(int idx = 0; idx < numberList1.length; idx++) {
			System.out.print(" " + numberList1[idx]);
		}
		System.out.println();
		
		System.out.print("numberList2 출력: ");
		for(int idx = 0; idx < numberList2.length; idx++) {
			System.out.print(" " + numberList2[idx]);
		}
		System.out.println();
		
		// Q. numberList1과 numberList2의 hashCode를 출력해 봅시다.
		System.out.println("numberList1: " + numberList1.hashCode());
		System.out.println("numberList2: " + numberList2.hashCode());
		// jvm에서 객체를 구분하기 위해 사용하는 값 (참조값_그때그때 달라질 수 있어요)
		
		
		// Q. numberList1의 0번 인덱스 값을 100으로 변경해 봅시다.
		numberList1[0] = 100;
		
		// Q. numberList'2'의 0번 인덱스 값을 출력해 봅시다.
		System.out.println("numberList2의 0번 인덱스 값: " + numberList2[0]);
		
		
		
		/* 깊은 복사 연습하기 */
		
		// Q. numberList1을 새롭게 1, 2, 3, 4, 5를 저장해 봅시다.
		numberList1 = new int[] {1, 2, 3, 4, 5};
		
		// Q. numberList2를 numberList1의 크기만큼 생성해 봅시다.
		numberList2 = new int[numberList1.length];
		
		// Q. 반복문을 활용하여 numberList2에 numberList1의 값을 저장해 봅시다.
		for(int idx = 0; idx < numberList2.length; idx++) {
			numberList2[idx] = numberList1[idx];
		}
		
		System.out.print("numberList 출력: ");
		for(int idx = 0; idx < numberList1.length; idx++) {
			System.out.print(" " + numberList1[idx]);
		}
		System.out.println();
		
		System.out.print("numberList2 출력: ");
		for(int idx = 0; idx < numberList2.length; idx++) {
			System.out.print(" " + numberList2[idx]);
		}
		System.out.println();
		
		// Q. numberList1과 numberList2의 hashCode를 출력해 봅시다.
		System.out.println("numberList1: " + numberList1.hashCode());
		System.out.println("numberList2: " + numberList2.hashCode());
		
		// Q. numberList1의 0번 인덱스 값을 100으로 변경해 봅시다.
		numberList1[0] = 100;
				
		// Q. numberList'2'의 0번 인덱스 값을 출력해 봅시다.
		System.out.println("numberList2의 0번 인덱스 값: " + numberList2[0]);
		
		// Q. API를 이용하여 배열을 복사해 봅시다.
		numberList2 = Arrays.copyOf(numberList1, numberList1.length);
		
		System.out.print("numberList2 출력: ");
		for(int idx = 0; idx < numberList2.length; idx++) {
			System.out.print(" " + numberList2[idx]);
		}
		System.out.println();
	}
}
