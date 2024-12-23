package panels;

import buttons.ClickBtn;
import labels.ClicksLabel;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    static ClicksLabel clicksLabel = new ClicksLabel();

    public MainPanel() {
        BorderLayout layout = new BorderLayout();
        ClickBtn clickBtn = new ClickBtn();
        ShopPanel shopPanel = new ShopPanel();

        this.setBackground(Color.YELLOW);
        this.setLayout(layout);
        this.setVisible(true);
        this.add(clickBtn, BorderLayout.CENTER);
        this.add(clicksLabel, BorderLayout.NORTH);
        this.add(shopPanel, BorderLayout.EAST);
    }

    public static void staticClick(int clicka) {
        clicksLabel.click(clicka);
    }
}
