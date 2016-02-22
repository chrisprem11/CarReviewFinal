package com.mindfire.carreview.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "car")
/**
 * This class named car is a persistent class.Stores information
 * about the car into the database. 
 * @author mindfire
 *
 */
public class Car {
	
	@Id
	@Column(name="car_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@NotNull
	private Long carId;
	
	@NotNull @Size(min=3,max=10)
	private String brand;
	
	@NotNull
	private String model;
	
	@NotNull 
	private Double price;
	
	@NotNull
	private String description;

	public Long getCarId() {
		return carId;
	}

	public void setCar_id(Long carId) {
		this.carId = carId;
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
