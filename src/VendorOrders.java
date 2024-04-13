import java.awt.*; // Importing the packages
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.*;

public class VendorOrders extends JFrame implements ActionListener {
  // Creating the UI
  JLabel text, selectText;
  JButton submit, back;
  JComboBox<String> selectBox;
  JTable orders;

  VendorOrders() {
    setBounds(100, 100, 1800, 1200); // creating a frame
    setLayout(null); // This helps in customizing our layout

    getContentPane().setBackground(Color.WHITE); // This command is used to set the background of the frame to white

    text = new JLabel("VENDOR DETAILS");
    text.setBounds(50, 25, 500, 50);
    text.setForeground(Color.BLACK);// choosing the colour of text
    text.setFont(new Font("serif", Font.BOLD, 40)); // choosing the font of text
    getContentPane().add(text);// adding text to the frame

    selectText = new JLabel("SELECT");
    selectText.setBounds(50, 100, 150, 30);
    selectText.setForeground(Color.BLACK);
    selectText.setFont(new Font("serif", Font.BOLD, 30));
    getContentPane().add(selectText);

    // creating a drop down box
    selectBox = new JComboBox<>(new String[] { "Past 5 orders", "Past 10 orders", "All time" });
    selectBox.setBounds(200, 100, 400, 30);
    selectBox.setFont(new Font("serif", Font.BOLD, 20));
    getContentPane().add(selectBox);

    // creating a submit button
    submit = new JButton("Submit");
    submit.setBounds(650, 100, 150, 40);
    submit.setForeground(Color.WHITE);
    submit.setFont(new Font("serif", Font.BOLD, 25));
    submit.setBackground(Color.BLACK);
    // submit.addActionListener(new ActionListener() {
    // public void actionPerformed(ActionEvent ae){
    // int selection = selectBox.getSelectedIndex();
    // try {
    // switch (selection) {
    // case 1:
    // Conn c = new Conn();
    // ResultSet query = c.s.executeQuery("select * from Products order by ;");

    // break;

    // default:
    // break;
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
    // });
    getContentPane().add(submit);

    // creating a back button
    back = new JButton("Back");
    back.setBounds(1600, 100, 150, 40);
    back.setForeground(Color.WHITE);
    back.setFont(new Font("serif", Font.BOLD, 25));
    back.setBackground(Color.BLACK);
    back.addActionListener(this);
    getContentPane().add(back);

    JLabel l1 = new JLabel("ProductID");
    l1.setFont(new Font("serif", Font.BOLD, 25));
    l1.setBackground(Color.BLUE);
    l1.setBounds(150, 150, 160, 20);
    add(l1);

    JLabel l2 = new JLabel("ProductName");
    l2.setFont(new Font("serif", Font.BOLD, 25));
    l2.setBackground(Color.BLUE);
    l2.setBounds(410, 150, 200, 20);
    add(l2);

    JLabel l3 = new JLabel("CostPrice");
    l3.setFont(new Font("serif", Font.BOLD, 25));
    l3.setBackground(Color.BLUE);
    l3.setBounds(670, 150, 200, 20);
    add(l3);

    JLabel l4 = new JLabel("SellingPrice");
    l4.setFont(new Font("serif", Font.BOLD, 25));
    l4.setBounds(930, 150, 130, 20);
    l4.setBackground(Color.BLUE);
    add(l4);

    JLabel l5 = new JLabel("Discount");
    l5.setFont(new Font("serif", Font.BOLD, 25));
    l5.setBounds(1190, 150, 160, 20);
    l5.setBackground(Color.BLUE);
    add(l5);

    orders = new JTable();
    orders.setBounds(150, 180, 1300, 400);
    orders.setFont(new Font("serif", Font.BOLD, 25));
    orders.removeEditor();
    orders.setShowHorizontalLines(true);
    orders.setRowHeight(40);

    add(orders);
    // JScrollPane tableScrollPane = new JScrollPane(orders);
    // tableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    // this.getContentPane().add(tableScrollPane);

    try {
      Conn c = new Conn();
      ResultSet query = c.s.executeQuery(
          "select * from Products;");
      orders.setModel(DbUtils.resultSetToTableModel(query));
    } catch (Exception e) {
      e.printStackTrace();
    }

    setVisible(true); // this makes the frame visible
  }

  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    new EmployeeDashboard();
  }

  public static void main(String[] args) {
    new VendorOrders(); // calling the object
  }
}
