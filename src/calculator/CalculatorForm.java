
package calculator;

import java.lang.Thread.UncaughtExceptionHandler;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CalculatorForm extends javax.swing.JFrame {

    //comaFlag is to control the use of decimal places character
    private boolean comaFlag = false;
    //value parenCount is to test if parentheses are balanced
    private int parenCount = 0;
    //maximal limit of chars that can fit into textbox
    private final int limitOfChars = 25;
    //current number of chars it gets incremented with every number\operator button click
    private int numberOfChars = 1;
    //enumerative type stores states of key input
    private State state = State.START;
    private StringBuffer stringToParse = new StringBuffer();
    //class defined in StackParser.java
    private StackParser parser = new StackParser();
    private double result;
    //flag of state to control the use of +\- button
    private boolean uminus = false;
    private DecimalFormat format = new DecimalFormat();
    private DecimalFormatSymbols symbol = new DecimalFormatSymbols();
    public CalculatorForm() {
        initComponents();
        format.setMinimumFractionDigits(0);
        symbol.setDecimalSeparator('.');
        format.setDecimalFormatSymbols(symbol);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextResult = new javax.swing.JTextField();
        jPanelKeyboard = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonMult = new javax.swing.JButton();
        jButtonComa = new javax.swing.JButton();
        jButtonEqu = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonFlipSign = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonLParen = new javax.swing.JButton();
        jButtonRParen = new javax.swing.JButton();
        jButtonPow = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextResult.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextResult.setText("0");
        jTextResult.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextResult.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextResult.setEnabled(false);
        jPanel1.add(jTextResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 11, 377, 55));

        jPanelKeyboard.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("1");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMinus.setText("-");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonMult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMult.setText("*");
        jButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultActionPerformed(evt);
            }
        });

        jButtonComa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonComa.setText(".");
        jButtonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComaActionPerformed(evt);
            }
        });

        jButtonEqu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEqu.setText("=");
        jButtonEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEquActionPerformed(evt);
            }
        });

        jButton0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonPlus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPlus.setText("+");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButtonFlipSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFlipSign.setText("<html>&plusmn;</html>");
        jButtonFlipSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFlipSignActionPerformed(evt);
            }
        });

        jButtonDiv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDiv.setText("/");
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setText("CE");
        jButtonClear.setName(""); // NOI18N
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonLParen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLParen.setText("(");
        jButtonLParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLParenActionPerformed(evt);
            }
        });

        jButtonRParen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRParen.setText(")");
        jButtonRParen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRParenActionPerformed(evt);
            }
        });

        jButtonPow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPow.setText("^");
        jButtonPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPowActionPerformed(evt);
            }
        });

        jButtonMod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMod.setText("%");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKeyboardLayout = new javax.swing.GroupLayout(jPanelKeyboard);
        jPanelKeyboard.setLayout(jPanelKeyboardLayout);
        jPanelKeyboardLayout.setHorizontalGroup(
            jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKeyboardLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFlipSign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                        .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                        .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButtonLParen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonComa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                                .addComponent(jButtonRParen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelKeyboardLayout.setVerticalGroup(
            jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeyboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFlipSign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLParen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRParen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPow, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKeyboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEqu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelKeyboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 72, -1, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("1");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"1");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("2");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"2");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("3");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"3");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("4");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"4");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("5");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"5");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("6");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"6");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("7");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"7");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("8");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"8");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.START){
            jTextResult.setText("9");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"9");
        }
        state = State.NUM;
        numberOfChars++;
    }//GEN-LAST:event_jButton9ActionPerformed
    //button clear resets all control values and settings 
    //to start state
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        if(!jTextResult.getText().equals("0")){
            jTextResult.setText("0");
            comaFlag = false;
            numberOfChars = 1;
            parenCount = 0;
            state = State.START;
            uminus = false;
        }
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonFlipSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipSignActionPerformed
        //This function flips between negative and positive of last value in textbox display.
        //The display of the last number string will be altered 
        //whether the uminus flag is true or false
        //eg: 
            //flag uminus==false
            //11+2; button +\- clicked   display shows ->
            //flag uminus==true
            //11+-2 button +\- clicked again display shows ->
            //11+2
        if(jTextResult.getText().charAt(jTextResult.getText().length()-1)==')'||jTextResult.getText().equals("0"))
            return;
        
        //function find last op returns the index of last operator
        //the int p value stores index of last oper is used to build string 
        int p = findLastOp();
        if(!uminus){
            if(p==0){
                jTextResult.setText("-"+jTextResult.getText());
            }
            else{
                StringBuilder sb = new StringBuilder(jTextResult.getText().subSequence(0, p+1));
                sb.append("-").append(jTextResult.getText().substring(p+1));
                jTextResult.setText(sb.toString());    
            }
            uminus = true;
            numberOfChars++;
        }
        else{
            if(p==0){
                jTextResult.setText(jTextResult.getText().substring(1));
            }
            else{
                StringBuilder sb = new StringBuilder(jTextResult.getText().subSequence(0, p));
                sb.append(jTextResult.getText().substring(p+1));
                jTextResult.setText(sb.toString());
            }
            uminus = false;
            numberOfChars--;
        }
        
    }//GEN-LAST:event_jButtonFlipSignActionPerformed

    private void jButtonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComaActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(!comaFlag){
            jTextResult.setText(jTextResult.getText()+".");
            comaFlag = true;
            numberOfChars++;
            state = State.COMA;
        }
        else if(jTextResult.getText().charAt(jTextResult.getText().length()-1)=='.'){
            jTextResult.setText(jTextResult.getText().substring(0,jTextResult.getText().length()-1));
            comaFlag=false;
            numberOfChars--;
            state = State.NUM;
        }
        
    }//GEN-LAST:event_jButtonComaActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        
        if(numberOfChars>limitOfChars || state==State.START ||state == State.ZERO)return;
        
        if(state==State.OPER){
            jTextResult.setText(jTextResult.getText()+"0");
            state = State.ZERO;
        }
        else if(state == State.COMA || state == State.NUM||state==State.RESULT){
            jTextResult.setText(jTextResult.getText()+"0");
            state = State.NUM;
        }
 
        numberOfChars++;
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.OPER || state==State.LPAREN){
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        jTextResult.setText(jTextResult.getText()+"+");
        state = State.OPER;
        numberOfChars++;
        comaFlag = false;
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        if(numberOfChars>limitOfChars)return; 
        if(state == State.COMA){
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        jTextResult.setText(jTextResult.getText()+"-");
        state = State.OPER;
        numberOfChars++;
        comaFlag = false;
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.OPER || state==State.LPAREN){
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        jTextResult.setText(jTextResult.getText()+"*");
        state = State.OPER;
        numberOfChars++;
        comaFlag = false;
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.OPER || state==State.LPAREN){
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        jTextResult.setText(jTextResult.getText()+"/");
        state = State.OPER;
        numberOfChars++;
        comaFlag = false;
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.OPER || state==State.LPAREN){
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        jTextResult.setText(jTextResult.getText()+"%");
        state = State.OPER;
        numberOfChars++;
        comaFlag = false;
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPowActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.OPER || state==State.LPAREN){
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
            return;
        }
        jTextResult.setText(jTextResult.getText()+"^");
        state = State.OPER;
        numberOfChars++;
        comaFlag = false;
    }//GEN-LAST:event_jButtonPowActionPerformed

    private void jButtonRParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRParenActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state==State.NUM){
            
            parenCount--;
            jTextResult.setText(jTextResult.getText()+")");
            state = State.RParen;
            numberOfChars++;
        }
        else {
           JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonRParenActionPerformed

    private void jButtonLParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLParenActionPerformed
        if(numberOfChars>limitOfChars)return;
        if(state == State.OPER){
            jTextResult.setText(jTextResult.getText()+"(");
            state = State.OPER;
            parenCount++;
            numberOfChars++;
        }
        else if(state == State.START){
            jTextResult.setText("(");
            state = State.OPER;
            parenCount++;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonLParenActionPerformed

    private void jButtonEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEquActionPerformed
        if(parenCount!=0){
            JOptionPane.showMessageDialog(this,"error unbalanced paretheses","",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if((state==State.NUM)||(state==State.RParen)|| (state==State.ZERO))
        {
            parser.setStringToParse(new StringBuilder(jTextResult.getText()));
            parser.parse();
            parser.evaluate();
            if(parser.isError()){
                jButtonClearActionPerformed(null);
                return;
            }
            result = parser.getValueStack().pop();
            jTextResult.setText(format.format(result));
            state = State.RESULT;
        }
        else if(state==State.RESULT){
            char c = parser.getLastOp();
            double y = parser.getY();
            parser.setStringToParse(new StringBuilder(jTextResult.getText()+c+y+""));
            parser.parse();
            parser.evaluate();
            jTextResult.setText(format.format(parser.getValueStack().peek()));
        }

        Pattern pattern = Pattern.compile("(\\.)");
        Matcher matcher = pattern.matcher(jTextResult.getText());
        if(matcher.find())
            comaFlag=true;

        numberOfChars = jTextResult.getText().length();
        if(result<0)
                uminus = true;
    }//GEN-LAST:event_jButtonEquActionPerformed
    
    int findLastOp(){
        
        for(int i=jTextResult.getText().length()-1;i>=0;i--){
            switch(jTextResult.getText().charAt(i)){
                case '+':
                    return i;
                case '-':
                    return i;
                case '*':
                    return i;
                case '/':
                    return i;
                case '%':
                    return i;
                case '^':
                    return i;
                default:
                    continue;
            }
        }
        return 0;
    }
    
    public static void setGlobalExceptionHandler(){
        
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                    CalculatorForm form1 = new CalculatorForm();
                    form1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonComa;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonEqu;
    private javax.swing.JButton jButtonFlipSign;
    private javax.swing.JButton jButtonLParen;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonMult;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonPow;
    private javax.swing.JButton jButtonRParen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelKeyboard;
    private javax.swing.JTextField jTextResult;
    // End of variables declaration//GEN-END:variables
}
