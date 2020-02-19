
package agenciaviajes;

import java.util.Objects;

enum sexo{
    v,
    m
}
public class Persona implements Comparable <Persona> {
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private int edad;
    private sexo genero;

    public Persona() {
    }

    public Persona(String DNI, String Nombre, String Apellidos, int edad, sexo genero) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona(String DNI, String Nombre, String Apellidos) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }
    
    

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public sexo getGenero() {
        return genero;
    }

    public void setGenero(sexo genero) {
        this.genero = genero;
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Apellidos, other.Apellidos)) {
            return false;
        }
        return true;
    }

   

   
    

  
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", edad=" + edad + ", genero=" + genero + '}';
    }

    @Override
    public int compareTo(Persona p) {
        int result=0;
         if (this.getNombre().equals(p.getNombre())==false){
             result= this.getNombre().compareTo(p.getNombre());
        }if (this.getNombre().equals(p.getNombre())==true && this.getApellidos().equals(p.getApellidos())==false){
            result= this.getApellidos().compareTo(p.getApellidos());
        }if(this.getNombre().equals(p.getNombre())==true && this.getApellidos().equals(p.getApellidos())==true && 
                this.getDNI().equals(p.getDNI())==false ){
            result= this.getDNI().compareTo(p.getDNI());
        }return result;
    }
    
}
