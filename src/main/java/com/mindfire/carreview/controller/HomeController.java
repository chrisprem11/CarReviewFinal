package com.mindfire.carreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindfire.carreview.DTO.ReviewDTO;
import com.mindfire.carreview.DTO.SearchDTO;
import com.mindfire.carreview.DTO.UserRegistrationDto;
import com.mindfire.carreview.DTO.UserSigninDto;
import com.mindfire.carreview.service.CarService;
import com.mindfire.carreview.service.ReviewService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private ReviewService reviewService;
	
	/**
	 * maps to the homepage and return the home.jsp page
	 * @param sdto
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@ModelAttribute("search")SearchDTO sdto,Model model) {
		model.addAttribute("search", new SearchDTO());
		return "home";
	}

	/**
	 * This method maps and returns the login page 
	 * @param dto
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@ModelAttribute("login") UserSigninDto dto,@ModelAttribute("search")SearchDTO sdto, Model model) {
		model.addAttribute(new UserRegistrationDto());
		model.addAttribute("search", new SearchDTO());
		return "login";
	}

	/**
	 * This method serves the GET request for the signup page and returns the
	 *  sign up
	 * page
	 * @param dto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute("user") UserRegistrationDto dto, Model model) {
		model.addAttribute(new UserRegistrationDto());
		return "signup";
	}
	/**
	 * This method maps the topbrands page of the application. The contents displayed
	 * here are coming from the database.
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value="topbrands")
	public ModelAndView topbrands(@ModelAttribute("search")SearchDTO sdto,Model model){
		model.addAttribute("search", new SearchDTO());
		return carService.carList();
	}
	
	/**
	 * This method maps and returns the reviews page.
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value="reviews")
	public ModelAndView reviews(@ModelAttribute("search")SearchDTO sdto,Model model){
		model.addAttribute("search", new SearchDTO());
		return reviewService.reviews();
	}
	
	/**
	 * This method redirects to the car details page which has a optional review section.
	 * The Car Id is taken as input url.
	 * @param sdto
	 * @param dto
	 * @param model
	 * @param carId
	 * @return returns the details page along with a review option for the logged in user.
	 */
	@RequestMapping(value = "write/{carId}")
	public ModelAndView writeReview(@ModelAttribute("search")SearchDTO sdto,@ModelAttribute("reviews") ReviewDTO dto,Model model,@PathVariable("carId") Long carId){
		model.addAttribute("search", new SearchDTO());
		model.addAttribute("reviews", new ReviewDTO());
		return carService.viewCar(carId);
	}

}
