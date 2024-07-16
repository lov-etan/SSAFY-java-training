package com.ssafy.hw.step2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest_P {

	public static void main(String[] args) {
		// 배열 선언과 동시에 값 초기화
		int[] arr = new int[] {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		System.out.println("-----원소 10개 출력-----");
		
		for(int i=0; i<10; i++) {
			// 배열에 있는 i번째 원소
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-----원소 10개 중 짝수만 출력-----");
		
		for(int i=0; i<10; i++) {
			// 배열에 있는 i번째 원소가 짝수인지 검사
			if(arr[i] % 2 == 0) {
				// 짝수면 원소를 출력
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("-----바꿀 위치 입력 : ");
		int index = sc.nextInt();
		System.out.print("-----수 입력 : ");
		int num = sc.nextInt();
		
		// arr 의 index 에 있는 원소를 num 으로 변경
		arr[index] = num;
		
		System.out.println("-----원소 10개 출력-----");
		
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
