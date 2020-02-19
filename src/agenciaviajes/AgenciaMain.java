/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;


public class AgenciaMain {
    public static void main(String[] args) {
        Agencia a =new Agencia(LocalDate.MIN.now());
        Persona p1=new Persona("372u8382","pepe", "Fernandez");
        Persona p2=new Persona("382u8334","Manuel", "Cortes");
        Persona p3=new Persona("352u6392","pepe", "Hernandez");
        Persona p4=new Persona("332u8343","Jorge", "Bautista");
    a.addPersona(p1);
      a.addPersona(p2);
        a.addPersona(p3);
          a.addPersona(p4);
        Collections.sort(a.clientes);
          a.Mostrar();
    }
   
    
}
