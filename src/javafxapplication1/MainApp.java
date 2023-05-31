/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import Controller.AdminLoginPageController;
import Controller.PatientLoginPageController;
import Controller.PatientRegisterPageController;
import View.AdminPage;
import View.PatientPage;
import View.ViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
//        ViewManager.openIndexPage();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Admin/index.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
//        stage.setTitle("Patient Login Page");
        stage.setScene(scene);
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        launch(args);
    }

}
