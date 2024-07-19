package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {
		// 코드를 작성하세요.(while문과 switch문 사용)
		int count = 1;
		
		while(count<=3) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("월 입력>>");
			int month = scanner.nextInt();
			
			switch (month) {
				case 3:
				case 4:
				case 5:
					System.out.println(month + "월은 봄입니다.");
					break;
				
				case 6:
				case 7:
				case 8:
					System.out.println(month + "월은 여름입니다.");
					break;
				
				case 9:
				case 10:
				case 11:
					System.out.println(month + "월은 가을입니다.");
					break;
				
				case 12:
				case 1:
				case 2:
					System.out.println(month + "월은 가을입니다.");
					break;
				
			} count++;
		}
		
		
	}

}
