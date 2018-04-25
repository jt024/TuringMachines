/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Trevi
 */
public class Instruction {
    
    
    private int cState;
    private String newVal;
    private int direction;

    public Instruction(int cState, String newVal, int direction) {
            this.cState = cState;
            this.newVal = newVal;
            this.direction = direction;
    }
    public int getState() {
            return cState;
    }
    public int getDirection() {
            return direction;
    }    
    public String getNewVal() {
            return newVal;
    }
    public String toString() {
            return "("+cState+", "+newVal+", "+direction+")";
    }        
}
