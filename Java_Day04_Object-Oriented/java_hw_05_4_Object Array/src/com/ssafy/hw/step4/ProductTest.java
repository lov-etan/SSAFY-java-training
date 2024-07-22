package com.ssafy.hw.step4;

/**
 * 상품 객체를 생성하고 출력하는 클래스 
 *
 */
public class ProductTest {
	public static void main(String[] args) {
		//코드를 작성하세요.
		
		Product pr1 = new Product("12", "정수기", 20000, 5, "삼성", "--");
		Product pr2 = new Product("13", "갤럭시", 300000, 7, "삼성", "--");
		Product pr3 = new Product("14", "청소기", 150000, 2, "삼성", "--");
		
		ProductManager pm = new ProductManager();
		pm.add(pr1);
		pm.add(pr2);
		pm.add(pr3);
		
		//1. updateProduct 메서드 사용해보기
			// 상품 정보를 수정할 새로운 상품 객체 생성
        Product updatedProduct = new Product("13", "갤럭시 S21", 350000, 10, "삼성", "--");
        
        	// updateProduct 메서드 호출하여 상품 정보 수정
        pm.updateProduct(updatedProduct);
        
        	// 수정된 상품 리스트 출력
        for(Product p : pm.getProductList()) {
            System.out.println(p);
        }
        
        //2. sell 메서드 사용해보기
        pm.sell("12", 2);
        
        //3. getProductList 메소드 사용해보기
        Product[] productList = pm.getProductList();
        for(Product p: productList)
        	System.out.println(p);
        
        //4. searchByCode 메소드 사용해보기
        Product searchList[] = pm.searchByCode("13");
        for(Product p : searchList)
        	System.out.println(p);
	}
}