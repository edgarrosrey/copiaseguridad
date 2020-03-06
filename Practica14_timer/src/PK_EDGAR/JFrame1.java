package PK_EDGAR;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.text.DecimalFormat;

public class JFrame1 extends javax.swing.JFrame {
//Global Declarations:

    Timer timer1;
    int interva = 1;
    int seg, min, h;
    static DecimalFormat df = new DecimalFormat("00");

//Builder
    public JFrame1() {
        initComponents();
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setLocationRelativeTo(this);
        timer1 = new Timer(interva, taskPerformer);
    }
    ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            // tarea  del timer
            seg++;
            ckSG.setText(df.format(seg));

            if (seg == 60) {
                ckSG.setText("00");
                seg = 0;
                min++;
                ckMin.setText(df.format(min));
            }

            if (min == 60) {
                ckMin.setText("00");
                min = 0;
                h++;
                ckH.setText(df.format(h));

            }
            if (h == 24) {
                ckMin.setText("00");
                ckSG.setText("00");
                ckH.setText("00");
                h = 0;
                min = 0;
                seg = 0;
            }

        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButtonTimer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ckH = new javax.swing.JLabel();
        ckMin = new javax.swing.JLabel();
        ckSG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tnt-bomba-tiempo-timebomb-reloj_79145-371.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTimer.setBackground(new java.awt.Color(35, 43, 46));
        jButtonTimer.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jButtonTimer.setForeground(new java.awt.Color(255, 255, 255));
        jButtonTimer.setText("START");
        jButtonTimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButtonTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimerActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 140, 40));

        jPanel1.setBackground(new java.awt.Color(41, 39, 42));

        ckH.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ckH.setForeground(new java.awt.Color(255, 51, 51));
        ckH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckH.setText("00");

        ckMin.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ckMin.setForeground(new java.awt.Color(255, 51, 51));
        ckMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckMin.setText("00");

        ckSG.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        ckSG.setForeground(new java.awt.Color(255, 51, 51));
        ckSG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ckSG.setText("00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckH, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ckMin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckSG, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckSG)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckMin)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 240, 130));

        jButton1.setBackground(new java.awt.Color(219, 51, 59));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("RESET");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 70, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tnt-bomba-tiempo-timebomb-reloj_79145-371.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimerActionPerformed
        String start = "START";
        String stop = "STOP";
        String state;
        state = jButtonTimer.getText();
        if (state == stop) {
            jButtonTimer.setText("START");
            timer1.stop();
        } else {
            jButtonTimer.setText("STOP");
            timer1.start();
        }
    }//GEN-LAST:event_jButtonTimerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ckMin.setText("00");
        ckSG.setText("00");
        ckH.setText("00");
        h = 0;
        min = 0;
        seg = 0;
        timer1.stop();
        jButtonTimer.setText("START");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ckH;
    private javax.swing.JLabel ckMin;
    private javax.swing.JLabel ckSG;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonTimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
