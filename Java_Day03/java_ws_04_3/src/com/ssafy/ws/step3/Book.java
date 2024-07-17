package com.ssafy.ws.step3;
/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
	//코드를 작성하세요.
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	//생성자
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	@Override
	//toString
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", price=" + price + ", desc=" + desc + "]";
	}
	
	
	
	
}

