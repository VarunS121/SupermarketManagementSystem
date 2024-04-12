import java.awt.*; // Importing the packages
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class CustomerDetails extends JFrame implements ActionListener {
  // Creating the UI
  JLabel text, prevOrders;
  JButton submit, back;
  JComboBox<String> previousOrders;
  JTable orders;

  CustomerDetails() {
    setBounds(100, 100, 1400, 600); // creating a frame
    setLayout(null); // This helps in customizing our layout

    getContentPane().setBackground(Color.WHITE); // This command is used to set the background of the frame to white

    text = new JLabel("CUSTOMER DETAILS");
    text.setBounds(50, 25, 500, 50);
    text.setForeground(Color.BLACK);// choosing the colour of text
    text.setFont(new Font("serif", Font.BOLD, 25)); // choosing the font of text
    getContentPane().add(text);// adding text to the frame

    // creating a back button
    back = new JButton("Back");
    back.setBounds(1200, 500, 100, 30);
    back.setForeground(Color.WHITE);
    back.setFont(new Font("serif", Font.BOLD, 15));
    back.setBackground(Color.BLACK);
    back.addActionListener(this);
    getContentPane().add(back);

    orders = new JTable();
    orders.setBounds(150, 120, 1200, 400);
    add(orders);

    // try {
    // Conn c = new Conn();
    // ResultSet query = c.s.executeQuery("select t.BillID,c.Price,c.Quantity,
    // b.BillDate, b.PaymentMethod from Transactions t join Checkout c on t.BillID =
    // c.BillID join bills b ont.BillID = b.BillID where t.CustomerID = 4;");
    // // orders.setModel(DbUtils.);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }

    setVisible(true); // this makes the frame visible
  }

  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    // new CustomerDashboard();
  }

  public static void main(String[] args) {
    new CustomerDetails(); // calling the object
  }
}
