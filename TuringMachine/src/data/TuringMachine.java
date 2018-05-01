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
    private Link root, head;
    private int state=1;
    private Instruction[] rules;
    public int ruleCount=0;
    private StringBuilder ruleSB;
    
    public TuringMachine(int rules){
        this.rules = new Instruction[rules];
        root = null;
        
        
    }

    public void runOnce(){
        head = root;
        for (int i = 0; i < 3; i++) {
            if (head.getRight()!=null) {
                head = head.getRight();
            }
            
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
        if (root==null) {
            root = nLink;
            tLength=1;
            return;
        } else if (root.getLeft()==null){
            nLink.setRight(root);
            root.setLeft(nLink);
            tLength++;
            return;
        } else if(root.getRight()==null){
            nLink.setLeft(root);
            root.setRight(nLink);
            tLength++;
            return;
        }
        while(root.getLeft()!=null){
            root = root.getLeft();
        }
        nLink.setRight(root);
        root.setLeft(nLink);
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
        if (root.getLeft()==null) {
            throw new NullPointerException("No more tape to the left!");
        }
        else
            root = root.getLeft();
    }
    public void moveRight(){
        if (root.getRight()==null) {
            throw new NullPointerException("No more tape to the right!");
        }
        else
            root = root.getRight();
    }

    public char getHeadVal(){
        return root.getVal();
    }
    public int getCurrentState(){
        return state;
    }
    
    
    public void changeVal(char newVal){
        root.setVal(newVal);
    }
    public void changeState(int state){
        this.state = state;
    }
    
    public char getHead(){
        return root.getVal();
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
        if (root.getLeft()==null) {
            iterator = root;
        }
        else{
            iterator = root.getLeft();
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
        return "The head on "+root.getVal()+"\nTo the right "
                + "is "+root.getRight().getVal()+"\nTo the left "
                + "is "+root.getLeft().getVal();
    }        
        


}





