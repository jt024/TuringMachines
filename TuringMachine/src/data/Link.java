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
public class Link {
    private char val;
    private Link right, left;
    
    public Link(char n){
        val = n;
    }
    
    // getters
    public char getVal(){
        return val;
    }     
    public Link getRight(){
        return right;
    }
    public Link getLeft(){
        return left;
    }    
    
    // setters
    public void setVal(char v){
        val = v;
    }
    public void setRight(Link r){
        right = r;
    }
    public void setLeft(Link l){
        left = l;
    }

    
    @Override
    public String toString(){
        return String.valueOf(val);
    }
    


    
}
