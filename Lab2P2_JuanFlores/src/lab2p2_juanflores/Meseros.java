/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_juanflores;


public class Meseros {
    private String nombre;
    private int edad;
    private String turno;
    private double sueldo;
    private int propina;
    
    public Meseros(){
        
    }
    
    
  public Meseros(String nombre, int edad, String turno, double sueldo, int propina){
      this.nombre=nombre;
      this.edad=edad;
      this.turno=turno;
      this.sueldo=sueldo;
      this.propina=propina;
      
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }
    
    
}
