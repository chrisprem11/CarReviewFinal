package com.mindfire.carreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.carreview.domain.Car;

/**
 * This is the repository for the car table.
 * @author mindfire
 *
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

	/**
	 * Searches the brand names of cars in the database.
	 * @param brand
	 * @return returns list of matching brands.
	 */
	public List<Car> findByBrandIgnoreCaseContaining(String brand);
	
	/**
	 * Searches the databse by model name ignoring the case.
	 * @param model
	 * @return matching models are returned.
	 */
	public List<Car> findByModelIgnoreCaseContaining(String model);
	
	/**
	 * Finds by brand ignoring the case.
	 * @param brand
	 * @return returns the mathing results.
	 */
	public List<Car> findByBrandIgnoreCase(String brand);
	
	/**
	 * Finds the car by brand and model ignoring the case.
	 * @param brand
	 * @param model
	 * @return returns the matching results.
	 */
	public List<Car> findByBrandAndModelIgnoreCaseContaining(String brand, String model);

	/**
	 * Searches by brand name and model name.
	 * @param brand
	 * @param model
	 * @return returns the mating results.
	 */
	public List<Car> findByBrandAndModel(String brand, String model);
	
	/**
	 * Finds the car by its Id
	 * @param id
	 * @return
	 */
	public Car findByCarId(Long id);

	

}
