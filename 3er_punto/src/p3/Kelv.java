
package p3;

import javax.swing.JOptionPane;


public class Kelv implements Itemp{
    //se implementa el metodo conversor de la interface ITemperatura
    public void conver() {
        double k, f, c;
        k = Double.parseDouble(JOptionPane.showInputDialog("Digite grados kelvin"));
        c = k - 273.15;
        f = ((9*(k-273.15)) / 5) + 32;
        JOptionPane.showMessageDialog(null, "kelvin: "+k+"\nCelsius: "+c+"\nFahrenheit: "+f);
    }
    
}
