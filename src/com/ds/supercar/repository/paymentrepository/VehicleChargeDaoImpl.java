package com.ds.supercar.repository.paymentrepository;

import com.ds.supercar.model.payment.VehicleCharge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VehicleChargeDaoImpl implements VehicleChargeDao {
    @Autowired
    private HibernateTemplate ht;
    @Override
    public int save(VehicleCharge vehicleCharge) throws Exception {
        return (Integer) ht.save(vehicleCharge);
    }

    @Override
    public boolean update(VehicleCharge vehicleCharge) throws Exception {
        ht.update(vehicleCharge);
        return true;
    }

    @Override
    public boolean delete(VehicleCharge vehicleCharge) throws Exception {
        ht.delete(vehicleCharge);
        return true;
    }

    @Override
    public VehicleCharge find(int id) throws Exception {
        return(VehicleCharge) ht.get(VehicleCharge.class , id);
    }

    @Override
    public List<VehicleCharge> findAll() throws Exception {
        return ht.find("from VehicleCharge ");
    }
}
