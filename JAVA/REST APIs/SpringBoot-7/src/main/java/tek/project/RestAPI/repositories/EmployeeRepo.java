package tek.project.RestAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tek.project.RestAPI.entites.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
