import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDashboard extends JFrame {
  // Creating a constructor
  EmployeeDashboard() {
    setBounds(100, 100, 1800, 1200); // creating a frame
    setLayout(null);

    // Adding the image to frame
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/newCustomer.png"));
    Image i2 = i1.getImage().getScaledInstance(1800, 1200, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 1800, 1200);
    add(image);

    // Adding text on the image
    JLabel text = new JLabel("WELCOME TO THE EMPLOYEE DASHBOARD");
    text.setBounds(380, 80, 1500, 100);
    text.setForeground(Color.BLACK);
    text.setFont(new Font("serif", Font.BOLD, 40));
    image.add(text);

    // Adding buttons
    JButton inventoryDetails = new JButton("Inventory");
    inventoryDetails.setBounds(100, 250, 450, 100);
    inventoryDetails.setFont(new Font("serif", Font.BOLD, 25));
    inventoryDetails.setBackground(Color.BLACK);
    inventoryDetails.setForeground(Color.WHITE);
    inventoryDetails.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new InventoryDetails();
      }
    });
    image.add(inventoryDetails);

    JButton prevTransactions = new JButton("Previous Transactions");
    prevTransactions.setBounds(100, 380, 450, 100);
    prevTransactions.setFont(new Font("serif", Font.BOLD, 25));
    prevTransactions.setBackground(Color.BLACK);
    prevTransactions.setForeground(Color.WHITE);
    prevTransactions.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new PrevTransactions();
      }
    });
    image.add(prevTransactions);

    JButton vendorOrders = new JButton("Vendor Orders");
    vendorOrders.setBounds(100, 510, 450, 100);
    vendorOrders.setFont(new Font("serif", Font.BOLD, 25));
    vendorOrders.setBackground(Color.BLACK);
    vendorOrders.setForeground(Color.WHITE);
    vendorOrders.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new VendorOrders();
      }
    });
    image.add(vendorOrders);

    JButton customerDetails = new JButton("Customer Details");
    customerDetails.setBounds(100, 640, 450, 100);
    customerDetails.setFont(new Font("serif", Font.BOLD, 25));
    customerDetails.setBackground(Color.BLACK);
    customerDetails.setForeground(Color.WHITE);
    customerDetails.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new CustomerDetails();
      }
    });
    image.add(customerDetails);

    JButton employeeDetails = new JButton("Employee Details");
    employeeDetails.setBounds(100, 770, 450, 100);
    employeeDetails.setFont(new Font("serif", Font.BOLD, 25));
    employeeDetails.setBackground(Color.BLACK);
    employeeDetails.setForeground(Color.WHITE);
    employeeDetails.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new EmployeeDetails();
      }
    });
    image.add(employeeDetails);

    JButton vendorDetails = new JButton("Vendor Details");
    vendorDetails.setBounds(100, 900, 450, 100);
    vendorDetails.setFont(new Font("serif", Font.BOLD, 25));
    vendorDetails.setBackground(Color.BLACK);
    vendorDetails.setForeground(Color.WHITE);
    vendorDetails.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new VendorDetails();
      }
    });
    image.add(vendorDetails);

    JButton makeOrder = new JButton("Make Order");
    makeOrder.setBounds(1200, 900, 450, 100);
    makeOrder.setFont(new Font("serif", Font.BOLD, 25));
    makeOrder.setBackground(Color.BLACK);
    makeOrder.setForeground(Color.WHITE);
    makeOrder.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new MakeOrder();
      }
    });
    image.add(makeOrder);

    JButton exit = new JButton("Exit");
    exit.setBounds(1400, 250, 200, 100);
    exit.setFont(new Font("serif", Font.BOLD, 25));
    exit.setBackground(Color.BLACK);
    exit.setForeground(Color.WHITE);
    exit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        setVisible(false);
      }
    });
    image.add(exit);

    setVisible(true);
  }

  public static void main(String[] args) {
    new EmployeeDashboard();
  }
}
