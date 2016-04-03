package oa.pavlenko.service;

import oa.pavlenko.model.User;

import java.util.List;

public interface UserService {

    User create (User user);
    User findById(Long id);
    User update (User user);
    boolean delete(User user);
    List<User> findAll();
}
