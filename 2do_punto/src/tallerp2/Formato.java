
package tallerp2;

public class Formato {
    private int numV,cost;
    private String fecha,nombre,hora;


    
    public Formato(String nombre,String hora,String fecha,int cost,int numV){
        this.hora = hora;
        this.cost = cost;
        this.fecha = fecha;
        this.nombre = nombre;
        this.numV = numV;
    }

    
    public int getNumV() {
        return numV;
    }

    
    public void setNumV(int numV) {
        this.numV = numV;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFecha() {
        return fecha;
    }

    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
    
}
