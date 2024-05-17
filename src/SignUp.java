import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class SignUp extends Application{


    public static void main (String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,600, 600, Color.BLACK);

        Text text = new Text();
        text.setText("Welcome");
        text.setX(25);
        text.setY(25);
        text.setFont(Font.font("Georgia"));
        text.setFill(Color.WHITE);

        root.getChildren().add(text);


        stage.setScene(scene);
        stage.setTitle("Memory Palace");
       // stage.setFullScreen(true);

        stage.show();
    }
}
