/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Vista1 {
    private Scene escena;
    private GridPane layout;
    private Button ventana2;
    private MenuBar menubar;
    private HBox menus;
    private Menu menu;
    public Vista1() {
        this.layout = new GridPane();
        this.ventana2 = new Button("Ventana2");
        this.menu = new Menu("Hola");
        this.menubar = new MenuBar();
        this.menus = new HBox();
        MenuItem it1 =new MenuItem("Hola");
        this.menu.getItems().add(it1);
        this.menubar.getMenus().add(menu);
        //this.layout.getChildren().add(menubar);
        this.menus.getChildren().add(menubar);
        this.layout.getChildren().add(menus);
        this.layout.add(ventana2,2,1);
        this.escena = new Scene(layout, 200, 300);
    }

    
    
    
    public void mostrar(Stage stage){
      stage.setTitle("Vista 1");
      stage.setScene(this.escena);
      stage.show();
    }

    public Button getVentana2() {
        return ventana2;
    }

    public Menu getMenu() {
        return menu;
    }
    
    
}
