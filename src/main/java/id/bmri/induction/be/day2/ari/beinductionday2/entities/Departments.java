package id.bmri.induction.be.day2.ari.beinductionday2.entities;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "departments")
public class Departments {

    @Id
    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    @Column(name = "department_name", length = 30)
    private String departmentName;

    @Column(name = "manager_id", nullable = true)
    private Integer managerId;

    @Column(name = "location_id", nullable = true)
    private Integer locationtId;

}
