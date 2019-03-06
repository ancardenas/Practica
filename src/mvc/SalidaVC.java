/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Fabian Giraldo
 */
public class SalidaVC {
    
   private DataBean dataBean;
   private SalidaView view;
    
    
   public SalidaVC(DataBean dataBean) {
      this.dataBean = dataBean;
      this.view = new SalidaView();
       
      // Eventhandler registrieren
      view.getBackBtn().setOnAction(new backBtnEventHandler());   
   }
    
   public void show(){
      // LLena vista con datos.
      int anz = 1;
      for (String key : dataBean.getNamePwMap().keySet()) {
         // 1: Name
         view.getList().getItems().add(anz + ": " + key + ", " + dataBean.getNamePwMap().get(key));
         anz++;
      }      
     
      view.show(dataBean.getPrimaryStage());
   }
    
   //+++++++++++++++++++++++++++++++++++++++++++++
   // Events
   //+++++++++++++++++++++++++++++++++++++++++++++
 
    
   class backBtnEventHandler implements EventHandler<ActionEvent>{
 
      @Override
      public void handle(ActionEvent e) {   
         // Ir a la siguiente pagina.
          EntradaVC eingabeVC = new EntradaVC(dataBean);
          eingabeVC.show();   
      }
       
   }
}