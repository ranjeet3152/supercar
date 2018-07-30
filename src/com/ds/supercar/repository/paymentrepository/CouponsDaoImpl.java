package com.ds.supercar.repository.paymentrepository;

import com.ds.supercar.model.payment.Coupons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CouponsDaoImpl implements CouponsDao {
    @Autowired
    private HibernateTemplate ht;
    @Override
    public int save(Coupons coupons) throws Exception {
        return(Integer) ht.save(coupons);
    }

    @Override
    public boolean update(Coupons coupons) throws Exception {
        ht.update(coupons);
        return true;
    }

    @Override
    public boolean delete(Coupons coupons) throws Exception {
        ht.delete(coupons);
        return true;
    }

    @Override
    public Coupons find(int id) throws Exception {
        return(Coupons) ht.get(Coupons.class , id);
    }

    @Override
    public List<Coupons> findAll() throws Exception {
        return ht.find("from Coupons ");
    }
}
