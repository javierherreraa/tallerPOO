
package p3;

import javax.swing.JOptionPane;


public class Datos {
    public static void menu(){
        //creacion de varibles 
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog("Unidad de temperatura a  convertir\n1.Grados Celsius \n2.Grados Kelvin \n3.Grados Fahrenheit"));
        //crseacion de objetos
        cels c = new cels();
        Kelv k = new Kelv();
        Farh f = new Farh();
        switch (opc) {
            case 1:
                c.conver();
                break;
            case 2:
                k.conver();
                break;
            case 3:
                f.conver();
                break;
        }
    }
}
