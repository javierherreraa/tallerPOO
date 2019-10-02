
package p3;

import javax.swing.JOptionPane;

public class cels implements Itemp {
    
    //se implementa el metodo conversor de la interface ITemperatura
    public void conver() {
        double k, f, c;
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite grados celsius"));
        k = c + 273.15;
        f = ((9 * c) / 5) + 32;
        JOptionPane.showMessageDialog(null, "Celsius: "+c+"\nkelvin: "+k+"\nFahrenheit: "+f);
    }

}
