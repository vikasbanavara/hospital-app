package com.ty.hospital.test;

import com.ty.hospital.dao.HospitalDao;
import com.ty.hospital.dto.Hospital;

public class TestHospital {
	public static void main(String[] args) {
		HospitalDao dao = new HospitalDao();
		
		Hospital h = new Hospital();
		h.setGst("GST-11-99-8976");
		h.setName("Sparsh");
		h.setWebsite("www.sparsh.com");
		
		
		dao.createHosptial(h);
	}
}
