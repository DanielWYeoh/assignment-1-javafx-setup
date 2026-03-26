import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Label (initially empty)
        Label label = new Label("");

        // Button
        Button button = new Button("Click Me!");

        // Button action
        button.setOnAction(e -> {
            label.setText("Hello World!");
            System.out.println("You clicked me!");
        });

        // Layout
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(button, label);

        // Scene
        Scene scene = new Scene(root, 300, 200);

        // Stage (window)
        stage.setTitle("JavaFX Simple App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}