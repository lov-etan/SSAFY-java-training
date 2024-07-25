package com.ssafy.hw.step2;

import java.util.ArrayList;
import java.util.List;

public class UserManagerImpl implements IUserManager {
	
	// ArrayList 를 사용하여 사용자 리스트 관리하기
	private List<User> userList = new ArrayList<>();

	private final int MAX_SIZE = 100;

	private static UserManagerImpl um = new UserManagerImpl();

	private UserManagerImpl() {
	};

	public static UserManagerImpl getInstance() {
		return um;
	}
	
	// ArrayList의 사용 방법에 맞게 구현
	public void add(User user) {
		if (userList.size() < MAX_SIZE) {
			userList.add(user);
		} else {
			System.out.println("유저의 수가 100을 넘었습니다. 등록 불가.");
		}
	}
	
	// ArrayList를 배열로 변환하여 반환
	public User[] getList() {

		User[] res = new User[userList.size()];

		return this.userList.toArray(res);
	}
	
	// ArrayList의 사용 방법에 맞게 구현
	public User[] getUsers() {

		List<User> list = new ArrayList<>();

		for (int i = 0; i < userList.size(); i++) {
			if (!(userList.get(i) instanceof VipUser)) {
				list.add(userList.get(i));
			}
		}

		User[] res = new User[list.size()];

		return list.toArray(res);

	}	

	// ArrayList의 사용 방법에 맞게 구현
	public VipUser[] getVipUsers() {

		List<VipUser> list = new ArrayList<>();

		for (int i = 0; i < userList.size(); i++) {
			if ((userList.get(i) instanceof VipUser)) {
				list.add((VipUser) userList.get(i));
			}
		}
		
		VipUser[] res = new VipUser[list.size()];

		return list.toArray(res);

	}
	
	// ArrayList의 사용 방법에 맞게 구현
	public User[] searchByName(String name) {

		List<User> list = new ArrayList<>();

		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getName().contains(name)) {
				list.add(userList.get(i));
			}
		}
		
		// 주어진 단어를 포함하는 사용자가 없으면 null을 반환한다.
		if(list.size() == 0)
			return null;
		
		User[] res = new User[list.size()];

		return list.toArray(res);
	}
	
	// ArrayList의 사용 방법에 맞게 구현
	public double getAgeAvg() {

		int sum = 0;

		for (int i = 0; i < userList.size(); i++) {
			sum += userList.get(i).getAge();
		}

		return sum / userList.size();

	}

}
