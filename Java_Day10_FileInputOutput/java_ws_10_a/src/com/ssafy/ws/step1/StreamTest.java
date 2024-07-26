package com.ssafy.ws.step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 스트림 이해하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * 스트림은 입력과 출력의 흐름을 의미합니다.
 * 
 * 스트림은 한 방향으로만 진행되며 입력은 입력끼리 출력은 출력끼리 진행되고, 쌍을 이룹니다.
 * 
 */
public class StreamTest {
	
	public static void main(String[] args) throws IOException {
		
		/* BufferedReader 이해하기 */
		
		// BufferedReader는 입력으로 들어오는 데이터를 버퍼 단위 (묶음)으로 입력받는 것을 말합니다.
		// InputStreamReader는 시스템으로 들어오는 입력을 쭉 받아오는 역할입니다.
		
		// 이해하기.
		// System.in: 시스템으로 들어오는 데이터.
		// InputStreamReader: 입력으로 들어오는 데이터를 Stream(흐름, 쭉) 읽어온다.
		// BufferedReader: 입력 스트림을 버퍼 단위로 읽어온다.
		// 방향 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// 사용한 자원은 반드시 해제해준다.
		// Checked Exception이 발생함을 확인한다. //Unhandled exception type IOException
		// 해당 코드를 굳이 처리해 줄 필요가 없다면 예외를 회피해보자.
		br.close();
		
		/* BufferedWriter 이해하기 */
		
		// BufferedWriter는 BufferedReader와 반대로 출력하는데 사용합니다.
		
		// 이해하기.
		// BufferedWriter: 버퍼 단위로 데이터를 출력한다.
		// OutputStreamReader: 출력하려는 데이터를 Stream(흐름, 쭉) 읽어온다.
		// System.out: 시스템에 출력한다.
		// 방향 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 사용한 자원은 반드시 해제해준다.
		// Checked Exception이 발생함을 확인한다.
		// 해당 코드를 굳이 처리해 줄 필요가 없다면 예외를 회피해보자.
		bw.close();
	}
}
