package com.ssafy.ws.step1;

public class Car {
	// 1: 국가 2: 제작사 3: 차량구분 4: 차종 5: 세부차종 6: 차체형상 7: 안정장치
	// 8: 배기량 9: 확인란 10: 제작년도 11: 공장위치 12~17: 제작일련번호
	private String VIN; // 자동차 등로 번호 17자리
	private String modelName; // 자동차 모델 이름
	private String color; // 자동차 색상
	private int mileage; // 주행거리

	// 기본 생성자
	public Car() {
	}

	// 인자를 받는 생성자
	public Car(String VIN, String modelName, String color, int mileage) {
		this.VIN = VIN;
		this.modelName = modelName;
		this.color = color;
		this.mileage = mileage;
	}

	/**
	 * 자동차 등록번호를 반환한다.
	 * 
	 * @return VIN
	 */
	public String getVIN() {
		return VIN;
	}

	/**
	 * 자동차 등록번호를 저장한다.
	 * 
	 * @param VIN
	 */
	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

	/**
	 * 자동차 모델이름을 반환한다.
	 * 
	 * @return modelName
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * 자동차 모델이름을 저장한다.
	 * 
	 * @param modelName
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	/**
	 * 자동자 색상을 반환한다.
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 자동차 색상을 저장한다.
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 자동차 주행거리를 반환한다.
	 * 
	 * @return mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * 자동차 주행거리를 저장한다.
	 * 
	 * @param mileage
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [VIN=" + VIN + ", modelName=" + modelName + ", color=" + color + ", mileage=" + mileage + "]";
	}

}
