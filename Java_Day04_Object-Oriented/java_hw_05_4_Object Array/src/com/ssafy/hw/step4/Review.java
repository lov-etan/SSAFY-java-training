package com.ssafy.hw.step4;

/**
 * 리뷰 정보를 나타내는 클래스
 */
public class Review {
	//코드를 작성하세요.
	public int reviewId;
	public String pCode;
	public String writer;
	public String content;
	
	public Review(){}

	public Review(int reviewId, String pCode, String writer, String content) {
		super();
		this.reviewId = reviewId;
		this.pCode = pCode;
		this.writer = writer;
		this.content = content;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", pCode=" + pCode + ", writer=" + writer + ", content=" + content
				+ "]";
	}
	
	
	
	
	
}