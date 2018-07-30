package com.ds.supercar.repository.bo.userbo;

import com.ds.supercar.model.usermodel.User;

import java.util.List;

public interface UserBo {
    public int create(User user) throws Exception;
    public boolean update(User user) throws Exception;
    public boolean delete(User user) throws Exception;
    public User selectUser(int id) throws Exception;
    public List<User> selectAllUser() throws Exception;
}
