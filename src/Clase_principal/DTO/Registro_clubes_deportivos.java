
package Clase_principal.DTO;

public class Registro_clubes_deportivos {
       private String codigo;
       private String nombre; 
       private String Lema;
       private int Valor_suscripcion; 
       private String colores; 
       private String deporte;
       private float cantidad;
       
       
       public Registro_clubes_deportivos(){
           this.codigo = "";
           this.Lema = "";
           this.colores ="";
           this.Valor_suscripcion = 0;
           this.nombre = "";
           this.deporte="Handball";
           this.cantidad=0f;
       }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public int getValor_suscripcion() {
        return Valor_suscripcion;
    }

    public void setValor_suscripcion(int Valor_suscripcion) {
        this.Valor_suscripcion = Valor_suscripcion;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }
      
        public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    
    @Override
    public String toString(){
        return this.nombre + " $" + this.Valor_suscripcion +
                " " + this.cantidad+"\n";
    }
       
}
