package com.ssafy.hw.step4;

import java.util.Arrays;

/**
 * 상품리스트를 배열로 유지하며 관리하는 클래스
 */
public class ProductManager {
	//코드를 작성하세요.
//	2.    상품리스트를 배열로 관리할 ProductManager 클래스 생성한다.(상품정보는 최대 100개, 리뷰정보는 1000개를 넘지 않는다.)
	private int pCount = 0;
	private final int MAX_PRODUCT_SIZE = 100;
	private Product[] productList = new Product[MAX_PRODUCT_SIZE];
	
	private int rCount = 0;
	private final int MAX_REVIEW_SIZE = 1000;
	private Review[] reviewList = new Review[MAX_REVIEW_SIZE];
	
//	3.    ProductManager 클래스에 상품정보를 등록하는 addProduct 메소드를 생성한다.
	public void add(Product product) {
		if(pCount<MAX_PRODUCT_SIZE) {
			productList[pCount++] = product;
		} else {
			System.out.println("상품정보 수가 100을 넘었습니다. 등록 불가합니다.");
		}
		
	}
//	4.    ProductManager 클래스에 상품정보를 수정하는 updateProduct 메소드를 생성한다.
	public void updateProduct(Product product) {
		for(int i=0; i<pCount; i++) {
			if(productList[i].getpCode().equals(product.getpCode())) { //리스트 돌려보면 pCode 같은거 찾기
				productList[i] = product; //상품 정보 수정
				System.out.println("상품정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 ID의 상품이 존재하지 않습니다.");
		
	}
	
//	5.    ProductManager 클래스에 상품을 판매하는 sell 메소드를 생성한다.A.판매 처리는 Product의 Quantity를 1 감소시킨다.
	public void sell(String pCode, int cnt) {
		for(int i=0; i<pCount;i++) {
			if(productList[i].getpCode().equals(pCode)){
				if(productList[i].getQuantity() >= cnt) {
					productList[i].setQuantity(productList[i].getQuantity()-1);
					System.out.println("상품이 판매되었습니다.");
				} else {
					System.out.println("재고가 부족합니다.");
				}
				return;
			}
			System.out.println("해당 코드의 상품이 존재하지 않습니다.");
		}
	}
//	6.    ProductManager 클래스에 상품리스트를 반환하는 getProductList 메소드를 생성한다.
	public Product[] getProductList() {
		Product[] result = new Product[pCount];
		
		for(int i=0; i<pCount;i++) {
			result[i] = productList[i];
		}
		return result;
	}
	
//	7.    ProductManager 클래스에 상품코드로 상품정보를 반환하는 searchByCode 메소드를 생성한다.
	public Product[] searchByCode(String pCode) {
		int cnt = 0;
		for(int i=0; i<this.pCount;i++) {
			if(productList[i].getpCode().equals(pCode))
				cnt++;
		}
		
		Product[] result = new Product[cnt];
		int idx = 0;
		for(int i=0;i<pCount; i++) {
			if(productList[i].getpCode().equals(pCode))
				result[idx++] = productList[i];
		}
		return result;
	}
	
	
	
//	8.    ProductManager 클래스에 리뷰정보를 등록하는 addReview 메소드를 생성한다.
//	9.    ProductManager 클래스에 리뷰정보를 삭제하는 removeReview 메소드를 생성한다.
//	10. ProductManager 클래스에 해당 상품에 대한 리뷰를 반환하는 getProductReview 메소드를 생성한다.
	

}
