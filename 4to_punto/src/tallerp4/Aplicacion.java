/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerp4;


import javax.swing.JOptionPane;

public class Aplicacion  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Acuaticos m1 = new Acuaticos();
        Voladores r1 = new Voladores();
        Terrestres a1 = new Terrestres();
        a1.color = JOptionPane.showInputDialog("Color");
        a1.patas = JOptionPane.showInputDialog("Patas");
        a1.cuernos = JOptionPane.showInputDialog("Cuernos");
        a1.garras = JOptionPane.showInputDialog("Garras");
        a1.comida = JOptionPane.showInputDialog("Comida");
        a1.tamaño = JOptionPane.showInputDialog("Tamaño");
        a1.alt = Integer.parseInt(JOptionPane.showInputDialog("digite la altura"));
        a1.lar = Integer.parseInt(JOptionPane.showInputDialog("digite el largo"));
        a1.pesD = Integer.parseInt(JOptionPane.showInputDialog("digite el peso del dinosaurio"));
        a1.pesC = Integer.parseInt(JOptionPane.showInputDialog("digite el peso del coche"));
        JOptionPane.showMessageDialog(null, "Color: " + a1.color + "\nPatas: " + a1.patas + "\nCuernos: " + a1.cuernos + "\nTipo de Garras: " + a1.garras + "\nTipo de Comida: " + a1.comida + "\nTamaño:" + a1.tamaño);
        a1.Tallaje();
        a1.Totcarros();
        r1.color = JOptionPane.showInputDialog("Color");
        r1.patas = JOptionPane.showInputDialog("Patas");
        r1.cuernos = JOptionPane.showInputDialog("Cuernos");
        r1.alas = JOptionPane.showInputDialog("Alas");
        r1.reptan = JOptionPane.showInputDialog("Reptan?Si/No");
        r1.tPico = JOptionPane.showInputDialog("Tipo de Pico");
        r1.alt = Integer.parseInt(JOptionPane.showInputDialog("digite la altura"));
        r1.lar = Integer.parseInt(JOptionPane.showInputDialog("digite el largo"));
        r1.pesD = Integer.parseInt(JOptionPane.showInputDialog("digite el peso del dinosaurio"));
        r1.pesC = Integer.parseInt(JOptionPane.showInputDialog("digite el peso del coche"));
        JOptionPane.showMessageDialog(null, "Color: " + r1.color + "\nPatas: " + r1.patas + "\nCuernos: " + r1.cuernos + "\nTipo de Alas: " + r1.alas + "\nReptan: " + r1.reptan + "\nTipo de Pico:" + r1.tPico);
        r1.Tallaje();
        r1.Totcarros();
        m1.color = JOptionPane.showInputDialog("Color");
        m1.patas = JOptionPane.showInputDialog("Patas");
        m1.cuernos = JOptionPane.showInputDialog("Cuernos");
        m1.dentadura = JOptionPane.showInputDialog("Tipo de Dentadura");
        m1.vista = JOptionPane.showInputDialog("Tipo de Vista");
        m1.aletas = JOptionPane.showInputDialog("Tipo de Aletas");
        m1.alt = Integer.parseInt(JOptionPane.showInputDialog("digite la altura"));
        m1.lar = Integer.parseInt(JOptionPane.showInputDialog("digite el largo"));
        m1.pesD = Integer.parseInt(JOptionPane.showInputDialog("digite el peso del dinosaurio"));
        m1.pesC = Integer.parseInt(JOptionPane.showInputDialog("digite el peso del coche"));

        JOptionPane.showMessageDialog(null, "Color: " + m1.color + "\nPatas: " + m1.patas + "\nCuernos: " + m1.cuernos + "\nTipo de Dentadura: " + m1.dentadura + "\nTipo de Vista: " + m1.vista + "\nTipo de Aletas:" + m1.aletas);
        m1.Tallaje();
        m1.Totcarros();

        // TODO code application logic here
    }

}
