package ui;

import javafx.animation.TranslateTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.util.Duration;
import sample.Arista;
import sample.Nodo;

public class NodoUI<T extends Comparable<T>> extends StackPane {
    Nodo<T> nodo;
    public DoubleProperty centerX;
    public DoubleProperty centerY;
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

    /*
    public void animateRoot(double toX, double toY){
        TranslateTransition circle1Animation = new TranslateTransition(Duration.seconds(1), c);
        circle1Animation.setByY(toY);
        circle1Animation.setByX(toX);
        TranslateTransition text1Animation = new TranslateTransition(Duration.seconds(1), t);
        text1Animation.setByY(toY);
        text1Animation.setByX(toX);
        System.out.println("Setting center X "+ toX);
        this.centerX=new SimpleDoubleProperty(toX+50);
        System.out.println("Setting center Y "+ toY);
        this.centerY=new SimpleDoubleProperty(50);

        circle1Animation.setCycleCount(1);
        circle1Animation.play();
        text1Animation.setCycleCount(1);
        text1Animation.play();
    }
    */

    public void animate(double toX, double toY, Arista line, Pane gp){
        TranslateTransition circle1Animation = new TranslateTransition(Duration.seconds(1), this);
        circle1Animation.setByY(0);
        circle1Animation.setByX(gp.getWidth()/2-50);
        c.setCenterY(0);
        c.setCenterX(gp.getWidth()/2-50);
        circle1Animation.setCycleCount(1);
        circle1Animation.play();
        NodoUI nodo= this;
        circle1Animation.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TranslateTransition transition= new TranslateTransition(Duration.seconds(1),nodo);
                transition.setByY(nodo.getC().getCenterY()+100);
                transition.setByX(-60);
                nodo.centerX=new SimpleDoubleProperty(-60);
                nodo.centerY=new SimpleDoubleProperty(nodo.getC().getCenterY()+100);
                transition.setCycleCount(1);
                transition.play();
                transition.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println(line.getC1().centerX.doubleValue());
                        System.out.println(line.getC2().centerX.doubleValue());
                        System.out.println(line.getC1().centerY.doubleValue());
                        System.out.println(line.getC2().centerY.doubleValue());
                        line.setStartX(line.getC1().centerX.doubleValue());
                        line.setEndX(line.getC2().centerX.doubleValue());
                        line.setStartY(line.getC1().centerY.doubleValue());
                        line.setEndY(line.getC2().centerY.doubleValue());
                        gp.getChildren().add(line);
                    }
                });

            }
        });




    }


    public Nodo<T> getNodo() {
        return nodo;
    }

    public void setNodo(Nodo<T> nodo) {
        this.nodo = nodo;
    }
}
