package buttons.shopbuttons;

import buttons.ClickBtn;
import labels.ClicksLabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CpcBtn extends JButton implements ActionListener {
    public CpcBtn() {
        this.setText("+1 cpc (10 Clicks)");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this) {
            if(ClicksLabel.clicks >= 10) {
                ClicksLabel.clicks -= 10;
                ClickBtn.clicka++;
            }
        }
    }
}
