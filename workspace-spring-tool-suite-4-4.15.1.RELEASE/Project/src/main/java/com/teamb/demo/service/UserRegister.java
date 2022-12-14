package com.teamb.demo.service;

import java.util.List;

import com.teamb.demo.dao.Bike_details;
import com.teamb.demo.dao.User_Details;

public interface UserRegister {
	// create/save
		public User_Details saveUserDetails(User_Details userdetails);
		
		// read
		public List<User_Details> fetchUserDetails();
		
		// update
		public User_Details updateUserdetails(User_Details userdetails , String username);
		
		// delete
		
		public void deleteUserDetails(String username);
		
		public List<User_Details> findByUserName(String userName);

}
