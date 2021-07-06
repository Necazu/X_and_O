/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x.si.pkg0;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Necazu
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    
    int tura=2;
    int dublura[]={0,0,0,0,0,0,0,0,0};
    int pion1[]={0,0,0,0,0,0,0,0,0};
    int pion2[]={0,0,0,0,0,0,0,0,0};
    int x=1,o=1;
    int pion1()
    {
        if(pion1[0]==1 && pion1[1]==1 && pion1[2]==1)
        {
            return 1;
        }
        
        if(pion1[3]==1 && pion1[4]==1 && pion1[5]==1)
        {
            return 1;
        }
        if(pion1[6]==1 && pion1[7]==1 && pion1[8]==1)
        {
            return 1;
        }
        
        if(pion1[0]==1 && pion1[3]==1 && pion1[6]==1)
        {
            return 1;
        }
        
        if(pion1[1]==1 && pion1[4]==1 && pion1[7]==1)
        {
            return 1;
        }
        
        if(pion1[2]==1 && pion1[5]==1 && pion1[8]==1)
        {
            return 1;
        }
        
        if(pion1[0]==1 && pion1[4]==1 && pion1[8]==1)
        {
            return 1;
        }
        
        if(pion1[2]==1 && pion1[4]==1 && pion1[6]==1)
        {
            return 1;
        }
        
        return 0;
    }
    
        int pion2()
    {
        if(pion2[0]==1 && pion2[1]==1 && pion2[2]==1)
        {
            return 1;
        }
        
        if(pion2[3]==1 && pion2[4]==1 && pion2[5]==1)
        {
            return 1;
        }
        if(pion2[6]==1 && pion2[7]==1 && pion2[8]==1)
        {
            return 1;
        }
        
        if(pion2[0]==1 && pion2[3]==1 && pion2[6]==1)
        {
            return 1;
        }
        
        if(pion2[1]==1 && pion2[4]==1 && pion2[7]==1)
        {
            return 1;
        }
        
        if(pion2[2]==1 && pion2[5]==1 && pion2[8]==1)
        {
            return 1;
        }
        
        if(pion2[0]==1 && pion2[4]==1 && pion2[8]==1)
        {
            return 1;
        }
        
        if(pion2[2]==1 && pion2[4]==1 && pion2[6]==1)
        {
            return 1;
        }
        
        return 0;
    }
        
    void resetare()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        tura=2;
        
        for(int i=0;i<9;i++)
        {
            dublura[i]=0;
        }
        
        for(int i=0;i<9;i++)
        {
            pion1[i]=0;
        }
        
        for(int i=0;i<9;i++)
        {
            pion2[i]=0;
        }
        
         afisarej.setText("Urmeaza:  X");
         
    }
    
    void egalitate()
    {
        int ok=1;
        for(int i=0;i<9 && ok==1;i++)
        {
            if (dublura[i]!=1)
            {
                 ok=0;
            }
        }
        if (ok==1)
        {
            JOptionPane.showMessageDialog(rootPane,"*** Egalitate ***");
             resetare();
        }
    }
    
   void negru()
   {
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.GRAY);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.GRAY);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.GRAY);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.GRAY);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.GRAY); 
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.GRAY);
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.GRAY);
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.GRAY);
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.GRAY);
        reset.setBackground(Color.BLACK);
        reset.setForeground(Color.GRAY);
        jLabel1.setBackground(Color.BLACK);
        jLabel1.setForeground(Color.GRAY);
        jLabel3.setBackground(Color.BLACK);
        jLabel3.setForeground(Color.GRAY);
        scorx.setBackground(Color.BLACK);
        scorx.setForeground(Color.GRAY);
        scoro.setBackground(Color.BLACK);
        scoro.setForeground(Color.GRAY);
        afisarej.setBackground(Color.BLACK);
        afisarej.setForeground(Color.GRAY);
        jButton1.setBackground(Color.BLACK);
        jButton1.setForeground(Color.GRAY);
        jButton2.setBackground(Color.BLACK);
        jButton2.setForeground(Color.GRAY); 
        top.setBackground(Color.BLACK);
        top.setForeground(Color.GRAY); 
   }
    
    
    public frame1() {
        initComponents();
    }
    
    public frame1(String n1,String n2)
    {
        initComponents();
        
        jLabel3.setText(n1);
        jLabel1.setText(n2);
    }
    
   public frame1(String n1,String n2, int n)
    {
        initComponents();
        
        jLabel3.setText(n1);
        jLabel1.setText(n2);
        
        negru();
        
        if(n==1)
        {
            UIManager UI=new UIManager();
            UI.put("OptionPane.background",Color.black);
            UI.put("Panel.background",Color.black);
            UI.put("OptionPane.messageForeground", Color.white);
            UI.put("Button.background", Color.black);
            UI.put("Button.foreground", Color.white);
        }
      
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scoro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scorx = new javax.swing.JLabel();
        afisarej = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        top = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setBackground(new java.awt.Color(100, 102, 41));
        b1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(249, 224, 174));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(100, 102, 41));
        b2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b2.setForeground(new java.awt.Color(249, 224, 174));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(100, 102, 41));
        b3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b3.setForeground(new java.awt.Color(249, 224, 174));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(100, 102, 41));
        b5.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b5.setForeground(new java.awt.Color(249, 224, 174));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(100, 102, 41));
        b4.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b4.setForeground(new java.awt.Color(249, 224, 174));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(100, 102, 41));
        b6.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b6.setForeground(new java.awt.Color(249, 224, 174));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(100, 102, 41));
        b7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b7.setForeground(new java.awt.Color(249, 224, 174));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(100, 102, 41));
        b8.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b8.setForeground(new java.awt.Color(249, 224, 174));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(100, 102, 41));
        b9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        b9.setForeground(new java.awt.Color(249, 224, 174));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(43, 56, 22));
        reset.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(174, 194, 118));
        reset.setText("Resetare Scor Joc");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(174, 194, 118));
        jLabel1.setText("Jucator X");

        scoro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        scoro.setForeground(new java.awt.Color(174, 194, 118));
        scoro.setText(" Scor:  0");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(174, 194, 118));
        jLabel3.setText("Jucator X");

        scorx.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        scorx.setForeground(new java.awt.Color(174, 194, 118));
        scorx.setText("Scor:   0");

        afisarej.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        afisarej.setForeground(new java.awt.Color(101, 225, 240));
        afisarej.setText("Urmeaza:  X");

        jButton1.setBackground(new java.awt.Color(43, 56, 22));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(174, 194, 118));
        jButton1.setText("Ghid Joc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(43, 56, 22));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(174, 194, 118));
        jButton2.setText("Schimba Jucatorii");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        top.setBackground(new java.awt.Color(43, 56, 22));
        top.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        top.setForeground(new java.awt.Color(174, 194, 118));
        top.setText("Top Jucatori");
        top.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topActionPerformed(evt);
            }
        });

        jMenu3.setText("Personalizare");

        jMenuItem1.setText("Butoane joc");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);
        jMenu3.add(jSeparator1);

        jMenuItem2.setText("Butoane setari");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator2);

        jMenuItem3.setText("Font");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);
        jMenu3.add(jSeparator3);

        jMenuItem4.setText("Tura font");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);
        jMenu3.add(jSeparator4);

        jMenuItem5.setText("Fundal");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator5);

        jMenuItem6.setText("Font fundal");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Setari Cont");
        jMenu4.add(jSeparator11);

        jMenuItem7.setText("Resetare scor X");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);
        jMenu4.add(jSeparator8);

        jMenuItem9.setText("Resetare scor O");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);
        jMenu4.add(jSeparator7);

        jMenuItem8.setText("Schimba nume X");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);
        jMenu4.add(jSeparator6);

        jMenuItem10.setText("Schimba nume O");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scorx, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(top, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(afisarej, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(afisarej, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scorx, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(scoro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        if(dublura[8]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b9.setText("X");
                dublura[8]=1;
                pion1[8]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b9.setText("O");
                dublura[8]=1;
                pion2[8]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        if(dublura[7]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b8.setText("X");
                dublura[7]=1;
                pion1[7]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b8.setText("O");
                dublura[7]=1;
                pion2[7]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        if(dublura[6]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b7.setText("X");
                dublura[6]=1;
                pion1[6]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b7.setText("O");
                dublura[6]=1;
                pion2[6]=1;

                afisarej.setText("Urmeaza:   X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        if(dublura[5]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b6.setText("X");
                dublura[5]=1;
                pion1[5]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b6.setText("O");
                dublura[5]=1;
                pion2[5]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b6ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        if(dublura[3]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b4.setText("X");
                dublura[3]=1;
                pion1[3]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b4.setText("O");
                dublura[3]=1;
                pion2[3]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here'
        if(dublura[4]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b5.setText("X");
                dublura[4]=1;
                pion1[4]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b5.setText("O");
                dublura[4]=1;
                pion2[4]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }

            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b5ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        if(dublura[2]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b3.setText("X");
                dublura[2]=1;
                pion1[2]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b3.setText("O");
                dublura[2]=1;
                pion2[2]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        if(dublura[1]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b2.setText("X");
                dublura[1]=1;
                pion1[1]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b2.setText("O");
                dublura[1]=1;
                pion2[1]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        if(dublura[0]==0)
        {
            if(tura%2==0)
            {
                tura++;
                b1.setText("X");
                dublura[0]=1;
                pion1[0]=1;

                afisarej.setText("Urmeaza:  O");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }
            }
            else
            {
                tura++;
                b1.setText("O");
                dublura[0]=1;
                pion2[0]=1;

                afisarej.setText("Urmeaza:  X");

                int castigator1=pion1();
                int castigator2=pion2();

                if(castigator1==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator X ***");
                    scorx.setText("Scor:  "+ x++);
                    resetare();
                }
                else if(castigator2==1)
                {
                    JOptionPane.showMessageDialog(rootPane,"***Castigator O ***");
                    scoro.setText("Scor:  "+ o++);
                    resetare();
                }

            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Casuta ocupata!");
        }
        egalitate();
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
             try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n1=jLabel3.getText();
                    
                    String sql="update topuri set scor=scor + '"+x+"'-1 where nume='"+n1+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    } 
             
                  try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n2=jLabel1.getText();
                    
                    String sql="update topuri set scor=scor + '"+o+"'-1 where nume='"+n2+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                  
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new Color(32, 40, 79));
        UI.put("Panel.background",new Color(32, 40, 79));
        UI.put("OptionPane.messageForeground", new Color(249,224,174));
        UI.put("Button.background",new Color(43,56,22));
        UI.put("Button.foreground", new Color(249,224,174));
        
        setVisible(false);
        new frame0().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,"Resetare scor -> reseteaza scorul jucatorilor"+"\n"
            +"Schimba Jucatorii -> Creaza un joc nou fara a mai inchide aplicatia"+"\n"
            +"Functia Personalizare va permite sa personalizati toate culorile jocului"+"\n"
            +"Functia resetare scor din setari cont va reseta scorul din topuri"+"\n"
            +"La apasarea butonului Top jucatori scorurile vor acctualiza cu scorul obtinut si va afisa topul");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
             try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n1=jLabel3.getText();
                    
                    String sql="update topuri set scor=scor + '"+x+"'-1 where nume='"+n1+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    } 
             
                  try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n2=jLabel1.getText();
                    
                    String sql="update topuri set scor=scor + '"+o+"'-1 where nume='"+n2+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                  
        resetare();
        x=1;
        o=1;
        scorx.setText("Scor:  0");
        scoro.setText("Scor:  0");
    }//GEN-LAST:event_resetActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
      JColorChooser jcc=new JColorChooser();
      Color c= jcc.showDialog(null,"Selecteaza o culoare",Color.RED);
      b1.setBackground(c);
      b2.setBackground(c);
      b3.setBackground(c);
      b4.setBackground(c);
      b5.setBackground(c);
      b6.setBackground(c);
      b7.setBackground(c);
      b8.setBackground(c);
      b9.setBackground(c);
      
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JColorChooser jcc=new JColorChooser();
        Color c= jcc.showDialog(null,"Selecteaza o culoare",Color.RED);
        reset.setBackground(c);
        jButton1.setBackground(c);
        jButton2.setBackground(c);
        top.setBackground(c);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JColorChooser jcc=new JColorChooser();
        Color c= jcc.showDialog(null,"Selecteaza o culoare",Color.RED);
        reset.setForeground(c);
        jButton1.setForeground(c);
        jButton2.setForeground(c);
        b1.setForeground(c);
        b2.setForeground(c);
        b3.setForeground(c);
        b4.setForeground(c);
        b5.setForeground(c);
        b6.setForeground(c);
        b7.setForeground(c);
        b8.setForeground(c);
        b9.setForeground(c);
        jLabel3.setForeground(c);
        jLabel1.setForeground(c);
        scorx.setForeground(c);
        scoro.setForeground(c);
        top.setForeground(c);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JColorChooser jcc=new JColorChooser();
        Color c= jcc.showDialog(null,"Selecteaza o culoare",Color.RED);
       afisarej.setForeground(c);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        JColorChooser jcc=new JColorChooser();
        Color c= jcc.showDialog(null,"Selecteaza o culoare",Color.RED);
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",c);
        UI.put("Panel.background",c);
      
        UI.put("Button.background",c);
    
        getContentPane().setBackground(c);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        JColorChooser jcc=new JColorChooser();
        Color c= jcc.showDialog(null,"Selecteaza o culoare",Color.RED);
        UIManager UI=new UIManager();
        UI.put("OptionPane.messageForeground",c);
        UI.put("Button.foreground",c);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void topActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topActionPerformed
        // TODO add your handling code here:
       
        String c1= jLabel3.getText();
        String c2= jLabel1.getText();
        if(!c1.equals("Jucator X") && !c1.equals("Jucator O"))   
        {    
             try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n1=jLabel3.getText();
                    
                    String sql="update topuri set scor=scor + '"+x+"'-1 where nume='"+n1+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    } 
             
                  try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n2=jLabel1.getText();
                    
                    String sql="update topuri set scor=scor + '"+o+"'-1 where nume='"+n2+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                       topurile frame = new topurile();
                        frame.setVisible(true);
                        frame.pack();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Nu aveti conturi!");
        }
   
    }//GEN-LAST:event_topActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        String c1= jLabel3.getText();
        String c2= jLabel1.getText();
        if(!c1.equals("Jucator X") && !c1.equals("Jucator O"))   
        {
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    
                    Statement stm= con.createStatement();
                    
                    String n1=jLabel3.getText();
                    String sql="update topuri set scor=0 where nume='"+n1+"'";
   
                    int rs =stm.executeUpdate(sql);
                   
                    if(rs==1)
                    {
                        JOptionPane.showMessageDialog(this, "Scorul a fost resetat");
                    
                    }
                    else
                        {
                            JOptionPane.showMessageDialog(this, "Error 404");
                        }
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    } 
	}
        else
        {
            JOptionPane.showMessageDialog(this, "Nu aveti conturi!");
        }
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
       String c1= jLabel3.getText();
        String c2= jLabel1.getText();
        if(!c1.equals("Jucator X") && !c1.equals("Jucator O"))   
        {  
  
         try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    
                    Statement stm= con.createStatement();
                    
                    String n2=jLabel1.getText();
                    String sql="update topuri set scor=0 where nume='"+n2+"'";
   
                    int rs =stm.executeUpdate(sql);
                   
                    if(rs==1)
                    {
                        JOptionPane.showMessageDialog(this, "Scorul a fost resetat");
                    }
                    else
                        {
                             JOptionPane.showMessageDialog(this, "Error 404");
                        }
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
	}
        else
        {
            JOptionPane.showMessageDialog(this, "Nu aveti conturi!");
        }      
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    String c1= jLabel3.getText();
        String c2= jLabel1.getText();
        if(!c1.equals("Jucator X") && !c1.equals("Jucator O"))   
        {      
        try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n1=jLabel3.getText();
                    
                    String sql="update topuri set scor=scor + '"+x+"'-1 where nume='"+n1+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    } 
             
                  try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n2=jLabel1.getText();
                    
                    String sql="update topuri set scor=scor + '"+o+"'-1 where nume='"+n2+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                  
                    String n1=jLabel3.getText();
                    setVisible(false);
                    conturi frame = new conturi(n1);
                    frame.setVisible(true);
                    frame.pack();
        
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Nu aveti conturi!");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        String c1= jLabel3.getText();
        String c2= jLabel1.getText();
        if(!c1.equals("Jucator X") && !c1.equals("Jucator O"))   
        {
         try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n1=jLabel3.getText();
                    
                    String sql="update topuri set scor=scor + '"+x+"'-1 where nume='"+n1+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    } 
             
                  try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/x_si_o?useSSL=false","root","Unu2trei4");
                    Statement stm= con.createStatement();
                    String n2=jLabel1.getText();
                    
                    String sql="update topuri set scor=scor + '"+o+"'-1 where nume='"+n2+"'";
                    stm.executeUpdate(sql);
                }catch(Exception e)
                    {
                        System.out.println(e.getMessage());
                    }
                  
                    String n2=jLabel1.getText();
                    setVisible(false);
                    conturi frame = new conturi(n2);
                    frame.setVisible(true);
                    frame.pack();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Nu aveti conturi!");
        }           
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afisarej;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scoro;
    private javax.swing.JLabel scorx;
    private javax.swing.JButton top;
    // End of variables declaration//GEN-END:variables
}
