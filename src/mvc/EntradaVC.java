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
public class EntradaVC {
    
   // Model
   private DataBean dataBean;
    
   // View
   private EntradaView view;
    
    
   public EntradaVC(DataBean dataBean) {
      this.dataBean = dataBean;
      this.view = new EntradaView();
       
      // Eventhandler registrieren
      view.getAddBtn().setOnAction(new addBtnEventHandler());   
      view.getOkBtn().setOnAction(new OkBtnEventHandler());   
   }
    
   public void show(){
      view.show(dataBean.getPrimaryStage());
   }
    
   //+++++++++++++++++++++++++++++++++++++++++++++
   // Events
   //+++++++++++++++++++++++++++++++++++++++++++++
 
    
   class OkBtnEventHandler implements EventHandler<ActionEvent>{
 
      @Override
      public void handle(ActionEvent e) {   
      // zur naechsten Seiten springen! 
          SalidaVC ausgabeVC = new SalidaVC(dataBean);
          ausgabeVC.show();   
      }
       
   }
    
   class addBtnEventHandler implements EventHandler<ActionEvent>{
 
      @Override
      public void handle(ActionEvent e) {   
         // Meldung reseten
         view.getMessageT().setText("");
          
         // Daten aus den Textfeldern holen
         String vname = view.getNameTF().getText();
          String nname = view.getNachnameTF().getText();
           
         //Textfelder zuruecksetzen
         view.getNachnameTF().setText("");
         view.getNameTF().setText("");
          
         // Daten testen
         if(vname.isEmpty()){
            view.getMessageT().setText("Ingrese el nombre!");
            return;
         }
         if(nname.isEmpty()){
            view.getMessageT().setText("Ingrese el apellido!");
            return;
         }
          
         // Daten hinzufuegen 
         String erg = null;
         erg = dataBean.getNamePwMap().put(nname, vname);
          
         // Meldung ausgeben
         if(erg == null){
            view.getMessageT().setText("Se agrego correctamente");
         }else{
            view.getMessageT().setText("Ya existe");
         }
      }
       
   }
 
}