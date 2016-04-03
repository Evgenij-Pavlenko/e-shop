package oa.pavlenko.model;

import javax.persistence.*;

@Entity
@Table(name = "GOODS")
public class Goods {

    @Id
    @GeneratedValue
    @Column(name = "id_goods")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    /*
     * Код товара
     */
    @Column(name = "goods_code", nullable = false, unique = true)
    private String goodsCode;

    @Column(name = "goods_img")
    private String goodsImg;

    /*
     * Описание товара
     */
    @Column(name = "description")
    private String description;

    /*
     * Цена товара
     */
    @Column(name = "price", nullable = false)
    private Double price;

    /*
     * Количество товара
     */
    @Column(name = "number")
    private Integer number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
