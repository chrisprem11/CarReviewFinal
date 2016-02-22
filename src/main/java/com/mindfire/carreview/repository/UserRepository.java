package com.mindfire.carreview.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.carreview.domain.UserDetails;

/**
 * This is a repository for the user table.
 * @author mindfire
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {
	
	/**
	 * Finds by Email
	 * @param email
	 * @return matching email and searches are returned.
	 */
	public List<UserDetails> findByEmail(String email);
	
	/**
	 * Searches by the username of the user.
	 * @param username
	 * @return returns the matching results.
	 */
	public List<UserDetails> findByUsername(String username);
	
	/**
	 * Finds by searching the username ignoring the case.
	 * @param username
	 * @return retunrs the username.
	 */
	public List<UserDetails> findByUsernameIgnoreCaseContaining(String username);
}