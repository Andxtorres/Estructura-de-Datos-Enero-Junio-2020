package ui;

import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.util.Duration;
import sample.Arista;
import sample.Nodo;

public class NodoUI<T extends Comparable<T>> extends StackPane {
    Nodo<T> nodo;
    DoubleProperty centerX;
    DoubleProperty centerY;
    Circle c;
    Text t;

    public Circle getC() {
        return c;
    }

    public NodoUI(double centerX, double centerY, Nodo<T> nodo) {
        super();
        Circle circle= new Circle(centerX,centerY,20);
        this.c=circle;
        this.centerX=new SimpleDoubleProperty(centerX);
        this.centerY=new SimpleDoubleProperty(centerY);
        Text text= new Text(nodo.getElemento().toString());
        this.t=text;
        text.setBoundsType(TextBoundsType.VISUAL);
        text.setFill(Color.WHITE);
        setLayoutX(centerX-20);
        setLayoutY(centerY-20);
        this.getChildren().addAll(circle,text);
        this.nodo = nodo;
    }

    public void animate(double toX, double toY, Arista line){
        TranslateTransition circle1Animation = new TranslateTransition(Duration.seconds(1), c);
        circle1Animation.setByY(toY);
        circle1Animation.setByX(toX);
        TranslateTransition text1Animation = new TranslateTransition(Duration.seconds(1), t);
        text1Animation.setByY(toY);
        text1Animation.setByX(toX);
        TranslateTransition circle1Animation2 = new TranslateTransition(Duration.seconds(1), line.getC2());
        circle1Animation2.setByY(toY+50);
        circle1Animation2.setByX(toX+50);
        centerX.bind(c.centerXProperty());
        centerY.bind(c.centerYProperty());
        line.startXProperty().bind(line.getC1().centerXProperty().add(line.getC1().translateXProperty()));
        line.startYProperty().bind(line.getC1().centerYProperty().add(line.getC1().translateYProperty()));
        line.endXProperty().bind(line.getC2().centerXProperty().add(line.getC2().translateXProperty()));
        line.endYProperty().bind(line.getC2().centerYProperty().add(line.getC2().translateYProperty()));
        circle1Animation.setCycleCount(1);
        circle1Animation.play();
        circle1Animation2.setCycleCount(1);
        circle1Animation2.play();
        text1Animation.setCycleCount(1);
        text1Animation.play();
    }


    public Nodo<T> getNodo() {
        return nodo;
    }

    public void setNodo(Nodo<T> nodo) {
        this.nodo = nodo;
    }
}
