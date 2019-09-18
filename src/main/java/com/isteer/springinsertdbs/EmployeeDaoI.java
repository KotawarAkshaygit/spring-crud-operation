package com.isteer.springinsertdbs;

public interface EmployeeDaoI {

	 public Number save(EntityBean employee);
	 
	 public void update(EntityBean employee);
	 
	 public void deleteEmpById(int id);
}
