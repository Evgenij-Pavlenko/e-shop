package oa.pavlenko.service.impl;

import oa.pavlenko.dao.OrderDao;
import oa.pavlenko.model.Order;
import oa.pavlenko.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    @Transactional
    public Order create(Order order) {
        return orderDao.create(order);
    }

    @Override
    @Transactional(readOnly = true)
    public Order findById(long id) {
        return orderDao.findById(id);
    }

    @Override
    @Transactional
    public Order update(Order order) {
        return orderDao.update(order);
    }

    @Override
    @Transactional
    public boolean delete(Order order) {
        return orderDao.delete(order);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Order> findAll() {
        return orderDao.findAll();
    }
}
