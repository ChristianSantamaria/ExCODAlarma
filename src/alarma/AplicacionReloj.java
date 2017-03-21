/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarma;

import alarma.Alarma;
import javax.swing.JOptionPane;

/**
 * Aqui encontraremos las opciones del reloj
 * @author christian
 */
public class AplicacionReloj {
    int hora;
    
    /**
     * Aqui podremos cambiar la hora actual del reloj
     * @param hora Es la hora actualizada nueva 
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
    /**
     * En esta funcion el usuario eligira entre cambiar 
     * la hora o la alarma
     */
    public void setalarma(){
        Alarma a = new Alarma();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1 = Cambiar Hora : 2 = Cambiar Alarma"));
        if(opcion == 1){
            a.setAlarma(4);}
        else if(opcion == 2){
            setHora(4);}
    }
    
}
