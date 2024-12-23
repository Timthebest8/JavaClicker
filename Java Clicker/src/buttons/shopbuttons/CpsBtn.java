package buttons.shopbuttons;

import labels.ClicksLabel;
import main.MainFrame;
import panels.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CpsBtn extends JButton implements ActionListener {
    public CpsBtn() {
        this.setText("+1 cps (10 Clicks)");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this) {
            if(ClicksLabel.clicks >= 10) {
                ClicksLabel.clicks -= 10;
                MainFrame.cps++;
            }
        }
    }
}
