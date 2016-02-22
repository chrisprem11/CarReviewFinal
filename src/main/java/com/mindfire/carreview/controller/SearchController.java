package com.mindfire.carreview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindfire.carreview.DTO.SearchDTO;
import com.mindfire.carreview.service.CarService;

@Controller
public class SearchController {
	
	@Autowired
	private CarService carService;
	
	/**
	 * This method serves the Post service and searches for a car in the database.
	 * Display the search results in  SearInfo page.
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value="search",method=RequestMethod.POST)
	public ModelAndView searchCar(@ModelAttribute("search")SearchDTO sdto, Model model){
		model.addAttribute("search", new SearchDTO());
		return carService.searchCar(sdto);
	}
	
	

}
