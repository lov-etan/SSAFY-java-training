package com.ssafy.ws.step4;

/**
 * 리뷰 정보를 나타내는 클래스
 */
public class Review {
	//코드를 작성해주세요.
	int reviewId;
	int resId;
	String writer;
	String content;
	
	//생성자 만들기
	public Review(int reviewId, int resId, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.resId = resId;
		this.writer = writer;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", resId=" + resId + ", writer=" + writer + ", content=" + content
				+ "]";
	}
	
	
	
}
