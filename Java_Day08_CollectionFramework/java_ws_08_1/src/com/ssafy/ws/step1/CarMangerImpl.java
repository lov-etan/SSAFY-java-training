package com.ssafy.ws.step1;

import java.util.ArrayList;
import java.util.List;

public class CarMangerImpl implements ICarManager {
	// 관리하는 자동차 리스트
	private List<Car> carList = new ArrayList<>();

	// 싱글톤 디자인패턴을 위해 유지하는 객체 참조
	// 클래스가 메모리에 로드될 때 객체를 1번만 생성하여 참조를 유지한다.
	private static ICarManager instance = new CarMangerImpl();

	// 외부에서 객체 생성을 하지 못하도록 생성자를 private 으로 선언
	private CarMangerImpl() {
	}

	// 내부에서 생성한 객체의 참조를 반환한다.
	public static ICarManager getInstance() {
		return instance;
	}

	// ArrayList는 크기의 제한이 없으므로 저장 성공/실패를 boolean으로 반환하지 않아도 된다.
	@Override
	public void add(Car car) {
		carList.add(car);
	}

	@Override
	public Car[] getList() {
		Car[] result = new Car[carList.size()];

		for (int i = 0; i < carList.size(); i++) {
			result[i] = carList.get(i);
		}

		return result;
	}

	@Override
	public Car[] searchByModelName(String modelName) {
		List<Car> tempList = new ArrayList<Car>();

		for (Car c : carList) {
			if (c.getModelName().contains(modelName))
				tempList.add(c);
		}

		Car[] result = new Car[tempList.size()];
		for (int i = 0; i < tempList.size(); i++) {
			result[i] = tempList.get(i);
		}
		return result;
	}

	@Override
	public ElectricCar[] getElectricCars() {
		List<ElectricCar> tempList = new ArrayList<ElectricCar>();

		for (Car c : carList) {
			if (c instanceof ElectricCar)
				tempList.add((ElectricCar) c);
		}
		ElectricCar[] eList = new ElectricCar[tempList.size()];

		for (int i = 0; i < tempList.size(); i++) {
			eList[i] = tempList.get(i);
		}

		return eList;
	}

	@Override
	public int getTotalMileage() {
		int total = 0;

		for (Car c : carList) {
			total += c.getMileage();
		}

		return total;
	}

}
