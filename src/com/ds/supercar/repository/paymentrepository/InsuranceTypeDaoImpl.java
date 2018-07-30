package com.ds.supercar.repository.paymentrepository;

import com.ds.supercar.model.payment.InsuranceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InsuranceTypeDaoImpl implements InsuranceTypeDao {

    @Autowired
    private HibernateTemplate ht;
    @Override
    public int save(InsuranceType insuranceType) throws Exception {
        return(Integer) ht.save(insuranceType);
    }

    @Override
    public boolean update(InsuranceType insuranceType) throws Exception {
        return false;
    }

    @Override
    public boolean delete(InsuranceType insuranceType) throws Exception {
        return false;
    }

    @Override
    public InsuranceType find(int id) throws Exception {
        return null;
    }

    @Override
    public List<InsuranceType> findAll() throws Exception {
        return null;
    }
}
