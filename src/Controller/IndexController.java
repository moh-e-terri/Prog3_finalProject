package Controller;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class IndexController implements Initializable {

    @FXML
    private Button btnAdminLoginPage;
    @FXML
    private Button btnPatientLoginPage;
    @FXML
    private Label choose;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showAdminLoginPage(ActionEvent event) throws IOException {
        ViewManager.openAdminPage();
    }

    @FXML
    private void showPatientLoginPage(ActionEvent event) throws IOException {
        ViewManager.openPatientPage();
    }
    
}
