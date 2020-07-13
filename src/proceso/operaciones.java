/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso;
import static java.lang.Integer.parseInt;
import seminario.Seminario;
/**
 *
 * @author diego
 */
public class operaciones {
    public void mensaje(String part[]){
        
     // String[] part=cadena.split(" ");
     int cont=0;
            for(int i=0;i<part.length;i++)
            {
                try {
                  Integer.parseInt(part[i]);  
                 // System.out.println("numero");
                  cont=cont+parseInt(part[i]);
                }catch(NumberFormatException e){
                  
                    if (part[i].matches(".*[a-z].*")){
                        System.out.println(part[i]+""+" no es un numero");
                    }
                }
            }
           System.out.println("el total es:"+cont);
               
}

}
