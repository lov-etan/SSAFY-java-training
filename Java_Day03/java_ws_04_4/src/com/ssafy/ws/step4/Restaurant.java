package com.ssafy.ws.step4;

/**
 * 맛집 정보를 나타내는 클래스
 */
public class Restaurant {
	//코드를 작성해주세요. 
	int resId;
	String name;
	String address;
	String signatureMenu;
	int rate;
	public Restaurant(int resId, String name, String address, String signatureMenu, int rate) {
		super();
		this.resId = resId;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Restaurant [resId=" + resId + ", name=" + name + ", address=" + address + ", signatureMenu="
				+ signatureMenu + ", rate=" + rate + "]";
	}
	
	
}
