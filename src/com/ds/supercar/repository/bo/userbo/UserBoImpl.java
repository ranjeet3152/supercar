package com.ds.supercar.repository.bo.userbo;

import com.ds.supercar.model.usermodel.User;
import com.ds.supercar.repository.usermodelrepository.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserBoImpl implements UserBo {

    @Autowired
    private UsersDao dao;
    @Override
    public int create(User user)throws Exception {
        return dao.save(user);
    }

    @Override
    public boolean update(User user)throws Exception  {
        return dao.update(user);
    }

    @Override
    public boolean delete(User user)throws Exception  {
        return dao.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User selectUser(int id)throws Exception  {
        return dao.find(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> selectAllUser()throws Exception  {
        return dao.findAll();
    }
}
