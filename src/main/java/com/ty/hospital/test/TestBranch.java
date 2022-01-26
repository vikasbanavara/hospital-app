package com.ty.hospital.test;

import com.ty.hospital.dao.BranchDao;
import com.ty.hospital.dto.Branch;

public class TestBranch {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setName("Branh - 3 ");
		branch.setPhone(223344);
		branch.setEmail("bar3@mail.com");
		
		BranchDao branchDao = new BranchDao();
		branchDao.createBranch(3, branch);
		
	}
}
