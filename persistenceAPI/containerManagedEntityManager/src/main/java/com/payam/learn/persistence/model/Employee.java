package com.payam.learn.persistence.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee", uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true)
    private Long empId;

    @Column(name="name", length=20, nullable=true)
    private String empName;

    @Column(name="employ_role", length=20, nullable=true)
    private String empRole;

    @Column(name="insert_time", nullable=true)
    private Date createdDate;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
