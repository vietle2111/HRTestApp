package hr.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.demo.dao.EmployeeDAO;
import hr.demo.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public Employee find(int id) {
		Employee e = new Employee(); // rule out null object
		Optional<Employee> opt = dao.findById(id);
		if (opt.isPresent()) {
			e = opt.get();
		}

		System.out.print(e);
		return e;
	}
	
	public void insert(Employee e) {
		dao.save(e);
	}
	
	public List<Employee> findAll(){
		return dao.findAll();
	}
}
