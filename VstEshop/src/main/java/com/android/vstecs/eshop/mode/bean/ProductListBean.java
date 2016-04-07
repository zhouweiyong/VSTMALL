package com.android.vstecs.eshop.mode.bean;

/**
 * @author zwy
 * @email 16681805@qq.com
 * created on 2016/4/7
 * class description:产品列表使用的实体
 */
public class ProductListBean {
    private String imageUrl;
    private String productName;
    private double price;

    public ProductListBean(String imageUrl, String productName, double price) {
        this.imageUrl = imageUrl;
        this.productName = productName;
        this.price = price;
    }

    public ProductListBean() {
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
