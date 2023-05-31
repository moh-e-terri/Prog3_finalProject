/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import View.ViewManager;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AdminLoginPageController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;
    @FXML
    private Button btnOk;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void adminLogin(ActionEvent event) throws SQLException, ClassNotFoundException {
        String adminUsername = this.txtUserName.getText();
        String adminPassword = this.txtPassword.getText();
        
        
        ArrayList<User> allUsers = User.getAllUsers();
        boolean isLogedIn = false;
        for(User user: allUsers){
            if(user.getRole().equals("admin")){ // if this user is patient check from his info
                if(user.getUsername().equals(adminUsername) && user.getPassword().equals(adminPassword)){
                    isLogedIn = true;
                    ViewManager.adminPage.changeSceneToAdminDachboardPage();
                    break;
                }
            }
        }
        if(!isLogedIn){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("login alert");
            alert.setContentText("Incorrect Username Or Password!\nPlease try again..");
            alert.showAndWait();
        }
    }
    
}
