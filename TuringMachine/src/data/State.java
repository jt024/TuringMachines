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
public class State {
    
    private static final int OPS = 3;
    private Instruction[] m_arr;
    
    public State() {
            m_arr = new Instruction[OPS];
    }
    public boolean push(int n, Instruction i) {
            try {
                    if (m_arr[n] == null) {
                            m_arr[n] = i;
                            return true;
                    }
            } catch (Exception ex) {
            }
            return false;
    }
    public Instruction get(Byte match) {
            return m_arr[match];
    }
    public String toString() {
            String r = "";
            int c = 0;
            for (Instruction i : m_arr) {
                    try {
                            r += "\t" + (c==0 ? "B" : (c-1)) + ":" + i.toString() + "\n";
                    } catch (Exception ex) {
                    }
                    c++;
            }
            return r;
    }
    
    
}
