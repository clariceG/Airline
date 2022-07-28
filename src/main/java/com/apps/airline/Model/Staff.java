package com.apps.airline.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAFF")
public class Staff {
    @Id
    @Column(name = "STAFF_ID")
    private Long staffId;
    @Column(name = "STAFF_NAME")
    private String staffName;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DEPARTMENT")
    private String department;

    public Staff(Long staffId, String staffName, String gender, String department) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.gender = gender;
        this.department = department;
    }

    public Staff() {

    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
