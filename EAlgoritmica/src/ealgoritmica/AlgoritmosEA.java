/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ealgoritmica;

import javax.swing.JOptionPane;

/**
 *
 * @author LEONIDAS
 */
public class AlgoritmosEA {
  
   
    public static int Factorial(int n){
        int fact =1 ;
        int i=1;

        if(n>0){
            while(i<=n){
                fact = fact*i;
                i++;
            }
        }

        return fact;
    }
    
    public static boolean esPar(int n){
        int resto = n;
        while(resto>1){
            resto = resto - 2;
        }
        if(resto==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static int nFibonacci(int n){
        int i=1;
        int fib = 0 , anterior =1 , actual = 0;
        while(i<=n){
            fib= anterior + actual ;
            anterior = actual;
            actual = fib ;
            i++; 
        }
        return fib;
    }
    
    public static int maximoComunDivisor(int a, int b){
        int dividendo=0, divisor=0,cociente=1,resto=1;
        if(a>b){
            dividendo= a;
            divisor=b;
        }else{
            dividendo= b;
            divisor=a;
        }
        while(resto!=0){
            cociente=dividendo/divisor;
            resto=dividendo-(divisor*cociente);
            dividendo=divisor;
            divisor=resto;            
        }
        //asd
        return dividendo;
    }
    
    public static boolean busquedaVector(int n){
        int dato;
        int arreglo[] = new int[n];
        int i=0;
        boolean encontrado = false;
        for ( i = 0; i < arreglo.length; i++) {
            arreglo[i]=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingresa un valor para la posicion: " +(i+1),
                    "Llenando el vector",JOptionPane.QUESTION_MESSAGE)));
        }
        dato=Integer.parseInt((JOptionPane.showInputDialog(null,"Ingresa el valor a buscar en el vector",
                    "Busqueda en el Vector",JOptionPane.QUESTION_MESSAGE)));
        
        for(i=0; i<arreglo.length; i++){
            if (dato==arreglo[i]) {
                    encontrado=true;                 
            }  
            i++;
        }
        
        return encontrado;
    }
}
