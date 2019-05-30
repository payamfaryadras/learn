package com.payam.learn.designpatterns.structural.adapter;

public class App {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setCode("code1");
        employeeDto.setName("name1");
        employeeDto.setFamily("family1");
        employeeDto.setId(20l);
        employeeDao.save(new EmployeeDtoAdapter(employeeDto));
    }
}
