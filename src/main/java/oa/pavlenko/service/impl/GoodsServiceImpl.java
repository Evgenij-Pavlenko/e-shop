package oa.pavlenko.service.impl;

import oa.pavlenko.dao.GoodsDao;
import oa.pavlenko.model.Goods;
import oa.pavlenko.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    @Transactional
    public Goods create(Goods goods) {
        return goodsDao.create(goods);
    }

    @Override
    @Transactional(readOnly = true)
    public Goods findById(long id) {
        return goodsDao.findById(id);
    }

    @Override
    @Transactional
    public Goods update(Goods goods) {
        return goodsDao.update(goods);
    }

    @Override
    @Transactional
    public boolean delete(Goods goods) {
        return goodsDao.delete(goods);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Goods> findAll() {
        return goodsDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Goods findByName(String name) {
        return goodsDao.findByName(name);
    }
}
