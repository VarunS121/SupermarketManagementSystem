import javax.swing.*; // importing the swing package
import java.awt.*;
import java.awt.event.*;

public class SuperMarketManagementSystem extends JFrame implements ActionListener { // Extending JFrame to create frames
  // Declaring a constructor of the class
  SuperMarketManagementSystem() {
    setSize(1400, 700); // Declaring the size of the frame
    setLocation(100, 100); // Top left corner of screen is (0,0). This kind of translation of frame in the
                           // space
    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/supermarket.jpg")); // Loading image from the
                                                                                          // system
    Image i2 = i1.getImage().getScaledInstance(1400, 600, Image.SCALE_DEFAULT); // this is used to scale the image wrt
                                                                                // to frame dimensions
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 1400, 600);
    add(image); // JLabel is used to place image on the frame.

    // This is to add text on the image
    JLabel text = new JLabel("SUPERMARKET MANAGEMENT SYSTEM");
    text.setBounds(150, 200, 1500, 100); // setting the text bounds
    text.setForeground(Color.BLACK);// choosing the colour of text
    text.setFont(new Font("serif", Font.BOLD, 50)); // choosing the font of text
    image.add(text);

    // This is to add a next button after the main page is opened. It redirects you
    // to the login page
    JButton next = new JButton("Next"); // JButton is used to create a button
    next.setBounds(1200, 500, 100, 50); // these commands are similar to the previously used text commands
    next.setFont(new Font("serif", Font.BOLD, 20));
    next.addActionListener(this);
    image.add(next);

    setVisible(true); // Making the created frame visible

    // This is to create the flickering effect
    while (true) {
      text.setVisible(false);
      try {
        Thread.sleep(250);
      } catch (Exception e) {
        e.printStackTrace();
      }
      text.setVisible(true);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    new Login();
  }

  public static void main(String[] args) {
    new SuperMarketManagementSystem(); // creating an object of the class
    /* Upon running this file, the created frame will be visible */
  }
}
