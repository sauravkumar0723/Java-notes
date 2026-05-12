package tek.project.RestAPI.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tek.project.RestAPI.dto.EmployeeDto;
import tek.project.RestAPI.entites.Employee;
import tek.project.RestAPI.services.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private  EmployeeService employeeService;

	// save
	
	@PostMapping("/employee")
	public ResponseEntity<?> saveData( @RequestBody EmployeeDto employeeDto) {
		
		Employee employee = employeeService.saveEmployee(employeeDto);
//	return ResponseEntity.status(HttpStatus.CREATED).body(employee);
		
	
		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
	}
	
	// read id
	
	// read all
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> readAllData() {

		List<Employee> list = employeeService.readAllData();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	// read single data
	@GetMapping("/employee/{id}")
	public ResponseEntity<?> readSingleData(@PathVariable Long id) {

		Optional<Employee> op= employeeService.readSingleData(id);
		if(op.isPresent()) {
			Employee employee =  op.get();
			return ResponseEntity.status(HttpStatus.OK).body(employee);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	 
	// update all
	@PutMapping("/employee/{id}")
	public ResponseEntity<?> UpdateAllData(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {

		Employee employee = employeeService.UpdateAllData(id,employeeDto);
		if(employee!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(employee);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	// update partial
	@PatchMapping("/employee/{id}/salary")
	public ResponseEntity<?> UpdatePartialData(@PathVariable Long id,  @RequestParam Double salary) {

		Employee employee = employeeService.UpdatePartialData(id,salary);
		if(employee!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(employee);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	/*
	 * // delete
	 * 
	 * @DeleteMapping("/employee/{id}") public ResponseEntity<?>
	 * DeleteData(@PathVariable Long id) {
	 * 
	 * 
	 * return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); }
	 */
	
	

}
