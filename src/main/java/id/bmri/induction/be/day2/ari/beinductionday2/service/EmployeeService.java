package id.bmri.induction.be.day2.ari.beinductionday2.service;

import id.bmri.induction.be.day2.ari.beinductionday2.entities.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<Employees> getEmployeeOptionalById(Integer id);

    Employees getEmployeeById(Integer id);

    List<Employees> getEmployeeList();

    Employees getEmployeeByIdAndSalary(Integer id, Integer salary);

    Optional<Employees> getEmployeeByNameAndSalary(String name, Integer salary);

    Employees getEmployeeByFirstNameAndDepartmentName(String name);



}
