/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repaso;

/**
 *
 * @author anaaw
 */
import java.util.Scanner;
public class Repaso {

    public static void main(String[] args) {
       
       Scanner sc = new Scanner (System.in);
       int [] puntuacion =new int[7];
       int  suma=0;
       int promediodepunto;
       int opcion=0;
       int puntomayor=0;
       int puntomenor=0;
       int conencima=0;
       int condebajo=0;
        for (int i = 0; i < 7; i++) {        
            do {                
            System.out.println(" ingresar las putuaciones"+(i+1));
            puntuacion[i]=sc.nextInt();
            } while (puntuacion[i]<0);}
        int puntuacionalta=puntuacion[0];
       int puntuacionbajo=puntuacion[0];
                    
            
        while (opcion!=5) {
            //menu principla
            System.out.println("calcular el total de puntuaciones del promedio");
            System.out.println("calcular el promedio de puntuaciones y mostar los dias por encima y por debajo del promedio");
            System.out.println("mostrar el dia con la puntuacion mas alta y mas baja");
            System.out.println("calcular el total de puntuaciones durante los primeros cuatro dias y los ultimos cuatro dias");
            System.out.println("salir");
        
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    for ( int i = 0; i < 7; i++) {
                        
                        suma=puntuacion[i]+suma;
                    }
                    System.out.println("la suma es:"+suma);
                    break;
                case 2:
                    for ( int i = 0; i < 7; i++) {
                        
                        suma=puntuacion[i]+suma;
                    }
                    
                  promediodepunto=suma/7;
                    for (int i = 0; i < 7; i++) {
                        if (puntuacion[i]>promediodepunto) {
                          conencima++;
                        } else {
                            condebajo++;
                       
                        }
                        
                    }
                    System.out.println("el promedio es :"+promediodepunto);
                    System.out.println("los dias por encima es :"+conencima);
                    System.out.println("los dias que estan por debajo es:"+condebajo);
                    break;
                case 3:
                    
                    for (int i = 0; i < 7; i++) {
                        if (puntuacionalta<puntuacion[i]) {
                            puntuacionalta=puntuacion[i];
                            
                        }
                    }
                    for (int i = 0; i < 7; i++) {
                        if (puntuacionbajo>puntuacion[i]) {
                            puntuacionbajo=puntuacion[i];
                            
                        }      
            }         
              System.out.println("la puntuacion alta es "+puntuacionalta);
              System.out.println("la puntuacion baja es:"+puntuacionbajo);
              break;
                case 4:
                    for (int i = 0; i <4; i++) {
                        puntomayor=puntomayor+puntuacion[i];
                        
                    }
                     for (int i = 3; i <7; i++) {
                        puntomenor=puntomenor+puntuacion[i];}
                     System.out.println("el punto mayor es :"+puntomayor);
                     System.out.println("el punto menor es :"+puntomenor);
                     break;
                case 5:
                    System.out.println("salir");
                    break;
                    
        }
    }
}

}