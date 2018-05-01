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
    private int state;
    private Instruction[] rules;
    private int ruleCount=0;
    
    public TuringMachine(int rules){
        this.rules = new Instruction[rules];
        head = null;
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
    }
    
    // Strings
    public String rToString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rules.length-1; i++) {
            sb.append(rules[i].toString()+"\n");
        }
        return sb.toString();
    }
    public String tToString(){
        StringBuilder sb = new StringBuilder();
        Link iterator = head;
        sb.append("[");
        sb.append(iterator.toString());
        sb.append("][");
        while(iterator.getRight()!=null){
            iterator = iterator.getRight();
            sb.append(iterator.toString());
            sb.append("][");
        }
        sb.append("]");
        return sb.toString();
        
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
    @Override
    public String toString(){
        return "The head on "+head.getVal()+"\nTo the right "
                + "is "+head.getRight().getVal()+"\nTo the left "
                + "is "+head.getLeft().getVal();
    }        
        


}





