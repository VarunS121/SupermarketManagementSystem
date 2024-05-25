package application;

import java.sql.*;

public class ConnectWithSQL {
    Connection c;
	Statement s;

    ConnectWithSQL() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "say my name");
			s = c.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
