
package calculator;

import javax.swing.JOptionPane;

public class CalculatorForm extends javax.swing.JFrame {

    private boolean comaFlag = false;
    private int parenCount = 0;
    enum State{
        START(0),NUM(1),COMA(2),PLUS(3),MINUS(4),
        MULT(5),DIV(6),MOD(7),POW(8),LParen(9),RParen(10);
        private int s;
        State(int s){
            this.s = s;
        }

        public int getS() {
            return s;
        }
    }
    State state = State.START;
    
    StringBuffer stringToParse = new StringBuffer();
    public CalculatorForm() {
        initComponents();
        
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
        if(state == State.START){
            jTextResult.setText("1");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"1");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(state == State.START){
            jTextResult.setText("2");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"2");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(state == State.START){
            jTextResult.setText("3");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"3");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(state == State.START){
            jTextResult.setText("4");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"4");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(state == State.START){
            jTextResult.setText("5");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"5");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       if(state == State.START){
            jTextResult.setText("6");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"6");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(state == State.START){
            jTextResult.setText("7");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"7");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(state == State.START){
            jTextResult.setText("8");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"8");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(state == State.START){
            jTextResult.setText("9");
        }
        else{
            jTextResult.setText(jTextResult.getText()+"9");
        }
        state = State.NUM;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        if(!jTextResult.getText().equals("0")){
            jTextResult.setText("0");
            state = State.START;
        }
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonFlipSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipSignActionPerformed
        if(!jTextResult.getText().equals("0")){
            if(jTextResult.getText().charAt(0)=='-'){
               jTextResult.setText(jTextResult.getText().substring(1));
            }
            else{
               jTextResult.setText("-"+jTextResult.getText());
            }
        }
    }//GEN-LAST:event_jButtonFlipSignActionPerformed

    private void jButtonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComaActionPerformed
        if(!comaFlag){
            jTextResult.setText(jTextResult.getText()+".");
            comaFlag = true;
        }
    }//GEN-LAST:event_jButtonComaActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if(state == State.NUM){
            jTextResult.setText(jTextResult.getText()+"0");
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        if(state == State.NUM || state==State.RParen){
            jTextResult.setText(jTextResult.getText()+"+");
            state = State.PLUS;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
         if(state == State.NUM || state==State.RParen){
            jTextResult.setText(jTextResult.getText()+"-");
            state = State.MINUS;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
         if(state == State.NUM || state==State.RParen){
            jTextResult.setText(jTextResult.getText()+"*");
            state = State.MULT;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
         if(state == State.NUM || state==State.RParen){
            jTextResult.setText(jTextResult.getText()+"/");
            state = State.DIV;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
         if(state == State.NUM || state==State.RParen){
            jTextResult.setText(jTextResult.getText()+"%");
            state = State.MOD;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonPowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPowActionPerformed
         if(state == State.NUM || state==State.RParen){
            jTextResult.setText(jTextResult.getText()+"^");
            state = State.POW;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonPowActionPerformed

    private void jButtonRParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRParenActionPerformed
        if(stateIsOper()|| state==State.NUM){
            if(parenCount>0){
                parenCount--;
            }
            else{
                JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
                return;
            }
            jTextResult.setText(jTextResult.getText()+")");
            state = State.RParen;
        }
        else {
           JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonRParenActionPerformed

    private void jButtonLParenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLParenActionPerformed
        if(stateIsOper()){
            jTextResult.setText(jTextResult.getText()+"(");
            state = State.LParen;
            parenCount++;
        }
        else{
            JOptionPane.showMessageDialog(this, "syntax error", "", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButtonLParenActionPerformed
    private boolean stateIsOper(){
        switch(state.getS()){
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                return false;
            default:
                return true;
        }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
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
