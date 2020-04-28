package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import ui.NodoUI;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        Pane gp = new Pane();
        Nodo<Integer> nodo= new Nodo<>(1);
        NodoUI<Integer> nodoUi=new NodoUI<>(50,50,nodo);
        gp.getChildren().add(nodoUi);
        Nodo<Integer> nodo2= new Nodo<>(2);
        NodoUI<Integer> nodoUi2=new NodoUI<>(100,100,nodo2);
        Line line= new Line(50,50,100,100);
        gp.getChildren().add(line);
        gp.getChildren().add(nodoUi2);
        primaryStage.setScene(new Scene(gp,1000,1000));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
