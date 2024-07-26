package com.ssafy.hw.step2;

public interface IUserManager {
	
	void add(User user);
	
	User[] getList();
	
	User[] getUsers();
	
	VipUser[] getVipUsers();
	
	User[] searchByName(String name) throws NameNotFoundException;
	
	double getAgeAvg();
	
	// 데이터 저장 기능 추가
	void saveData();
	
	// 데이터 로드 기능 추가
	void loadData();
}
