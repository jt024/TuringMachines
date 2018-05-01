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
public class TuringMachine {
    private int tLength;
    private Link head;
    private int state=1;
    private Instruction[] rules;
    public int ruleCount=0;
    private StringBuilder ruleSB;
    
    public TuringMachine(int rules){
        this.rules = new Instruction[rules];
        head = null;
        
        
    }

    public void runOnce(){
        for (int i = 0; i < 3; i++) {
            head = head.getRight();
        }
        
        
        for (int i = 0; i < ruleCount-1; i++) {
            if (head.getVal()==rules[i].getCV() && state==rules[i].getCS()) {
                head.setVal(rules[i].getVC());
                state = rules[i].getSC();
                if (rules[i].getDir().equalsIgnoreCase("r") && head.getRight()!=null) {
                    head = head.getRight();
                }
                else if (rules[i].getDir().equalsIgnoreCase("l") && head.getLeft()!=null) {
                    head = head.getLeft();
                }
                
                
            }
            
            
            
        }
        
    }



//    public TuringMachine(){}
    public void addTape(Link nLink){
        if (head==null) {
            head = nLink;
            tLength=1;
            return;
        } else if (head.getLeft()==null){
            nLink.setRight(head);
            head.setLeft(nLink);
            tLength++;
            return;
        } else if(head.getRight()==null){
            nLink.setLeft(head);
            head.setRight(nLink);
            tLength++;
            return;
        }
        while(head.getLeft()!=null){
            head = head.getLeft();
        }
        nLink.setRight(head);
        head.setLeft(nLink);
        tLength++;
    }
    public void addRule(Instruction newRule){
        rules[ruleCount] = newRule;
        ruleCount++;
    }
    
    // Strings
    public int getRuleCount(){
        return ruleCount;
    }

    // Move
    public void moveLeft() throws NullPointerException {
        if (head.getLeft()==null) {
            throw new NullPointerException("No more tape to the left!");
        }
        else
            head = head.getLeft();
    }
    public void moveRight(){
        if (head.getRight()==null) {
            throw new NullPointerException("No more tape to the right!");
        }
        else
            head = head.getRight();
    }

    public char getHeadVal(){
        return head.getVal();
    }
    public int getCurrentState(){
        return state;
    }
    
    
    public void changeVal(char newVal){
        head.setVal(newVal);
    }
    public void changeState(int state){
        this.state = state;
    }
    
    public char getHead(){
        return head.getVal();
    }
//    public String getRule(int element){
//        
//    }
    public String rToString(){
        ruleSB = new StringBuilder();
        
        for (int i = 0; i < ruleCount; i++) {
            ruleSB.append(rules[i].toString());
            ruleSB.append("\n");
        }
        return ruleSB.toString();
    }
    public String tToString(){
        StringBuilder sb = new StringBuilder();
        Link iterator;
        if (head.getLeft()==null) {
            iterator = head;
        }
        else{
            iterator = head.getLeft();
        }
        
        sb.append("[");
        sb.append(iterator.toString());
        while(iterator.getRight()!=null){
            sb.append("][");
            iterator = iterator.getRight();
            sb.append(iterator.toString());
            
        }
        sb.append("]");
        return sb.toString();
        
    }    
    
    @Override
    public String toString(){
        return "The head on "+head.getVal()+"\nTo the right "
                + "is "+head.getRight().getVal()+"\nTo the left "
                + "is "+head.getLeft().getVal();
    }        
        


}





