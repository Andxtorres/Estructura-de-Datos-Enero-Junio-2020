package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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
        Arista a= new Arista(nodoUi.getC(),nodoUi2.getC());
        gp.getChildren().add(a);
        gp.getChildren().add(nodoUi2);
        primaryStage.setScene(new Scene(gp,1000,1000));

        primaryStage.show();
        nodoUi.animate(200,200,a);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
