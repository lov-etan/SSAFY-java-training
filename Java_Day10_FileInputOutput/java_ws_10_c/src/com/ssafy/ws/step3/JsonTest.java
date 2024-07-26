package com.ssafy.ws.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.google.gson.Gson;
//구글에서 만든 Json 라이브러리
// 자바 객체 => json문자열
// json 문자열 => 자바 객체

//1. Maven Project로 만들기
//2.POM.xml에다가 dependency 넣기
//3. 프로젝트 > 우클릭 > Maven >




/**
 * Json 파일 입출력 연습하기
 * 
 * 주석을 참고하여 ____ 부분을 채우고 프로그램을 완성해 봅시다.
 * 
 * Json은 Javascript Object Notation으로 자바스크립트 객체 표기법입니다.
 * Json은 데이터를 표현하는 방법으로 다양한 프로그래밍 언어에서 활용되며, 쉽게 작성할 수 있습니다.
 * 
 * Json 데이터를 직접 처리할 수 있지만 Gson 라이브러리를 이용하여 처리해 봅시다.
 * 
 */
class Person {
	private String name;
	private int age;
	private int height;

	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

public class JsonTest {

	public static void main(String[] args) throws Exception {
		//Gson 라이브러리 불러오기
		
		// Q. Gson을 사용하기 위한 객체를 생성해 봅시다.
		Gson gson = new Gson();

		// Q. 이름은 김민재, 나이는 27, 키는 190인 person1 객체를 생성해 봅시다.
		Person person1 = new Person("김민재", 27, 190);
		
		/*
		 var person1 ={
		  	name: "김민재",
		  		age: 27,
		  		height: 190
		  }
		 */
		
		
		
		//JSON: JavaScript Object Notation
		//자바스크립트의 객체 리터럴을 그대로 문자열로 나타낸 것
		// Q. person1 객체를 json 문자열로 변경해 봅시다.
		String personToJson = gson.toJson(person1);
		System.out.println(personToJson);
		
		// Q. person.json에 파일을 작성하도록 객체를 선언해 봅시다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("person.Json")));
		gson.toJson(person1, bw);
		bw.close();

		
		// Q. person2.json에 저장된 내용을 읽어오도록 객체를 선언해 봅시다.
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("person2.json")));
		
		// Q. json 문자열을 person2 객체로 변환해 봅시다.
		Person person2 = gson.fromJson(br, Person.class);

		// Q. person2의 내용을 출력해봅시다.
		System.out.println("이름 : " + person2.getName());
		System.out.println("나이 : " + person2.getAge());
		System.out.println("키 : " + person2.getHeight());

	}

}

