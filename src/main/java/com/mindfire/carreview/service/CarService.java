package com.mindfire.carreview.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.mindfire.carreview.DTO.AddCarDTO;
import com.mindfire.carreview.DTO.SearchDTO;
import com.mindfire.carreview.domain.Car;
import com.mindfire.carreview.repository.CarRepository;
import com.mindfire.carreview.repository.ReviewRepository;

/**
 * This is service class for service all the car related mappings and searching.
 * 
 * @author mindfire
 *
 */
@Service
public class CarService {

	private static final String HONDA = "honda";
	private static final String HYUNDAI = "hyundai";
	private static final String RENAULT = "renault";

	@Autowired
	public CarRepository carRepository;

	@Autowired
	public ReviewRepository reviewRepository;
	
	/**
	 * This method handles the new entries of the cars.
	 * @param dto
	 * @param model
	 * @return success page on successful completion.
	 */

	public String addNewCars(AddCarDTO dto, Model model) {

		List<Car> carExists = carRepository.findByBrandAndModel(dto.getBrand(), dto.getModel());

		if (carExists.isEmpty()) {

			Car newCar = new Car();
			newCar.setBrand(dto.getBrand());
			newCar.setModel(dto.getModel());
			newCar.setPrice(dto.getPrice());
			newCar.setDescription(dto.getDescription());

			Car check = carRepository.save(newCar);
			
			if (check.equals(null)) {
				
				model.addAttribute("message", "operation failed");
				
				return "redirect:addcar";
				
			} else {
				
				model.addAttribute("message", "Success !");
				
				return "result";
			}
		} else {
			
			model.addAttribute("message", "Car already exists");
			
			return "redirect:addcar";

		}

	}

	/**
	 * Searches car in the database based on the inputs.
	 * 
	 * @param dto
	 * @return
	 */
	public ModelAndView searchCar(SearchDTO sdto) {
		
		List<Car> cars = carRepository.findByBrandIgnoreCaseContaining(sdto.getName());
		List<Car> modelname = carRepository.findByModelIgnoreCaseContaining(sdto.getName());
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("cars", cars);
		model.put("modelname", modelname);
		return new ModelAndView("searchInfo", model);
	}

	/**
	 * Generates a topbrands view page where the attributes are added.
	 * @return a view page for listing the top brands
	 */
	public ModelAndView carList() {
		
		List<Car> honda = carRepository.findByBrandIgnoreCase(HONDA);
		List<Car> hyundai = carRepository.findByBrandIgnoreCase(HYUNDAI);
		List<Car> renault = carRepository.findByBrandIgnoreCase(RENAULT);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("honda", honda);
		model.put("hyundai", hyundai);
		model.put("renault", renault);
		return new ModelAndView("topbrands", model);
	}
	
	public ModelAndView viewCar(Long carId){
		Car cars=carRepository.findByCarId(carId);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("cars", cars);
		return new ModelAndView("write",model);
	}

}
