package hr.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import hr.demo.entity.Department;
import hr.demo.entity.Employee;
import hr.demo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService eserv;
	
	@GetMapping("/find")
	public String find(@RequestParam("emp_id") int id, Model m) {
		Employee e = eserv.find(id);
		m.addAttribute("emp", e);
		if (e.getId()==0) m.addAttribute("msg", "There is no record with id: "+id);
		return "details";
		
	}
	@GetMapping("/list")
	public String findAll(Model m) {
		List<Employee> empList = eserv.findAll();
		if (empList.isEmpty()) {
			m.addAttribute("msg", "There is no employee record");
			return "details";
		}
		m.addAttribute("empList", empList);
		return "employeeList";
		
	}
	
	@GetMapping("/insert")
	public String insert(@RequestParam("emp_id") int eid, @RequestParam("emp_name") String ename, @RequestParam("emp_salary") double salary,
			@RequestParam("dept_id") int did, @RequestParam("dept_name") String dname, @RequestParam("dept_loc") String loc)
	{
		Department d = new Department(did, dname, loc);
		eserv.insert(new Employee(eid,ename,salary,d));
		return "details";
	}
	
}
