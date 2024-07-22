package com.ssafy.hw.step4;

public class Refrigerator extends Product {
	//코드를 작성하세요.
	public String category;
	public int liter;
	public boolean freezer;
	public int year;
	
	public Refrigerator(){}

	public Refrigerator(String pCode, String pName, int price, int quantity, String brand, String desc, String category, int liter, boolean freezer, int year) {
		super(pCode, pName, price, quantity, brand, desc);
		this.category = category;
		this.liter = liter;
		this.freezer = freezer;
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public boolean isFreezer() {
		return freezer;
	}

	public void setFreezer(boolean freezer) {
		this.freezer = freezer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Refrigerator [category=" + category + ", liter=" + liter + ", freezer=" + freezer + ", year=" + year
				+ "]";
	}
	
	
	
	
	

}
