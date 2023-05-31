/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class UpdataPatientController implements Initializable {

    @FXML
    private Label userName;
    @FXML
    private Label password;
    @FXML
    private Label firstName;
    @FXML
    private Label lastName;
    @FXML
    private Label age;
    @FXML
    private Label role;
    @FXML
    private Label email;
    @FXML
    private Label gender;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtAge;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtUserName;
    @FXML
    private Button btnOk;
    @FXML
    private RadioButton radioMale;
    @FXML
    private ToggleGroup groupGender;
    @FXML
    private RadioButton radioFemale;
    @FXML
    private RadioButton radioAdmail;
    @FXML
    private ToggleGroup groupRole;
    @FXML
    private RadioButton radioPatient;
    @FXML
    private Label phone;
    @FXML
    private TextField txtPhone;
    @FXML
    private Label updtaYourInformation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showFirstName(ActionEvent event) {
    }

    @FXML
    private void showLastName(ActionEvent event) {
    }

    @FXML
    private void showAge(ActionEvent event) {
    }

    @FXML
    private void showEmail(ActionEvent event) {
    }

    @FXML
    private void showPassword(ActionEvent event) {
    }

    @FXML
    private void showUserName(ActionEvent event) {
    }

    @FXML
    private void showBtnOk(ActionEvent event) {
    }

    @FXML
    private void showPhone(ActionEvent event) {
    }
    
}
