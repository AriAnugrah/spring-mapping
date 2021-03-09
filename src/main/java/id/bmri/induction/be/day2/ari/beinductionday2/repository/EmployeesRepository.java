package id.bmri.induction.be.day2.ari.beinductionday2.repository;


import id.bmri.induction.be.day2.ari.beinductionday2.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Integer> {


//    Optional<Employees> findByEmployeeId(Integer employeeId);

    Employees findByEmployeeId(Integer employeeId);

    @Query(nativeQuery = true, value = "select * from Employees e where e.employee_id = :employeeId")
    Employees cariDenganEmployeeId(Integer employeeId);

    @Query(nativeQuery = true, value = "select * from Employees e where e.employee_id = ?1")
    Employees cariDenganEmployeeId2(Integer employeeId);

    @Query(nativeQuery = true, value = "select * from Employees e where e.employee_id = :employee")
    Employees cariDenganEmployeeId3(@Param("employee") Integer employeeId);

    // jpa dengan 2 parameter (boleh and atau or)
    Optional<Employees> getEmployeesByFirstNameAndSalary(String name, Integer salary);

    // native dengan 2 parameter (boleh and atau or)
    @Query(nativeQuery = true, value = "select * from employees where employee_id = :employeeId and salary = :salary")
    Employees getEmployeesByIdAndSalary(Integer employeeId, Integer salary);

    // join pake native
    @Query(nativeQuery = true, value = "select e.first_name, d.department_name \n" +
            "from employees e \n" +
            "join departments d \n" +
            "on e.department_id = d.department_id\n" +
            "where first_name = :name")
    Employees getEmployeesByFirstNameAndDepartmentName(String name);

}
