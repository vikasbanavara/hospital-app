package com.ty.hospital.test;

import com.ty.hospital.dao.UserDao;
import com.ty.hospital.dto.User;

public class TestUser {
	public static void main(String[] args) {
		
		User user = new User();
		user.setEmail("anil@mail.com");
		user.setPassword("1234");
		user.setPhone(112233);
		user.setName("Anil");
		user.setRole("Nurse");
		
		UserDao dao = new UserDao();
		dao.createUser(1, user);
		
		
	}
}
