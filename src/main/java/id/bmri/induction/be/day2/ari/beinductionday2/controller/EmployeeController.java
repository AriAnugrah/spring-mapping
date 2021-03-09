package id.bmri.induction.be.day2.ari.beinductionday2.controller;

import id.bmri.induction.be.day2.ari.beinductionday2.entities.Employees;
import id.bmri.induction.be.day2.ari.beinductionday2.model.EmployeeRespon;
import id.bmri.induction.be.day2.ari.beinductionday2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/optional/{id}")
    public Optional<Employees> getEmployeeOptional(@PathVariable Integer id) {
        return employeeService.getEmployeeOptionalById(id);
    }

    @GetMapping(value = "/{id}")
    public Employees getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(value = "/list")
    public List<Employees> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

    @GetMapping(value = "/custom")
    public List<EmployeeRespon> getEmployeeListCustom() {
        return employeeService.getEmployeeList().stream().map(e -> EmployeeRespon.builder()
                .employeeId(e.getEmployeeId())
                .firstName(e.getFirstName())
                .build()
        ).collect(Collectors.toList());
    }




    @GetMapping(value = "find/{id}")
    public Employees getEmployeeIdAndSalary (@PathVariable Integer id, @RequestParam(defaultValue = "0" ) Integer salary) {
        return employeeService.getEmployeeByIdAndSalary(id, salary);
    }

    @GetMapping(value = "name/{name}")
    public Optional<Employees> getEmployeeNameAndSalary (@PathVariable String name, @RequestParam(defaultValue = "0" ) Integer salary) {
        return employeeService.getEmployeeByNameAndSalary(name, salary);
    }

    @GetMapping(value = "native/{name}")
    public Employees getEmployeeNameAndDepartment (@PathVariable String name) {
        return employeeService.getEmployeeByFirstNameAndDepartmentName(name);
    }



}
