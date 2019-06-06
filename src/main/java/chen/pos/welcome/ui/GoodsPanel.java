/**
 * Copyright (c) 2019, TP-Link Co.,Ltd.
 * Author: chenhang <chenhang@tp-link.com.cn>
 * Created: 2019-06-06
 */
package chen.pos.welcome.ui;

import chen.pos.welcome.bean.Goods;

import javax.swing.*;

public class GoodsPanel {

    private static final String[] header = new String[]{"序号", "商品代码", "商品名称", "单价", "数量", "金额"};

    private String[][] goodsList = null;
    private JTable goodsTable = null;
    private int goodsCount = 0;

    private JScrollPane goodsPane = null;

    GoodsPanel() {
        goodsList = new String[50][6];
        goodsTable = new JTable(goodsList, header);
        goodsPane = new JScrollPane(goodsTable);
    }

    JScrollPane getGoodsPane() {
        return goodsPane;
    }

    void addToList(Goods goods) {
        goodsList[goodsCount][0] = goodsCount + "1";
        goodsList[goodsCount][1] = goods.getId();
        goodsList[goodsCount][2] = goods.getName();
        goodsList[goodsCount][3] = goods.getPrice();
        goodsList[goodsCount][4] = "1";
        goodsList[goodsCount][5] = goods.getPrice();
    }

    void modifyGoodsNumber(int goodsSn, int number) {
        goodsList[goodsSn][4] = String.valueOf(number);
        int price = Integer.valueOf(goodsList[goodsSn][3]);
        goodsList[goodsSn][5] = String.valueOf(price * number);
    }
}
