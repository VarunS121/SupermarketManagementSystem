import java.sql.*;
//import com.mysql.cj.jdbc.*;

public class Conn {

  Connection c;
  Statement s;

  Conn() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      c = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "nemo", "Nemo@123");
      s = c.createStatement();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
