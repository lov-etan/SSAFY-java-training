package com.ssafy.hw.step4;

/**
 * 리뷰 정보를 나타내는 클래스
 */
public class Review {
	//코드를 작성하세요.
	int reviewId;
	String pCode;
	String writer;
	String content;
	
	//생성자 생성
	public Review(int reviewId, String pCode, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.pCode = pCode;
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", pCode=" + pCode + ", writer=" + writer + ", content=" + content
				+ "]";
	}
	
	
	
	
	
}
