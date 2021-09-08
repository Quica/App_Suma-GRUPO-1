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
public class SumaNum {
    private int num1;
    private int num2;
    private int num3;

    public SumaNum() {
    }

    
    
    public int sumarDos(int num1, int num2){
        int respuesta = num1 + num2;
        return respuesta;
    }
    
    public int sumarTres(int num1, int num2, int num3){
        int respuesta = num1 + num2 + num3;
        return respuesta;
    }

    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the num3
     */
    public int getNum3() {
        return num3;
    }

    /**
     * @param num3 the num3 to set
     */
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    
    
}
