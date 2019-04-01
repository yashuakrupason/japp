/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapps;

import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;
import java.net.*;


public class javaapp extends javax.swing.JFrame {
  //TTT
    private String turn="X";
    private String playerone="playerone";
    private String playertwo="playertwo";
//calci
    static int operator;
    double first,second,result;
    public javaapp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        parent = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tttp = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonA = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonC = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonD = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonE = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonF = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButtonG = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButtonH = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButtonI = new javax.swing.JButton();
        padp = new javax.swing.JPanel();
        ipbtn = new javax.swing.JButton();
        iptf = new javax.swing.JTextField();
        charp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfc = new javax.swing.JTextField();
        tfw = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        calp = new javax.swing.JPanel();
        calfield = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnp = new javax.swing.JButton();
        jbtndot = new javax.swing.JButton();
        jbtns = new javax.swing.JButton();
        jbtnm = new javax.swing.JButton();
        jbtndel = new javax.swing.JButton();
        jbtnd = new javax.swing.JButton();
        jbtnclear = new javax.swing.JButton();
        jbtne = new javax.swing.JButton();
        jbtnmod = new javax.swing.JButton();
        jbtnbin = new javax.swing.JButton();
        jbtnf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA APPS");
        setBackground(new java.awt.Color(204, 204, 255));

        panel.setBackground(new java.awt.Color(204, 204, 255));

        jButton2.setText("calculator");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("ip finder");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("char.counter");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JAPPS");

        jButton6.setText("HOME");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setText("tic tac toe");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        parent.setBackground(new java.awt.Color(204, 204, 255));
        parent.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(204, 204, 255));
        home.setLayout(new java.awt.BorderLayout());

        jLabel5.setBackground(new java.awt.Color(255, 204, 0));
        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome to JAPPS");
        home.add(jLabel5, java.awt.BorderLayout.CENTER);

        parent.add(home, "card6");

        tttp.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonA, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonB, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel2);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonC, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonD, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonE, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonF, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel6);

        jPanel7.setLayout(new java.awt.BorderLayout());

        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonG, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });
        jPanel8.add(jButtonH, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel8);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonI, java.awt.BorderLayout.CENTER);

        tttp.add(jPanel9);

        parent.add(tttp, "card3");

        ipbtn.setText("Get IP");
        ipbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipbtnActionPerformed(evt);
            }
        });

        iptf.setText("enter host name");

        javax.swing.GroupLayout padpLayout = new javax.swing.GroupLayout(padp);
        padp.setLayout(padpLayout);
        padpLayout.setHorizontalGroup(
            padpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, padpLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(iptf, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(padpLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(ipbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        padpLayout.setVerticalGroup(
            padpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(padpLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(iptf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ipbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        parent.add(padp, "card4");

        charp.setBackground(new java.awt.Color(153, 255, 153));

        jButton1.setText("proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("enter characters");

        jLabel3.setText("no of words");

        jLabel4.setText("no of chars");

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        javax.swing.GroupLayout charpLayout = new javax.swing.GroupLayout(charp);
        charp.setLayout(charpLayout);
        charpLayout.setHorizontalGroup(
            charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charpLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charpLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charpLayout.createSequentialGroup()
                        .addGroup(charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfw, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(tfc))
                        .addGap(266, 266, 266))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charpLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charpLayout.createSequentialGroup()
                        .addGroup(charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(496, 496, 496))))
        );
        charpLayout.setVerticalGroup(
            charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(charpLayout.createSequentialGroup()
                .addGroup(charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(charpLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, charpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jButton1)
                .addGap(40, 40, 40)
                .addGroup(charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(charpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        parent.add(charp, "card5");

        calp.setBackground(new java.awt.Color(255, 255, 153));

        calfield.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnp.setText("+");
        jbtnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnpActionPerformed(evt);
            }
        });

        jbtndot.setText(".");
        jbtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndotActionPerformed(evt);
            }
        });

        jbtns.setText("-");
        jbtns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsActionPerformed(evt);
            }
        });

        jbtnm.setText("*");
        jbtnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmActionPerformed(evt);
            }
        });

        jbtndel.setText("del");
        jbtndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndelActionPerformed(evt);
            }
        });

        jbtnd.setText("/");
        jbtnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndActionPerformed(evt);
            }
        });

        jbtnclear.setText("C");
        jbtnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnclearActionPerformed(evt);
            }
        });

        jbtne.setText("=");
        jbtne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneActionPerformed(evt);
            }
        });

        jbtnmod.setText("%");
        jbtnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnmodActionPerformed(evt);
            }
        });

        jbtnbin.setText("bin");
        jbtnbin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbinActionPerformed(evt);
            }
        });

        jbtnf.setText("!");
        jbtnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calpLayout = new javax.swing.GroupLayout(calp);
        calp.setLayout(calpLayout);
        calpLayout.setHorizontalGroup(
            calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calpLayout.createSequentialGroup()
                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(calpLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(calfield, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(calpLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(calpLayout.createSequentialGroup()
                                .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(calpLayout.createSequentialGroup()
                                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(calpLayout.createSequentialGroup()
                                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(calpLayout.createSequentialGroup()
                                        .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(calpLayout.createSequentialGroup()
                                        .addComponent(jbtnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtne, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(calpLayout.createSequentialGroup()
                                        .addComponent(jbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtnf, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbtnbin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(calpLayout.createSequentialGroup()
                                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jbtndel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        calpLayout.setVerticalGroup(
            calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calpLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(calfield, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtns, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtndel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnbin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(calpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnmod, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtne, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 52, Short.MAX_VALUE))
        );

        parent.add(calp, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(parent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//panel selection
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      parent.removeAll();
     parent.add(charp);
     parent.repaint();
     parent.revalidate();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  parent.removeAll();
     parent.add(calp);
     parent.repaint();
     parent.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        parent.removeAll();
     parent.add(tttp);
     parent.repaint();
     parent.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     parent.removeAll();
     parent.add(padp);
     parent.repaint();
     parent.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed
     // CALCULATOR
    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String Enter = calfield.getText()+jbtn1.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String Enter = calfield.getText()+jbtn2.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
       String Enter = calfield.getText()+jbtn3.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String Enter = calfield.getText()+jbtn4.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String Enter = calfield.getText()+jbtn5.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String Enter = calfield.getText()+jbtn6.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        String Enter = calfield.getText()+jbtn7.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String Enter = calfield.getText()+jbtn8.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
      String Enter = calfield.getText()+jbtn9.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndotActionPerformed
        String Enter = calfield.getText()+jbtndot.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtndotActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        String Enter = calfield.getText()+jbtn0.getText();
        calfield.setText(Enter);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndActionPerformed
      first = Double.parseDouble(calfield.getText());
        calfield.setText("");
       operator=4;
    }//GEN-LAST:event_jbtndActionPerformed

    private void jbtnpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnpActionPerformed
       first = Double.parseDouble(calfield.getText());
        calfield.setText("");
       operator=1;
    }//GEN-LAST:event_jbtnpActionPerformed

    private void jbtnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsActionPerformed
       first = Double.parseDouble(calfield.getText());
        calfield.setText("");
       operator=2;
    }//GEN-LAST:event_jbtnsActionPerformed

    private void jbtnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmActionPerformed
       first = Double.parseDouble(calfield.getText());
        calfield.setText("");
       operator=3;
    }//GEN-LAST:event_jbtnmActionPerformed

    private void jbtnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnmodActionPerformed
     first = Double.parseDouble(calfield.getText());
        calfield.setText("");
       operator=5;
    }//GEN-LAST:event_jbtnmodActionPerformed

    private void jbtnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnclearActionPerformed
      calfield.setText(" ");
    }//GEN-LAST:event_jbtnclearActionPerformed

    private void jbtndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndelActionPerformed
      String s=calfield.getText();
     calfield.setText("");
     for(int i=0;i<s.length()-1;i++)
         calfield.setText(calfield.getText()+s.charAt(i));
    }//GEN-LAST:event_jbtndelActionPerformed

    private void jbtneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneActionPerformed
          second = Double.parseDouble(calfield.getText());
           switch(operator){
               case 1:result=first+second;
               break;
               case 2:result=first-second;
               break;
               case 3:result=first*second;
               break;
               case 4:result=first/second;
               break;
               case 5:result=first%second;
               break;
                default:result=0;
     
           }
           calfield.setText(" "+result);
    }//GEN-LAST:event_jbtneActionPerformed



//ttt
    
    private void determineTurn(){
        if(turn.equalsIgnoreCase("x"))
        {
            turn = "O";
        }
        else{
        turn="X";
        }
    }
private void Xwin(){
JOptionPane.showMessageDialog(this,"player one wins","winner",
        JOptionPane.INFORMATION_MESSAGE);
reset();
}
private void Owin(){
JOptionPane.showMessageDialog(this,"player two wins","winner",
        JOptionPane.INFORMATION_MESSAGE);
reset();
}
private void tie(){
    String one = jButtonA.getText();
String two = jButtonB.getText();
String three = jButtonC.getText();
String four = jButtonD.getText();
String five = jButtonE.getText();
String six = jButtonF.getText();
String seven = jButtonG.getText();
String eight = jButtonH.getText();
String nine = jButtonI.getText();

if(one!=""&&two!=""&&three!=""&&four!=""&&five!=""&&six!=""&&seven!=""&&
        eight!=""&&nine!=""){
JOptionPane.showMessageDialog(this,"no one wins",
        "tiegame",JOptionPane.INFORMATION_MESSAGE);
reset();
}}

private void reset(){
jButtonA.setText("");
jButtonB.setText("");
jButtonC.setText("");
jButtonD.setText("");
jButtonE.setText("");
jButtonF.setText("");
jButtonG.setText("");
jButtonH.setText("");
jButtonI.setText("");

}
private void Ifwin(){
String one = jButtonA.getText();
String two = jButtonB.getText();
String three = jButtonC.getText();
String four = jButtonD.getText();
String five = jButtonE.getText();
String six = jButtonF.getText();
String seven = jButtonG.getText();
String eight = jButtonH.getText();
String nine = jButtonI.getText();



if(one == "X"&& two == "X"&& three == "X")
{
 Xwin();   
}
if(four == "X"&& five == "X"&& six == "X")
{
 Xwin();   
}
if(seven == "X"&& eight == "X"&& nine == "X")
{
 Xwin();   
}
if(one == "X"&& four == "X"&& seven == "X")
{
 Xwin();   
}
if(two == "X"&& five == "X"&& eight == "X")
{
 Xwin();   
}
if(three == "X"&& six == "X"&& nine == "X")
{
 Xwin();   
}
if(one == "X"&& five == "X"&& nine == "X")
{
 Xwin();   
}
if(three == "X"&& five == "X"&& seven == "X")
{
 Xwin();   
}
// if owins
if(one == "O"&& two == "O"&& three == "O")
{
 Owin();   
}
if(four == "O"&& five == "O"&& six == "O")
{
 Owin();   
}
if(seven == "O"&& eight == "O"&& nine == "O")
{
 Owin();   
}
if(one == "O"&& four == "O"&& seven == "O")
{
 Owin();   
}
if(two == "O"&& five == "O"&& eight == "O")
{
 Owin();   
}
if(three == "O"&& six == "O"&& nine == "O")
{
 Owin();   
}
if(one == "O"&& five == "O"&& nine == "O")
{
 Owin();   
}
if(three=="O"&& five=="O"&& seven=="O")
{
 Owin();   
}
}

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        jButtonB.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonB.setForeground(Color.red);
         }else{
                 jButtonB.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
       jButtonA.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonA.setForeground(Color.red);
         }else{
                 jButtonA.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jButtonC.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonC.setForeground(Color.red);
         }else{
                 jButtonC.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
jButtonD.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonD.setForeground(Color.red);
         }else{
                 jButtonD.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
       jButtonE.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonE.setForeground(Color.red);
         }else{
                 jButtonE.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        jButtonF.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonF.setForeground(Color.red);
         }else{
                 jButtonF.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
     jButtonG.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonG.setForeground(Color.red);
         }else{
                 jButtonG.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
        jButtonH.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonH.setForeground(Color.red);
         }else{
                 jButtonH.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
       jButtonI.setText(turn);
         if(turn.equalsIgnoreCase("X")){
        jButtonI.setForeground(Color.red);
         }else{
                 jButtonI.setForeground(Color.blue);
                }
            
        determineTurn();
         Ifwin();tie();
    }//GEN-LAST:event_jButtonIActionPerformed
//HOME
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       parent.removeAll();
     parent.add(home);
     parent.repaint();
     parent.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed
//CHARS
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int i,nw=0,nc=0;
      String sentence = textarea.getText();
      for(i=0;i<sentence.length();i++)
      {
          nc++;     
      }
      StringTokenizer st=new StringTokenizer(textarea.getText());
      nw+=st.countTokens();
      tfw.setText(" "+nw);
      tfc.setText(" "+nc);
    }//GEN-LAST:event_jButton1ActionPerformed

//calci(binary)
    private void jbtnbinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbinActionPerformed
        first = Double.parseDouble(calfield.getText());
        String y="";
        int num= (int)first;
        while(num>0){
            int z=num%2;
            y=" "+z+y;
            num=(num)/2;
        }
        calfield.setText(""+y);
    }//GEN-LAST:event_jbtnbinActionPerformed

    private void jbtnfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnfActionPerformed
        first = Double.parseDouble(calfield.getText());
        int num=(int)first;
        int i=num;
        while(i>1){
        num=num*(i-1);
        i--;
        
        }
        calfield.setText(""+num);
    }//GEN-LAST:event_jbtnfActionPerformed

    private void ipbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipbtnActionPerformed
    
        String host;
        host=iptf.getText();
        try{
        InetAddress ad=InetAddress.getByName(host);
        JOptionPane.showMessageDialog(this,"ip address:"+ad.toString());
        }
        catch(UnknownHostException e){
            JOptionPane.showMessageDialog(this,"could not find "+host);
        }
    }//GEN-LAST:event_ipbtnActionPerformed

 
    
public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javaapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField calfield;
    private javax.swing.JPanel calp;
    private javax.swing.JPanel charp;
    private javax.swing.JPanel home;
    private javax.swing.JButton ipbtn;
    private javax.swing.JTextField iptf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnbin;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtnd;
    private javax.swing.JButton jbtndel;
    private javax.swing.JButton jbtndot;
    private javax.swing.JButton jbtne;
    private javax.swing.JButton jbtnf;
    private javax.swing.JButton jbtnm;
    private javax.swing.JButton jbtnmod;
    private javax.swing.JButton jbtnp;
    private javax.swing.JButton jbtns;
    private javax.swing.JPanel padp;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel parent;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextField tfc;
    private javax.swing.JTextField tfw;
    private javax.swing.JPanel tttp;
    // End of variables declaration//GEN-END:variables

    private boolean charAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
