/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

/**
 *
 * @author Saulo
 */
public class JavaFXApplication1 extends Application {
    
   @Override
public void start(Stage stage) {
    try {
        ScrollPane scrollPane = FXMLLoader.load(getClass().getResource("/gui/MainView.fxml"));
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        Scene scene = new Scene(scrollPane);
        stage.setScene(scene);
        stage.show();
    }catch (IOException e) {
        e.printStackTrace();
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
