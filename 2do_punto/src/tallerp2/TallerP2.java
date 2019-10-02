/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerp2;

import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class TallerP2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Formato c1= new Formato("Sebastian","20:10","23/02/19",12000,541);
        Formato c2= new Formato("Carlos","14:20","28/03/19",12000,542);
        Formato c3= new Formato("Pedro","16:35","15/08/19",12000,543);
        
        int totc;
        totc=c1.getCost()+c2.getCost()+c3.getCost();
        JOptionPane.showMessageDialog(null,"El total de Costo de los tiquetes es: "+totc);
        
    }
    
}   

//class DosDimensiones{
//    private double base;
//    private double altura;
//    //Métodos de acceso para base y altura
//    double getBase(){return base;}
//    double getAltura(){return altura;}
//    void setBase(double b){base=b;}
//    void setAltura (double h){altura=h;}
//    void mostrarDimension(){
//        System.out.println("La base y altura es: "+base+" y "+altura);
//    }
//}
////Una subclase de DosDimensiones para Triangulo
//class Triangulo extends DosDimensiones{
//    String estilo;
//    double area(){
//        return getBase()*getAltura()/2;
//    }
//    void mostrarEstilo(){
//        System.out.println("Triangulo es: "+estilo);
//    }
//}
//class Lados3{
//    public static void main(String[] args) {
//        Triangulo t1=new Triangulo();
//        Triangulo t2=new Triangulo();
//        t1.setBase(4.0);
//        t1.setAltura(4.0);
//        t1.estilo="Estilo 1";
//        t2.setBase(8.0);
//        t2.setAltura(12.0);
//        t2.estilo="Estilo 2";
//        System.out.println("Información para T1: ");
//        t1.mostrarEstilo();
//        t1.mostrarDimension();
//        System.out.println("Su área es: "+t1.area());
//        System.out.println();
//        System.out.println("Información para T2: ");
//        t2.mostrarEstilo();
//        t2.mostrarDimension();
//        System.out.println("Su área es: "+t2.area());
//    }
//}
//Salida:

//public static void main(String[] args) {
//        // TODO code application logic here
//    }