/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanflores;




public class Chefs {
    private String nombre;
    private int edad;
    private String turno;
    private int estrellasM;
    private double sueldo;
    
  
public Chefs(){
    
}

public Chefs(String nombre, int edad,String turno, int estrellasM, double sueldo){
    
    this.nombre=nombre;
    this.edad=edad;
    this.turno=turno;
    this.estrellasM=edad;
    this.sueldo=sueldo;
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

    public int getEstrellasM() {
        return estrellasM;
    }

    public void setEstrellasM(int estrellasM) {
        this.estrellasM = estrellasM;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        
        return "El chef: "+nombre+" con edad: "+edad+ ", que tiene turno "+turno+", cuenta con: "+estrellasM+ "y su sueldo es: "+sueldo;
    }
}
