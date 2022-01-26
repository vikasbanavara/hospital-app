package com.ty.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.User;

public class UserDao {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = null;
	
	public void createUser(int branchId,User user) {
		
		
		BranchDao branchDao = new BranchDao();
		Branch branch = branchDao.getBranchById(branchId);
		
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		user.setBranch(branch);
		entityManager.persist(user);
		
		entityTransaction.commit();
		
	}
}
