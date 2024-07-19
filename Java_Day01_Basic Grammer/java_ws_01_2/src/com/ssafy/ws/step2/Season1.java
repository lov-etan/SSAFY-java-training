package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		for (int count = 1; count <= 3; count++ ) {
			System.out.print("월 입력>>");
			int month = scanner.nextInt();
			if (month >= 3 && month <= 5) {
				System.out.println(month + "월은 봄입니다.");
			} else if (month >= 6 && month <= 8) {
				System.out.println(month + "월은 여름입니다.");
			} else if (month >= 9 && month <= 11 ) {
				System.out.println(month + "월은 가을입니다.");
			} else {
				System.out.println(month + "월은 겨울입니다.");
			}
		} 
		
	}

}
