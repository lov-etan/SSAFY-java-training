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
		VipUser vuser = new VipUser("vip1", "vip1", "김싸피", "ssafy3@ssafy.com", 29, "Gold", 300);

		IUserManager um = UserManagerImpl.getInstance();
		IUserManager um2 = UserManagerImpl.getInstance();

		um.add(user1);
		um.add(user2);
		um.add(vuser);
		
		// 예외가 발생할수 있는 메소드인 searchByName은 처리가 필요.
		try {
			System.out.println(Arrays.toString(um.searchByName("황")));
		} catch (NameNotFoundException exception) {
			exception.printStackTrace();
		}
		
		System.out.println(Arrays.toString(um.getUsers()));
		System.out.println(um.getAgeAvg());

		System.out.println(um.equals(um2));

	}

}
