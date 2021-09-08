/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.FrmSuma;

/**
 *
 * @author chacha
 */
public class Sleep {
    private int time;
    public void sleepMensaje(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmSuma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    /**
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }
}
