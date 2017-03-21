/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarma;

/**
 *En esta clase tendremos el acceso de cambiar tanto 
 * la hora como la alarma
 * @author christian
 */
public class Alarma {
    int alarma;

    
    /**
     * Aqui podremos cambiar la hora de la alarma
     * @param alarma Es la alarma que queremos cambiar
     */
    public void setAlarma(int alarma) {
        this.alarma = alarma;
    }   
}
