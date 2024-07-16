package com.ssafy.hw.step2;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		String str = sc.nextLine();
//		String str2 = sc.nextLine();
//		
//		System.out.println(a);
//		System.out.println(str);
//		System.out.println(str2);
//		String str = sc.next();
		
//		System.out.println(a);
//		System.out.println(str);
		
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] map = new int[n][n];
		
		for(int r=0; r<n; r++) {
			String str = sc.nextLine();
			for(int c=0; c<n; c++) {
				map[r][c] = str.charAt(c) - '0';
			}
		}
		
		System.out.println(Arrays.deepToString(map));
		
	}
}
