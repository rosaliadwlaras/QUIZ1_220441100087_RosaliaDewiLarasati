
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author INFINIX
 */
public class quiz1 extends javax.swing.JFrame {

    /**
     * Creates new form coffe
     */
    public quiz1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idMenu = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        idPesan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idHarga = new javax.swing.JTextField();
        idJP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idTotal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idBayar = new javax.swing.JTextField();
        idKembalian = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        pesan = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        idTotalP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 24)); // NOI18N
        jLabel1.setText("Kyara Coffe");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Menu");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        idMenu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silahkan Pilih Menu", "Nuttella Frappucino", "Americano", "Cappuccino", "Brown Sugar Milk Tea", " " }));
        idMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMenuActionPerformed(evt);
            }
        });
        getContentPane().add(idMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Pesanan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        idPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPesanActionPerformed(evt);
            }
        });
        getContentPane().add(idPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah Pesanan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        idHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idHargaActionPerformed(evt);
            }
        });
        getContentPane().add(idHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, -1));
        getContentPane().add(idJP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel7.setText("=========");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, 20));

        idTotal.setText("TOTAL");
        idTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTotalActionPerformed(evt);
            }
        });
        getContentPane().add(idTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 240, 90, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel8.setText("Uang Bayar");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel9.setText("Kembalian");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        idBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBayarActionPerformed(evt);
            }
        });
        getContentPane().add(idBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 120, -1));

        idKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idKembalianActionPerformed(evt);
            }
        });
        getContentPane().add(idKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 120, -1));

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        pesan.setText("Pesan");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });
        getContentPane().add(pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel10.setText("Total ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        idTotalP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTotalPActionPerformed(evt);
            }
        });
        getContentPane().add(idTotalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 150, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPesanActionPerformed

    private void idHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idHargaActionPerformed

    private void idMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMenuActionPerformed
        // TODO add your handling code here:
        switch (idMenu.getSelectedIndex()){
            case 1:
            {
                idPesan.setText(String.valueOf("Nuttella Frappucino"));
                idHarga.setText(String.valueOf("20000"));
            }
            break;
            case 2:
            {
                idPesan.setText(String.valueOf("Americano"));
                idHarga.setText(String.valueOf("13000"));
                
            }
            break;
            case 3:
            {
                idPesan.setText(String.valueOf("Cappuccino"));
                idHarga.setText(String.valueOf("14000"));
            }
            break;
            case 4:
            {
                idPesan.setText(String.valueOf("Brown Sugar Milk Tea"));
                idHarga.setText(String.valueOf("12000"));
            }
            break;
        }
        
    }//GEN-LAST:event_idMenuActionPerformed

    private void idTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTotalActionPerformed
        // TODO add your handling code here:
        double harga, jumlah, total;
            harga = Double.parseDouble(idHarga.getText());
            jumlah = Double.parseDouble(idJP.getText());
            total = harga * jumlah;
            idTotalP.setText(String.valueOf(total));
    }//GEN-LAST:event_idTotalActionPerformed

    private void idKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idKembalianActionPerformed

    private void idBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBayarActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        // TODO add your handling code here:
        double harga, bayar, hasil;
            harga = Double.parseDouble(idTotalP.getText());
            bayar = Double.parseDouble(idBayar.getText());
            hasil = bayar - harga;
            idKembalian.setText(String.valueOf(hasil));
    }//GEN-LAST:event_pesanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        idMenu.setSelectedIndex(0);
        idPesan.setText(" ");
        idHarga.setText(" ");
        idJP.setText(" ");
        idTotalP.setText(" ");
        idBayar.setText(" ");
        idKembalian.setText(" ");
    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "TERIMA KASIH TELAH MEMESAN");
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void idTotalPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTotalPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTotalPActionPerformed

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
            java.util.logging.Logger.getLogger(quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idBayar;
    private javax.swing.JTextField idHarga;
    private javax.swing.JTextField idJP;
    private javax.swing.JTextField idKembalian;
    private javax.swing.JComboBox<String> idMenu;
    private javax.swing.JTextField idPesan;
    private javax.swing.JButton idTotal;
    private javax.swing.JTextField idTotalP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton keluar;
    private javax.swing.JButton pesan;
    // End of variables declaration//GEN-END:variables
}
