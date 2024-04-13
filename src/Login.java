import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

  JTextField user_entry;
  JPasswordField password_entry;
  JButton login_Button, cancel_Button;

  Login() {
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    JLabel user_label = new JLabel("Username");
    user_label.setBounds(40, 20, 100, 30);
    add(user_label);

    JLabel password_label = new JLabel("Password");
    password_label.setBounds(40, 70, 100, 30);
    add(password_label);

    user_entry = new JTextField();
    user_entry.setBounds(150, 20, 150, 30);
    add(user_entry);

    password_entry = new JPasswordField();
    password_entry.setBounds(150, 70, 150, 30);
    add(password_entry);

    login_Button = new JButton("Login");
    login_Button.setBounds(40, 150, 120, 30);
    login_Button.addActionListener(this);
    add(login_Button);

    cancel_Button = new JButton("Cancel");
    cancel_Button.setBounds(200, 150, 120, 30);
    cancel_Button.addActionListener(this);
    add(cancel_Button);

    ImageIcon login_user = new ImageIcon(ClassLoader.getSystemResource("Icons/User.png"));
    ImageIcon login_user_scaled = new ImageIcon(login_user.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    JLabel image = new JLabel(login_user_scaled);
    image.setBounds(350, 10, 200, 200);
    add(image);

    setBounds(500, 200, 600, 300);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == cancel_Button) {
      setVisible(false);
    } else if (ae.getSource() == login_Button) {
      String user = user_entry.getText();
      String pass = password_entry.getText();
      pass = MD5.getMd5(pass);
      try {
        Conn c = new Conn();

        String query = "select * from Employees where UserID = '" + user + "' and Password = '" + pass + "';";
        ResultSet rs = c.s.executeQuery(query);
        if (rs.next()) {
          setVisible(false);
          new EmployeeDashboard();
        } else {
          query = "select * from Customers where UserID = '" + user + "' and Password = '" + pass + "';";
          rs = c.s.executeQuery(query);
          if (rs.next()) {
            setVisible(false);
            new CustomerDashboard();
          } else {
            JOptionPane.showMessageDialog(null, "invalid username or Password");
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    new Login();
  }
}
