/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.util.HashMap;
import java.util.Map;
import javafx.stage.Stage;

/**
 *
 * @author Fabian Giraldo
 */
public class DataBean {   
   private Stage primaryStage = null;   //Podria estar en un singleton
   private Map<String , String> namePwMap = null;
    
   public DataBean(Stage primaryStage) {
      this.primaryStage = primaryStage;
      this.namePwMap = new HashMap<>();
   }
 
   public Map<String, String> getNamePwMap() {
      return namePwMap;
   }
 
   public Stage getPrimaryStage() {
      return primaryStage;
   }
}