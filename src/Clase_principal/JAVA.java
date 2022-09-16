/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_principal;
import java.util.Date;

import Clase_principal.DTO.*;
/**
 *
 * @author aldoo
 */
public class JAVA {
    public static void main(String[] args){
        
        int correlativo = 0;
  
        System.out.println("Ingresando producto");
        Registro_clubes_deportivos p = new Registro_clubes_deportivos();
        p.setNombre("Arsenal de Coquimbo");
        p.setLema("Cañones a los puertos");
        p.setValor_suscripcion(10050);
        p.setColores("Amarillo, Rojo");
        p.setCodigo(p.getNombre().toUpperCase().substring(0,2)+p.getDeporte().substring(0,1)+(++correlativo+10));
        System.out.println("Creado producto: "+ p.getNombre());
        System.out.println(p.getCodigo());
        
        System.out.println("Ingresando Equipo");
        Registro_clubes_deportivos a = new Registro_clubes_deportivos();
        a.setNombre("Manquehue City");
        a.setLema("Vivir y Fuerza");
        a.setValor_suscripcion(15100);
        a.setColores("Celeste, Blanco");
        a.setCodigo(a.getNombre().toUpperCase().substring(0,2)+a.getDeporte().substring(0,1)+(++correlativo+10));
        System.out.println(a.getCodigo());

        
        System.out.println("Creado producto: "+ a.getNombre());
        
        System.out.println("Ingresando producto");
        Registro_clubes_deportivos b = new Registro_clubes_deportivos();
        b.setNombre("Los Cóndores Unidos");
        b.setLema("Desde lo alto al sol");
        b.setValor_suscripcion(13200);
        b.setColores("Amarillo, Naranjo");
        b.setCodigo(b.getNombre().toUpperCase().substring(0,2)+b.getDeporte().substring(0,1)+(++correlativo+10));
        System.out.println(b.getCodigo());

        System.out.println("Creado producto: "+ a.getNombre());
        
        
        System.out.println("Creando Cliente");
        Registro_Usuario u = new Registro_Usuario();
        u.setId(correlativo+1000);
        u.setUsuario("dcog");
        u.setEmail("david.cogiolle@gmail.com");
        u.setFecha_nac(new Date(1996, 03, 29));
        u.setTelefono(12345678);
        u.setRut(20062248, '0');
        u.setNombre_completo("David Cogiolle");
        System.out.println(u.getFecha_nac());
        
        System.out.println("Creado cliente: "+ u.getUsuario());
        
        System.out.println("Creando Solicitud");
        Suscripcion_Usuario s = new Suscripcion_Usuario();
        s.setNumero(++correlativo);
        s.setUsuario(u);
        s.agregarEquipo(p);
        s.agregarEquipo(p);
        s.agregarEquipo(a);
        s.agregarEquipo(a);
        s.agregarEquipo(a);
        s.agregarEquipo(p);
        s.agregarEquipo(b);
        s.agregarEquipo(p);
        System.out.println("Solicitud Creada");
        System.out.println(s.toString());
        
        
    }
}
