/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import javax.swing.ImageIcon;

/**
 *
 * @author Muchwat
 */
public class StandbyClass extends javax.swing.JFrame {

    /**
     * Creates new form StandbyClass
     */
    public StandbyClass() {
        initComponents();
        ImageIcon x = new ImageIcon(getClass().getResource(""));
        status.setIcon(x);
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
        close = new javax.swing.JLabel();
        minz = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        logouthover = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        Container = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(926, 610));
        setMinimumSize(new java.awt.Dimension(926, 610));
        setUndecorated(true);
        setOpacity(0.0F);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/exit.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(905, 5, -1, -1));

        minz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/min.png"))); // NOI18N
        minz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minzMouseExited(evt);
            }
        });
        getContentPane().add(minz, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 5, -1, -1));

        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 38, 229, 152));

        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/status.png"))); // NOI18N
        status.setLabelFor(status);
        status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statusMouseExited(evt);
            }
        });
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 198, 229, 180));

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/settings.png"))); // NOI18N
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 389, 229, 182));

        logouthover.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logouthover.setToolTipText("Logout"); // NOI18N
        logouthover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logouthover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logouthoverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logouthoverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logouthoverMouseExited(evt);
            }
        });
        getContentPane().add(logouthover, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 542, 30, 30));

        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/log.PNG"))); // NOI18N
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 545, -1, -1));

        Container.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppPackage/backgrd.png"))); // NOI18N
        getContentPane().add(Container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 926, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
     ImageIcon x = new ImageIcon(getClass().getResource("/AppPackage/home.png"));
     home.setIcon(x);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
       ImageIcon x = new ImageIcon(getClass().getResource(""));
     home.setIcon(x);
    }//GEN-LAST:event_homeMouseExited

    private void statusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseEntered
    ImageIcon x = new ImageIcon(getClass().getResource("/AppPackage/status.png"));
     status.setIcon(x);
    }//GEN-LAST:event_statusMouseEntered

    private void statusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseExited
        ImageIcon x = new ImageIcon(getClass().getResource(""));
     status.setIcon(x);
    }//GEN-LAST:event_statusMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        ImageIcon x = new ImageIcon(getClass().getResource("/AppPackage/settings.png"));
     settings.setIcon(x);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        ImageIcon x = new ImageIcon(getClass().getResource(""));
     settings.setIcon(x);
    }//GEN-LAST:event_settingsMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
      ImageIcon fd = new ImageIcon(getClass().getResource("/AppPackage/closef.png"));
        close.setIcon(fd);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       ImageIcon fd = new ImageIcon(getClass().getResource("/AppPackage/exit.png"));
       close.setIcon(fd);
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minzMouseEntered
       ImageIcon be = new ImageIcon(getClass().getResource("/AppPackage/minf.png"));
        minz.setIcon(be);
    }//GEN-LAST:event_minzMouseEntered

    private void minzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minzMouseExited
       ImageIcon es = new ImageIcon(getClass().getResource("/AppPackage/min.png"));
        minz.setIcon(es);
    }//GEN-LAST:event_minzMouseExited

    private void minzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minzMouseClicked
      this.setState(StandbyClass.ICONIFIED);
    }//GEN-LAST:event_minzMouseClicked

    private void logouthoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouthoverMouseEntered
      ImageIcon hv = new ImageIcon(getClass().getResource("/AppPackage/logout.png"));
      logouthover.setIcon(hv);
    }//GEN-LAST:event_logouthoverMouseEntered

    private void logouthoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouthoverMouseExited
       ImageIcon hv= new ImageIcon(getClass().getResource(""));
      logouthover.setIcon(hv);
    }//GEN-LAST:event_logouthoverMouseExited

    private void logouthoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logouthoverMouseClicked
      new MainClass().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_logouthoverMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          for(double i=0.0; i<=1.0; i=i+0.1){
            String val =i+"F";
            float op = Float.valueOf(val);
            this.setOpacity(op);
            try{
                Thread.sleep(80);
            }
            catch(Exception e){
                
            }      
 
    }     
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(StandbyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandbyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandbyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandbyClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandbyClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Container;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel close;
    private javax.swing.JLabel home;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logouthover;
    private javax.swing.JLabel minz;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
