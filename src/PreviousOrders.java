import java.awt.*; // Importing the packages
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.*;

public class PreviousOrders extends JFrame implements ActionListener {
  // Creating the UI
  JLabel text, prevOrders;
  JButton submit, back;
  JComboBox<String> previousOrders;
  JTable orders;

  PreviousOrders() {
    setBounds(100, 100, 1400, 700); // creating a frame
    setLayout(null); // This helps in customizing our layout

    getContentPane().setBackground(Color.WHITE); // This command is used to set the background of the frame to white

    text = new JLabel("CUSTOMER ORDERS");
    text.setBounds(50, 25, 500, 50);
    text.setForeground(Color.BLACK);// choosing the colour of text
    text.setFont(new Font("serif", Font.BOLD, 25)); // choosing the font of text
    getContentPane().add(text);// adding text to the frame

    prevOrders = new JLabel("SELECT");
    prevOrders.setBounds(50, 85, 100, 30);
    prevOrders.setForeground(Color.BLACK);
    prevOrders.setFont(new Font("serif", Font.BOLD, 15));
    getContentPane().add(prevOrders);

    // creating a drop down box
    previousOrders = new JComboBox<>(new String[] { "Past 5 orders", "Past 10 orders", "All time" });
    previousOrders.setBounds(150, 85, 400, 30);
    getContentPane().add(previousOrders);

    // creating a submit button
    submit = new JButton("Submit");
    submit.setBounds(600, 85, 100, 30);
    submit.setForeground(Color.WHITE);
    submit.setFont(new Font("serif", Font.BOLD, 15));
    submit.setBackground(Color.BLACK);
    getContentPane().add(submit);

    // creating a back button
    back = new JButton("Back");
    back.setBounds(1200, 500, 100, 30);
    back.setForeground(Color.WHITE);
    back.setFont(new Font("serif", Font.BOLD, 15));
    back.setBackground(Color.BLACK);
    back.addActionListener(this);
    getContentPane().add(back);

    JLabel l1 = new JLabel("BillID");
    l1.setBounds(150, 120, 100, 20);
    add(l1);

    JLabel l2 = new JLabel("Price");
    l2.setBounds(390, 120, 100, 20);
    add(l2);

    JLabel l3 = new JLabel("Quantity");
    l3.setBounds(630, 120, 100, 20);
    add(l3);

    JLabel l4 = new JLabel("BillDate");
    l4.setBounds(870, 120, 100, 20);
    add(l4);

    JLabel l5 = new JLabel("PaymentMethod");
    l5.setBounds(1110, 120, 130, 20);
    add(l5);

    orders = new JTable();
    orders.setBounds(150, 150, 1200, 400);
    add(orders);

    try {
      Conn c = new Conn();
      ResultSet query = c.s.executeQuery(
          "select t.BillID,c.Price,c.Quantity, b.BillDate, b.PaymentMethod from Transactions t join Checkout c on t.BillID = c.BillID join Bills b on t.BillID = b.BillID where t.CustomerID = 1;");
      // ResultSet query = c.s.executeQuery("select * from Promotions;");
      orders.setModel(DbUtils.resultSetToTableModel(query));
    } catch (Exception e) {
      e.printStackTrace();
    }

    setVisible(true); // this makes the frame visible
  }

  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    new CustomerDashboard();
  }

  public static void main(String[] args) {
    new PreviousOrders(); // calling the object
  }
}
