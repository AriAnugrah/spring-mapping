package id.bmri.induction.be.day2.ari.beinductionday2.repository;


import id.bmri.induction.be.day2.ari.beinductionday2.entities.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



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
    // native dengan 2 parameter (boleh and atau or)
    // join pake native

}
