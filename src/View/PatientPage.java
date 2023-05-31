/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class PatientPage extends Stage {
    
    private Scene patientLoginPageScene;
    private Scene patientRegisterPageScene;
    private Scene patientDachboardPageScene;

    public static int logedInPatientID;  // the patient has beed loged in
    public static String logedInPatientUsername;  // the patient has beed loged in
    
    
    public PatientPage() throws IOException {
        //load patientLoginPage FXML File in patientLogin Scene
        FXMLLoader patientLoginLoader = new FXMLLoader(getClass().getResource("/View/Admin/PatientLoginPage.fxml"));
        Parent patientLoginRoot = patientLoginLoader.load();
        patientLoginPageScene = new Scene(patientLoginRoot);

        //load patientRegisterPage FXML File in patientRegister Scene
        FXMLLoader patientRegisterLoader = new FXMLLoader(getClass().getResource("/View/Admin/PatientRegisterPage.fxml"));
        Parent patientRegisterRoot = patientRegisterLoader.load();
        patientRegisterPageScene = new Scene(patientRegisterRoot);

        //load patientDachboard FXML File in patientDachboard Scene
        FXMLLoader patientDachboardLoader = new FXMLLoader(getClass().getResource("/View/Admin/PatientDashboardPage.fxml"));
        Parent patientDachboardRoot = patientDachboardLoader.load();
        patientDachboardPageScene = new Scene(patientDachboardRoot);


        this.setScene(patientLoginPageScene);
        this.setTitle("Patient Login Page");
        this.show();
        
        /* 
            for testing
        */
//        this.setScene(patientDachboardPageScene);

    }

    public void changeSceneToPatientLoginPage() {
        this.setScene(patientLoginPageScene);
    }

    public void changeSceneToPatientRegisterPage() {
        this.setScene(patientRegisterPageScene);
    }

    public void changeSceneToPatientDachboardPage(int patientID, String patientUsername) {
        this.setScene(patientDachboardPageScene);
        logedInPatientID = patientID;
        logedInPatientUsername = patientUsername;
    }

}
