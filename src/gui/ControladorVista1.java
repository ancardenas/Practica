/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import modelo.Modelo;

/**
 *
 * @author Estudiante
 */
public class ControladorVista1 {
    private Vista1 vista;
    private Modelo modelo;

    public ControladorVista1(Modelo modelo) {
      this.modelo = modelo;
      this.vista = new Vista1();
     
    }
    
    public void mostrarVista(){
      Singleton singleton = 
              Singleton.getSingleton();
      this.vista.mostrar(singleton.getStage());
      this.vista.getVentana2().setOnAction(new EventoSiguiente());
      this.vista.getMenu().setOnAction(new EventoMenu());
    }
    //clases internas
    class EventoMenu implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
             //To change body of generated methods, choose Tools | Templates.
             System.out.println("Hola mi pez");
        }
        
    }
    class EventoSiguiente implements EventHandler<ActionEvent>{
      @Override
        public void handle(ActionEvent event) {
           //Transicion a la siguiente vista 
           ControladorVista2 controlador = 
                   new ControladorVista2(modelo);
           controlador.mostrarVista();
        }
    }
       
    
}
