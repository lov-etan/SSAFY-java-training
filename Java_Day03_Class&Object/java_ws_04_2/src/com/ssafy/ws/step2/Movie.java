package com.ssafy.ws.step2;

//멤버변수, 멤버 메서드, 생성자 모두 클래스 안에 있어야... 구성요소
public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	//멤버메서드
	//source -> generate toString
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre + ", runningTime="
				+ runningTime + "]";
	}

	
	
	//생성자
	// - 기본 생성자
//  public Movie(){};
	//1.첫번째 방법: ctrl + spacebar
	//->제일 처음에 기본생성자
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	

	//2. 두번째 방법: 우클릭 >
		// Source > Generate constructor using fields..
	public Movie(int id, String title, String director, String genre, int runningTime) {
		// super();//금요일 상속시간에..
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
}
