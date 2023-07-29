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
                                     if(chefs.size()>14){
                                         System.out.println("No se puede ingresar mas chefs.");
                                         break;
                                     }
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
                                        for (Object chef : chefs) {
                                            System.out.println(chefs.indexOf(chef)+"- " +chef);
                                        }
                                        
                                        System.out.println("Ingrese la posicion del chef a eliminar: ");
                                        int pos=leer.nextInt();
                                        
                                        while(pos<=0&&pos>chefs.size()){
                                           System.out.println("Ingrese la posicion del chef a eliminar: ");
                                         pos=leer.nextInt(); 
                                        }
                                        chefs.remove(pos);
                                        
                                        System.out.println("chef eliminado correctamente");
                                        break;
                                    case 4:
                                        //listar chefs
                                        
                                        for (Object chef : chefs) {
                                            System.out.println(chefs.indexOf(chef)+"- " +chef);
                                        }
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
                             
                             
                             int opcionmenu2 = leer.nextInt();
                             
                                switch (opcionmenu2) {
                                    case 1:
                                     String nombre;
                                     int edad;
                                     String turno;
                                     double sueldo;
                                     int propina;
                                             
                                     if(meseros.size()>8){
                                         System.out.println("No se puede ingresar mas meseros.");
                                         break;
                                     }
                                        System.out.println("Ingrese el nombre del mesero: ");
                                        nombre= leer2.nextLine();
                                    
                                        System.out.println("Ingrese la edad del mesero: ");
                                        edad=leer.nextInt();
                                        
                                        while(edad<0){
                                            System.out.println("Ingrese una edad mayor a 0: ");
                                            edad=leer.nextInt();
                                        }
                                        System.out.println("Ingrese el turno del mesero [matutino/vespertino]: ");
                                        turno=leer2.nextLine();
                                        String turno1="matutino";
                                        String turno2="vespertino";
                                        while(!turno1.equalsIgnoreCase(turno) && !turno2.equals(turno)){
                                        
                                        System.out.println("Ingrese correctamente el turno [vespertino/matutino]: ");
                                        turno = leer2.nextLine();                                        
                                      }
                                        System.out.println("Ingrese la propina: ");
                                        propina=leer.nextInt();
                                        
                                        System.out.println("Ingrese el sueldo del mesero: ");
                                        sueldo=leer.nextDouble();
                                        
                                        meseros.add(new Meseros(nombre, edad, turno, sueldo, propina));
                                        System.out.println("Mesero agredado exitosamente");
                                        break;
                                        
                                        
                                    case 2: 
                                        //Modificar un Mesero
                                        for (Object mes : meseros) {
                                            System.out.println(meseros.indexOf(mes)+"- " +mes);
                                        }
                                        
                                        System.out.println("ingrese la posicion del chef a modificar");
                                        int posi=leer.nextInt();
                                        
                                        if (posi>=0&&posi<meseros.size()){
                                            if(meseros.get(posi) instanceof Meseros){
                                               System.out.println("Ingrese el nombre del mesero: ");
                                                 nombre= leer2.nextLine();
                                                ((Meseros)meseros.get(posi)).setNombre(nombre); 
                                                 
                                                System.out.println("Ingrese la edad del mesero: ");
                                                edad=leer.nextInt();

                                                while(edad<0){
                                                    System.out.println("Ingrese una edad mayor a 0: ");
                                                    edad=leer.nextInt();
                                                }
                                                ((Meseros)meseros.get(posi)).setEdad(edad); 
                                                
                                                System.out.println("Ingrese el turno del mesero [matutino/vespertino]: ");
                                                turno=leer2.nextLine();
                                                
                                                 turno1="matutino";
                                                 turno2="vespertino";
                                                
                                                while(!turno1.equalsIgnoreCase(turno) && !turno2.equalsIgnoreCase(turno)){

                                                System.out.println("Ingrese correctamente el turno [vespertino/matutino]: ");
                                                turno = leer2.nextLine();                                        
                                              }
                                                ((Meseros)meseros.get(posi)).setTurno(turno);
                                                
                                                System.out.println("Ingrese la propina: ");
                                                propina=leer.nextInt();
                                                
                                               ((Meseros)meseros.get(posi)).setPropina(propina); 
                                               
                                                System.out.println("Ingrese el sueldo del mesero: ");
                                                sueldo=leer.nextDouble();
                                                ((Meseros)meseros.get(posi)).setSueldo(sueldo); 

                                                
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
                                        for (Object mes : meseros) {
                                            System.out.println(meseros.indexOf(mes)+"- " +mes);
                                        }
                                        
                                        System.out.println("Ingrese la posicion del mesero a eliminar: ");
                                        int pos=leer.nextInt();
                                        
                                        while(pos<=0&&pos>meseros.size()){
                                           System.out.println("Ingrese la posicion del mesero a eliminar: ");
                                         pos=leer.nextInt(); 
                                        }
                                        meseros.remove(pos);
                                        
                                        System.out.println("chef eliminado correctamente");
                                        
                                        break;
                                    case 4:
                                        for (Object mes : meseros) {
                                            System.out.println(chefs.indexOf(mes)+"- " +mes);
                                        }
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
                                
                                        //bartenders
                                        
                                     String nombre;
                                     int edad;
                                     String turno;
                                     double sueldo = 0;
                                     int licores;
                                             
                                     if(meseros.size()>4){
                                         System.out.println("No se puede ingresar mas backtenders.");
                                         break;
                                     }
                                        System.out.println("Ingrese el nombre del bartender: ");
                                        nombre= leer2.nextLine();
                                    
                                        System.out.println("Ingrese la edad del bartender: ");
                                        edad=leer.nextInt();
                                        
                                        while(edad<0){
                                            System.out.println("Ingrese una edad mayor a 0: ");
                                            edad=leer.nextInt();
                                        }
                                        System.out.println("Ingrese el turno del bartender [matutino/vespertino]: ");
                                        turno=leer2.nextLine();
                                        String turno1="matutino";
                                        String turno2="vespertino";
                                        while(!turno1.equalsIgnoreCase(turno) && !turno2.equals(turno)){
                                        
                                        System.out.println("Ingrese correctamente el turno [vespertino/matutino]: ");
                                        turno = leer2.nextLine();                                        
                                      }
                                        System.out.println("Ingrese la cantidad de licores disponibles: ");
                                        licores=leer.nextInt();
                                        
                                      
                                        
                                        bartenders.add(new Bartenders(nombre, edad, turno, sueldo, licores));
                                        System.out.println("Backtender agredado exitosamente");
                                        
                                        
                                        break;

                                        
                                        
                                    case 2: 
                                        //Modificar un barktender
                                        for (Object bar : bartenders) {
                                            System.out.println(chefs.indexOf(bar)+"- " +bar);
                                        }
                                        
                                        System.out.println("ingrese la posicion del bartender a modificar");
                                        int posi=leer.nextInt();
                                        
                                        if (posi>=0&&posi<meseros.size()){
                                            if(bartenders.get(posi) instanceof Bartenders){
                                               System.out.println("Ingrese el nombre del bartender: ");
                                                 nombre= leer2.nextLine();
                                                ((Bartenders)bartenders.get(posi)).setNombre(nombre); 
                                                 
                                                System.out.println("Ingrese la edad del chef: ");
                                                edad=leer.nextInt();

                                                while(edad<0){
                                                    System.out.println("Ingrese una edad mayor a 0: ");
                                                    edad=leer.nextInt();
                                                }
                                                ((Bartenders)bartenders.get(posi)).setEdad(edad); 
                                                
                                                System.out.println("Ingrese el turno del chef [matutino/vespertino]: ");
                                                turno=leer2.nextLine();
                                                
                                                 turno1="matutino";
                                                 turno2="vespertino";
                                                
                                                while(!turno1.equalsIgnoreCase(turno) && !turno2.equalsIgnoreCase(turno)){

                                                System.out.println("Ingrese correctamente el turno [vespertino/matutino]: ");
                                                turno = leer2.nextLine();                                        
                                              }
                                                ((Bartenders)bartenders.get(posi)).setTurno(turno);
                                                
                                                
                                                  System.out.println("Ingrese el sueldo del bartender: ");
                                                sueldo=leer.nextDouble();
                                                ((Bartenders)bartenders.get(posi)).setSueldo(sueldo); 
                                                
                                                System.out.println("Ingrese los licores disponibles: ");
                                                licores=leer.nextInt();
                                                
                                               ((Bartenders)bartenders.get(posi)).setLicores(licores); 
                                               
                                              

                                                
                                                System.out.println("bartender modificado exitosamente");  
                                                    }else{
                                                    System.out.println("esto no es un chef");   
                                                    }
                                        }else{
                                            System.out.println("posicion fuera de rango");
                                        }
                                        
                                        break;
                                    case 3:
                                         //eliminar un bartender
                                        for (Object bar : bartenders) {
                                            System.out.println(chefs.indexOf(bar)+"- " +bar);
                                        }
                                        
                                        System.out.println("Ingrese la posicion del chef a eliminar: ");
                                        int pos=leer.nextInt();
                                        
                                        while(pos<=0&&pos>bartenders.size()){
                                           System.out.println("Ingrese la posicion del chef a eliminar: ");
                                         pos=leer.nextInt(); 
                                        }
                                        bartenders.remove(pos);
                                        
                                        System.out.println("bartender eliminado correctamente");
                                        
                                        break;
                                    case 4:
                                        for (Object bar : bartenders) {
                                            System.out.println(bartenders.indexOf(bar)+"- " +bar);
                                        }
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
                             
                             
                             int opcionmenu4 = leer.nextInt();
                             
                                switch (opcionmenu4) {
                                    case 1:
                                        
                                     
                                     int platos;
                                     int utensilios;
                                     int precio=0;
                                             
                                     if(mesas.size()>10){
                                         System.out.println("No se puede ingresar mas backtenders.");
                                         break;
                                     }
                                        
                                    
                                        System.out.println("Numero de platos: ");
                                        platos=leer.nextInt();
                                        
                                        while(platos<0){
                                            System.out.println("Ingrese una edad mayor a 0: ");
                                            platos=leer.nextInt();
                                        }
                                        
                                        
                                        System.out.println("Ingrese la cantidad de utensilios: ");
                                        utensilios=leer.nextInt();
                                        
                                      
                                        System.out.println("Ingrese el precio: ");
                                         precio=leer.nextInt();
                                       
                                        
                                        mesas.add(new Mesas(platos, utensilios, precio));
                                        System.out.println("mesa agredado exitosamente");
                                        
                                        
                                        break;

                                        
                                        
                                    case 2: 
                                        //Modificar un barktender
                                        for (Object me : mesas) {
                                            System.out.println(chefs.indexOf(me)+"- " +me);
                                        }
                                        
                                        System.out.println("ingrese la posicion del bartender a modificar");
                                        int posi=leer.nextInt();
                                        
                                        if (posi>=0&&posi<meseros.size()){
                                            if(mesas.get(posi) instanceof Mesas){
                                              
                                                System.out.println("Ingrese los platos:  ");
                                                platos=leer.nextInt();

                                                while(platos<0){
                                                    System.out.println("Ingrese una edad mayor a 0: ");
                                                    platos=leer.nextInt();
                                                }
                                                ((Mesas)mesas.get(posi)).setPlatos(platos); 
                                                                            
                                                
                                                System.out.println("Ingrese el precio: ");
                                                precio=leer.nextInt();
                                                ((Mesas)mesas.get(posi)).setPrecio(precio); 
                                                
                                                System.out.println("Ingrese los utensilios: ");
                                                utensilios=leer.nextInt();
                                                
                                               ((Mesas)mesas.get(posi)).setUtensilios(utensilios); 
                                               
                                              

                                                
                                                System.out.println("mesas modificado exitosamente");  
                                                    }else{
                                                    System.out.println("esto no es un chef");   
                                                    }
                                        }else{
                                            System.out.println("posicion fuera de rango");
                                        }
                                        
                                        break;
                                    case 3:
                                         //eliminar un bartender
                                        for (Object me : mesas) {
                                            System.out.println(chefs.indexOf(me)+"- " +me);
                                        }
                                        
                                        System.out.println("Ingrese la posicion del chef a eliminar: ");
                                        int pos=leer.nextInt();
                                        
                                        while(pos<=0&&pos>mesas.size()){
                                           System.out.println("Ingrese la posicion del chef a eliminar: ");
                                         pos=leer.nextInt(); 
                                        }
                                        mesas.remove(pos);
                                        
                                        System.out.println("mesa eliminado correctamente");
                                        
                                        break;
                                    case 4:
                                        for (Object me : mesas) {
                                            System.out.println(chefs.indexOf(me)+"- " +me);
                                        }
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
            
            salida += chefs.indexOf(cosa) + "- " + cosa + "\n";
            

        }
        return salida;
    }
  
}


