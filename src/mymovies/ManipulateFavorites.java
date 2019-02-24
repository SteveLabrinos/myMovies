package mymovies;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import model.FavoriteList;
import model.Movie;

/**
 *
 * @author Iliana
 */
public class ManipulateFavorites extends javax.swing.JFrame {

    /**
     * Creates new form ManipulateFavorites
     */
    private MainMenu parent;
    private Query _qGetFavLists;
    List<FavoriteList> favoriteLists = new ArrayList<>();
//    private Query _moviesQuery;
    public ManipulateFavorites(MainMenu parent) {
        this.parent=parent;
        initComponents();
        
        populateFavListTable();
    }
    
    /**
     * μέθοδος που γεμίζει τον πίνακα Movies με τις ταινίες της
     * επιλεγμένης λίστας αγαπημένων
     * @param favListID 
     */
    private void populateMovieTable(Integer favListID){
        Object[] moviesCols = new Object[] {"Rating","Overview","Release Date","Title","Id"};
        DefaultTableModel tm;
        FavoriteList theSelectedList = favoriteLists.stream()
                .filter(l -> l.getId().equals(favListID))
                .findFirst()
                .orElse(null);
        
        tm = new DefaultTableModel(moviesCols, 0); 
        if(theSelectedList != null){
            for (Object movie : theSelectedList.getMovieList()) {
                tm.addRow(new Object[] 
                {                 
                    ((Movie)movie).getRating(),
                    ((Movie)movie).getOverview(),
                    ((Movie)movie).getReleaseDate(),
                    ((Movie)movie).getTitle(),
                    ((Movie)movie).getId()
                });
            }
        }
        moviesTable.setModel(tm);
        
        // Format Table
        // Center the column headers
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        moviesTable.getTableHeader().setDefaultRenderer(centerRenderer);
        
        Enumeration<TableColumn> cen = moviesTable.getColumnModel().getColumns();
        while (cen.hasMoreElements()) {
            TableColumn etc = (TableColumn) cen.nextElement();
            etc.setCellRenderer(centerRenderer);
        }
        
        // Format the date column
        TableCellRenderer tableCellRenderer = new DefaultTableCellRenderer() {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            
            public Component getTableCellRendererComponent(JTable table, 
            Object value, boolean isSelected, boolean hasFocus, int row, 
            int col) { 
                DefaultTableCellRenderer renderer = 
                   new DefaultTableCellRenderer(); 
                Component c = renderer.getTableCellRendererComponent(table, 
                   value, isSelected, hasFocus, row, col); 
                String s = ""; 
                if (col == 2) {                   
                    if( value instanceof Date) {
                        s = f.format((Date)value);
                        value = f.format(value);
                    }
                   c = renderer.getTableCellRendererComponent(table, s, 
                      isSelected, hasFocus, row, col); 
                   ((JLabel) c).setHorizontalAlignment(SwingConstants.CENTER); 
                } 
            return c; 
            } 
        };        
        moviesTable.getColumnModel().getColumn(2).setCellRenderer(tableCellRenderer);
    }
    
    /**
     * Γεμίζει τον πίνακα των λιστών με τις αγαπημένες ταινίες.
     */
    private void populateFavListTable() {
        // Create Tables
        Object[] favListCols = new Object[] {"Id","Name"};
        DefaultTableModel tm;
        
        // Δημιουργούνται οι στήλες του πίνακα moviesTable
        tm = new DefaultTableModel(favListCols, 0); 
        
        // Τρέχει το query για την ανάκτηση όλων των λιστών από τη βάση...
        _qGetFavLists = MainMenu.em.createNamedQuery("FavoriteList.findAll", FavoriteList.class);
        
        // ...και οι λίστες φορτώνοντε μια προς μια στον πίνακα
        favoriteLists.clear();
        for (Object lstFav : _qGetFavLists.getResultList()) {
            tm.addRow(new Object[] {((FavoriteList)lstFav).getId(), ((FavoriteList)lstFav).getName()});
            // Βάζει στη λίστα όλα τα αντικείμενα
            // τύπου FavoriteList για χρήση από την populateMovieTable
            MainMenu.em.refresh(lstFav); // Refresh the Entity Object
            favoriteLists.add((FavoriteList)lstFav);  
        }
        favListsTable.setModel(tm);
        
        // Format Tables
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        favListsTable.getTableHeader().setDefaultRenderer(centerRenderer);
        favListsTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        headerJLaber = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        favListsTableScrollPane = new javax.swing.JScrollPane();
        favListsTable = new javax.swing.JTable();
        moviesTableScrollPane = new javax.swing.JScrollPane();
        moviesTable = new javax.swing.JTable();
        panelBottom = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        panelInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Διαχείριση Λιστών Αγαπημένων Ταινιών");
        setMinimumSize(new java.awt.Dimension(470, 600));
        setPreferredSize(new java.awt.Dimension(1063, 564));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelHeader.setBackground(new java.awt.Color(204, 255, 255));
        panelHeader.setPreferredSize(new java.awt.Dimension(470, 50));

        headerJLaber.setBackground(new java.awt.Color(44, 196, 158));
        headerJLaber.setDisplayedMnemonic('\u03c3');
        headerJLaber.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        headerJLaber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerJLaber.setText("<html><span style=\"font-size:20px;\">Διαχείριση Λιστών Αγαπημένων Ταινιών</span></html>");
        headerJLaber.setToolTipText("Διαχείρiση Λιστών Αγαπημένων Ταινιών");
        headerJLaber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        headerJLaber.setPreferredSize(new java.awt.Dimension(470, 25));

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerJLaber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerJLaber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.setPreferredSize(new java.awt.Dimension(470, 206));

        btnCreate.setText("Δημιουργία");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnChange.setText("Επεξεργασία");
        btnChange.setEnabled(false);
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDelete.setText("Διαγραφή");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        favListsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favListsTableMouseClicked(evt);
            }
        });
        favListsTableScrollPane.setViewportView(favListsTable);

        moviesTable.getTableHeader().setReorderingAllowed(false);
        moviesTableScrollPane.setViewportView(moviesTable);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(favListsTableScrollPane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(moviesTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(18, 18, 18)
                        .addComponent(btnChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addComponent(favListsTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moviesTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
        );

        panelBottom.setMinimumSize(new java.awt.Dimension(100, 50));
        panelBottom.setPreferredSize(new java.awt.Dimension(790, 50));

        exitButton.setBackground(new java.awt.Color(204, 255, 255));
        exitButton.setText("<html><span style=\"font-size:15px;\">Επιστροφή στο Κεντρικό Μενού</span></html>");
        exitButton.setToolTipText("Συντόμευση πλήκτρου: Esc");
        exitButton.setMargin(new java.awt.Insets(10, 10, 10, 10));
        exitButton.setPreferredSize(new java.awt.Dimension(430, 33));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBottomLayout = new javax.swing.GroupLayout(panelBottom);
        panelBottom.setLayout(panelBottomLayout);
        panelBottomLayout.setHorizontalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1562, Short.MAX_VALUE)
            .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBottomLayout.createSequentialGroup()
                    .addContainerGap(476, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(350, 350, 350)))
        );
        panelBottomLayout.setVerticalGroup(
            panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(panelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Πληροφορίες", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 51, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("<html> <p>Με τη λειτουργία αυτή παρέχεται η δυνατότητα προβολής και διαχείρισης των λιστών αγαπημένων ταινιών. </li> <li> Με το πλήκτρο <span style=\"color:blue;\"><b>Δημιουργία </span>, καταχωρείται νέα λίστα αγαπημένων </li> <li> Με το πλήκτρο <span style=\"color:blue;\"><b>Επεξεργασία</span>, δίνεται η δυνατότητα μετονομασίας μιας λίστας </li> <li> Με το πλήκτρο <span style=\"color:blue;\"><b>Διαγραφή </span>, διαγράφεται μία ή και περισσότερες λίστες");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelInfoLayout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(panelInfoLayout);
        panelInfoLayout.setHorizontalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap())
        );
        panelInfoLayout.setVerticalGroup(
            panelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1572, Short.MAX_VALUE)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1572, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, 1562, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        
    }//GEN-LAST:event_formInternalFrameClosed
    
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        parent.setEnabled(true);
        parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void favListsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favListsTableMouseClicked

        try {
            // Enable changes button only if one row is selected.
            btnChange.setEnabled(favListsTable.getSelectedRows().length == 1);

            // Enable deletions button when at least on row is selected.
            btnDelete.setEnabled(favListsTable.getSelectedRows().length >= 1);

            // Καλείται η παρακάτω μέθοδος με παράμετρο
            // το ID της επιλεγμένης λίστας
            populateMovieTable(Integer.parseInt(favListsTable.getModel().getValueAt(favListsTable.getSelectedRows()[0], 0).toString()));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Exception occur" + ex.getMessage());
        }
    }//GEN-LAST:event_favListsTableMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        EntityTransaction tx = MainMenu.em.getTransaction();        
        
        try {
            int dialogResult = JOptionPane.showConfirmDialog (null, "Θέλετε να διαγραφούν οι επιλεγμένες λίστες?","ΠΡΟΣΟΧΗ !!!",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.NO_OPTION){
                return;
            }
            tx.begin();
            // Delete selected lists
            int[] selected = favListsTable.getSelectedRows();
            for (int idx = 0; idx < selected.length; idx++) {
                int listId = Integer.parseInt(favListsTable.getModel().getValueAt(selected[idx], 0).toString());
 
                // Get the current list
                FavoriteList favList = (FavoriteList)_qGetFavLists.getResultList()
                    .stream()
                    .filter(fl -> ((FavoriteList)fl).getId().equals(listId))
                    .findFirst()
                    .orElse(null);
                // Get the list of movies bound to the above list
                List<Movie> moviesToUpdate = favList.getMovieList();
                if(moviesToUpdate.size() > 0){
                    for(Movie m : moviesToUpdate){
                        m.setFavoriteListId(null);
                        MainMenu.em.persist(m);
                    }
                }
                // Remove the fav list
                MainMenu.em.remove(favList);
            }
            tx.commit();
            ((DefaultTableModel)moviesTable.getModel()).setRowCount(0);            
            populateFavListTable();
        }
        catch(Exception ex){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Exception occur" + ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        EntityTransaction tx = MainMenu.em.getTransaction();
        
        try {
            // Ask for the new name
            String listName = favListsTable.getModel().getValueAt(favListsTable.getSelectedRows()[0], 1).toString();
            int listId = Integer.parseInt(favListsTable.getModel().getValueAt(favListsTable.getSelectedRows()[0], 0).toString());
            TitleMessageBox msgBox = new TitleMessageBox("Επεξεργασία νέας λίστας", listName);

            msgBox.setModal(true);
            msgBox.setVisible(true);
            listName = msgBox.getPreDefMessage();

            // Get a reference to selected favorite list
            tx.begin();
            _qGetFavLists = MainMenu.em.createNamedQuery("FavoriteList.findById");
            _qGetFavLists.setParameter("id", listId);            
            FavoriteList favList = (FavoriteList)_qGetFavLists.getResultList()
                    .stream()
                    .filter(fl -> ((FavoriteList)fl).getId() == listId)
                    .findFirst()
                    .orElse(null);
            if(favList != null) {
                MainMenu.em.persist(favList);
                favList.setName(listName);
                
                populateFavListTable();
            }
            tx.commit();
        }
        catch(Exception ex){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Exception occur" + ex.getMessage());
        }
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        EntityTransaction tx = MainMenu.em.getTransaction();
        
        try {
            TitleMessageBox msgBox = new TitleMessageBox("Δημιουργία νέας λίστας", "");

            msgBox.setModal(true);
            msgBox.setVisible(true);

            // Επιβεβαιώνουμε ότι ο χρήστης θέλει όντως να δημιουργήσει τη λίστα
            if(msgBox.getPreDefMessage().trim().equals("") &&
                msgBox.getUserButtonSelection()==TitleMessageBox.ButtonPressed.AcceptButtonPressed){
                JOptionPane.showMessageDialog(null, "Δεν μπορείτε να αποθηκεύσετε λίστα αγαπημένων με κενό όνομα.");
                return;
            }
            else
            if(msgBox.getUserButtonSelection()==TitleMessageBox.ButtonPressed.CancelButtonPressed)
            return;

            // Η λίστα δημιουργήται στη ΒΔ
            FavoriteList favList = new FavoriteList(msgBox.getPreDefMessage().trim());
            tx.begin();            
            MainMenu.em.persist(favList);
            tx.commit();
            populateFavListTable();
        }
        catch(Exception ex){
            tx.rollback();
            JOptionPane.showMessageDialog(null, "Exception occur" + ex.getMessage());
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int dialogResult = JOptionPane.showConfirmDialog (null, "Θέλετε να κλείσετε τη λειτουργία  'Διαχείριση Λιστών Αγαπημένων Ταινιών' ?","ΠΡΟΣΟΧΗ !!!",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.NO_OPTION){
            return;
        }
        exitButtonActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton exitButton;
    private javax.swing.JTable favListsTable;
    private javax.swing.JScrollPane favListsTableScrollPane;
    private javax.swing.JLabel headerJLaber;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable moviesTable;
    private javax.swing.JScrollPane moviesTableScrollPane;
    private javax.swing.JPanel panelBottom;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables

}
