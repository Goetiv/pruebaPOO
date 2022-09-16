/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_principal.DTO;

/**
 *
 * @author aldoo
 */
public class Suscripcion_Usuario {
       private int numero;
       private Registro_Usuario Usuario;
       private int Abonototal;
       private String Equipos;
       
        public Suscripcion_Usuario(){
            this.numero = 0;
            this.Usuario = new Registro_Usuario();
            this.Abonototal = 0;
            this.Equipos = "";
        }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Registro_Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Registro_Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public int getAbonototal() {
        return Abonototal;
    }

    public void setAbonototal(int Abonototal) {
        this.Abonototal = Abonototal;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }
    
    public void agregarEquipo(Registro_clubes_deportivos p){
        if(!this.Equipos.equals("")){
            this.Equipos += "";
        }
        this.Equipos += p.toString();
        this.Abonototal += p.getValor_suscripcion();
    }
    
    @Override
    public String toString(){
        // Un método que permite ver el detalle del pedido del cliente
        StringBuilder sb = new StringBuilder();
        sb.append("============\n");
        sb.append("Venta N°");
        sb.append(this.numero);
        sb.append("\nTotal: $");
        sb.append(this.Abonototal);
        sb.append("\n============\n");
        sb.append("Cliente: ");
        sb.append(this.Usuario.getUsuario());
        sb.append("\n============\n");
        sb.append(this.Equipos);
        
        return sb.toString();
    }
        
}
