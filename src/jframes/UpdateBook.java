package jframes;

import filemanager.BooksManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Book;

/**
 *
 * @author Angelo
 */
public class UpdateBook extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBook
     */
    public UpdateBook() {
        initComponents();
        panelUpdate.setVisible(false);
        this.setSize(511, 250);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnMenu = new javax.swing.JButton();
        titleFrame = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        selectBook = new javax.swing.JButton();
        panelUpdate = new javax.swing.JPanel();
        labelPrice = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        updateBook = new javax.swing.JButton();
        newPrice = new javax.swing.JSpinner();
        newStock = new javax.swing.JSpinner();
        resetUpdate = new javax.swing.JButton();
        returnMenu1 = new javax.swing.JButton();

        returnMenu.setText("VOLVER AL MEN�");
        returnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleFrame.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleFrame.setText("ACTUALIZA UN LIBRO");

        labelTitle.setText("Indica el titulo del Libro que quieres actualizar:");

        selectBook.setText("SELECCIONAR LIBRO");
        selectBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBookActionPerformed(evt);
            }
        });

        labelPrice.setText("Indica el nuevo precio del Libro seleccionado");

        labelStock.setText("Indica la nueva cantidad en inventario del Libro seleccionado");

        updateBook.setText("ACTUALIZAR LIBRO");
        updateBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookActionPerformed(evt);
            }
        });

        newPrice.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1.0d));

        newStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        resetUpdate.setText("REINICIAR PROCESO");
        resetUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUpdateLayout = new javax.swing.GroupLayout(panelUpdate);
        panelUpdate.setLayout(panelUpdateLayout);
        panelUpdateLayout.setHorizontalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUpdateLayout.createSequentialGroup()
                        .addComponent(labelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelUpdateLayout.createSequentialGroup()
                        .addComponent(labelStock, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelUpdateLayout.createSequentialGroup()
                        .addGroup(panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newStock, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPrice, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(17, 17, 17))))
            .addGroup(panelUpdateLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(192, 192, 192))
        );
        panelUpdateLayout.setVerticalGroup(
            panelUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdateLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(updateBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        returnMenu1.setText("VOLVER AL MEN�");
        returnMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(titleFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addComponent(panelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBookActionPerformed
        if (title.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El campo t�tulo no puede estar vac�o.", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            if (BooksManager.bookExists(new Book("", title.getText(), 0, 0))) {
                this.setSize(511, 450);
                title.setEditable(false);
                selectBook.setEnabled(false);
                panelUpdate.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "LOG ERROR: Ese libro no existe. Por favor, indica otro libro.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(UpdateBook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_selectBookActionPerformed

    private void updateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookActionPerformed
        try {
            BooksManager.updateBook(title.getText(), Double.parseDouble(newPrice.getValue().toString()), Integer.parseInt(newStock.getValue().toString()));
            JOptionPane.showMessageDialog(this, "LOG: El libro ha sido actualizado con �xito.");
            returnMenu1ActionPerformed(evt);
        } catch (IOException ex) {
            Logger.getLogger(UpdateBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBookActionPerformed

    private void returnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMenuActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_returnMenuActionPerformed

    private void returnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMenu1ActionPerformed
        this.setVisible(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_returnMenu1ActionPerformed

    private void resetUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetUpdateActionPerformed
        this.setVisible(false);
        UpdateBook update = new UpdateBook();
        update.setLocationRelativeTo(this);
        update.setVisible(true);
    }//GEN-LAST:event_resetUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JSpinner newPrice;
    private javax.swing.JSpinner newStock;
    private javax.swing.JPanel panelUpdate;
    private javax.swing.JButton resetUpdate;
    private javax.swing.JButton returnMenu;
    private javax.swing.JButton returnMenu1;
    private javax.swing.JButton selectBook;
    private javax.swing.JTextField title;
    private javax.swing.JLabel titleFrame;
    private javax.swing.JButton updateBook;
    // End of variables declaration//GEN-END:variables
}
