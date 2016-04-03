package oa.pavlenko.dao;

import oa.pavlenko.model.Goods;

import java.util.List;

public interface GoodsDao {

    Goods create(Goods goods);
    Goods findById(long id);
    Goods update(Goods goods);
    boolean delete(Goods goods);
    List <Goods> findAll();
    Goods findByName(String name);

}
