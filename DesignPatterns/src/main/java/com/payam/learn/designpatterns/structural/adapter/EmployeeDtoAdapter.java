package com.payam.learn.designpatterns.structural.adapter;

public class EmployeeDtoAdapter extends Employee {

    private EmployeeDto employeeDto = new EmployeeDto();

    public EmployeeDtoAdapter(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public Long getId() {
        return employeeDto.getId();
    }

    @Override
    public String getFullName() {
        return employeeDto.getName() + employeeDto.getFamily();
    }

    @Override
    public String getCode() {
        return employeeDto.getCode();
    }
}
