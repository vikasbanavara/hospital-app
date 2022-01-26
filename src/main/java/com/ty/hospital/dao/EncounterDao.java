package com.ty.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Person;

public class EncounterDao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction = null;
	
	public boolean createEncounter(int personId,int branchId, Encounter encounter) {
		
		PersonDao personDao = new PersonDao();
		BranchDao branchDao = new BranchDao();
		
		Person person = personDao.getPersonById(personId);
		Branch branch = branchDao.getBranchById(branchId);
		
		if( person != null && branch != null) {
			
			encounter.setPerson(person);
			encounter.setBranch(branch);
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return true;
			
		} else {
			return false;
		}
	}
	
	public Encounter getEncounterById(int id) {
		return entityManager.find(Encounter.class, id);
	}
	
}
