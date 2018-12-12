/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanager;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author hadin
 */
public class LibraryManager extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        AnchorPane root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("MainLayout.fxml"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("mainlayout.css").toExternalForm());
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
