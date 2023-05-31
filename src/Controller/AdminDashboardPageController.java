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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dell
 */
public class AdminDashboardPageController implements Initializable {

    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> tvID;
    @FXML
    private TableColumn<?, ?> tvUserName;
    @FXML
    private TableColumn<?, ?> tvFirstName;
    @FXML
    private TableColumn<?, ?> tvLastName;
    @FXML
    private TableColumn<?, ?> tvAge;
    @FXML
    private TableColumn<?, ?> tvEmail;
    @FXML
    private TableColumn<?, ?> tvGender;
    @FXML
    private TableColumn<?, ?> tvRole;
    @FXML
    private Button btnLogout;
    @FXML
    private Button btnCreatNewPatient;
    @FXML
    private Button btnUpdata;
    @FXML
    private Button btnShowAllBookedAppointments;
    @FXML
    private Button btnDelelte;
    @FXML
    private Button btnShowAllFreeAppointment;
    @FXML
    private Button btnShowallRegisterdPatientsInTheSystem;
    @FXML
    private TextField txtSearchInPatients;
    @FXML
    private Button btnSearchInPatients;
    @FXML
    private Button btnSearchInBookedAppointments;
    @FXML
    private TextField txtSearchinbookedappointments;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void showLogout(ActionEvent event) {
    }

    @FXML
    private void showbtnCreatNewPatient(ActionEvent event) {
    }

    @FXML
    private void showbtnUpdata(ActionEvent event) {
    }

    @FXML
    private void ShowAllBookedAppointments(ActionEvent event) {
    }

    @FXML
    private void showbtnDelelte(ActionEvent event) {
    }

    @FXML
    private void ShowAllFreeAppointment(ActionEvent event) {
    }

    @FXML
    private void ShowallRegisterdPatientsInTheSystem(ActionEvent event) {
    }

    @FXML
    private void showSearchInPatients(ActionEvent event) {
    }

    @FXML
    private void showSearchInBookedAppointments(ActionEvent event) {
    }

    @FXML
    private void Searchinbookedappointments(ActionEvent event) {
    }
    
}
