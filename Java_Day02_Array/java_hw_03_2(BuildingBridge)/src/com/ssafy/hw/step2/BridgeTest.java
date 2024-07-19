package com.ssafy.hw.step2;

import java.util.Scanner;

public class BridgeTest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		
		// n * n 크기 배열 선언 ( 지도 )
		int[][] map = new int[n][n];
		
		// 지도 정보 입력 받기
		for (int r = 0; r < n ; r++ ) {
			String str = sc.nextLine();
			for ( int c=0 ; c < n ; c++ ) {
				map[r][c] = str.charAt(c)-'0';
			}
		}
		
		
		int row = 0;
		int col = 2;
		
		int maxDistance =0;
		for (int d = 1; d < (8-col) ; d++) {
			if ( map[row][col+d] == 1 ) {
				maxDistance = Math.max(d , maxDistance );
				break;
			}
		}
		
		System.out.println(maxDistance);
		
		
	}
}
