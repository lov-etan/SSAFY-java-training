package com.ssafy.hw.step2;

public class UserManager {

	private int size = 0;
	
	// 최대 사용자 개수
	private final int MAX_SIZE = 100 ;

	private User[] userList = new User[MAX_SIZE]; //{null, null, ...}

	// 사용자 추가
	public void add(User user) {
		
		// 최대 사용자 개수에 도달하지 않았으면 사용자 추가
		if (size < MAX_SIZE) {
			userList[size] = user;
			size++;
		} else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}
	
	// 등록된 사용자 리스트 반환
	// 5.UserManager 클래스에 등록된 사용자리스트를 반환하는 getList 메소드를 생성한다.    
	//  A. 만약 2명이 등록되었다면 크기가 2인 User 배열을 반환하면 된다.    
	//  B. 전체 사용자 리스트를 반환하면 안된다.
	public User[] getList() {
		
		//size 만큼만 배열을 새로 만들어서 반환
		User[] actualList = new User[size] ;
		for(int i=0; i<size; i++) {
			actualList[i] = userList[i];
		}
		return actualList;
	}
	
	// 제공된 name과 일치하는 이름을 가진 사용자 객체 반환
	//6.   UserManager 클래스에 이름으로 해당 사용자 객체를 반환하는 searchByName 메소드를 생성한다.
	public User searchByName(String name) {
		
		for (int i = 0; i < userList.length ; i++) {
			if (userList[i].getName().equals(name) ) {
				return userList[i];
			}
		}

		return null;
	}

	public int getSize() {
		return size;
	}
	
	

}
