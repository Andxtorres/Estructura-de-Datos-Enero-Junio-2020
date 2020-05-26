package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ui.NodoUI;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        List<NodoUI> nodoList= new ArrayList<>();

        primaryStage.setTitle("Hello World");
        Pane gp = new Pane();
        BorderPane bp= new BorderPane();
        VBox vbox = new VBox();
        TextField textField = new TextField();
        Label label= new Label("Ingresa un número");
        Button button = new Button("Agregar");

        button.setOnAction(e ->{
            if(nodoList.size()==0){
                Nodo<String> nodo= new Nodo<>(textField.getText());
                NodoUI<String> nodoUi=new NodoUI<>(50,50,nodo);
                gp.getChildren().add(nodoUi);
                nodoUi.animateRoot(gp.getWidth()/2-50,0);
                nodoList.add(nodoUi);
            }else{
                Nodo<String> nodo= new Nodo<>(textField.getText());
                NodoUI<String> nodoUi=new NodoUI<>(50,50,nodo);
                gp.getChildren().add(nodoUi);
                Arista a= new Arista(nodoList.get(0),nodoUi);
                nodoUi.animate(gp.getWidth()/2-50,0,a,gp);
            }

        });


        vbox.getChildren().addAll(label,textField,button);
        bp.setLeft(vbox);
        bp.setCenter(gp);
        /*
        Nodo<Integer> nodo= new Nodo<>(1);
        NodoUI<Integer> nodoUi=new NodoUI<>(50,50,nodo);
        gp.getChildren().add(nodoUi);
        Nodo<Integer> nodo2= new Nodo<>(2);
        NodoUI<Integer> nodoUi2=new NodoUI<>(100,100,nodo2);
        Arista a= new Arista(nodoUi.getC(),nodoUi2.getC());
        gp.getChildren().add(a);
        gp.getChildren().add(nodoUi2);
        */
        primaryStage.setScene(new Scene(bp,1000,1000));
        primaryStage.show();
        //nodoUi.animate(200,200,a);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
