package ru.mirea.task8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.List;

public class Task8_1 extends Application {
    public static void main(String args[]) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        Parameters params = getParameters();
        List<String> list = params.getRaw();
        String path = list.get(0);
        Image image = new Image(new FileInputStream(path));
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(455);
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Loading an image");
        stage.setScene(scene);
        stage.show();
    }
}

