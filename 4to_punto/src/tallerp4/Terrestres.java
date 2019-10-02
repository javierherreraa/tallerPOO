/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerp4;

import javax.swing.JOptionPane;


public class Terrestres extends Dinos implements peso{

    /**
     *
     */
    public String garras;
   public String comida;
   public String tamaño;
   public void Tallaje(){
       tall=alt/lar;
       JOptionPane.showMessageDialog(null,"Tallaje:"+tall);
   }
   public void Totcarros(){
       totcar=pesD/pesC;
        JOptionPane.showMessageDialog(null,"Peso en Autos Compactos:"+totcar);
    }

    @Override
    public int totcar(int pesD, int pesC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
