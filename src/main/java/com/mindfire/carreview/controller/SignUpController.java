package com.mindfire.carreview.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindfire.carreview.DTO.SearchDTO;
import com.mindfire.carreview.DTO.UserRegistrationDto;
import com.mindfire.carreview.DTO.UserSigninDto;
import com.mindfire.carreview.domain.UserDetails;
import com.mindfire.carreview.service.UserDetailsService;

@Controller
public class SignUpController {
	
	@Autowired
	private UserDetailsService userDetailsService;

	/**
	 * This method serves the Post service and registers a user for the application.
	 * This method adds the user into the userdetails table in the database.
	 * @param userdetails
	 * @param dto
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@Valid @ModelAttribute("user")  UserDetails userdetails ,UserRegistrationDto dto, BindingResult result,Model model) {
		System.out.println("Input has errors" + result.hasErrors());
		if(result.hasErrors()){
			return "signup";
		}
		return userDetailsService.createUserDetails(dto, model);
	}

	/**
	 * This method serves the Post service for the login page.
	 * checks the password and authenticates the user
	 *  and also maintains a session.
	 * @param dto
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") UserSigninDto dto, Model model, HttpSession session) {
		return userDetailsService.UserLogin(dto, model, session);
	}
	
	/**
	 * This method invalidates the session that was maintained.
	 * @param session
	 * @param model
	 * @param sdto
	 * @return
	 */
	@RequestMapping(value ="/logout",method=RequestMethod.GET)
	public String logout(HttpSession session ,Model model,@ModelAttribute("search")SearchDTO sdto){
		session.invalidate();
		model.addAttribute("search", new SearchDTO());
		return "home";
		
	}

}