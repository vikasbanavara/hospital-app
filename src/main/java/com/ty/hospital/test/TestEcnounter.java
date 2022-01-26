package com.ty.hospital.test;

import java.time.LocalDateTime;

import com.ty.hospital.dao.EncounterDao;
import com.ty.hospital.dto.Encounter;

public class TestEcnounter {
	public static void main(String[] args) {
		
		Encounter encounter = new Encounter();
		encounter.setReason("Person is hill");
		encounter.setAdmitDateTime(LocalDateTime.now());
		encounter.setCreatorName("Anil");
		
		EncounterDao dao = new EncounterDao();
		boolean res = dao.createEncounter(1, 1, encounter);
		
		System.out.println(res);
		
	}
}
