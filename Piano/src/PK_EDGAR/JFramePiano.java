
package PK_EDGAR;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JFramePiano extends javax.swing.JFrame {
//Global declarations

    JButton jbt[]; //array defination
    String[] arrayNotas;
    String letters;
    int count = 0;
 //Builder
    public JFramePiano() {
        initComponents();
        initConfig();
        keyboardlistener();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(254, 24, 45));

    }
    //el listener del teclado

    private void keyboardlistener() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(final KeyEvent e) {
                synchronized (JFramePiano.class) {
                    readKeyBoard(e);
                    return false;
                }
            }
        });
    }//fin del listener

//gestión de la Tecla apretada:
    public void readKeyBoard(KeyEvent event) {
        char letter = event.getKeyChar();
        count++;
        if (count == 2) {
            int num=letters.indexOf(letter);
            sound(arrayNotas[num]);
           // System.out.println("" + letter);
           // JOptionPane.showMessageDialog(this, letter);
            count = 0;
        }
    }

    private void sound1(String nota) throws MalformedURLException { //"Do"
        // this.getClass().getResource("notas\\Do.wav");
        String path = System.getProperty("user.dir");
        path += "\\notas\\" + nota + ".wav";
        File file = new File(path); //transformar el string de la ruta en file de music para que suene
        URL url = file.toURL();
        AudioClip audioclip = java.applet.Applet.newAudioClip(url);
        audioclip.play();
    }

    private void sound(String nota) {
        String sNota = "/notas/" + nota + ".wav";
        AudioClip audioClip;
        audioClip = java.applet.Applet.newAudioClip(getClass().getResource(sNota));
        audioClip.play();//System.out.println(sNota);}
    }
    

     private void initConfig() {
        getContentPane().setBackground(Color.blue);
        this.setExtendedState(MAXIMIZED_BOTH);
        //screen dimension
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screen.width;
        int height = screen.height;

        jPanel1.setLocation((width - jPanel1.getWidth()) / 2, (height - jPanel1.getHeight()));
        jbt = new JButton[]{Bt00, Bt01, Bt02, Bt03, Bt04, Bt05, Bt06, Bt07, Bt08, Bt09, Bt10, Bt11, Bt12};
        for (int i = 0; i < jbt.length; i++) { //recorrer los elementos del array
            jbt[i].setName(i + "");
        
        }
         arrayNotas = new String[] {"DO", "RE", "MI", "FA", "SOL", "LA", "SI", "DO2","DOSHARP","RESHARP","FASHARP","SOLSHARP","LASHARP"};
         letters="asdfghjqwerty";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Bt08 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bt09 = new javax.swing.JButton();
        Bt00 = new javax.swing.JButton();
        Bt01 = new javax.swing.JButton();
        Bt02 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Bt10 = new javax.swing.JButton();
        Bt11 = new javax.swing.JButton();
        Bt12 = new javax.swing.JButton();
        Bt03 = new javax.swing.JButton();
        Bt04 = new javax.swing.JButton();
        Bt05 = new javax.swing.JButton();
        Bt06 = new javax.swing.JButton();
        ButtonPause = new javax.swing.JButton();
        ButtonBehind = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Bt07 = new javax.swing.JButton();
        ButtonPlay = new javax.swing.JButton();
        ButtonAhead = new javax.swing.JButton();
        ButtonPRec = new javax.swing.JButton();
        ButtonRec = new javax.swing.JButton();
        ButtonSave = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Bt12AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.setLayout(null);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DO#");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 200, 70, 20);

        Bt08.setBackground(new java.awt.Color(0, 0, 0));
        Bt08.setActionCommand("jButtonDO#");
        Bt08.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt08.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt08);
        Bt08.setBounds(220, 80, 70, 150);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 360, 80, 40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MI");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 360, 80, 40);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("RE#");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(300, 200, 70, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DO");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 370, 80, 30);

        Bt09.setBackground(new java.awt.Color(0, 0, 0));
        Bt09.setActionCommand("jButtonRE#");
        Bt09.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt09.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt09);
        Bt09.setBounds(300, 80, 70, 150);

        Bt00.setBackground(new java.awt.Color(255, 255, 255));
        Bt00.setActionCommand("jButtonDO");
        Bt00.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt00.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt00);
        Bt00.setBounds(170, 80, 80, 320);

        Bt01.setBackground(new java.awt.Color(255, 255, 255));
        Bt01.setActionCommand("jButtonRE");
        Bt01.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt01.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt01);
        Bt01.setBounds(250, 80, 80, 320);

        Bt02.setBackground(new java.awt.Color(255, 255, 255));
        Bt02.setActionCommand("jButtonMI");
        Bt02.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt02.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt02);
        Bt02.setBounds(330, 80, 80, 320);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 370, 80, 20);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SOL");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 370, 80, 20);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LA");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(570, 370, 80, 20);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("FA#");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(450, 200, 70, 20);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SOL#");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(530, 200, 70, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LA#");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(610, 200, 70, 20);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SI");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(650, 370, 80, 20);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("DO");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(730, 370, 80, 20);

        Bt10.setBackground(new java.awt.Color(0, 0, 0));
        Bt10.setActionCommand("jButtonFA#");
        Bt10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt10);
        Bt10.setBounds(450, 80, 70, 150);

        Bt11.setBackground(new java.awt.Color(0, 0, 0));
        Bt11.setActionCommand("jButtonSOL#");
        Bt11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt11);
        Bt11.setBounds(530, 80, 70, 150);

        Bt12.setBackground(new java.awt.Color(0, 0, 0));
        Bt12.setActionCommand("jButtonLA#");
        Bt12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt12);
        Bt12.setBounds(610, 80, 70, 150);

        Bt03.setBackground(new java.awt.Color(255, 255, 255));
        Bt03.setActionCommand("jButtonFA");
        Bt03.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt03.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt03);
        Bt03.setBounds(410, 80, 80, 320);

        Bt04.setBackground(new java.awt.Color(255, 255, 255));
        Bt04.setActionCommand("jButtonSOL");
        Bt04.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt04.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt04);
        Bt04.setBounds(490, 80, 80, 320);

        Bt05.setBackground(new java.awt.Color(255, 255, 255));
        Bt05.setActionCommand("jButtonLA");
        Bt05.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt05.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt05);
        Bt05.setBounds(570, 80, 80, 320);

        Bt06.setBackground(new java.awt.Color(255, 255, 255));
        Bt06.setActionCommand("jButtonSI");
        Bt06.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt06.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt06);
        Bt06.setBounds(650, 80, 80, 320);

        ButtonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pausa.png"))); // NOI18N
        jPanel1.add(ButtonPause);
        ButtonPause.setBounds(490, 30, 60, 40);

        ButtonBehind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        jPanel1.add(ButtonBehind);
        ButtonBehind.setBounds(420, 30, 60, 40);

        jLabel14.setText("DO");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(150, 500, 15, 14);

        Bt07.setBackground(new java.awt.Color(255, 255, 255));
        Bt07.setActionCommand("jButtonDO2");
        Bt07.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bt07.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Bt07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        jPanel1.add(Bt07);
        Bt07.setBounds(730, 80, 80, 320);

        ButtonPlay.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        ButtonPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        ButtonPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ButtonPlay);
        ButtonPlay.setBounds(560, 30, 60, 40);

        ButtonAhead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delante.png"))); // NOI18N
        jPanel1.add(ButtonAhead);
        ButtonAhead.setBounds(630, 30, 65, 40);

        ButtonPRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ppp.png"))); // NOI18N
        jPanel1.add(ButtonPRec);
        ButtonPRec.setBounds(360, 30, 50, 40);

        ButtonRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grabar.png"))); // NOI18N
        jPanel1.add(ButtonRec);
        ButtonRec.setBounds(300, 30, 50, 40);

        ButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jPanel1.add(ButtonSave);
        ButtonSave.setBounds(10, 10, 50, 50);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(940, 391, 50, 40);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("ABOUT");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(903, 20, 80, 30);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classic Piano", "Electric Piano", "Grand piano" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 30, 120, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 1000, 440));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 74)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Virtual Piano");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 780, 130));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Bt12AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Bt12AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Bt12AncestorAdded

    private void Bt00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt00ActionPerformed
        JButton jbt = (JButton) evt.getSource();
        System.out.println(jbt);
        //JOptionPane.showMessageDialog(jbt, jbt.getName());

        //Detectar la nota
       
        int numeroDeTecla = Integer.parseInt(jbt.getName());
        //JOptionPane.showMessageDialog(null, arrayNotas[numeroDeTecla]);
        sound(arrayNotas[numeroDeTecla]);
    }//GEN-LAST:event_Bt00ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ABOUT fra = new ABOUT();
        fra.setVisible(true);
        this.setResizable(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePiano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePiano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt00;
    private javax.swing.JButton Bt01;
    private javax.swing.JButton Bt02;
    private javax.swing.JButton Bt03;
    private javax.swing.JButton Bt04;
    private javax.swing.JButton Bt05;
    private javax.swing.JButton Bt06;
    private javax.swing.JButton Bt07;
    private javax.swing.JButton Bt08;
    private javax.swing.JButton Bt09;
    private javax.swing.JButton Bt10;
    private javax.swing.JButton Bt11;
    private javax.swing.JButton Bt12;
    private javax.swing.JButton ButtonAhead;
    private javax.swing.JButton ButtonBehind;
    private javax.swing.JButton ButtonPRec;
    private javax.swing.JButton ButtonPause;
    private javax.swing.JButton ButtonPlay;
    private javax.swing.JButton ButtonRec;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
