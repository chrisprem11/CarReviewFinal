package com.mindfire.carreview.DTO;

public class ReviewDTO {

	private Long car_id;
	private Long user_id;
	private String title;
	private String review;
	private Integer rating;

	public ReviewDTO() {

	}

	public ReviewDTO(Long car_id, Long user_id, String title, String review, Integer rating) {
		this.car_id = car_id;
		this.user_id = user_id;
		this.title = title;
		this.review = review;
		this.rating = rating;
	}

	public Long getCar_id() {
		return car_id;
	}

	public void setCar_id(Long car_id) {
		this.car_id = car_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
