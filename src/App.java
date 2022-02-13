import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello JavaFX!");

        /*
        label.setBackground(new Background(new BackgroundFill(new LinearGradient(
            0, 0, 1, 1, true,                      //sizing
            CycleMethod.NO_CYCLE,                  //cycling
            new Stop(0, Color.web("#81c483")),     //colors
            new Stop(1, Color.web("#fcc200"))), null, null)));
        // */

        //label.setMinHeight(200);
        //label.setMinWidth(100);
        //label.setAlignment(Pos.CENTER);

        ////label.setMouseTransparent(true);
      
        label.setOnMouseClicked(event ->
        {
            System.out.format("mouse x=%d y=%d\n", (int)event.getX(), (int)event.getY());
        });

        // the root of the scene shown in the main window
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // create a scene specifying the root and the size
        Scene scene = new Scene(root, 500, 300);

        // add scene to the stage
        primaryStage.setScene(scene);
        // make the stage visible
        primaryStage.show();
    }

    public static void main(String[] args) throws Exception {
        Application.launch(App.class, args);
    }
}
