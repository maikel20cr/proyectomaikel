/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectroestructuramaikel;

import static java.time.Clock.system;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Ryzen
 */
public class Proyectroestructuramaikel {

    /**
     * @param args the command line arguments
     */
    public static void paciente(LinkedList<string>formulamedica,scanner teclado){
        System.out.println("ingrese el nombre de la persona o paciente");
        formulamedica.push(teclado.next());
        
        
    }
    public static void imprimir (LinkedList<string>formulamedica){
        System.out.println("formulamedica");
    }
    public static void buscar(LinkedList<string>formulamedica,scanner teclado){
        System.out.println("ingrese la informacion para buscar");
        string informacion;
        informacion=teclado.next();
        if (formulamedica.contains(informacion))
            System.out.println("la informacion : "+informacion+"se encuentra en"+formulamedica.indexOf(informacion));
        else
            System.out.println("no se ha encontrado esa informacion ");
        
            
        
    }
    public static void medicamentos(LinkedList<string>formulamedica,scanner teclado){
        System.out.println("ingrese los medicamentos");
        formulamedica.push(teclado.next());
    }
    public static void medicamentoselimidados(LinkedList<string>formulamedica,scanner teclado){
        System.out.println("ingrese el medicamento a eliminar");
string eliminar = null;
if (formulamedica.contains(eliminar));
formulamedica.remove();
        System.out.println("fue eliminado"+ " el medicamento "+eliminar);
        

    
    
    
}

    /**
     *
     * 
     * @param args
     */
    public static void main(string [] args){
        linkedlist linkedlistformulamedica = new linkedlist (); 
        scanner teclado;
        
        int opcion=0;
        do{
            System.out.println("rellenar formulario");
            
            
            System.out.println("a ingresar paciente");
            
            
            System.out.println("b iniciar medicamentos");
            
            
            System.out.println("3 iniciar a imprimir");
            
            
            System.out.println("4 iniciar a buscar");
            
            
            System.out.println("5 eliminados");
            
            
           
            System.out.println("6 terminar");
            
            opcion=teclado.nextint()
                  //empezar hacer los case , total 5
            switch (opcion)
                case 1 :
                    System.out.println("1 introduzca paciente ");
                    paciente(formulamedica,teclado);
                    break;
                case 2:
                    System.out.println("2 iniciar medicamentos");
                    medicamentos (formulamedica,teclado);
                    break;
                case 3:
                    System.out.println("3 iniciar imprimir");
                    imprimir(formulamedica);
                    break:
                case 4:
                    System.out.println("4 iniciar a buscar");
                    medicamentos(formulamedica,teclado);
                    break;
                case 5:
                    System.out.println("medicamentos eliminar");
                    medicamentoseliminados(formulamedica,teclado);
                    break:
                case 6:
                    System.out.println("6 terminar todo");
                    break;
                    
                default:
                    System.out.println("es invalido o incorrecto");
                    break;
               
                  
            
  
{


    



{
    
}

