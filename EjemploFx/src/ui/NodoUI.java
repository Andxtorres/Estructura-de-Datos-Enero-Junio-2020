package ui;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import sample.Nodo;

public class NodoUI<T extends Comparable<T>> extends StackPane {
    Nodo<T> nodo;

    public NodoUI(double centerX, double centerY, Nodo<T> nodo) {
        super();
        Circle circle= new Circle(centerX,centerY,20);
        Text text= new Text(nodo.getElemento().toString());
        text.setBoundsType(TextBoundsType.VISUAL);
        text.setFill(Color.WHITE);
        setLayoutX(centerX-20);
        setLayoutY(centerY-20);
        this.getChildren().addAll(circle,text);
        this.nodo = nodo;
    }

    public Nodo<T> getNodo() {
        return nodo;
    }

    public void setNodo(Nodo<T> nodo) {
        this.nodo = nodo;
    }
}
