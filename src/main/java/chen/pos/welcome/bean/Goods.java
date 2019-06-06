/**
 * Copyright (c) 2019, TP-Link Co.,Ltd.
 * Author: chenhang <chenhang@tp-link.com.cn>
 * Created: 2019-06-06
 */
package chen.pos.welcome.bean;

import com.google.common.base.MoreObjects;

public class Goods {

    private String id;
    private String barCode;
    private String name;
    private String price;
    private String stock;
    private String actegory;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getActegory() {
        return actegory;
    }

    public void setActegory(String actegory) {
        this.actegory = actegory;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("barCode", barCode)
                .add("name", name)
                .add("price", price)
                .add("stock", stock)
                .add("actegory", actegory)
                .toString();
    }
}
