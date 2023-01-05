package window.menu;

import java.awt.*;
import javax.swing.*;

public class OptionSelector extends JFrame{
    JButton algorithmRenderButton = new JButton("Render Fire");
    JButton fireRenderButton = new JButton("Render Array");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("doom fire!!!");
    public void render(){
        setBounds(800,500,800,500);
        setVisible(true);
        setTitle("Doom fire");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.setLayout(null);
        add(panel);
        panel.add(algorithmRenderButton);
        panel.add(fireRenderButton);
        //Fire render configs;
        fireRenderButton.setVisible(true);
        fireRenderButton.setBounds(300, 100, 100, 100);
//        fireRenderButton.addActionListener();

        algorithmRenderButton.setVisible(true);
        algorithmRenderButton.setBounds(600,100,100,100);

    }

}
