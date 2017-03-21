/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarma;

/**
 * Es la clase principal en la cual podremos acceder
 * a las diferentes opciones del reloj
 * @author christian
 */
public class AplicacionCliente {

    /**
     * Este es el acceso del usuario ante el reloj
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AplicacionReloj o = new AplicacionReloj();
        
        o.setalarma();
    }


    
}
