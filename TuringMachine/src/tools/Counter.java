/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Trevi
 */
public class Counter {
    StringBuilder rc;
    String bar;
    int rCount;
    
    public Counter(int x){
        rc = new StringBuilder();
        rCount = x;
        for (int i = 0; i < x; i++) {
            rc.append(" |");
        }
        bar = rc.toString();
    }
    public void decBar(){
        rCount--;
    }
    public void resBar(){
        rCount=0;
        bar="";
    }
    public String getBar(){
        return bar;
    }
    public int getCount(){
        return rCount;
    }
    
    
    
    
}
