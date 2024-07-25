package com.ssafy.ws.step2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 컬렉션 프레임워크 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 컬렉션 프레임워크는 데이터를 쉽고 효과적으로 관리하고 사용할 수 있는 표준화된 방법을 제공하는 기능입니다.
 * 
 * 컬렉션 프레임워크를 이해하기 전에 '다형성'과 '인터페이스'를 반드시 이해후 학습하는 것이 좋습니다. 
 * 
 */
public class CollectionFramework2 {
	
	public static void main(String[] args) {
		
		/* Stack 연습하기 */
		
		// Stack은 First-In, Last-Out (FILO) 형태의 자료구조 입니다.
		// 먼저 들어온 데이터가 나중에 나오는 방식입니다.
		
		// Q. 타입으로 Stack, 저장할 데이터 타입은 Integer, 변수 이름으로 stack, 구현체로 Stack을 생성해 봅시다.
		Stack <Integer> stack = new Stack <>();
		
		// Q. stack에 반복문을 활용하여 1부터 10까지 저장해 봅시다.
		for(int num = 1; num < 11; num++) {
			stack.push(num);
		}
		
		// Q. stack에 저장된 데이터를 출력해 봅시다.
		System.out.print("stack: ");
		while(!stack.isEmpty()) {
			System.out.print(" " + stack.pop());
		}
		System.out.println();
		
		
		
		/* Queue 연습하기 */
		
		// Queue는 First-In, First-Out (FIFO) 형태의 자료구조 입니다.
		// 먼저 들어온 데이터가 먼저 나오는 방식입니다.
		
		// Q. 타입으로 Queue, 저장할 데이터 타입은 Integer, 변수 이름으로 queue, 구현체로 LinkedList를 생성해 봅시다.
		Queue<Integer> queue = new LinkedList<>();
		
		// Q. queue에 반복문을 활용하여 1부터 10까지 저장해 봅시다.
		for(int num = 1; num < 11; num++) {
			queue.add(num);
		}
		
		// Q. queue에 저장된 데이터를 출력해 봅시다.
		System.out.print("queue: ");
		while(!queue.isEmpty()) {
			System.out.print(" " + queue.poll());//빼고 출력
		}
		System.out.println();
		
		
		
		/* Deque 연습하기 */
		
		// Deque은 Queue와 동일한 형태로 이루어져있지만 앞과 뒤에서 모두 자료를 삽입하고 꺼낼 수 있는 자료구조 입니다.
		
		// Q. 타입으로 Deque, 저장할 데이터 타입은 Integer, 변수 이름으로 deque, 구현체로 ArrayDeque를 생성해 봅시다.
		Deque<Integer> deque = new ArrayDeque<>();
		
		// Q. deque에 반복문을 활용하여 1부터 10까지 저장해 봅시다.
		for(int num = 1; num < 11; num++) {
			deque.add(num);
		}
		
		// Q. deque의 맨 앞 데이터를 꺼내 출력해 봅시다.
		System.out.println("Deque 첫 번째 데이터: " + deque.pop());
		
		// Q. deque의 맨 뒤 데이터를 꺼내 출력해 봅시다.
		System.out.println("Deque 마지막 데이터: " + deque.poll());
	}
}
