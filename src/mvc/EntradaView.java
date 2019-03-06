/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Fabian Giraldo
 */
public class EntradaView{
    
   private Scene scene;
    
   private GridPane grid;
   private Text scenetitle;
    
   private Label name;
   private TextField nameTF;
    
   private Label lastNameLB;
   private TextField lastNameTF;
    
   private Text messageT;
    
   private Button okBtn;
   private Button addBtn;
   private HBox hbBtn;
    
   public EntradaView() {
      // Layout
      grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setHgap(10);
      grid.setVgap(10);
      grid.setPadding(new Insets(25, 25, 25, 25));
 
      // Ueberschrift
      scenetitle = new Text("Bienvenidos");
      scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
      grid.add(scenetitle, 0, 0, 2, 1);
 
      // Vorname
      name = new Label("Nombre:");
      grid.add(name, 0, 1);
 
      nameTF = new TextField();
      grid.add(nameTF, 1, 1);
       
      // Nachname
      lastNameLB = new Label("Apellido:");
      grid.add(lastNameLB, 0, 2);
 
      lastNameTF = new TextField();
      grid.add(lastNameTF, 1, 2);
 
      // Buttons
      addBtn = new Button("Insertar");
      okBtn = new Button("Listar Todo");
 
      // Buttongruppe
      hbBtn = new HBox(10);
      hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
      hbBtn.getChildren().add(addBtn);
      hbBtn.getChildren().add(okBtn);
      grid.add(hbBtn, 1, 4);
 
      // Meldung
      messageT = new Text();
      grid.add(messageT, 1, 6);
 
      scene = new Scene(grid, 300, 300);
   }
 
   public void show(Stage stage) {
      stage.setTitle("Ejemplo MVC");
      stage.setScene(scene);
      stage.show();
   }
 
 
   //solo crea getters de elementos que son modificados y / o dinámicos
   public TextField getNameTF() {
      return nameTF;
   }
 
 
   public TextField getNachnameTF() {
      return lastNameTF;
   }
 
 
   public Text getMessageT() {
      return messageT;
   }
 
   public Button getOkBtn() {
      return okBtn;
   }
 
 
   public Button getAddBtn() {
      return addBtn;
   }
 
 
}