/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.application.Application;
import javafx.stage.Stage;
import modelo.Modelo;

/**
 *
 * @author Estudiante
 */
public class Main extends Application{
    public void start(Stage primaryStage) 
            throws Exception {
        //Registrando el state como variable global
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        Modelo modelo = new Modelo();
        //Invocando al controlador principal
        ControladorVista1 controlador = 
                new ControladorVista1(modelo);
        controlador.mostrarVista();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
