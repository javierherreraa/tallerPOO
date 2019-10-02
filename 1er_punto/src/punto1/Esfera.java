package punto1;
import javax.swing.JOptionPane;

public class Esfera {
    
   
    double volumen;
    double area;
   

    double r;
    
//METODO LEE DATOS
    public void leerDatos(){
        
        
        r=Double.parseDouble(JOptionPane.showInputDialog("Digite el radio de la esfera: "));
        
    }
       
//METODO CALCULA AREA
     public void calculaArea(){
         
         area=(4*(Math.PI)*Math.pow(r, 2));
      
    }
     
//METODO CALCULA VOLUMEN    
     public void calculaVolumen(){
         
         volumen=(1.333333)*(Math.PI)*(Math.pow(r, 3));
        
     }
     
//METODO MUESTRA CALCULOS     
     public void mostrarCalculos(){
        
        JOptionPane.showMessageDialog(null, "El area de la esfera es: " +area);
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: " +volumen);
        
        
    }
    
}
