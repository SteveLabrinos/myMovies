package mymovies;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Labrinos
 */
import javax.swing.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerJPanel = new javax.swing.JPanel();
        headerJLaber = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        populateDBButton = new javax.swing.JButton();
        fListButton = new javax.swing.JButton();
        movieSearchButton = new javax.swing.JButton();
        statisticsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        populateDBMenuItem = new javax.swing.JMenuItem();
        fListMenuItem = new javax.swing.JMenuItem();
        movieSearchMenuItem = new javax.swing.JMenuItem();
        statisticsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Αρχικό Μενού My Movies");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        headerJPanel.setBackground(new java.awt.Color(204, 255, 255));
        headerJPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        headerJLaber.setBackground(new java.awt.Color(44, 196, 158));
        headerJLaber.setDisplayedMnemonic('\u03c3');
        headerJLaber.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        headerJLaber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerJLaber.setText("<html><strong>My Movies</strong></html>");
        headerJLaber.setToolTipText("Αρχικό Μενού");
        headerJLaber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout headerJPanelLayout = new javax.swing.GroupLayout(headerJPanel);
        headerJPanel.setLayout(headerJPanelLayout);
        headerJPanelLayout.setHorizontalGroup(
            headerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerJLaber, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(575, 575, 575))
        );
        headerJPanelLayout.setVerticalGroup(
            headerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerJLaber, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Λειτουγίες Εφαρμογής", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("<html>\n<p>\nΗ εφαρμογή My Movies παρέχει τη δυνατότητα δημιουργίας λιστών για τις αγαπημένες σας ταινίες. Σε συνεργασία με τη Βάση Δεδομένων που παρέχεται από τον ιστιότοπο <a href=\"https://www.themoviedb.org\">https://www.themoviedb.org</a>, προσφέρονται οι παρακάτω λειτουργίες:\n</p>\n</html>");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("<html>\n<p><ul>\n<li>Ανάκτηση και Αποθήκευση Δεδομένων Ταινιών</li>\n<li>Διαχείριση Λιστών Αγαπημένων Ταινιών</li>\n<li>Αναζήτηση Ταινιών</li>\n<li>Στατιστικά</li>\n</ul></p><br/><br/>\n<p syle=\"font-size:15px;\"><i><span style=\"color:red;\">Σημείωση: </span>\nΜπορείτε να μεταβείτε στις παραπάνω λειτουργίες επιλέγοντας την από το αναδυόμενο μενού επιλογών ή εναλλακτικά επιλέγοντας ένα από τα παρακάτω πλήκτρα.</i></p>\n</html>");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        populateDBButton.setBackground(new java.awt.Color(204, 255, 255));
        populateDBButton.setText("<html><span style=\"font-size:15px;\">Ανάκτηση και Αποθήκευση Δεδομένων Ταινιών</span></html>");
        populateDBButton.setToolTipText("Συντόμευση πλήκτρου: F1");

        fListButton.setBackground(new java.awt.Color(204, 255, 255));
        fListButton.setText("<html><span style=\"font-size:15px;\">Διαχείριση Λιστών Αγαπημένων Ταινιών</span></html>");
        fListButton.setToolTipText("Συντόμευση πλήκτρου: F2");

        movieSearchButton.setBackground(new java.awt.Color(204, 255, 255));
        movieSearchButton.setText("<html><span style=\"font-size:15px;\">Αναζήτηση Ταινιών</span></html>");
        movieSearchButton.setToolTipText("Συντόμευση πλήκτρου: F3");
        movieSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieSearchButtonActionPerformed(evt);
            }
        });

        statisticsButton.setBackground(new java.awt.Color(204, 255, 255));
        statisticsButton.setText("<html><span style=\"font-size:15px;\">Στατιστικά</span></html>");
        statisticsButton.setToolTipText("Συντόμευση πλήκτρου: F4");

        exitButton.setBackground(new java.awt.Color(204, 255, 255));
        exitButton.setText("<html><span style=\"font-size:15px;\">Έξοδος</span></html>");
        exitButton.setToolTipText("Συντόμευση πλήκτρου: Esc");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(movieSearchButton)
                    .addComponent(populateDBButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fListButton, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addComponent(statisticsButton))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populateDBButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(movieSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(statisticsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("<html><span style=\"font-size:15px;\">Επιλογές</span></html>");

        populateDBMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        populateDBMenuItem.setText("<html><span style=\"font-size:15px;\">1. Ανάκτηση και Αποθήκευση Δεδομένων Ταινιών</span></html>");
        jMenu1.add(populateDBMenuItem);

        fListMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        fListMenuItem.setText("<html><span style=\"font-size:15px;\">2. Διαχείριση Λιστών Αγαπημένων Ταινιών</span></html>");
        fListMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fListMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(fListMenuItem);

        movieSearchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        movieSearchMenuItem.setText("<html><span style=\"font-size:15px;\">3. Αναζήτηση Ταινιών</span></html>");
        movieSearchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieSearchMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(movieSearchMenuItem);

        statisticsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        statisticsMenuItem.setText("<html><span style=\"font-size:15px;\">4. Στατιστικά</span></html>");
        jMenu1.add(statisticsMenuItem);
        jMenu1.add(jSeparator1);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitMenuItem.setText("<html><span style=\"font-size:15px;\">5. Έξοδος</span></html>");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(headerJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(headerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fListMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fListMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fListMenuItemActionPerformed

    //Μέθοδος τερματισμού εφαρμογής από το πλήκτρο εξόδου
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        exitMenuItemActionPerformed(evt);
    }//GEN-LAST:event_exitButtonActionPerformed
    
    //Μέθοδος τερματισμού εφαρμογής από την λίστα επιλογών
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int choise=JOptionPane.showConfirmDialog(new JFrame(),
                "Η εφαρμογή θα τερματιστεί.\nΘέλετε να συνεχίσετε;","Προειδοποιητικό Μήνυμα",JOptionPane.YES_NO_OPTION);
        if(choise==0) {
            dispose();
            System.exit(0);
            //  Αποδέσμευση του Entity Manager Factory και του Entity Manager
            em.close();
            managerFactory.close();
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void movieSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieSearchButtonActionPerformed
        // TODO add your handling code here:
        new MoviesSearchForm();
    }//GEN-LAST:event_movieSearchButtonActionPerformed

    private void movieSearchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieSearchMenuItemActionPerformed
        // TODO add your handling code here:
         new MoviesSearchForm();
    }//GEN-LAST:event_movieSearchMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //Δηλωσή του Entity Manager Factory και του Entity Manager στην αρχή του προγράμματος
        managerFactory=Persistence.createEntityManagerFactory("myMoviesPU");
        em=managerFactory.createEntityManager();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
        
        
        
    }
    //Αρχική δήλωση του αντικειμένου Entity Manager για τον χειρισμό των POJOs
    public static EntityManager em;
    public static EntityManagerFactory managerFactory;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JButton fListButton;
    private javax.swing.JMenuItem fListMenuItem;
    private javax.swing.JLabel headerJLaber;
    private javax.swing.JPanel headerJPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton movieSearchButton;
    private javax.swing.JMenuItem movieSearchMenuItem;
    private javax.swing.JButton populateDBButton;
    private javax.swing.JMenuItem populateDBMenuItem;
    private javax.swing.JButton statisticsButton;
    private javax.swing.JMenuItem statisticsMenuItem;
    // End of variables declaration//GEN-END:variables
}
