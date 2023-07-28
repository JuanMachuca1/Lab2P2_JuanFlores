/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanflores;


public class Bartenders {
    private String nombre;
    private int edad;
    private String turno;
    private int licores;
    
    
    public Bartenders(){
        
    }
    public Bartenders(String nombre, int edad, String turno, int licores){
        this.nombre=nombre;
        this.edad=edad;
        this.turno=turno;
        this.licores=licores;
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getLicores() {
        return licores;
    }

    public void setLicores(int licores) {
        this.licores = licores;
    }
    
    
    
}
