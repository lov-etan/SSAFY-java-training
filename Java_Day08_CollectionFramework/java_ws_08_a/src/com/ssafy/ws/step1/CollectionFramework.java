package com.ssafy.ws.step1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
public class CollectionFramework {
	public static void main(String[] args) {
		
		/* ArrayList 연습하기 */
		
		// Q. 타입으로 List, 저장할 데이터 타입은 Integer, 변수 이름으로 numberList, 구현체로 ArrayList를 생성해 봅시다.
		List<Integer> numberList = new ArrayList<>();
		
		// Q. numberList에 반복문을 활용하여 1부터 10까지 저장해 봅시다.
		for(int num = 1; num < 11; num++) {
			numberList.add(num);
		}
		
		// Q. numberList에 저장된 데이터를 출력해 봅시다.
		System.out.print("numberList: ");
		for(int idx = 0; idx < numberList.size(); idx++) {
			System.out.print(" " + numberList.get(idx));
		}
		System.out.println();
		
		
		
		
		/* LinkedList 연습하기 */
		
		// Q. 타입으로 List, 저장할 데이터 타입은 Integer, 변수 이름으로 numberList2, 구현체로 LinkedList를 생성해 봅시다.
		List<Integer> numberList2 = new LinkedList<>();
		
		// Q. numberList2에 반복문을 활용하여 1부터 10까지 저장해 봅시다.
		for(int num = 1; num < 11; num++) {
			numberList2.add(num);
		}
		
		// Q. numberLis2t에 저장된 데이터를 출력해 봅시다.
		System.out.print("numberList2: ");
		for(int idx = 0; idx < numberList2.size(); idx++) {
			System.out.print(" " + numberList2.get(idx));
		}
		System.out.println();
		
		// 생각해보기. numberList와 numberList2는 List 인터페이스를 타입으로 가지고 있습니다.
		//         구현체로 각각 ArrayList와 LinkedList로 다름을 확인할 수 있습니다.
		//         인터페이스 타입으로 선언하면 구현체 변경만으로 쉽게 전환할 수 있습니다.
		//         또한, 데이터를 추가하고 조회하는데 모두 동일하게 add()와 get()을 사용하는 것을 확인할 수 있습니다.
		//         add()와 get()를 수정하지 않고, 구현체 변경만하면 사용할 수 있습니다.
		
		
		
		
		
		/* HashSet 연습하기 */

		// tip. 프로그래밍을 하다보면 자연스레 여러 문제를 해소하기 위해 인터넷 검색을 시행합니다.
		//      검색만 잘해도 문제를 보다 단시간에 해소할 수 있으며 개발 역량 향상에도 도움이 됩니다.
		//      하지만 단순 검색을 해보는 것만으로는 내가 찾고자 하는 내용을 바로 찾기에는 아직 연습이 부족합니다.
		//      검색 엔진(google, etc.)과 공식문서를 찾아, 컬렉션 프레임워크들의 메소드가 어떤 것들이 있는지 찾아봅시다.
		
		// Q. 타입으로 Set, 저장할 데이터 타입은 Integer, 변수 이름으로 numberSet, 구현체로 HashSet를 생성해 봅시다.
		Set<Integer> numberSet = new HashSet<>();
		
		// Q. 구현체를 TreeSet, LinkedHashSet으로 변경해 봅시다.
		Set<Integer> numberSet1 = new TreeSet<>();
		Set<Integer> numberSet2 = new LinkedHashSet<>(); 
		
		// Q. numberSet에 반복문을 활용하여 1부터 10까지 2번씩 저장해 봅시다.
		for(int num = 1; num < 11; num++) {
			numberSet.add(num);
			numberSet.add(num);
		} 
		
		// Q. numberSet의 크기를 출력해 봅시다.
		System.out.println("numberSet의 크기: " + numberSet.size());
		
		// Q. numberLis2t에 저장된 데이터를 출력해 봅시다.
		System.out.print("numberSet: ");
		for(int num : numberSet) {
			System.out.print(" " + num);
		}
		System.out.println();
		
		
		
		
		/* HashMap 연습하기 */
		
		// Q. 타입으로 Map, 저장할 데이터 타입은 키로 String 데이터로 Integer, 변수 이름으로 scoreMap, 구현체로 HashMap을 생성해 봅시다.
		Map<String, Integer> scoreMap = new HashMap<String, Integer>();
		
		// Q. 수학은 100점, 국어는 90점, 영어는 80점을 저장해 봅시다.
		scoreMap.put("수학", 100);
		scoreMap.put("국어", 90);
		scoreMap.put("영어", 80);
		
		// Q. scoreMap에 저장된 '키'를 출력해 봅시다.
		System.out.println("scoreMap keys: " + scoreMap.keySet());
		
		// Q. scoreMap에 저장된 데이터를 출력해 봅시다.
		for(String subject : scoreMap.keySet()) {
			System.out.println(subject + ": " + scoreMap.get(subject));
		}
		
		// Q. 영어 90점을 추가로 저장해 봅시다.
		scoreMap.put("영어", 90);
		
		// Q. 다시 한 번 저장된 데이터를 출력해 봅시다.
		for(String subject : scoreMap.keySet()) {
			System.out.println(subject + ": " + scoreMap.get(subject));
		}
	}
}
