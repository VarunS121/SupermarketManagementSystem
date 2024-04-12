import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeOrder extends JFrame implements ActionListener {
  MakeOrder() {
    setBounds(100, 100, 1400, 600); // creating a frame
    setLayout(null); // This helps in customizing our layout

    getContentPane().setBackground(Color.WHITE);

    JLabel text = new JLabel("PLACE ORDERS");
    text.setBounds(50, 25, 500, 50);
    text.setForeground(Color.BLACK);// choosing the colour of text
    text.setFont(new Font("serif", Font.BOLD, 25)); // choosing the font of text
    getContentPane().add(text);// adding text to the frame

    // Creating categories
    JLabel category = new JLabel("Category");
    category.setBounds(50, 75, 100, 30);
    category.setForeground(Color.BLUE);
    category.setFont(new Font("serif", Font.BOLD, 20));
    getContentPane().add(category);

    JLabel availableItems = new JLabel("Available Items");
    availableItems.setFont(new Font("serif", Font.BOLD, 20));
    availableItems.setForeground(Color.BLUE);
    availableItems.setBounds(300, 75, 200, 30);
    getContentPane().add(availableItems);

    JLabel groceries = new JLabel("Groceries");
    groceries.setForeground(Color.BLACK);
    groceries.setFont(new Font("serif", Font.BOLD, 18));
    groceries.setBounds(50, 110, 100, 30);
    getContentPane().add(groceries);

    JLabel lifeStyle = new JLabel("Lifestyle");
    lifeStyle.setForeground(Color.BLACK);
    lifeStyle.setFont(new Font("serif", Font.BOLD, 18));
    lifeStyle.setBounds(50, 150, 100, 30);
    getContentPane().add(lifeStyle);

    JLabel sports = new JLabel("Sports and Health");
    sports.setForeground(Color.BLACK);
    sports.setFont(new Font("serif", Font.BOLD, 18));
    sports.setBounds(50, 190, 150, 30);
    getContentPane().add(sports);

    // Creating dropdown boxes for them
    JComboBox<String> groceriesBox = new JComboBox<>(new String[] { "Product 1", "Product 2", "Product 3" });
    groceriesBox.setBounds(300, 110, 150, 30);
    getContentPane().add(groceriesBox);

    JComboBox<String> lifeStyleBox = new JComboBox<>(new String[] { "Product 1", "Product 2", "Product 3" });
    lifeStyleBox.setBounds(300, 150, 150, 30);
    getContentPane().add(lifeStyleBox);

    JComboBox<String> sportsBox = new JComboBox<>(new String[] { "Product 1", "Product 2", "Product 3" });
    sportsBox.setBounds(300, 190, 150, 30);
    getContentPane().add(sportsBox);

    // Creating Add Buttons
    JButton groceriesButton = new JButton("Add");
    groceriesButton.setBounds(500, 110, 100, 30);
    groceriesButton.setForeground(Color.WHITE);
    groceriesButton.setFont(new Font("serif", Font.BOLD, 18));
    groceriesButton.setBackground(Color.BLACK);
    getContentPane().add(groceriesButton);

    JButton lifeStyleButton = new JButton("Add");
    lifeStyleButton.setBounds(500, 150, 100, 30);
    lifeStyleButton.setForeground(Color.WHITE);
    lifeStyleButton.setFont(new Font("serif", Font.BOLD, 18));
    lifeStyleButton.setBackground(Color.BLACK);
    getContentPane().add(lifeStyleButton);

    JButton sportsButton = new JButton("Add");
    sportsButton.setBounds(500, 190, 100, 30);
    sportsButton.setForeground(Color.WHITE);
    sportsButton.setFont(new Font("serif", Font.BOLD, 18));
    sportsButton.setBackground(Color.BLACK);
    getContentPane().add(sportsButton);

    // Creating Submit and Cancel Buttons
    JButton submit = new JButton("Submit");
    submit.setBounds(450, 500, 100, 30);
    submit.setForeground(Color.WHITE);
    submit.setFont(new Font("serif", Font.BOLD, 20));
    submit.setBackground(Color.BLUE);
    getContentPane().add(submit);

    JButton cancel = new JButton("Cancel");
    cancel.setBounds(750, 500, 100, 30);
    cancel.setForeground(Color.WHITE);
    cancel.setFont(new Font("serif", Font.BOLD, 20));
    cancel.setBackground(Color.BLUE);
    cancel.addActionListener(this);
    getContentPane().add(cancel);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    setVisible(false);
    new CustomerDashboard();
  }

  public static void main(String[] args) {
    new MakeOrder();
  }
}
