package tek.project.RestAPI.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tek.project.RestAPI.dto.EmployeeDto;
import tek.project.RestAPI.entites.Employee;
import tek.project.RestAPI.repositories.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	private Employee employeeDtoTOEmployeeEntity(EmployeeDto employeeDto) {
		
		Employee employee = new Employee();
		employee.setId(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setAddress(employeeDto.getAddress());
		employee.setSalary(employeeDto.getSalary());
		employee.setDate(LocalDate.now().toString());
		
		return employee;
	}
	
	public Employee saveEmployee(EmployeeDto employeeDto) {
		
		Employee employee = employeeDtoTOEmployeeEntity(employeeDto);
		return employeeRepo.save(employee);
		
	}

	public List<Employee> readAllData() {
		
		return employeeRepo.findAll();
	}

	public Optional<Employee> readSingleData(Long id) {
		
		return employeeRepo.findById(id);
	}

	public Employee UpdateAllData(Long id, EmployeeDto employeeDto) {
		
		Optional<Employee> op = employeeRepo.findById(id);
		if(op.isPresent()) {
			Employee employee = employeeDtoTOEmployeeEntity(employeeDto);
			Employee updated = employeeRepo.save(employee);
			return updated;
		}
		
		return null;
	}

	public Employee UpdatePartialData(Long id, Double salary) {
		
		Optional<Employee> op = employeeRepo.findById(id);
		if(op.isPresent()) {
			
			Employee employee = op.get();
			employee.setSalary(salary);
			Employee updated = employeeRepo.save(employee);
			return updated;
		}
		
		return null;
	}

}
