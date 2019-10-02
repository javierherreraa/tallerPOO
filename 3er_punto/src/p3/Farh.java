
package p3;

import javax.swing.JOptionPane;


public class Farh implements Itemp{
    
    //se implementa el metodo conversor de la interface ITemperatura
    public void conver() {
        double k, f, c;
        f = Double.parseDouble(JOptionPane.showInputDialog("Digite grados fahrenheit"));
        c = (5*(f-32))/9;
        k = ((5*(f-32))/9)+273.15;
        JOptionPane.showMessageDialog(null, "Grados Fahrenheit: "+f+"\nGrados Celsius: "+c+"\nGrados kelvin: "+k);
    }
    
}
