package ru.mirea.task9;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;


public class Task9 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    int x = 0;
    int y = 0;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("MyApp");
        Button btn1 = new Button();
        Button btn2 = new Button();
        btn1.setText("ЦСКА");
        btn1.setPrefSize(300, 50);
        btn2.setText("Спартак");
        btn2.setPrefSize(300, 50);
        Label label = new Label("Result: " + x + "x" + y);
        label.setScaleY(5);
        label.setScaleX(5);
        label.setTranslateY(-100);
        Label label1 = new Label("Last Scorer: N/A");
        label1.setScaleY(5);
        label1.setScaleX(5);
        Label label2 = new Label("Winner: N/A");
        label2.setScaleY(5);
        label2.setScaleX(5);
        label2.setTranslateY(100);
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("ЦСКА + 1");
                ++x;
                label.setText("Result: " + x + "x" + y);
                label1.setText("Last Scorer: ЦСКА");
                if (x > y)
                    label2.setText("Winner: ЦСКА");
                else if (x < y)
                    label2.setText("Winner: Спартак");
                else
                    label2.setText("Winner: N/A");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Спартак + 1");
                ++y;
                label.setText("Result: " + x + "x" + y);
                label1.setText("Last Scorer: Спартак");
                if (x < y)
                    label2.setText("Winner: Спартак");
                else if (x > y)
                    label2.setText("Winner: ЦСКА");
                else
                    label2.setText("Winner: N/A");
            }
        });
        StackPane root = new StackPane();
        HBox hbox = new HBox(btn1, btn2);
        root.getChildren().addAll(hbox, label, label1, label2);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
