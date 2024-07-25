package com.ssafy.ws.step1;

public class ElectricCar extends Car {
	// 전기자동차 배터리 량
	private int battery;

	// 기본생성자
	public ElectricCar() {
	}

	// 모든 필드를 갖는 생성자
	public ElectricCar(String VIN, String modelName, String color, int mileage, int battery) {
		super(VIN, modelName, color, mileage);
		this.battery = battery;
	}

	/**
	 * 배터리 정보를 반환한다.
	 * 
	 * @return battery
	 */
	public int getBattery() {
		return battery;
	}

	/**
	 * 배터리를 저장한다.
	 * 
	 * @param battery
	 */
	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return super.toString() + "+ battery=" + battery + "]";
	}

}
