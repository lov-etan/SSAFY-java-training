package com.ssafy.ws.step2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 파일 입출력 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 */
public class FileTest {
	public static void main(String[] args) throws IOException {
		
		/* 파일 읽기 연습하기 */
		
		// 이전 실습의 BufferedReader의 형태를 다시 살펴봅시다.
		// 시스템으로 들어오는 데이터를 사용하기 위해서 System.in을 이용했습니다.
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Q. input.txt 파일을 읽어와 봅시다.
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
		
		// Q. input.txt의 4줄의 데이터를 읽어 출력해 봅시다.
		for(int line = 0; line < 4; line++) {
			String message = br.readLine();
			System.out.println(message);
		}
		
		
		
		/* 파일 출력 연습하기 */
		
		// 이전 실습의 BufferedWriter의 형태를 다시 살펴봅시다.
		// 시스템으로 들어오는 데이터를 사용하기 위해서 System.out을 이용했습니다.
		// BufferedWriter bw = new BufferedWriter(new OutputStreamReader(System.in));
		
		// Q. output.txt 파일에 데이터를 출력해 봅시다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
		
		String lorem = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout."
				+ "\nThe point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English."
				+ "\nMany desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy."
				+ "\nVarious versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like)";
		
		bw.write(lorem);
		bw.close();
		
		// Q. 해당 프로젝트에 output.txt를 확인합니다.
		//	  output.txt가 보이지 않으면 프로젝트 - 오른쪽 마우스 - refresh를 눌러주세요.
	}
}
