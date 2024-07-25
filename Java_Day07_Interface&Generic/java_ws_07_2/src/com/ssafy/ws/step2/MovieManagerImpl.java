package com.ssafy.ws.step2;

import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class MovieManagerImpl implements IMovieManager {
	//코드를 작성해주세요. 
	
	private int size = 0;
	private final int MAX_SIZE = 100;
	private Movie[] movieList = new Movie[MAX_SIZE];
	
	//클래스가 메모리에 로드될 때 객체를 1번만 생성하여 참조를 유지한다.
	private static MovieManagerImpl instance = new MovieManagerImpl();
	//외부에서 객체 생성을 하지 못하도록 생성자를 싱글톤 패턴으로 선언
	private MovieManagerImpl() {
		
	}
	
	//내부에서 생성한 객체의 참조를 반환한다.
	public static IMovieManager getInstance() {
		return instance;
	}
	
	@Override
	public void add(Movie m) {
		if (size < 100) {
			movieList[size++] = m;
		} else {
			System.out.println("영화 정보의 수가 100을 넘었습니다. 등록 불가.");
		}
	}
	
	@Override
	public Movie[] getList() {
		Movie[] result = new Movie[size];
		
		for(int i=0; i<size; i++){
			result[i++] = movieList[i];
		}
		
		return result;
	}
	
	@Override
	public Movie[] getMovies() {
		int cnt = 0;
		
		for(int i=0; i<this.size; i++) {
			//리스트안의 객체가 일반영화 클래스의 인스턴스인지 검사
			if(!(movieList[i] instanceof SeriesMovie)){
				cnt++;
			}
		}
		if (cnt == 0)
			return null;
		
		Movie[] result = new Movie[cnt] ;
		for(int i=0, idx=0; i<this.size; i++) {
			if(!(movieList[i] instanceof SeriesMovie)) {
				result[idx++] = movieList[i];
			}
		}
		return result;
	}
	
	@Override
	//등록된 영화 중에 시리즈영화만 반환한다.
	public SeriesMovie[] getSeriesMovies() {
		int cnt=0;
		for(int i=0; i<this.size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				cnt++;
			}
		}
		if(cnt == 0)
			return null;
		
		SeriesMovie[] result = new SeriesMovie[cnt];
		for(int i=0, idx=0; i<this.size; i++) {
			if(movieList[i] instanceof SeriesMovie) {
				result[idx++] = (SeriesMovie)movieList[i];
			}
		}
		return result;
	}
	
	@Override
	//도서 제목을 포함하고 있는 영화 리스트를 반환한다.
	public Movie[] searchByTitle(String title) {
		int cnt = 0;
		for(int idx=0; idx<this.size; idx++) {
			if(movieList[idx].getTitle().contains(title)) {
				cnt++;
			}
		}
		
		Movie[] actualMovieList = new Movie[cnt];
		int idx = 0;
		for (idx=0; idx<this.size; idx++) {
			if(movieList[idx].getTitle().contains(title)) {
				actualMovieList[idx++] = movieList[idx];
			}
		}
		return actualMovieList;
	}
	
	//영화 상영시간의 평균을 반환한다.
	public double getRunningTimeAvg() {
		int sum = 0;
		
		for(int i=0; i<this.size;i++) {
			sum += movieList[i].getRunningTime();
		}
		
		return sum/this.size;
	}
	
	
}
	

