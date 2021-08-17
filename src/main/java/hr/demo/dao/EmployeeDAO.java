package hr.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hr.demo.entity.*;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
}