import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerDashboard extends JFrame {
  // Creating a constructor
  CustomerDashboard() {
    setBounds(100, 100, 1400, 600); // creating a frame
    setLayout(null);

    // Adding the image to frame
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/newCustomer.png"));
    Image i2 = i1.getImage().getScaledInstance(1400, 600, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 1400, 600);
    add(image);

    // Adding text on the image
    JLabel text = new JLabel("WELCOME TO THE CUSTOMER PAGE");
    text.setBounds(50, 0, 1500, 100);
    text.setForeground(Color.BLACK);
    text.setFont(new Font("serif", Font.BOLD, 35));
    image.add(text);

    // Adding buttons
    JButton previousOrders = new JButton("Previous Orders");
    previousOrders.setBounds(50, 100, 500, 100);
    previousOrders.setFont(new Font("serif", Font.BOLD, 25));
    previousOrders.setForeground(Color.BLACK);
    previousOrders.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new PreviousOrders();
      }
    });
    image.add(previousOrders);

    JButton makeOrder = new JButton("Make Order");
    makeOrder.setBounds(50, 250, 500, 100);
    makeOrder.setFont(new Font("serif", Font.BOLD, 25));
    makeOrder.setForeground(Color.BLACK);
    makeOrder.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new MakeOrder();
      }
    });
    image.add(makeOrder);

    setVisible(true);

    // // This is to create the flickering effect
    // while (true) {
    // text.setVisible(false);
    // try {
    // Thread.sleep(250);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // text.setVisible(true);
    // try {
    // Thread.sleep(500);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
  }

  public static void main(String[] args) {
    new CustomerDashboard();
  }
}
