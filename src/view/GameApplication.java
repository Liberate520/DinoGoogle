package view;

import controllers.MyEventHandler;
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventDispatchChain;
import javafx.event.EventDispatcher;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class GameApplication extends Application {
    GraphicsContext context;

    @Override
    public void start(Stage stage) throws Exception {
        Canvas canvas = new Canvas(800, 600);
        context = canvas.getGraphicsContext2D();
        Button button = new Button("test");
        button.setOpacity(0);

        Group root = new Group();
        root.setEventDispatcher(new MyEventHandler());
        root.getChildren().add(canvas);
        root.getChildren().add(button);
        Scene scene = new Scene(root,800, 600);
        draw();

        stage.setTitle("My game");
        stage.setScene(scene);
        stage.show();
    }

    public void createGame(String[] args){
        launch(args);
    }

    public void draw(){

    }
}
