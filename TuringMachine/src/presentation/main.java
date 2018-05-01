/*
 *  @author Johnny Trevino
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;
import java.util.*;
import data.Instruction;
import data.Link;
import data.TuringMachine;
import tools.Counter;

/**
* The main interface between program and user
* 
* @version 2.3
* @author Johnny Trevino
*/
public class main extends javax.swing.JFrame {
    StringBuilder sb,rc = new StringBuilder();
    TuringMachine tm;
    public int currentState = 1, numChars, states, head;
    Instruction[] instructions;
    TuringMachine tape;
    char[] characters;
    Counter counter;
    
    public JFrame frame = new JFrame();
    public String fileName = "src\\resource\\Assignment_Instructions";
//    private static final Byte NULL = 0, ZERO = 1, ONE = 2, LEFT = -1, RIGHT = 1, HALT = -1;
//    private int m_HEAD = 0, m_STATE = 0;
//    private ArrayList<Byte> TAPE = new ArrayList<Byte>();
//    private ArrayList<State> STATES = new ArrayList<State>();    
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        assignment();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta2User = new javax.swing.JTextArea();
        bnExecute = new javax.swing.JButton();
        tfTape = new javax.swing.JTextField();
        bnAddTape = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        bnCreateRule = new javax.swing.JButton();
        tfCurrentState = new javax.swing.JTextField();
        tfCurrentValue = new javax.swing.JTextField();
        tfValueChange = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfChange2State = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfDirection = new javax.swing.JTextField();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ta2User.setColumns(20);
        ta2User.setLineWrap(true);
        ta2User.setRows(5);
        jScrollPane1.setViewportView(ta2User);

        bnExecute.setText("Run Once");
        bnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnExecuteActionPerformed(evt);
            }
        });

        bnAddTape.setText("Add Tape");
        bnAddTape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAddTapeActionPerformed(evt);
            }
        });

        jLabel8.setText(",");

        bnCreateRule.setText("Create Rule");
        bnCreateRule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCreateRuleActionPerformed(evt);
            }
        });

        jLabel1.setText("=");

        jLabel2.setText("(");

        jLabel3.setText(")");

        jLabel5.setText(")");

        jLabel4.setText(",");

        jLabel6.setText(",");

        jLabel7.setText("(");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfTape, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnAddTape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bnExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCurrentState, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCurrentValue, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfChange2State, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfValueChange, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(bnCreateRule, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfChange2State, tfCurrentState, tfCurrentValue, tfDirection});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bnAddTape, bnCreateRule});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfChange2State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel8)
                        .addComponent(tfDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(bnCreateRule)
                        .addComponent(tfValueChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCurrentState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(tfCurrentValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnAddTape))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnExecute)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfChange2State, tfCurrentState, tfCurrentValue, tfDirection});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnCreateRuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCreateRuleActionPerformed
        if (tm==null) {
            tm = new TuringMachine(1000);
        }
//        pnExecute.setVisible(true);
        // current
        int cs = Integer.parseInt(tfCurrentState.getText());
        char cv = tfCurrentValue.getText().charAt(0);
        
        // change to this
        char vc = tfValueChange.getText().charAt(0);
        int sc = Integer.parseInt(tfChange2State.getText());
        String dir = tfDirection.getText();
        
        tm.addRule(new Instruction(cs,cv,sc,vc,dir));
        
//        instructions[counter.getRCount()-1] = new Instruction(cs,cv,sc,vc,dir);
       
        ta2User.setText(tm.rToString());
//        ta2User.append("\n\n\n\nOnce all the rules are entered you and you have a tape\n"
//                + "you can run the machine");
        

        

        tfCurrentState.setText("");
        tfCurrentValue.setText("");
        tfValueChange.setText("");
        tfChange2State.setText("");
        tfDirection.setText("");
        tfCurrentState.requestFocus();
        
        

        
        
    }//GEN-LAST:event_bnCreateRuleActionPerformed

    private void bnAddTapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAddTapeActionPerformed
        if (tm==null) {
            tm = new TuringMachine(1000);
        }
        
        String tapeIn = tfTape.getText();
        char[] temp = tapeIn.toCharArray();
        
        for(char b : temp){
            tm.addTape(new Link(b));
        }
        System.out.println(tm.tToString());
        ta2User.setText(tm.tToString());
        
        
    }//GEN-LAST:event_bnAddTapeActionPerformed

    private void bnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExecuteActionPerformed
        tm.runOnce();
        ta2User.setText(tm.tToString());
    }//GEN-LAST:event_bnExecuteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAddTape;
    private javax.swing.JButton bnCreateRule;
    private javax.swing.JButton bnExecute;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta2User;
    private javax.swing.JTextField tfChange2State;
    private javax.swing.JTextField tfCurrentState;
    private javax.swing.JTextField tfCurrentValue;
    private javax.swing.JTextField tfDirection;
    private javax.swing.JTextField tfTape;
    private javax.swing.JTextField tfValueChange;
    // End of variables declaration//GEN-END:variables


    
    public void assignment(){
//        pnExecute.setVisible(false);
        String line;
        
        try {
            FileReader fileReader = 
                new FileReader(fileName);

            // wraps FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            int lcount = 0;
            while((line = bufferedReader.readLine()) != null) {
                lcount++;
                ta2User.append(line);
                if (lcount%2==0) {
                    ta2User.append("\n");
                }
                else{
                    ta2User.append("\t");
                }
                
            }   
            // close file
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }   
}
