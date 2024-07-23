package com.ssafy.hw.step2;

// 인터페이스 정의
public interface IUserManager {
	
	void add(User user);
	
	User[] getList();
	
	User[] getUsers();
	
	VipUser[] getVipUsers();
	
	User[] searchByName(String name);
	
	double getAgeAvg();
	
}
