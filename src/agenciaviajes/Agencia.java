
package agenciaviajes;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;


public class Agencia   {
private  LocalDate fecha;
ArrayList<Persona> clientes=new ArrayList<>();
 private static int codigoViaje=10000;

    public Agencia(LocalDate fecha) {
        this.fecha = fecha;
        codigoViaje++;
    }
    
    public boolean addPersona(Persona p){
        boolean result=false;
        if(p!=null && !clientes.contains(p)){
            clientes.add(p);
        }
        
     return result;
        
    }
    public void Mostrar(){
      
       for (Persona p:clientes){
           System.out.println(p);
       }
        
    }
  
    //este metodo no se como lo he hecho :)
    public void Mostrar2(){
        clientes.sort((Comparator<? super Persona>) clientes);
        clientes.forEach((p) -> {
            System.out.println(p);
    });
    }
    
    public boolean DeletePersona(Persona p){
        boolean result=false;
        if(p!=null && clientes.contains(p)){
            clientes.remove(p);
            result=true;
        }
        
        
        
        return result;
    }
    
    public boolean SearchPersona(Persona p){
        boolean result=false;
       
        Iterator<Persona> i = clientes.iterator();
        while (i.hasNext() && !result){
          result=i.next().getDNI().equals(p);
          
        }
        
        
        
        
        return result;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList clientes) {
        this.clientes = clientes;
    }

    public static int getCodigoViaje() {
        return codigoViaje;
    }

    public static void setCodigoViaje(int codigoViaje) {
        Agencia.codigoViaje = codigoViaje;
    }

    @Override
    public String toString() {
        return "Agencia{" + "fecha=" + fecha + ", clientes=" + clientes + '}';
    }

   
    
}
