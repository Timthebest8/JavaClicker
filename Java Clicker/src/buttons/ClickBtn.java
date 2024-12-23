package buttons;

import panels.MainPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickBtn extends JButton implements ActionListener {
    public static int clicka = 1;

    public ClickBtn() {
        this.setText("Click!");
        this.setFocusable(false);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == this) {
            MainPanel.staticClick(clicka);
        }
    }
}
