package ru.mirea.task8;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import java.util.Random;

public class Task8 extends Application{
    public static void main(String[] args) {
        Application.launch();
    }

    @Override
    public void start(Stage stage) {
        final Random random = new Random();
        Shape Sh = new Rectangle(10,15 ,10,20);
        Group group = new Group(Sh);
        for(int i = 0; i < 20; i++){
            int R = (random.nextInt(4) + 1);
            int x = (random.nextInt(500) + 1);
            int y = (random.nextInt(500) + 1);
            int Sx = (random.nextInt(100) + 1);
            int Sy = (random.nextInt(100) + 1);
            switch (R){
                case(1):
                    Sh = new Rectangle(x, y, Sx, Sy);
                    Sh.setFill(Color.AZURE);
                    break;
                case(2):
                    Sh = new Circle(x, y, Sy);
                    Sh.setFill(Color.LAVENDERBLUSH);
                    break;
                case(3):
                    Sh = new Ellipse(x, y, Sx, Sy);
                    Sh.setFill(Color.AQUAMARINE);
                    break;
                case(4):
                    Sh = new Polygon(x, y);
                    ((Polygon) Sh).getPoints().addAll(new Double[]{
                            200.0, 50.0,
                            400.0, 50.0,
                            450.0, 150.0,
                            400.0, 250.0,
                            200.0, 250.0,
                            150.0, 150.0,
                    });
                    Sh.setFill(Color.DARKBLUE);
                    break;
            }
            group.getChildren().add(Sh);
        }
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.setWidth(500);
        stage.setHeight(400);
        stage.show();
    }
}//--module-path "/Users/igorstarikov/javafx-sdk-17.0.0.1/lib" --add-modules javafx.controls,javafx.fxml
