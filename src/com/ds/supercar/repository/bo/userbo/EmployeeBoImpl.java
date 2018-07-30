package com.ds.supercar.repository.bo.userbo;

import com.ds.supercar.model.usermodel.Employee;
import com.ds.supercar.repository.usermodelrepository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class EmployeeBoImpl implements EmployeeBo {

    @Autowired
    private EmployeeDao dao;
    @Override
    public int create(Employee employee) throws Exception {
        return dao.save(employee);
    }

    @Override
    public boolean update(Employee employee) throws Exception {
        return dao.update(employee);
    }

    @Override
    public boolean delete(Employee employee) throws Exception {
        return dao.delete(employee);
    }

    @Override
    public Employee selectEmployee(int id) throws Exception {
        return dao.find(id);
    }

    @Override
    public List<Employee> selectAllEmployee() throws Exception {
        return dao.findAll();
    }
}
