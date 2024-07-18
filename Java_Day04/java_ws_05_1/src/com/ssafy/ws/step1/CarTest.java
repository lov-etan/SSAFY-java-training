package com.ssafy.ws.step1;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();

		// car1의 필드값을 작성해보자.
		// 자동차 등록번호
		car1.setVIN("KMHXX00XXXX000000");
		// 자동차 모델이름
		car1.setModelName("쏘나타");
		// 자동차 색상
		car1.setColor("Red");
		// 자동차 주행거리
		car1.setMileage(12000);

		Car car2 = new Car("KNHXX00XXXX000000", "K5", "White", 35000);
		System.out.println("-------------toStirng-------------");
		System.out.println(car1);
		System.out.println(car2);
		
		CarManager cm = new CarManager();
		
		cm.add(car1);
		cm.add(car2);
		
		System.out.println("-------------getList-------------");
		Car[] carList = cm.getList();
		for(Car c : carList)
			System.out.println(c);
		
		System.out.println("-------------searchByModelName(K가 들어가는 모델)-------------");
		Car[] searchList = cm.searchByModelName("K");
		for(Car c : searchList)
			System.out.println(c);
		
		
	}
}
