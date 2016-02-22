package com.mindfire.carreview.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.AddCarDTO;
import com.mindfire.carreview.DTO.SearchDTO;
import com.mindfire.carreview.service.CarService;

/**This is a controller class which controls the mapping that are 
 * meant for the admin only.
 * 
 * @author mindfire
 *
 */

@Controller
public class AdminController {
	
	@Autowired
	private CarService carService;
	
	/**
	 * This method maps the home page of the admin.
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String review(@ModelAttribute("search")SearchDTO sdto,Model model) {
		model.addAttribute("search", new SearchDTO());
		return "admin";
	}

	/**
	 * This method maps to a new page for the admin from where the admin can add 
	 * cars to the database.
	 * @param dto
	 * @param sdto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "addcar", method = RequestMethod.GET)
	public String getaddcars(@ModelAttribute("addcar") AddCarDTO dto,@ModelAttribute("search")SearchDTO sdto, Model model) {
		model.addAttribute("addcar", new AddCarDTO());
		model.addAttribute("search", new SearchDTO());
		return "addcar";
	}

	/**
	 * This is a service method that takes input from the admin and maps to the 
	 * Car DTO and finally updates the changes into the database. 
	 * @param dto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "addCars", method = RequestMethod.POST)
	public String postaddcars(@ModelAttribute("addcar") AddCarDTO dto, Model model) {
		model.addAttribute("addcar", new AddCarDTO());
		return carService.addNewCars(dto, model);
	}

	/**
	 * Binds the date entered into a readable format.
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

}
