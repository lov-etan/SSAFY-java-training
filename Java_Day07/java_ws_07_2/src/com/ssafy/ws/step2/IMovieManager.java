package com.ssafy.ws.step2;

public interface IMovieManager {
	//코드를 작성해주세요. 
	
	//영화를 영화리스트에 추가한다.
	void add(Movie movie);
	
	//등록된 영화리스트를 반환한다.
	Movie[] getList();
	
	//도서 제목을 포함하고 있는 영화 리스트를 반환한다.
	Movie[] searchByTitle(String title);
	
	//등록된 영화 중에 일반영화만 반환한다.
	Movie[] getMovies();
	
	//등록된 영화 중에 시리즈영화만 반환한다.
	SeriesMovie[] getSeriesMovies();
	
	//영화 상영시간의 평균을 반환한다.
	double getRunningTimeAvg();
}
