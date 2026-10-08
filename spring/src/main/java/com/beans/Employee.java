package com.beans;

import java.util.List;

public class Employee {
    private int empId;
    private String empName;
    private Laptop laptop;
    private List<String> skills;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName=" + empName +
                ", laptop=" + laptop +
                ", skills=" + skills +
                '}';
    }
    public Employee(){

    }

    public Employee(int empId, String empName, Laptop laptop, List<String> skills) {
        this.empId = empId;
        this.empName = empName;
        this.laptop = laptop;
        this.skills = skills;
    }
}
