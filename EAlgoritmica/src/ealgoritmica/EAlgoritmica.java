/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ealgoritmica;

import javax.swing.JOptionPane;

/**
 *
 * @author LEÓNIDAS
 */
public class EAlgoritmica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0, n, mayor, menor;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,""
                        + "\n1.Hallar factorial de un numero real"
                        + "\n2.Hallar la paridad de un numero real"
                        + "\n3.Hallar el enesimo termino en la serie Fibonacci"
                        + "\n4.Obtener MCD mediante Euclides"
                        + "\n5.Busqueda de un elemento en el vector"
                        + "\n6.Salir"
                        + "\nQue desea realizar","MENU DE OPCIONES",JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        n=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo","Factorial de un numero",JOptionPane.QUESTION_MESSAGE)));
                        JOptionPane.showMessageDialog(null, "El resultado es :["+AlgoritmosEA.Factorial(n)+"]","Factorial de un numero"
                                    ,JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        n=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo","Paridad",JOptionPane.QUESTION_MESSAGE)));
                        if(AlgoritmosEA.esPar(n)){
                            JOptionPane.showMessageDialog(null, "El resultado es par","Paridad"
                                    ,JOptionPane.INFORMATION_MESSAGE); 
                        }else{
                            JOptionPane.showMessageDialog(null, "El resultado es impar","Paridad"
                                    ,JOptionPane.INFORMATION_MESSAGE); 
                        }                
                        break;
                    case 3:
                        n=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese un numero entero positivo","Enesimo termino Fibonacci",
                                                        JOptionPane.QUESTION_MESSAGE)));
        
                        JOptionPane.showMessageDialog(null, "El termino "+ n +"  de la serie Fibonacci es :" +AlgoritmosEA.nFibonacci(n)," Enesimo termino Fibonacci"
                                    ,JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        mayor=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese primer numero","MCD de Euclides",
                                                        JOptionPane.QUESTION_MESSAGE)));
        
                        menor=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese segundo numero","MCD de Euclides",
                                                        JOptionPane.QUESTION_MESSAGE)));
        
                        JOptionPane.showMessageDialog(null, "El MCD de "+mayor+ " y " +menor +" es: " +AlgoritmosEA.maximoComunDivisor(mayor, menor),"MCD de Euclides"
                                    ,JOptionPane.INFORMATION_MESSAGE); 
                        break;
                    case 5:
                        n=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingrese el tamano del arreglo","BUSQUEDA EN VECTOR",
                                                        JOptionPane.QUESTION_MESSAGE)));
                        if(AlgoritmosEA.busquedaVector(n)){
                            JOptionPane.showMessageDialog(null, "El dato fue encontrado","ELEMENTO ENCONTRADO"
                                    ,JOptionPane.INFORMATION_MESSAGE); 
                        }else{
                            JOptionPane.showMessageDialog(null, "El dato no fue encontrado","NO SE ENCONTRO ELEMENTO"
                                    ,JOptionPane.INFORMATION_MESSAGE); 
                        }                 
                        break;                
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada","FIIN",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta","Opción no válida",JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error"+e.getMessage(),"Error", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }while(opcion!=6);  
    }
    
}
