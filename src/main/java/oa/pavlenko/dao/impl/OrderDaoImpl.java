package oa.pavlenko.dao.impl;

import oa.pavlenko.dao.OrderDao;
import oa.pavlenko.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Order create(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.save(order);
        return order;
    }

    @Override
    public Order findById(long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Order) session.get(Order.class, id);
    }

    @Override
    public Order update(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.update(order);
        return order;
    }

    @Override
    public boolean delete(Order order) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(order);
        return true;
    }

    @Override
    public List<Order> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(Order.class).list();
    }
}
