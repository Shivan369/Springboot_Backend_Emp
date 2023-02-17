package springboot.backend.mava369.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.backend.mava369.springbootbackend.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
