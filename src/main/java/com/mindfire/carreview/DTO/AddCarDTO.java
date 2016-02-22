package com.mindfire.carreview.DTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * This is the DTO class for the car table which maintains the car table 
 * in the database.
 * @author mindfire
 *
 */
public class AddCarDTO {
	
	@NotNull
	private Long car_id;
	
	@NotNull @Size(min=3,max=10)
	private String brand;
	
	@NotNull
	private String model;
	
	@NotNull 
	private Double price;
	
	@NotNull
	private String description;

	/**
	 *  No arg constructor 
	 */
	public AddCarDTO() {

	}

	/**
	 *  This argumented constructor holds the input that are 
	 *  to be stored.
	 * @param brand
	 * @param model
	 * @param price
	 * @param description
	 */
	public AddCarDTO(String brand, String model, Double price, String description) {
	
		this.brand = brand;
		this.model = model;
		this.price = price;

	}

	public Long getCar_id() {
		return car_id;
	}

	public void setCar_id(Long car_id) {
		this.car_id = car_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
