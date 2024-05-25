package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;

public class DashboardController {
	@FXML
	private Button menuButtonDashboard;
	@FXML
	private Button menuButtonInventory;
	@FXML
	private Button menuButtonEmployee;
	@FXML
	private Button menuButtonCustomer;
	@FXML
	private Button menuButtonVendor;
	@FXML
	private Button LogoutButton;
	@FXML
	private Button ProfileButton;
	@FXML
	private Button RefreshButton;
	@FXML
	private AnchorPane scenePane;
	@FXML
	private PasswordField passwordField;
	@FXML
	private TextField usernameField;
	
	Stage stage;
	
	@FXML
    private void exit(ActionEvent event){
		Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Exit!");
    	alert.setContentText("Are you sure you want to exit?");
    	
    	if(alert.showAndWait().get() == ButtonType.OK) {
    		stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("Exitted normally!");
            stage.close();
    	}
    }
	
	@FXML
	private void login(ActionEvent event) {
		String username = usernameField.getText();
		String password = passwordField.getText();
        String sha256hash = getSHA256Hash(password);
        
        if(username.isEmpty() || password.isEmpty()) {
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("Empty Fields!");
        	alert.setContentText("Either the username or password has been left blank. Kindly fill out the details.");
        	alert.showAndWait();
        }
        
        try{
            ConnectWithSQL c = new ConnectWithSQL();
            String query = "select * from employees where UserID = '" + username + "' and Password = '" + sha256hash + "'";
            ResultSet rs_employee = c.s.executeQuery(query);
            
            if(rs_employee.next()) {
            	Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
    			Scene scene = new Scene(root);
    			String css = this.getClass().getResource("style.css").toExternalForm();
    			scene.getStylesheets().add(css);
    			
    			stage = (Stage) scenePane.getScene().getWindow();
    			stage.setTitle("Akshay Supermarket");
    			stage.setResizable(false);
    			stage.setScene(scene);
    			stage.show();
            } else {
            	query = "select * from customers where EmailID = '" + username + "' and Password = '" + sha256hash + "'";
                ResultSet rs_customer = c.s.executeQuery(query);
                if(rs_customer.next()) {
                	//TODO
                } else {
	            	Alert alert = new Alert(AlertType.ERROR);
	            	alert.setTitle("Invalid Entry");
	            	alert.setContentText("Either the username or password is incorrect.");
	            	usernameField.setText("");
	            	passwordField.setText("");
	            	alert.showAndWait();
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
	}
        
    private static String getSHA256Hash(String input) {
    	 try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hashbyte = md.digest(input.getBytes());
			StringBuilder hashPassword = new StringBuilder();
			for(byte b : hashbyte) {
				hashPassword.append(String.format("%02x", b));
			}
			return hashPassword.toString();
 		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
     }
}
