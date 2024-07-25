package com.ssafy.hw.step2;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId("user1");
		user1.setPassword("user1");
		user1.setName("김싸피");
		user1.setEmail("ssafy1@ssafy.com");
		user1.setAge(27);

		User user2 = new User("user2", "user2", "박싸피", "ssafy2@ssafy.com", 28);
		VipUser vuser = new VipUser("vip1", "vip1", "김싸피" , "ssafy3@ssafy.com", 29, "Gold", 300);
		
		// 싱글톤 테스트를 위해 UserManager 2개 생성
		UserManagerImpl um = UserManagerImpl.getInstance();
		UserManagerImpl um2 = UserManagerImpl.getInstance();
		
		um.add(user1);
		um.add(user2);
		um.add(vuser);
		
		// 동일하게 동작하는지 테스트
		System.out.println(Arrays.toString(um.searchByName("김")));
		System.out.println(Arrays.toString(um.getUsers()));
		System.out.println(um.getAgeAvg());
		
		// UserManager 2개가 같은 인스턴스를 참조하는지 검사
		System.out.println(um == um2);
		
	}

}
