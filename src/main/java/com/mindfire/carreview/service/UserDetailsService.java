package com.mindfire.carreview.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mindfire.carreview.DTO.UserRegistrationDto;
import com.mindfire.carreview.DTO.UserSigninDto;
import com.mindfire.carreview.domain.UserDetails;
import com.mindfire.carreview.repository.UserRepository;

/**
 * This is a service class for the user table.
 * @author mindfire
 *
 */
@Service
public class UserDetailsService {

	@Autowired
	public UserRepository userRepository;
	
	/**
	 * This methods add a user to the registry.
	 * @param dto
	 * @param model
	 * @return returns the success page on successful completion
	 */
	public String createUserDetails(UserRegistrationDto dto, Model model) {

		List<UserDetails> userExists = userRepository.findByEmail(dto.getEmail());
		if (userExists.isEmpty()) {

			UserDetails newUser = new UserDetails();

			newUser.setFirstname(dto.getFirstname());
			newUser.setLastname(dto.getLastname());
			newUser.setEmail(dto.getEmail());
			newUser.setUsername(dto.getUsername());
			newUser.setPassword(new BCryptPasswordEncoder().encode(dto.getPassword()));
			newUser.setPrivilege("user");

			UserDetails obj = userRepository.save(newUser);
			System.out.println(obj);
			
			if (obj.equals(null)) {
				return "signup";
			} else {
				return "result";
			}
		}

		else {
			model.addAttribute("userExists", "Email already Registered!!");
			return "signup";
		}

	}

	/**
	 * This methods redirects both user and admin into different pages according
	 * to their role. This method also checks the password.
	 * @param dto
	 * @param model
	 * @param session
	 * @return user page or admin page
	 */
	public String UserLogin(UserSigninDto dto, Model model, HttpSession session) {

		List<UserDetails> checkExist = userRepository.findByUsername(dto.getUsername());

		String password = checkExist.get(0).getPassword();
		
		if (checkExist != null && new BCryptPasswordEncoder().matches(dto.getPassword(), password)) {
			if (checkExist.get(0).getPrivilege().equals("admin")) {
				session.setAttribute("role", "admin");
				return "redirect:admin";
			} else {
				session.setAttribute("role", "user");
				return "redirect:/";
			}
		} else {
			model.addAttribute("status", "Username or Password Error!!!");
			return "login";
		}
	}
	
	

}
