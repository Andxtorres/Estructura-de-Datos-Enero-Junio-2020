package sample;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import ui.NodoUI;

public class Arista extends Line {

    public Arista(NodoUI c1, NodoUI c2) {
        super();
        this.c1 = c1;
        this.c2 = c2;
    }

    private NodoUI c1;
    private NodoUI c2;

    public NodoUI getC1() {
        return c1;
    }

    public void setC1(NodoUI c1) {
        this.c1 = c1;
    }

    public NodoUI getC2() {
        return c2;
    }

    public void setC2(NodoUI c2) {
        this.c2 = c2;
    }
}
