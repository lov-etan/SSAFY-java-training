package com.ssafy.ws.step3;

/**
 * 직각삼각형 모양의 숫자 출력하는 클래스
 */
public class DigitTest1 {

	public static void main(String[] args) {
		// 3
		//공백 0부터 4까지 출력
		int n = 5;
		int num = 1;
		for(int row = 1; row<=n ; row++) { //행 1
			for(int blank=0; blank<row-1;blank++) {//행 하나에 blank가 몇 번 돌까? 
				System.out.print("   ");
			} 
			for(int star=n-row+1; star>0; star--) {//공백 뒤에 숫자 몇 개 올까?
					System.out.printf("%3d",num);
					num++;
				}System.out.println();
			}
	}
}	
	


