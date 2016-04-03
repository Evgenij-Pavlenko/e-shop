package oa.pavlenko.dao;

import oa.pavlenko.model.Order;

import java.util.List;

public interface OrderDao {
    Order create(Order order);
    Order findById(long id);
    Order update(Order order);
    boolean delete(Order order);
    List<Order> findAll();


}
