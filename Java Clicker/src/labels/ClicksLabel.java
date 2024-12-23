package labels;

import javax.swing.*;
import java.awt.*;

public class ClicksLabel extends JLabel {
    public static int clicks = 0;

    public ClicksLabel() {
        this.setText("Clicks: 0");
        this.setFont(new Font("MV Boli", Font.BOLD, 40));
        this.setPreferredSize(new Dimension(600,150));
    }

    public void click(int clicka) {
        clicks+=clicka;
        this.setText("Clicks: " + Integer.toString(clicks));
    }
}
