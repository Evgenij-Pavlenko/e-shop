package oa.pavlenko.dao.impl;

import oa.pavlenko.dao.GoodsDao;
import oa.pavlenko.model.Goods;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Goods create(Goods goods) {
        Session session = sessionFactory.getCurrentSession();
        session.save(goods);
        return goods;
    }

    @Override
    public Goods findById(long id) {
        Session session = sessionFactory.getCurrentSession();
        return (Goods) session.get(Goods.class, id);
    }

    @Override
    public Goods update(Goods goods) {
        Session session = sessionFactory.getCurrentSession();
        session.update(goods);
        return goods;
    }

    @Override
    public boolean delete(Goods goods) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(goods);
        return true;
    }

    @Override
    public List<Goods> findAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createCriteria(Goods.class).list();
    }

    @Override
    public Goods findByName(String name) {
        Session session = sessionFactory.getCurrentSession();

        return (Goods) session.createCriteria(Goods.class).add(Restrictions.eq(name, "name")).uniqueResult();
    }
}
