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
    
    private int currentState;
    private String currentValue;
    
    private int newState;
    private String newValue;
    private String direction;
    
    public Instruction(int cs, String cv, int sc, String vc, String dir) {
            currentState = cs;
            currentValue = cv;
            newState = sc;
            newValue = vc;
            direction = dir;
    }
    public Instruction(int cs, String cv, int sc, String dir) {
            currentState = cs;
            currentValue = cv;
            newState = sc;
            direction = dir;
    }    
    public Instruction(int cs, int sc, String vc, String dir) {
            currentState = cs;
            newState = sc;
            newValue = vc;
            direction = dir;
    }    
    
    
    public int getCS() {
            return currentState;
    }
    public String getCV() {
            return currentValue;
    }
    public int getSC() {
            return newState;
    }    
    public String getVC() {
            return newValue;
    }    
    public String getDir() {
            return direction;
    }    

    public String toString() {
            return "G("+currentState+","+currentValue+")=("+newState
                    +","+newValue+","+direction+")";
    }        
}
