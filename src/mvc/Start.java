/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *  Tomado de: http://blog.axxg.de/model-view-controller-mit-javafx/
 * @author Fabian Giraldo
 */public class Start extends Application {
    public static void main(String[] args) {
        launch(args);
    }
      
    @Override
    public void start(Stage primaryStage) {
        
        // ambito de sesión / ámbito de aplicación ¡inicializar beans!
        // necesita ser pasado el controlador de la aplicacion
       DataBean dataBean = new DataBean(primaryStage);
        
 
       // LLamar el primer controlador
       EntradaVC entradaVC = new EntradaVC(dataBean);
       entradaVC.show();      
    }
}
