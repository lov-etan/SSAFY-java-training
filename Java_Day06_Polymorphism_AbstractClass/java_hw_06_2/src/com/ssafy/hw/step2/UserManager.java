package com.ssafy.hw.step2;

import java.util.Arrays;

public class UserManager {

	private final int MAX_SIZE = 100;

	private int size = 0;
	
	private User[] userList = new User[MAX_SIZE];

	public void add(User user) {
		if (size < MAX_SIZE) {
			userList[size++] = user;
		} else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}

	public User[] getList() {

		return Arrays.copyOfRange(userList, 0, size);
	}
	
	// 일반 사용자만 반환
	public User[] getUsers() {
		
		int cnt = 0;
		
		for(int i=0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(!(userList[i] instanceof VipUser)) { 
				//instanceOf는 해당 클래스의 자손까지 모두 해당된다.
				//VipUser마저도 아니어야만(!userList instanceOf VipUser) 일반 사용자를 반환할 수 있다.
				cnt++;
			}
		}
		
		if (cnt == 0)
			return null;
		
		User[] res = new User[cnt];
		
		for(int i=0, index = 0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(!(userList[i] instanceof VipUser)) {
				res[index++] = userList[i];
			}
		}
		
		return res;
		
	}
	
	// VipUser만 반환
	public VipUser[] getVipUsers() {
		
		int cnt = 0;
		
		for(int i=0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(userList[i] instanceof VipUser) {
				cnt++;
			}
		}
		
		if (cnt == 0)
			return null;
		
		VipUser[] res = new VipUser[cnt];
		
		for(int i=0, index = 0; i<this.size; i++) {
			// 리스트안의 객체가 VipUser 클래스의 인스턴스인지 검사
			if(userList[i] instanceof VipUser) {
				res[index++] = (VipUser)userList[i];
			}
		}
		
		return res;
		
	}
	
	public User[] searchByName(String name) {

		int cnt = 0;

		for (int i = 0; i < this.size; i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (userList[i].getName().contains(name)) {
				cnt++;
			}
		}

		if (cnt == 0)
			return null;

		User[] res = new User[cnt];

		for (int i = 0, index = 0; i < this.size; i++) {
			// 주어진 이름을 포함하는 사용자인지 검사
			if (userList[i].getName().contains(name)) {
				res[index++] = userList[i];
			}
		}

		return res;
	}
	
	// 사용자의 평균 나이 반환
	public double getAgeAvg() {
		
		int sum = 0;
		
		for(int i=0; i<this.size; i++) {
			sum += userList[i].getAge();
		}
		
		return sum/this.size;
	}

}
