/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seminario;
import java.util.Scanner;

import proceso.operaciones;

/**
 *
 * @author diego
 */
public class Seminario {

   
   
    public static void main(String[] args) {
       
       operaciones msm=new operaciones();
        
            String entrada = " 1  2    3 14  5 y u 6 7";  
            String[] part=entrada.split(" ");
           
             msm.mensaje(part);//enviar datos al metodo
   
    }

    
}
