package com.mindfire.carreview.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.mindfire.carreview.DTO.ReviewDTO;
import com.mindfire.carreview.domain.Review;
import com.mindfire.carreview.repository.CarRepository;
import com.mindfire.carreview.repository.ReviewRepository;

/**
 * This is a service class for the Reviews
 * @author mindfire
 *
 */
@Service
public class ReviewService {
	
	@Autowired
	public ReviewRepository reviewRepository;
	
	@Autowired
	public CarRepository carRepository;

	/**
	 * This method adds the review to the database.
	 * @param dto
	 * @param model
	 * @return
	 */
	public String addReview(ReviewDTO dto, Model model) {
		
		Review newReview = new Review();
		newReview.setCar_id(dto.getCar_id());
		newReview.setUser_id(dto.getUser_id());
		newReview.setTitle(dto.getTitle());
		newReview.setReview(dto.getReview());
		newReview.setRating(dto.getRating());

		Review check = reviewRepository.save(newReview);
		if (check.equals(null)) {
			return "write";
		} else {
			return "result";
		}
	}
	
	/**
	 * This method generates a view page for listing the reviews.
	 * @return reviews view page.
	 */
	public ModelAndView reviews(){
		List<Review> reviews=reviewRepository.findByRating(4);
		Map<String, Object> model=new HashMap<String, Object>();
		model.put("reviews", reviews);
		return new ModelAndView("reviews",model);
	}
	
	

}
