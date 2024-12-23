package panels;

import buttons.shopbuttons.CpcBtn;
import buttons.shopbuttons.CpsBtn;
import labels.ShopLabel;

import javax.swing.*;
import java.awt.*;

public class ShopPanel extends JPanel {
    public ShopPanel() {
        GridLayout layout = new GridLayout(3, 1);
        ShopLabel label = new ShopLabel();
        CpsBtn cpsBtn = new CpsBtn();
        CpcBtn cpcBtn = new CpcBtn();

        this.setBackground(Color.CYAN);
        this.setPreferredSize(new Dimension(150, 600));
        this.setLayout(layout);
        this.add(label);
        this.add(cpsBtn);
        this.add(cpcBtn);
        this.setVisible(true);
    }
}
