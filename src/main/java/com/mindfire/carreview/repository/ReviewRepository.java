package com.mindfire.carreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindfire.carreview.domain.Review;

/**
 * This is a repository for the Review table
 * @author mindfire
 *
 */
public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	/**
	 * Lists all the reviews.
	 */
	@Override
	public List<Review> findAll();
	
	/**
	 * Finds the reviews by a matching rating.
	 * @param rating
	 * @return returns the matching results.
	 */
	public List<Review> findByRating(Integer rating);

	

}
