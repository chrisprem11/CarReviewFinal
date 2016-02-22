package com.mindfire.carreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.ReviewDTO;
import com.mindfire.carreview.DTO.SearchDTO;
import com.mindfire.carreview.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	/**
	 * This method maps and returns the feedback page.
	 * @param dto
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String getReview(@ModelAttribute("reviews") ReviewDTO dto,@ModelAttribute("search")SearchDTO sdto, Model model) {
		model.addAttribute("reviews", new ReviewDTO());
		model.addAttribute("search", new SearchDTO());
		return "write";
	}
	
	
	/**
	 * This method serves the Post service and adds the reviews provided 
	 * by the user into the database.
	 * @param dto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "write/userreview", method = RequestMethod.POST)
	public String postReview(@ModelAttribute("reviews") ReviewDTO dto, Model model) {
		model.addAttribute("reviews", new ReviewDTO());
		return reviewService.addReview(dto, model);
	}

}
