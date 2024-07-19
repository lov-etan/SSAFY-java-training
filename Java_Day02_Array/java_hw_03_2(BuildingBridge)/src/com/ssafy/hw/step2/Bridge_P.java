package com.ssafy.hw.step2;

import java.util.Scanner;

public class Bridge_P {

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
		
		// 최대값 저장
		int maxDistance = 0;
		
		for ( int r = 0 ; r < n ; r++ ) {
			for ( int c=0 ; c < n ; c++  ) {
				
				// 지금 위치가 섬인지 검사
				if ( map[r][c] == 1 ) {
					
					// 섬이면 현재 위치로부터 사방탐색 하여 가로 또는 세로에 있는 섬과 거리 측정, 최대값 저장
					
					// 동쪽이 1인지 검사
					// 틀린 부분: <= 8까지 포함해버림. 그렇게 하면 index 초과
					for (int d = 1; d < (n-c) ; d++) {
						if ( map[r][c+d] == 1 ) {
							maxDistance = Math.max(d , maxDistance );
							break;
						}
					}
					
					// 서쪽이 1인지 검사
					for (int d = 1; d <= c ; d++) {
						if ( map[r][c-d] == 1 ) {
							maxDistance = Math.max( d , maxDistance );
							break;
						}
					}
					
					// 북쪽이 1인지 검사
					// 북쪽으로 가려면 row 를 참조해야 함
					for (int d = 1; d <=r ; d++) {
						if ( (r-d)>=0 && map[r-d][c] == 1 ) {
							maxDistance = Math.max( d , maxDistance );
							break;
						}
					}
					
					// 남쪽이 1인지 검사
					for (int d = 1; d < (n-r) ; d++) {
						if ( map[r+d][c] == 1 ) {
							maxDistance = Math.max( d , maxDistance );
							break;
						}
					}
				}
			}
		}
		
		System.out.println(maxDistance);

	}
}
