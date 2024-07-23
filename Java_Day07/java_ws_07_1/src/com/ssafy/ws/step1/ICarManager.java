package com.ssafy.ws.step1;

public interface ICarManager {
	/**
	 * 자동차를 추가한다.
	 * 
	 * @param car
	 * @return 성공 / 실패
	 */
	boolean add(Car car);

	/**
	 * 등록된 자동차 리스트를 반환한다.
	 * 
	 * @return 등록된 전체 자동차 리스트
	 */
	public Car[] getList();

	/**
	 * 해당 이름을 포함하고 있는 자동차 리스트를 반환한다.
	 * 
	 * @param modelName : 조회할 모델 명
	 * @return 모델명을 포함한 자동차 리스트
	 */
	public Car[] searchByModelName(String modelName);

	/**
	 * 등록된 자동차중에 전기차만 반환한다.
	 * 
	 * @return 등록된 전체 전기차 리스트
	 */
	public ElectricCar[] getElectricCars();

	/**
	 * 자동차 주행거리의 총합을 반환한다.
	 * 
	 * @return 등록된 자동차 주행거리의 총합
	 */
	public int getTotalMileage();
}
