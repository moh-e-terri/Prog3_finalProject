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
public class IndexPage extends Stage {

    private Scene indexPageScene;

    public IndexPage() throws IOException {
        //load adminDachboard FXML File in adminDachboard Scene
        FXMLLoader indexLoader = new FXMLLoader(getClass().getResource("/View/Admin/index.fxml"));
        Parent indexRoot = indexLoader.load();
        indexPageScene = new Scene(indexRoot);
        this.setScene(indexPageScene);
        this.setTitle("Home Page");
        this.show();

    }

}
