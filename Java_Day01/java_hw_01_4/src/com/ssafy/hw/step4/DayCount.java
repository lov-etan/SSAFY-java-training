package com.ssafy.hw.step4;

import java.util.Scanner;

public class DayCount {

	public static void main(String[] args) {
		//코드를 작성하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("월과 일을 입력하세요");
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int count = 0;
		
				
		
		for(int i = 1; i < month; i++) {		
			switch (i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				count += 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				count += 30;
				break;
			case 2:
				count += 28;
				break;				
		
		} 
		
	} 	count += day;
		System.out.println(month + "월 " + day + "일은 " + count + "번째 날입니다." ) ;

 }
}

