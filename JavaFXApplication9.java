
package javafxapplication9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JavaFXApplication9 extends Application {
    
  
 

    
    public static void main(String[] args) {
   launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.show();
        
        Button btn1 = new Button("Helloo");
        
        Button btn2 = new Button("Exit");
        
        btn2.setOnAction(e -> System.exit(0));
        
        VBox root = new VBox();
 
        
        root.getChildren().addAll(btn1,btn2);
        
        Scene scene = new Scene(root,400,300);
        
        primaryStage.setScene(scene);
        
        
        
       
    }
    
}
