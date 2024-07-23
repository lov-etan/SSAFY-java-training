package com.ssafy.ws.step2;

public class MovieTest {
	public static void main(String[] args) {
		//코드를 작성해주세요. 
		//int id, String title, String director, String genre, int runningTime
		Movie movie1 = new Movie(1,"Avengers", "Joss Whedon","Fantasy", 143);
        Movie movie2 = new Movie(2,"Inception", "Christopher Nolan","SF", 148);
        Movie movie3 = new Movie(3,"Interstellar", "Christopher Nolan","SF", 169);
        SeriesMovie seriesMovie1 = new SeriesMovie(4,"Harry Potter", "Chris Columbus","Fantasy", 152,1,"ajaj");
        SeriesMovie seriesMovie2 = new SeriesMovie(5,"Harry Potter", "Chris Columbus","Fantasy", 161,2,"jj");
		
        IMovieManager mm = MovieManagerImpl.getInstance();
        
        mm.add(movie1);
        mm.add(movie2);
        mm.add(movie3);
        mm.add(seriesMovie1);
        mm.add(seriesMovie2);
        
        System.out.println("-------------일반영화-------------");
        Movie[] movieList = mm.getMovies();
        for(Movie m : movieList)
        	System.out.println(m);
        
        System.out.println("-------------시리즈영화-------------");
        Movie[] seriesList = mm.getSeriesMovies();
        for(Movie sm : seriesList)
        	System.out.println(sm);
        
        System.out.println("등록된 영화의 상영시간의 평균: " + mm.getRunningTimeAvg());
        
	}
}