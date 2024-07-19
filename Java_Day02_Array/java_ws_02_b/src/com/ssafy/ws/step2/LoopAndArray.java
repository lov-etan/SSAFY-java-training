package com.ssafy.ws.step2;

/**
 * 1차원 배열 탐색 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 반복문은 배열과 함께 사용하는 경우가 많습니다.
 * 반복문에는 while, do ~ while, for 문, 향상된 for 문이 있으며, 이를 사용하는 방법을 익힌 후 배열을 탐색해 봅시다.
 * 
 */
public class LoopAndArray {
	public static void main(String[] args) {
		
		// Q. 1부터 10까지 출력하는 while 문을 작성해 봅시다.
		int num1 = 1;
		System.out.print("num: ");
		
		while(num1 <= 10) {
			System.out.print(" " + num1);
			num1++;
		}
		System.out.println();
		
		
		// Q. 1부터 10까지 출력하는 do ~ while 문을 작성해 봅시다.
		int num2 = 1;
		System.out.print("num2: ");
		
		do {
			System.out.print(" " + num2);
			num2++;
		}while(num2 <= 10);
		System.out.println();
		
		
		// Q. 1부터 10까지 출력하는 for 문을 작성해 봅시다.
		//    for 문은 [초기식]; [조건식]; [증감식]; 으로 구성되어있습니다.
		System.out.print("num3: ");
		for(int num3 = 1; num3 <= 10; num3++) {
			System.out.print(" " + num3);
		}
		System.out.println();
		
		
		
		
		int[] numberList = new int[10];
		
		// Q. numberList에 1부터 10까지 저장하는 코드를 작성해 봅시다.
		for(int idx = 0; idx < 10; idx++) {
			numberList[idx] = idx + 1;
		}
		
		
		
		
		// Q. while 문을 이용하여 numberList를 탐색하는 코드를 작성해 봅시다.
		int idx = 0;
		System.out.print("while 문을 이용한 numberList 탐색 결과: ");
		
		while(idx < numberList.length) {
			System.out.print(" " + numberList[idx]);
			idx++;
		}
		System.out.println();
		
		
		// Q. do ~ while 문을 이용하여 numberList를 탐색하는 코드를 작성해 봅시다.
		idx = 0;
		System.out.print("do ~ while 문을 이용한 numberList 탐색 결과: ");
		
		do {
			System.out.print(" " + numberList[idx]);
			idx++;
		}while(idx < numberList.length);
		System.out.println();
		
		
		// Q. for 문을 이용하여 numberList를 탐색하는 코드를 작성해 봅시다.
		System.out.print("for 문을 이용한 numberList 탐색 결과: ");
		for(idx = 0; idx < 10; idx++) {
			System.out.print(" " + numberList[idx]);
		}
		System.out.println();
		
		
		// Q. 향상된 for 문을 이용하여 배열의 요소를 출력해 봅시다.
		System.out.print("향상된 for 문을 이용한 numberList 탐색 결과: ");
		for(int num : numberList) {
			System.out.print(" " + num);
		}
	}
}
