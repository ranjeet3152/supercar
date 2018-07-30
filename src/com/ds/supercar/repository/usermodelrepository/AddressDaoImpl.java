package com.ds.supercar.repository.usermodelrepository;

import com.ds.supercar.model.usermodel.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AddressDaoImpl implements AddressDao {
    @Autowired
    private HibernateTemplate ht;

    @Override
    public int save(Address address) throws Exception {
        return (Integer)ht.save(address);
    }

    @Override
    public boolean update(Address address) throws Exception {
        ht.update(address);
        return true;
    }

    @Override
    public boolean delete(Address address) throws Exception {
        ht.delete(address);
        return true;
    }

    @Override
    public Address find(int id) throws Exception {
        return(Address) ht.get(Address.class  , id);
    }

    @Override
    public List<Address> findAll() throws Exception {
        return ht.find("from Address");
    }
}
