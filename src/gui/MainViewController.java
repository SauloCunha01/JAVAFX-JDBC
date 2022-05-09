/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
    @FXML    
    private MenuItem    menuItemSeller;
    
     @FXML    
    private MenuItem    menuItemDepartment;
    
    @FXML    
    private MenuItem    menuItemAbout;
    
    @FXML
    public  void onMenuItemSellerAction(){
        System.out.println("onAction menu Item");
    }
    @FXML
    public  void onMenuItemDepartmentAction(){
        System.out.println("onAction Department Item");
    }
    @FXML
    public  void onMenuItemAboutAction(){
        System.out.println("onAction About Item");
    }
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
     
    }
}
