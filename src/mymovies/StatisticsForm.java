/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymovies;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import model.Movie;
import model.FavoriteList;
import javax.swing.table.*;
import java.util.List;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Labrinos
 */
public class StatisticsForm extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     *
     * @param parent
     */
    public StatisticsForm(MainMenu parent) {
        this.parent = parent;
        initComponents();
        //Παραμετροποίηση της καφαλίδας του πίνακα
        JTableHeader header=moviesTable.getTableHeader();
        header.setForeground(Color.darkGray);
        header.setFont(new Font("Tahoma",Font.BOLD,18));
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        //Ενεργοποίηση του grid για τισ γραμμές του πίνακα
        moviesTable.setShowGrid(true);
        moviesTable.setIntercellSpacing(new Dimension(0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        bodyPanel = new javax.swing.JPanel();
        fListMoviesButton = new javax.swing.JButton();
        bestMoviesButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Στατιστικά Στοιχεία Ταινιών");

        headerPanel.setBackground(new java.awt.Color(204, 255, 255));
        headerPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        headerLabel.setBackground(new java.awt.Color(44, 196, 158));
        headerLabel.setDisplayedMnemonic('\u03c3');
        headerLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        headerLabel.setText("<html><strong>Στατιστικά</strong></html>");
        headerLabel.setToolTipText("Λειτουργία εμφάνισης στατιστικών");
        headerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        infoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Πληροφορίες", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        infoPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        infoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        infoLabel.setText("<html> <p> Με τη λειτουργία <strong style=\"color:blue\">Στατιστικά</strong> παρέχεται η δυνατότητα προβολής των καλύτερων ταινιών της εφαρμογής. Συγκεκριμένα για την προβολή των αποτελεσμάτων παρέχονται οι παρακάτω επιλογές: </p> <ol> <li>Με την επιλογή του πλήκτρου <strong style=\"color:blue\">Οι Καλύτερες 10 Ταινίες</strong> εμφανίζονται ταξινομημένες σε φθίνουσα σειρά οι δέκα(10) καλύτερες ταινίες της εφαρμογής.</li> <li>Με την επιλογή του πλήκτρου <strong style=\"color:blue\">Οι Καλύτερες Ταινίες ανά Λίστα</strong> εμφανίζονται οι τίτλοι της καλύτερης ταινίας από κάθε λίστα που έχετε δημιουργήσει.</li> </ol> </html>");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        homeButton.setBackground(new java.awt.Color(204, 255, 255));
        homeButton.setText("<html><span style=\"font-size:15px;\">Επιστροφή στο Κεντρικό Μενού</span></html>");
        homeButton.setToolTipText("Συντόμευση πλήκτρου: Esc");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addGap(315, 315, 315))
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        bodyPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        fListMoviesButton.setBackground(new java.awt.Color(204, 255, 255));
        fListMoviesButton.setText("<html><span style=\"font-size:15px;\">Οι Καλύτερες Ταινίες ανά Λίστα</span></html>");
        fListMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fListMoviesButtonActionPerformed(evt);
            }
        });

        bestMoviesButton.setBackground(new java.awt.Color(204, 255, 255));
        bestMoviesButton.setText("<html><span style=\"font-size:15px;\">Οι 10 Καλύτερες Ταινίες</span></html>");
        bestMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestMoviesButtonActionPerformed(evt);
            }
        });

        moviesTable.setAutoCreateRowSorter(true);
        moviesTable.setBackground(java.awt.SystemColor.control);
        moviesTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.cyan, java.awt.Color.cyan, java.awt.Color.white));
        moviesTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        moviesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Όνομα Ταινίας", "Βαθμολογία"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        moviesTable.setColumnSelectionAllowed(true);
        moviesTable.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        moviesTable.setDragEnabled(true);
        moviesTable.setFillsViewportHeight(true);
        moviesTable.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(moviesTable);
        moviesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyPanelLayout.createSequentialGroup()
                        .addComponent(bestMoviesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fListMoviesButton))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bestMoviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fListMoviesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        parent.setEnabled(true);
        parent.setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void fListMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fListMoviesButtonActionPerformed
        /*
         * Δημιουργία ενός List από NamedQuery για την ανάκτηση
         * όλων των αγαπημένων λιστών
         */
        fLists = MainMenu.em.createNamedQuery("FavoriteList.findAll", FavoriteList.class).getResultList();

        if (!fLists.isEmpty()) {
            //Δημιουργία του μοντέλου του πίνακα με δύο στήλες και μηδέν γραμμές
            tableModel = new DefaultTableModel(BEST_MOVIES_FLIST_COLUMNS, 0);
            for (int i = 0; i < fLists.size(); i++) {
                List<Movie> fListMovies = fLists.get(i).getMovieList();
                //Εφόσον υπάρχει ταινία καταχωρημένη στην αγαπημένη λίστα
                if (!fListMovies.isEmpty()) {
                    Movie maxRatedMovie = fListMovies.get(0);
                    for (Movie m : fListMovies) {
                        if (maxRatedMovie.getRating() <= m.getRating()) {
                            maxRatedMovie = m;
                        }
                    }
                    //Προσθήκη της καλύτερης - 1ης ταινίας της λίστας στο μοντέλο του πίνακα
                    Object[] rowData = {maxRatedMovie.getTitle()};

                    tableModel.addRow(rowData);
                    //Ταξινόμηση κατά φθείνουσα σειρά
                    //fListMovies.sort(Movie.compareMoviesDesc);

                    //Προσθήκη της καλύτερης - 1ης ταινίας της λίστας στο μοντέλο του πίνακα
                    //Movie fMovie=fListMovies.get(0);
                    //Object[] rowData={fMovie.getTitle()};
                    //tableModel.addRow(rowData);
                }
            }
            if (tableModel.getRowCount() > 0) {
                //Σύνδεση του μοντέλου με τον πίνακα της φόρμας
                moviesTable.setModel(tableModel);
                //Στοίχηση των περιεχομένων του πίνακα στο κέντρο
                setCellsAlignment(moviesTable, SwingConstants.CENTER);
                
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Δεν υπάρχουν καταχωρημένες ταινίες στις λίστες αγαπημένων."
                        + "\nΠαρακαλώ επιλέξτε την λειτουργία \"Αναζήτηση Ταινιών\" ώστε να καταχωρήσετε τις ταινίες που θέλετε στις λίστες αγαπημένων ταινιών",
                        "Σφάλμα", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Δεν υπάρχουν καταχωρημένες λίστες αγαπημένων ταινιών στην εφαρμογή."
                    + "\nΠαρακαλώ επιλέξτε την λειτουργία \"Διαχείριση Λιστών Αγαπημένων Ταινιών\" ώστε να καταχωρήσετε λίστες αγαπημένων ταινιών",
                    "Σφάλμα", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fListMoviesButtonActionPerformed

    private void bestMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestMoviesButtonActionPerformed
        /*
         * Δημιουργία ενός List από NamedQuery για την ανάκτηση
         * στοιχείων των 10 καλύτερων ταινιών
         */
        
        movies = MainMenu.em.createNamedQuery("Movie.findAll", Movie.class).getResultList();

        //Ορισμός 10 γραμμών κατά μέγιστο για το μοντέλο του πίνακα
        int tableSize = (movies.size() < MAX_ROWS) ? movies.size() : MAX_ROWS;
        //Δημιουργία του μοντέλου του πίνακα με δύο στήλες και μηδέν γραμμές
        tableModel = new DefaultTableModel(BEST_MOVIES_COLUMNS, 0);
        //Ταξινόμηση των ταινιών κατά φθείνουσα σειρά βαθμολογίας
        movies.sort(Movie.compareMoviesDesc);
        //Δημιουργία αντικειμένου τύπου Object με τις τιμές του πίνακα
        for (int i = 0; i < tableSize; i++) {
            //Ορισμός του ονόματος και της βαθμολογίας κάθε ταινίας
            Object[] rowData = {movies.get(i).getTitle(), movies.get(i).getRating()};
            //Προσθήκη στο μοντέλο του πίνακα
            tableModel.addRow(rowData);
        }
        //Σύνδεση του μοντέλου με τον πίνακα της φόρμας
        moviesTable.setModel(tableModel);
        //Στοίχηση των περιεχομένων του πίνακα στο κέντρο
        setCellsAlignment(moviesTable, SwingConstants.CENTER);
        
    }//GEN-LAST:event_bestMoviesButtonActionPerformed

     public static void setCellsAlignment(JTable table, int alignment){
        //Ορισμός νέου Renderer για τη στοίχιση των περιεχομένων του πίνακα
        DefaultTableCellRenderer newRenderer = new DefaultTableCellRenderer();
        newRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();
        //Επανάληψη στοίχησης για όλες τις στήλες του πίνακα
        for (int i = 0;i<tableModel.getColumnCount();i++){
            table.getColumnModel().getColumn(i).setCellRenderer(newRenderer);
        }
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bestMoviesButton;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton fListMoviesButton;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable moviesTable;
    // End of variables declaration//GEN-END:variables
    //Δήλωση της αρχικής φόρμας ως γονέα για την επιστροφή σε αυτή
    private final MainMenu parent;
    //Δήλωση του μοντέλου πίνακα για την συμπλήρωση δεδομένων
    private DefaultTableModel tableModel;
    private List<Movie> movies;
    private List<FavoriteList> fLists;
    private final int MAX_ROWS = 10;
    private final String[] BEST_MOVIES_COLUMNS = {"Όνομα Ταινίας", "Βαθμολογία"};
    private final String[] BEST_MOVIES_FLIST_COLUMNS = {"Όνομα Ταινίας"};
}
