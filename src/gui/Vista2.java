/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Vista2 {
    private Scene escena;
    private VBox layout;
    private TextArea tinformacion;
    private Button bregresar;

    public Vista2() {
      this.layout = new VBox();
      this.tinformacion = new TextArea();
      this.bregresar = new Button("Regresar");
      this.layout.getChildren().add(tinformacion);
      this.layout.getChildren().add(bregresar);
      this.escena = new Scene(layout, 200, 300);
    }

    public TextArea getTinformacion() {
        return tinformacion;
    }

    public Button getBregresar() {
        return bregresar;
    }
    
    
    
     public void mostrar(Stage stage){
      stage.setTitle("Vista 2");
      stage.setScene(this.escena);
      stage.show();
    }
    
}
