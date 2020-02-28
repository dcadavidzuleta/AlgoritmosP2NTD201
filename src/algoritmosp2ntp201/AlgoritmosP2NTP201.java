/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosp2ntp201;

import static java.time.Clock.system;
import java.util.Scanner;

public class AlgoritmosP2NTP201 {

    public static void main(String[] args) {
        
    // Entrada    
        int rc = 0;
        int ri = 0;
        int rb = 0;
        int prc = 4;
        int pri = -1;
        int prb = 0;
        
        // libreria para pedir por datos al usuario y convertirlos en una variable
        Scanner sc = new Scanner(System.in);
        
    // Proceso
        System.out.println("Ingresa cantidad de respuestas correctas");
        rc = sc.nextInt();
        
        System.out.println("Ingresa cantidad de respuestas incorrectas");
        ri = sc.nextInt();
        
        System.out.println("Ingresa cantidad de respuestas en blanco");
        rb = sc.nextInt();
        
    // Salida
        System.out.println("///////***************/////////");
        System.out.println("Tu puntuación");
        System.out.println("///////***************/////////");
        System.out.println((rc * prc) 
                + (ri * pri)
                + (rb * prb));
        
      
        
    }
    
}
