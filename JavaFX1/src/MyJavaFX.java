import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    @Override // Override the start method in the Application class 
    
    public voidstart(Stage primaryStage) {     // Create a scene and place a button in the scene10      
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);    
        primaryStage.setTitle("MyJavaFX"); // Set the stage title13      
        primaryStage.setScene(scene); // Place the scene in  
        primaryStage.show(); // Display the stage15    
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}