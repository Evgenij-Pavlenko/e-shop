package oa.pavlenko.service.impl;

import oa.pavlenko.dao.UserDao;
import oa.pavlenko.model.User;
import oa.pavlenko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public User create(User user) {
        return userDao.create(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public User update(User user) {
        return userDao.update(user);
    }

    @Override
    @Transactional
    public boolean delete(User user) {
        return userDao.delete(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return userDao.findAll();
    }
}
