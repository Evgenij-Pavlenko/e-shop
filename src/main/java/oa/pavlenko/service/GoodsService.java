package oa.pavlenko.service;

import oa.pavlenko.model.Goods;

import java.util.List;

public interface GoodsService {
    Goods create(Goods goods);
    Goods findById(long id);
    Goods update(Goods goods);
    boolean delete(Goods goods);
    List<Goods> findAll();
    Goods findByName(String name);
}
