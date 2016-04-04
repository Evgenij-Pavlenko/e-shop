package oa.pavlenko.controllers;


import oa.pavlenko.model.Goods;
import oa.pavlenko.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String getAllGoods(ModelMap model) {
        model.addAttribute("goodsList", goodsService.findAll());
        return "goodsList";
    }

    @RequestMapping(value = "/goods/add", method = RequestMethod.GET)
    public String addGoods(ModelMap modelMap) {
        return "addGoods";
    }

    @RequestMapping(value = "/goods/addForm", method = RequestMethod.POST)
    public String addGoodsForm(@RequestParam("code") String code,
                               @RequestParam("name") String name,
                               @RequestParam("description") String description,
                               @RequestParam("price") double price,
                               @RequestParam("number") int number) {

        Goods goods = new Goods();
        goods.setName(name);
        goods.setGoodsCode(code);
        goods.setDescription(description);
        goods.setPrice(price);
        goods.setNumber(number);


        Long id = goodsService.create(goods).getId();

        return "redirect:/goods/update/" + id;
    }

    @RequestMapping(value = "/goods/update", method = RequestMethod.POST)
    public String updateGoods(@RequestParam("id") Long id,
                              @RequestParam("code") String code,
                              @RequestParam("name") String name,
                              @RequestParam("description") String description,
                              @RequestParam("price") Double price,
                              @RequestParam("number") Integer number) {


        Goods goods = goodsService.findById(id);
        if (id!=null) goods.setId(id);
        if (name != null) goods.setName(name);
        if (code != null) goods.setGoodsCode(code);
        if (name != null) goods.setName(name);
        if (description != null) goods.setDescription(description);
        if (price != null) goods.setPrice(price);
        if (number!=null) goods.setNumber(number);
        goodsService.update(goods);


        return "redirect:/goods/update/" + goods.getId();
    }

    @RequestMapping(value = "/goods/update/{id}", method = RequestMethod.GET)
    public String updateProductForm(@PathVariable("id") Long id, ModelMap model) {
        Goods goods = goodsService.findById(id);
        model.addAttribute("goods", goods);

        return "updateGoods";
    }

    @RequestMapping(value = "/goods/delete/{id}", method = RequestMethod.GET)
    public String deleteGoods(@PathVariable("id") Long id) {
        goodsService.delete(goodsService.findById(id));
        return "redirect:/product/admin";
    }

    @RequestMapping(value = "/goods/id/{id}", method = RequestMethod.GET)
    public String getProduct(@PathVariable("id") Long id, ModelMap model) {
        Goods goods = goodsService.findById(id);
        model.addAttribute("goods", goods);

        return "good";
    }

    @RequestMapping(value = "/goods/admin", method = RequestMethod.GET)
    public String getAllProductsAdmin(ModelMap model) {
        List<Goods> goodss = new ArrayList<>();
        goodss = goodsService.findAll();
        model.addAttribute("goodsList", goodss);
        return "goodsAdmin";
    }
}
