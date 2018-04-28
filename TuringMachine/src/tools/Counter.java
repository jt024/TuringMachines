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
    String rBar;
    String cBar;
    int rCount;
    int cCount;
    
    public Counter(int r, int c){
        rCount = r;
        cCount = c;
        setRString();
        setCString();

    }
    
    // create bars base on count
    private void setRString(){
        rc = new StringBuilder();
        for (int i = 0; i < rCount; i++) {
            rc.append(" |");
        }
        rBar = rc.toString();
    }
    private void setCString(){
        rc = new StringBuilder();
        for (int i = 0; i < cCount; i++) {
            rc.append(" |");
        }
        cBar = rc.toString();
    }    
    
    // decrease count and call update for bars
    public void decRBar(){
        rCount--;
        updateBar();
    }
    public void decCBar(){
        cCount--;
        updateBar();
    }
    
    
    // reset bars
    public void resRBar(){
        rCount=0;
        rBar="";
    }
    public void resCBar(){
        cCount=0;
        cBar="";
    }    
    
    
    // get strings for bars
    public String getRBar(){
        return rBar;
    }
    public String getCBar(){
        return cBar;
    }    
    
    // get numeric count for bars
    public int getRCount(){
        return rCount;
    }
    public int getCCount(){
        return cCount;
    }    
    
    
    
    // update bar string for bars
    private void updateBar(){
        // first update the rule bar
        rc = new StringBuilder();
        
        for (int i = 0; i < rCount; i++) {
            rc.append(" |");
        }        
        rBar = rc.toString();
        // first update the character bar
        rc = new StringBuilder();
        
        for (int i = 0; i < cCount; i++) {
            rc.append(" |");
        }        
        cBar = rc.toString();        
        
    }
    
}
