package com.ds.supercar.repository.paymentrepository;

import com.ds.supercar.model.payment.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PaymentTypeDaoImpl implements PaymentTypeDao {
    @Autowired
    private HibernateTemplate ht;
    @Override
    public int save(PaymentType paymentType) throws Exception {
        return(Integer) ht.save(paymentType);
    }

    @Override
    public boolean update(PaymentType paymentType) throws Exception {
        ht.update(paymentType);
        return true;
    }

    @Override
    public boolean delete(PaymentType paymentType) throws Exception {
        ht.delete(paymentType);
        return true;
    }

    @Override
    public PaymentType find(int id) throws Exception {
        return(PaymentType) ht.get(PaymentType.class , id);
    }

    @Override
    public List<PaymentType> findAll() throws Exception {
        return null;
    }
}
