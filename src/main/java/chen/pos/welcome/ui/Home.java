/**
 * Copyright (c) 2019, TP-Link Co.,Ltd.
 * Author: chenhang <chenhang@tp-link.com.cn>
 * Created: 2019-06-05
 */
package chen.pos.welcome.ui;

import javax.swing.*;

import java.awt.*;

import static javax.swing.SwingUtilities.invokeLater;

public class Home {
    private static final String LAYOUT_NORTH = "North";
    private static final String LAYOUT_SOUTH = "South";
    private static final String LAYOUT_EAST = "East";
    private static final String LAYOUT_CENTER = "Center";

    private static void createAndShowGUI() {

        Color bgColor = new Color(77, 88, 99);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout(0, 0);
        frame.setLayout(layout);

        String[] header = new String[]{"id", "name", "hp", "damage"};
        String[][] goodList = new String[][]{
                {"1", "盖伦", "616", "100"},
                {"2", "提莫", "512", "102"},
                {"3", "奎因", "832", "200"},
                {"4", "奎因", "832", "200"},
                {"5", "奎因", "832", "200"},
                {"6", "盖伦", "616", "100"},
                {"7", "提莫", "512", "102"},
                {"8", "奎因", "832", "200"},
                {"9", "奎因", "832", "200"},
                {"10", "奎因", "832", "200"},
                {"1", "盖伦", "616", "100"},
                {"2", "提莫", "512", "102"},
                {"3", "奎因", "832", "200"},
                {"4", "奎因", "832", "200"},
                {"5", "奎因", "832", "200"},
                {"6", "盖伦", "616", "100"},
                {"7", "提莫", "512", "102"},
                {"8", "奎因", "832", "200"},
                {"9", "奎因", "832", "200"},
                {"10", "奎因", "832", "200"},
                {"1", "盖伦", "616", "100"},
                {"2", "提莫", "512", "102"},
                {"3", "奎因", "832", "200"},
                {"4", "奎因", "832", "200"},
                {"5", "奎因", "832", "200"},
                {"6", "盖伦", "616", "100"},
                {"7", "提莫", "512", "102"},
                {"8", "奎因", "832", "200"},
                {"9", "奎因", "832", "200"},
                {"10", "奎因", "832", "200"},
                {"1", "盖伦", "616", "100"},
                {"2", "提莫", "512", "102"},
                {"3", "奎因", "832", "200"},
                {"4", "奎因", "832", "200"},
                {"5", "奎因", "832", "200"},
                {"6", "盖伦", "616", "100"},
                {"7", "提莫", "512", "102"},
                {"8", "奎因", "832", "200"},
                {"9", "奎因", "832", "200"},
                {"10", "奎因", "832", "200"}};
        JTable goodTable = new JTable(goodList, header);
        goodTable.setBackground(bgColor);
        goodTable.setFont(new Font("宋体", Font.PLAIN, 20));
        goodTable.setForeground(Color.white);
        goodTable.setRowHeight(40);
        JScrollPane goodsPane = new JScrollPane(goodTable);
        goodsPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        frame.getContentPane().add(new TimePanel().getTime(), LAYOUT_NORTH);
        frame.getContentPane().add(new WelcomePanel().getWelcome(), LAYOUT_SOUTH);
        frame.getContentPane().add(new JTextArea("\t\t￥100.00\t\t\n\t\t数量：8\t\t"), LAYOUT_EAST);
        frame.getContentPane().add(new GoodsPanel().getGoodsPane(), LAYOUT_CENTER);

        // 显示窗口
//        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 显示应用 GUI
        invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
