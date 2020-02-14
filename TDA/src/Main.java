import javax.swing.*;

public class Main {

    public static void main(String args[]){
        Figura figura= null;
        int respuesta= Integer.parseInt(JOptionPane.showInputDialog("Dame que figura tienes: 1)Cuadrado 2)Triángulo 3) Círculo"));
        switch (respuesta){
            case 1:
                int lado= Integer.parseInt(JOptionPane.showInputDialog("Dame el tamaño del lado"));
                figura = new Cuadrado(lado);
                break;
            case 3:
                int radio= Integer.parseInt(JOptionPane.showInputDialog("Dame el radio del círculo"));
                figura= new Circulo(radio);
                break;
        }
        JOptionPane.showMessageDialog(null,"El área es: "+figura.calcularArea()+"\n"+" y el perímetro es: "+figura.calcularPerimetro());
    }
}
