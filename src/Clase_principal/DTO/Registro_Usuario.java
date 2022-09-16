
package Clase_principal.DTO;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;

public class Registro_Usuario {
       private int id;
       private String nombre_completo;
       private int rut;
       private String dv;
       private Date fecha_nac;
       private int telefono;
       private String usuario;
       private String email;
       private String contraseña; 
       
       
         
       public Registro_Usuario(){
           this.id = 0;
           this.nombre_completo="";
           this.rut=0;
           this.dv="";
           this.fecha_nac=new Date();
           this.telefono=0;
           this.usuario = "";
           this.email = "";
           this.contraseña = "";
       }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if(usuario.length() > 3){
        this.usuario = usuario;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@") && (email.contains(".com") || email.contains(".cl")) ){
        this.email = email;
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        char ch;
        boolean capitalFlag = false;
        boolean numberFlag = false;
        
        for(int i=0;i < contraseña.length();i++) {
        ch = contraseña.charAt(i);
        if( Character.isDigit(ch)) {
            numberFlag = true;
        }
        else if (Character.isUpperCase(ch)) {
            capitalFlag = true;
        }
        if(capitalFlag && numberFlag && contraseña.length() > 5){
            this.contraseña = contraseña;
        }
    }
        
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut, char dv) {
        if(this.validarRut(rut, dv)){
        this.rut = rut;
        }
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(fecha_nac.getYear(),fecha_nac.getMonth(),fecha_nac.getDay());
        
        Period periodo = Period.between(birthday, today);
        if(periodo.getYears()>17){
        this.fecha_nac = fecha_nac;
        }
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if(Integer.toString(telefono).substring(0,2)=="56" && Integer.toString(telefono).length()>7){
        this.telefono = telefono;
        }
    }
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    
    
    
}
