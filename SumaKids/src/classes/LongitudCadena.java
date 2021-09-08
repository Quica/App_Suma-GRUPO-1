/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Victor Diaz
 */
public class LongitudCadena {
    private String cadena;

    public LongitudCadena() {
    }
    
    public int cantidadCacteres(String numero){
        int respuesta = numero.length();
        return respuesta;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    
    
}
