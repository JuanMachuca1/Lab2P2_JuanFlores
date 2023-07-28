/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_juanflores;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2P2_JuanFlores {

    static Scanner leer = new Scanner (System.in);
    static Scanner leer2 = new Scanner (System.in);
    
        public static void main(String[] args) {
            //chefs  meseros  bartenders   mesas
            ArrayList chefs = new ArrayList();
            ArrayList meseros = new ArrayList();
            ArrayList bartenders = new ArrayList();
            ArrayList mesas = new ArrayList();
            
        boolean menu = true;
        
            while (menu) {                
                System.out.println("""
                                   M E N U
                                1. Inicio de Sesión 
                                2. Salir
                                 Ingrese una opcion:
                                   """);
                int opcion = leer.nextInt();
                
                
                switch (opcion) {
                    case 1:
                        String usuarioGerente="gerente";
                        String ContraGerente="g3r$nt0";
                        System.out.println("Ingrese usuario: ");
                        String usuario = leer2.nextLine();
                        
                        System.out.println("Ingrese la contraseña");
                        String contraseña = leer2.nextLine();
                        
                        
                        while(!ContraGerente.equals(contraseña) || !usuarioGerente.equals(usuario)){
                            System.out.println("Usuario o contraseña incorrecta, vuelva a intentar ");
                            System.out.println("");
                            System.out.println("Ingrese usuario: ");
                             usuario = leer2.nextLine();
                        
                        System.out.println("Ingrese la contraseña");
                             contraseña = leer2.nextLine();
                        }
                        
                        boolean menu2 = true;
                        while(menu2){
                         System.out.println("""
                                           M E N U  R E S T A U R A N T E 
                                        1. Menu de Chefs
                                        2. Menu de Meseros
                                        3. Menu de Bartenders
                                        4. Menu de Mesas
                                        5.Salir al Menu Inicio
                                        Ingrese una opcion:
                                           """);
                        int opcionR= leer.nextInt();
                        switch (opcionR) {
                            case 1:
                            {
                             boolean menu1=true;
                             
                             menu_chefs();
                             int opcionmenu1 = leer.nextInt();
                             
                                switch (opcionmenu1) {
                                    case 1:
                                        //crear chef
                                     String nombre;
                                     int edad;
                                     String turno;
                                     int Estrellas;
                                     double sueldo;
                                     
                                        System.out.println("Ingrese el nombre del chef: ");
                                        nombre= leer2.nextLine();
                                    
                                        System.out.println("Ingrese la edad del chef: ");
                                        edad=leer.nextInt();
                                        
                                        while(edad<0){
                                            System.out.println("Ingrese una edad mayor a 0: ");
                                            edad=leer.nextInt();
                                        }
                                        System.out.println("Ingrese el turno del chef [matutino/vespertino]: ");
                                        turno=leer2.nextLine();
                                        String turno1="matutino";
                                        String turno2="vespertino";
                                        while(!turno1.equalsIgnoreCase(turno) && !turno2.equals(turno)){
                                        
                                        System.out.println("Ingrese correctamente el turno [vespertino/matutino]: ");
                                        turno = leer2.nextLine();                                        
                                      }
                                        System.out.println("Ingrese el numero de estrellas michelin del chef: ");
                                        Estrellas=leer.nextInt();
                                        
                                        System.out.println("Ingrese el sueldo del chef: ");
                                        sueldo=leer.nextDouble();
                                        
                                        chefs.add(new Chefs(nombre, edad,turno, Estrellas, sueldo));
                                        System.out.println("Chef agredado exitosamente");
                                        break;
                                        
                                    case 2: 
                                        //Modificar un chef
                                        System.out.println("ingrese la posicion del chef a modificar");
                                        int posi=leer.nextInt();
                                        
                                        if (posi>=0&&posi<chefs.size()){
                                            if(chefs.get(posi) instanceof Chefs){
                                               System.out.println("Ingrese el nombre del chef: ");
                                                 nombre= leer2.nextLine();
                                                ((Chefs)chefs.get(posi)).setNombre(nombre); 
                                                 
                                                System.out.println("Ingrese la edad del chef: ");
                                                edad=leer.nextInt();

                                                while(edad<0){
                                                    System.out.println("Ingrese una edad mayor a 0: ");
                                                    edad=leer.nextInt();
                                                }
                                                ((Chefs)chefs.get(posi)).setEdad(edad); 
                                                
                                                System.out.println("Ingrese el turno del chef [matutino/vespertino]: ");
                                                turno=leer2.nextLine();
                                                
                                                 turno1="matutino";
                                                 turno2="vespertino";
                                                
                                                while(!turno1.equalsIgnoreCase(turno) && !turno2.equalsIgnoreCase(turno)){

                                                System.out.println("Ingrese correctamente el turno [vespertino/matutino]: ");
                                                turno = leer2.nextLine();                                        
                                              }
                                                ((Chefs)chefs.get(posi)).setTurno(turno);
                                                
                                                System.out.println("Ingrese el numero de estrellas michelin del chef: ");
                                                Estrellas=leer.nextInt();
                                                
                                               ((Chefs)chefs.get(posi)).setEstrellasM(Estrellas); 
                                               
                                                System.out.println("Ingrese el sueldo del chef: ");
                                                sueldo=leer.nextDouble();
                                                ((Chefs)chefs.get(posi)).setSueldo(sueldo); 

                                                
                                                System.out.println("Chef modificado exitosamente");  
                                                    }else{
                                                    System.out.println("esto no es un chef");   
                                                    }
                                        }else{
                                            System.out.println("posicion fuera de rango");
                                        }
                                        
                                        break;
                                    case 3:
                                        //eliminar un chef
                                        listaCH(chefs);
                                        
                                        System.out.println("Ingrese la posicion del chef a eliminar: ");
                                        int pos=leer.nextInt();
                                        
                                        chefs.remove(pos);
                                        
                                        System.out.println("chef eliminado correctamente");
                                        break;
                                    case 4:
                                        //listar chefs
                                        
                                        listaCH(chefs);
                                        break;
                                    case 5:
                                        menu1=false;
                                        break;
                                        
                                    default:
                                        System.out.println("opcion invalida");
                                        break;
                                 }
                             
                            }
                              break;
                            case 2:
                            {
                              menu_meseros();
                              
                               boolean menuu2=true;
                             
                             menu_chefs();
                             int opcionmenu2 = leer.nextInt();
                             
                                switch (opcionmenu2) {
                                    case 1:
                                        
                                        break;
                                    case 2: 
                                        
                                        break;
                                    case 3:
                                        
                                        break;
                                    case 4:
                                        
                                        break;
                                    case 5:
                                        menuu2=false;
                                        break;
                                        
                                    default:
                                        System.out.println("opcion invalida");
                                        break;
                                 }
                            }      
                               break;
                            case 3:
                            {
                             menu_Bartenders();
                             
                              boolean menu3=true;
                             
                             
                             int opcionmenu3 = leer.nextInt();
                             
                                switch (opcionmenu3) {
                                    case 1:
                                     
                                        
                                        break;
                                    case 2: 
                                    
                                        
                                        break;
                                    case 3:
                                    
                                        
                                        break;
                                    case 4:
                                    
                                        
                                        break;
                                    case 5:
                                        menu3=false;
                                        break;
                                        
                                    default:
                                        System.out.println("opcion invalida");
                                        break;
                                 }
                            }
                                break;
                            case 4:
                            {
                             menu_Mesas();
                             
                              boolean menu4=true;
                             
                             menu_chefs();
                             int opcionmenu4 = leer.nextInt();
                             
                                switch (opcionmenu4) {
                                    case 1:
                                        
                                        break;
                                    case 2: 
                                        
                                        break;
                                    case 3:
                                        
                                        break;
                                    case 4:
                                        
                                        break;
                                    case 5:
                                        menu4=false;
                                        break;
                                        
                                    default:
                                        System.out.println("opcion invalida");
                                        break;
                                 }
                            }
                                break;
                            case 5:
                                menu2=false;
                                
                                break;
                            default:
                                System.out.println("opcion invalida ");
                                break;
                        }   
                        }
                        
                        
                        break;
                    case 2:
                        menu=false;
                        break;
                    default:
                       System.out.println("Opcion Invalida");
                       break;
                }
       }
    } 
 public static void menu_chefs(){
     
     System.out.println("""
                        M E N U  C H E F S
                        1.Crear un chef
                        2.Modificar un chef
                        3.Eliminar un chef
                        4.Listar chefs
                        5.Salir al Menu Restaurante
                        """);
 }
 
  public static void menu_meseros(){
     
     System.out.println("""
                        M E N U  C H E F S
                        1.Crear un mesero
                        2.Modificar un mesero
                        3.Eliminar un mesero
                        4.Listar meseros
                        5.Salir al Menu Restaurante
                        """);
 }
  
  public static void menu_Bartenders(){
     
     System.out.println("""
                        M E N U  C H E F S
                        1.Crear un Bartender
                        2.Modificar un Bartender
                        3.Eliminar un Bartender
                        4.Listar Bartenders
                        5.Salir al Menu Restaurante
                        """);
 }
  
  public static void menu_Mesas(){
     
     System.out.println("""
                        M E N U  C H E F S
                        1.Crear una mesa
                        2.Modificar una mesa
                        3.Eliminar una mesa
                        4.Listar chefs
                        5.Salir al Menu Restaurante
                        """);
 }

  
  
  
 public static String listaCH(ArrayList chefs) {
        String salida = "";
        for (Object cosa : chefs) {
            if (cosa instanceof Chefs) {
                salida += chefs.indexOf(cosa) + "- " + cosa + "\n";
            }

        }
        return salida;
    }
  
}


