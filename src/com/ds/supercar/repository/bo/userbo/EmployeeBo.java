package com.ds.supercar.repository.bo.userbo;

import com.ds.supercar.model.usermodel.Employee;

import java.util.List;

public interface EmployeeBo {
    public int create(Employee employee) throws Exception;
    public boolean update(Employee employee) throws Exception;
    public boolean delete(Employee employee) throws Exception;
    public Employee selectEmployee(int id) throws Exception;
    public List<Employee> selectAllEmployee() throws Exception;
}
