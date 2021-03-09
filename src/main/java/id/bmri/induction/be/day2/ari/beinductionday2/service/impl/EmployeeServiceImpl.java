package id.bmri.induction.be.day2.ari.beinductionday2.service.impl;

import id.bmri.induction.be.day2.ari.beinductionday2.entities.Employees;
import id.bmri.induction.be.day2.ari.beinductionday2.repository.EmployeesRepository;
import id.bmri.induction.be.day2.ari.beinductionday2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public Optional<Employees> getEmployeeOptionalById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Employees getEmployeeById(Integer id) {
        return employeesRepository.cariDenganEmployeeId(id);
    }

    @Override
    public List<Employees> getEmployeeList() {
        return employeesRepository.findAll();
    }

    @Override
    public Employees getEmployeeByIdAndSalary(Integer id, Integer salary){
        return employeesRepository.getEmployeesByIdAndSalary(id,salary);
    }

    @Override
    public Optional<Employees> getEmployeeByNameAndSalary(String name, Integer salary){
        return employeesRepository.getEmployeesByFirstNameAndSalary(name, salary);
    }

    @Override
    public Employees getEmployeeByFirstNameAndDepartmentName(String name){
        return employeesRepository.getEmployeesByFirstNameAndDepartmentName(name);
    }

}
