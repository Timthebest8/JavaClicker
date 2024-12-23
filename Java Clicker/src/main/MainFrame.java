package main;

import panels.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class MainFrame extends JFrame {
    public static int cps = 0;

    public MainFrame() {
        ImageIcon icon = new ImageIcon("Images/Icon.png");
        BorderLayout layout = new BorderLayout();
        MainPanel panel = new MainPanel();

        this.setSize(600,600);
        this.setMinimumSize(new Dimension(400, 300));
        this.setLocationRelativeTo(null);
        this.setIconImage(icon.getImage());
        this.setTitle("Java Clicker");
        this.setLayout(layout);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(panel, BorderLayout.CENTER);

        while (true) {
            while(true) {
                MainPanel.staticClick(cps);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
