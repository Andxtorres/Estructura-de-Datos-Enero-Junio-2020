package sample;

import javafx.animation.TranslateTransition;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import ui.NodoUI;

import java.util.List;

public class ListaDeNodos {

    private List<NodoUI> lista;
    private Pane gp;
    private int currentIndex=0;

    public ListaDeNodos(List<NodoUI> lista,Pane gp) {
        this.lista = lista;
        this.gp=gp;
    }

    public void agregarNodo(NodoUI nodoUI){
        lista.add(nodoUI);
        gp.getChildren().add(nodoUI);
        animar(nodoUI);
    }

    public void animar(NodoUI nodoUI) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), nodoUI);
        transition.setByY(lista.get(currentIndex).centerY.doubleValue());
        transition.setCycleCount(1);
        transition.play();
        currentIndex=0;
        transition.setOnFinished(new MyEventHandler(currentIndex, nodoUI));

    }

    public void animarRec(NodoUI nodoUI) {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), nodoUI);
        transition.setByY(lista.get(currentIndex).centerY.doubleValue());
        transition.setCycleCount(1);
        transition.play();
        transition.setOnFinished(new MyEventHandler(currentIndex, nodoUI));

    }
    class MyEventHandler implements EventHandler<ActionEvent>{

        int pos;
        NodoUI nodoUI;

        public MyEventHandler(int pos,NodoUI nodoUI) {
            this.pos = pos;
            this.nodoUI=nodoUI;
        }

        @Override
        public void handle(ActionEvent event) {
            System.out.println(pos);
            TranslateTransition transition= new TranslateTransition(Duration.seconds(1),nodoUI);
            nodoUI.centerY=new SimpleDoubleProperty(lista.get(pos).centerY.doubleValue());
            transition.setByY(nodoUI.centerY.doubleValue());

            System.out.println("Center y:"+nodoUI.centerY);
            transition.setCycleCount(1);

            transition.play();
            currentIndex++;
            if(currentIndex<lista.size()){
                animarRec(nodoUI);
            }
        }
    }


}
