package oa.pavlenko.dao.impl;

import oa.pavlenko.dao.UserDao;
import oa.pavlenko.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User create(User user) {
//      Session session = null;
        Session  session = sessionFactory.getCurrentSession();
        session.save(user);
        return user;
    }

    @Override
    public User findById(Long id) {
//      Session session = null;
        Session  session = sessionFactory.getCurrentSession();
        return (User) session.get(User.class, id);
    }

    @Override
    public User update(User user) {
//      Session session = null;
        Session  session = sessionFactory.getCurrentSession();
        session.update(user);
        return user;
    }

    @Override
    public boolean delete(User user) {
//      Session session = null;
        Session  session = sessionFactory.getCurrentSession();
        session.delete(user);
        return true;
    }

    @Override
    public List<User> findAll() {
//      Session session = null;
        Session  session = sessionFactory.getCurrentSession();
        return session.createCriteria(User.class).list();
    }
}
