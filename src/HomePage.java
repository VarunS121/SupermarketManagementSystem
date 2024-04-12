//package HomePage;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener {

  JLabel l1;
  JButton b1;

  public HomePage() {

    setSize(1200, 600); // setContentPane(300,300,1366,390); frame size
    setLayout(null);
    setLocation(300, 300);

    l1 = new JLabel("");
    b1 = new JButton("Next");

    b1.setBackground(Color.WHITE);
    b1.setForeground(Color.BLACK);

    // ImageIcon bg_img = new
    // ImageIcon(ClassLoader.getSystemResource("Images\\Background\\Homepage.png"));
    // ImageIcon bg_img_scaled = new
    // ImageIcon(bg_img.getImage().getScaledInstance(1366,
    // 390,Image.SCALE_DEFAULT));
    // l1 = new JLabel(bg_img_scaled);

    JLabel welcome_text = new JLabel("AKSHAY SUPERMARKET");
    welcome_text.setBounds(30, 300, 1500, 100);
    welcome_text.setFont(new Font("serif", Font.PLAIN, 70));
    welcome_text.setForeground(Color.red);
    l1.add(welcome_text);

    b1.setBounds(1170, 325, 150, 50);
    l1.setBounds(0, 0, 1366, 390);

    l1.add(b1);
    add(l1);

    b1.addActionListener(this);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    // new Login();
  }

  public static void main(String[] args) {
    HomePage window = new HomePage();
    window.setVisible(true);
  }
}