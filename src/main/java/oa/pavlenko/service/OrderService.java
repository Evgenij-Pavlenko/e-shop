package oa.pavlenko.service;

import oa.pavlenko.model.Order;

import java.util.List;

public interface OrderService {

    Order create(Order order);
    Order findById(long id);
    Order update(Order order);
    boolean delete(Order order);
    List<Order> findAll();
}
