/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxejercicio;

import java.awt.Color;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Fabian Giraldo
 */
public class JavaFXEjercicio extends Application {
    Stage primaryStage;
    @Override
    public void start(Stage primaryStage) {
       this.primaryStage = primaryStage;
	BorderPane borderPane = new BorderPane();
	VBox vbox = new VBox();
        vbox.getChildren().add(getMenuBar());
        vbox.getChildren().add(getToolBar());
        
	borderPane.setTop(vbox);

	TextArea centerText = new TextArea("Center");
	BorderPane.setAlignment(centerText, Pos.CENTER);
	BorderPane.setMargin(centerText, new Insets(5.0, 5.0, 4.0, 4.0));
	borderPane.setCenter(getTabpane());
	
        Pane bottom = getBottom();
        BorderPane.setMargin(bottom, new Insets(10));
        borderPane.setBottom(bottom);
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private Pane getBottom(){
       
        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);
        gridpane.getColumnConstraints().addAll(col1, col2);
       

        Button bt = new Button("Stock");
        GridPane.setHalignment(bt, HPos.LEFT);
      
        Label order = new Label("Order Total");
        
        GridPane.setHalignment(order, HPos.RIGHT);
        gridpane.add(bt, 0, 0);
        gridpane.add(order, 1, 0);
       
        return gridpane;

    }
    
    
    private MenuBar getMenuBar(){
       Menu menu = new Menu("Menu 1");
        MenuItem menuItem1 = new MenuItem("Item 1");
        MenuItem menuItem2 = new MenuItem("Item 2");
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);

        Menu menu2 = new Menu("Menu 2");
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        menuBar.getMenus().add(menu2);
        return menuBar;
    }
    
    private ToolBar getToolBar() {

        ToolBar toolBar = new ToolBar(
                new Button("New"),
                new Button("Open"),
                new Separator(),
                new Button("Save"),
                new Button("Clean"),
                new Button("Compile"),
                new Button("Run"),
                new Button("Debug"),
                new Button("Profile")
        );
        return toolBar;
    }

    private TabPane getTabpane(){
        TabPane tPane = new TabPane();
        Tab tab = new Tab();
        tab.setText("Tab" + 1);
        VBox vbox = new VBox();
        
        //Fila 1
        GridPane gridpane = new GridPane();
        ColumnConstraints col1 = new ColumnConstraints();
        col1.setPercentWidth(50);
        ColumnConstraints col2 = new ColumnConstraints();
        col2.setPercentWidth(50);
        gridpane.getColumnConstraints().addAll(col1, col2);
        HBox hbox = new HBox();
        Label order = new Label("Order ID");
        TextField txt = new TextField();
        txt.setMaxWidth(40);
        txt.setEditable(false);
        hbox.getChildren().add(order);
        hbox.getChildren().add(txt);
        GridPane.setHalignment(hbox, HPos.LEFT);
        gridpane.add(hbox,0,1);
        Label orderInformation = new Label("Order Information");
        GridPane.setHalignment(orderInformation, HPos.LEFT);
        gridpane.add(orderInformation,1,0);
        vbox.getChildren().add(gridpane);
        
        //Fila2
       
       
        
        //Fila3 
        BorderPane pane = new BorderPane();

        TableView table = new TableView();
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("Jacob", "Smith", "jacob.smith@example.com"),
                new Person("Isabella", "Johnson",
                        "isabella.johnson@example.com"),
                new Person("Ethan", "Williams", "ethan.williams@example.com"),
                new Person("Emma", "Jones", "emma.jones@example.com"),
                new Person("Michael", "Brown", "michael.brown@example.com")
        );
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("firstName")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("lastName")
        );
        emailCol.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        table.setItems(data);

          ObservableList selectedCells = table.getSelectionModel().getSelectedCells();

          selectedCells.addListener(new ListChangeListener() {
            @Override
            public void onChanged(Change c) {
                TablePosition tablePosition = (TablePosition) selectedCells.get(0);
                Object val = tablePosition.getTableColumn().getCellData(tablePosition.getRow());
                System.out.println("Selected Value" + val);
            }
        });

        pane.setCenter(table);
        VBox botones = new VBox();
        Button ba = new Button("A");
        Button bb = new Button("B");
        Button bc = new Button("C");
        Button bd = new Button("D");
        botones.getChildren().add(ba);
        botones.getChildren().add(bb);
        botones.getChildren().add(bc);
        botones.getChildren().add(bd);
        pane.setLeft(botones);
        botones.setPadding(new Insets(10));

        ba.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
                ObservableList selectedCells = table.getSelectionModel().getSelectedCells();
                if(selectedCells.size()>0){
                    TablePosition tablePosition = (TablePosition) selectedCells.get(0);
                    Object val = tablePosition.getTableColumn().getCellData(tablePosition.getRow());
                    System.out.println("Selected Value" + val);
                }
               
             
         }
      });
        
        
         bb.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
                
            Label secondLabel = new Label("I'm a Label on new Window");
 
            StackPane secondaryLayout = new StackPane();
            secondaryLayout.getChildren().add(secondLabel);
 
            Scene secondScene = new Scene(secondaryLayout, 230, 100);
 
            // New window (Stage)
            Stage newWindow = new Stage();
            newWindow.setTitle("Second Stage");
            newWindow.setScene(secondScene);
 
            // Specifies the modality for new window.
            newWindow.initModality(Modality.WINDOW_MODAL);
 
            // Specifies the owner Window (parent) for new window
            newWindow.initOwner(primaryStage);
 
            // Set position of second window, related to primary window.
            newWindow.setX(primaryStage.getX() + 200);
            newWindow.setY(primaryStage.getY() + 100);
 
            newWindow.show();
         }
      });
        
         bc.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {
               showAlertWithHeaderText();
             
         }
      });
        
         
        vbox.getChildren().add(pane);
        
        tab.setContent(vbox);
        tab.setClosable(false);
        tPane.getTabs().add(tab);
      
       return tPane;
     
    }
    
    // Show a Information Alert with header Text
    private void showAlertWithHeaderText() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Test Connection");
        alert.setHeaderText("Results:");
        alert.setContentText("Connect to the database successfully!");
 
        alert.showAndWait();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
