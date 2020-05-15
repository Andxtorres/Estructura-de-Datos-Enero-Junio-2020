package sample;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Arista extends Line {

    public Arista(Circle c1, Circle c2) {
        super();
        this.c1 = c1;
        this.c2 = c2;
    }

    private Circle c1;
    private Circle c2;

    public Circle getC1() {
        return c1;
    }

    public void setC1(Circle c1) {
        this.c1 = c1;
    }

    public Circle getC2() {
        return c2;
    }

    public void setC2(Circle c2) {
        this.c2 = c2;
    }
}
