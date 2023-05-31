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

public class PatientLoginPageController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtPassword;
    @FXML
    private Button btnLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void patientLogin(ActionEvent event) throws SQLException, ClassNotFoundException {
        String patientUsername = this.txtUserName.getText();
        String patientPassword = this.txtPassword.getText();
        
        ArrayList<User> allUsers = User.getAllUsers();
        boolean isLogedIn = false;
        for(User user: allUsers){
            if(user.getRole().equals("patient")){ // if this user is patient check from his info
                if(user.getUsername().equals(patientUsername) && user.getPassword().equals(patientPassword)){
                    isLogedIn = true;
                    ViewManager.patientPage.changeSceneToPatientDachboardPage(user.getId(), user.getUsername());
                    this.txtPassword.setText("");
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
