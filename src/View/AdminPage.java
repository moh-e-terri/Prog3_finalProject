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
public class AdminPage extends Stage{
    private Scene adminLoginPageScene;
    private Scene adminDachboardPageScene;
    
    public AdminPage() throws IOException{
    
        //load AdminLoginPage FXML File in adminLogin Scene
        FXMLLoader adminLoginLoader = new FXMLLoader(getClass().getResource("/View/Admin/AdminLoginPage.fxml"));
        Parent adminLoginRoot = adminLoginLoader.load();
        adminLoginPageScene = new Scene(adminLoginRoot);
        
         //load adminDachboard FXML File in adminDachboard Scene
        FXMLLoader adminDachboardLoader = new FXMLLoader(getClass().getResource("/View/Admin/AdminDashboardPage.fxml"));
        Parent adminDachboardRoot = adminDachboardLoader.load();
        adminDachboardPageScene = new Scene(adminDachboardRoot);
        
       
        // Set Main Scene in Admin Dasboard ( UsersManagment Scene )
//        this.setScene(adminLoginPageScene);
        this.setTitle("Admin Login Page");
        this.show();
        
        /* 
            for testing
        */
        this.setScene(adminDachboardPageScene);

    }
   

    public void changeSceneToAdminDachboardPage(){
        this.setScene(adminDachboardPageScene);
    }
    public void changeSceneToAdminLoginPage(){
        this.setScene(adminLoginPageScene);
    }
    
   
   


}
