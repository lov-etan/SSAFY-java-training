package com.ssafy.ws.step4;

/**
 * 맛집 객체를 생성하고 정보를 출력하는 클래스
 */
public class RestaurantTest {
	public static void main(String[] args) {
		//코드를 작성해주세요. 
		
		Restaurant res1 = new Restaurant(101, "을밀대", "서울", "냉면", 4);
		Restaurant res2 = new Restaurant(401, "도마29", "대구", "냉면", 4);
		
		Review r1 = new Review(1, 101, "김싸피", "너무 맛있네요.");
		Review r2 = new Review(2, 401, "나싸피", "연어초밥은 여기가 최고!");
		
		System.out.println(res1.toString());
		System.out.println(res2.toString());
		System.out.println(r1.toString());
	}
}
