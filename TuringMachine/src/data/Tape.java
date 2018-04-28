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
public class Tape {
    
    char[] values;
    int tapeLength;
    
    public Tape(int length){
        
        values = new char[length];
        tapeLength = length;
        
    }
    
    public void setChar(char val, int loc){
        values[loc] = val;
    }
    public char getChar(int loc){
        return values[loc];
    }
    public int getLength(){
        return tapeLength;
    }

    
    
    
    @Override
    public String toString(){
        
        return String.valueOf(values);
    }
    public String toString(int loc){
        
        return String.valueOf(values[loc]);
    }
    
    
    
    
    
}
