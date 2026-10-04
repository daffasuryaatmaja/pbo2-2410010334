/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p03;

import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatDarkLaf;

    

/**
 *
 * @author Lenovo
 */
  public class FormPendaftaran extends javax.swing.JFrame {

    public FormPendaftaran() {
        initComponents();

        // Placeholder
        namaField.putClientProperty(
                "JTextField.placeholderText",
                "Nama lengkap"
        );

        npmField.putClientProperty(
                "JTextField.placeholderText",
                "Contoh: 2410010001"
        );

        // Tombol default ketika menekan Enter
        getRootPane().setDefaultButton(daftarButton);
    
  }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jeniskelaminGroup = new javax.swing.ButtonGroup();
        namaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        jeniskelaminLabel = new javax.swing.JLabel();
        minatLabel = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        npmField = new javax.swing.JTextField();
        prodiCombo = new javax.swing.JComboBox<>();
        lakiRadio = new javax.swing.JRadioButton();
        perempuanRadio = new javax.swing.JRadioButton();
        javaCheck = new javax.swing.JCheckBox();
        pythonCheck = new javax.swing.JCheckBox();
        webCheck = new javax.swing.JCheckBox();
        temaToggle = new javax.swing.JToggleButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pendaftaran Workshop");

        namaLabel.setText("Nama:");

        npmLabel.setText("NPM:");

        prodiLabel.setText("Prodi:");

        jeniskelaminLabel.setText("Jenis Kelamin:");

        minatLabel.setText("Minat:");

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi", "Manajemen Informatika" }));
        prodiCombo.addActionListener(this::prodiComboActionPerformed);

        jeniskelaminGroup.add(lakiRadio);
        lakiRadio.setSelected(true);
        lakiRadio.setText("Laki-Laki");

        jeniskelaminGroup.add(perempuanRadio);
        perempuanRadio.setText("Perempuan");

        javaCheck.setText("Java");
        javaCheck.addActionListener(this::javaCheckActionPerformed);

        pythonCheck.setText("Python");

        webCheck.setText("WEB");

        temaToggle.setText("Mode Gelap");
        temaToggle.addActionListener(this::temaToggleActionPerformed);

        daftarButton.setText("Daftar");
        daftarButton.addActionListener(this::daftarButtonActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(temaToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(daftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(minatLabel)
                            .addGap(81, 81, 81)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(javaCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pythonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(webCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lakiRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(perempuanRadio))
                                .addComponent(prodiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(namaLabel)
                                    .addGap(80, 80, 80))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(npmLabel)
                                    .addGap(85, 85, 85)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(npmField)
                                .addComponent(namaField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jeniskelaminLabel)
                    .addComponent(prodiLabel))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namaLabel)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npmLabel)
                    .addComponent(npmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prodiLabel)
                    .addComponent(prodiCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jeniskelaminLabel)
                    .addComponent(lakiRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perempuanRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minatLabel)
                    .addComponent(javaCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pythonCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(webCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(temaToggle)
                    .addComponent(daftarButton))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prodiComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodiComboActionPerformed

    }//GEN-LAST:event_prodiComboActionPerformed


    private void javaCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaCheckActionPerformed
            
    }//GEN-LAST:event_javaCheckActionPerformed
    private void tampilkanRingkasan() {

    String jenisKelamin =
            lakiRadio.isSelected()
                    ? "Laki-laki"
                    : "Perempuan";

    List<String> minat = new java.util.ArrayList<>();

    for (JCheckBox cb :
            List.of(javaCheck, pythonCheck, webCheck)) {

        if (cb.isSelected()) {
            minat.add(cb.getText());
        }
    }

    String pesan =
            "Nama: " + namaField.getText()
            + "\nNPM: " + npmField.getText()
            + "\nProgram Studi: " + prodiCombo.getSelectedItem()
            + "\nJenis Kelamin: " + jenisKelamin
            + "\nMinat: "
            + (minat.isEmpty()
                    ? "-"
                    : String.join(", ", minat));

    JOptionPane.showMessageDialog(
            this,
            pesan,
            "Data Pendaftaran",
            JOptionPane.INFORMATION_MESSAGE
    );
}
    private void temaToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaToggleActionPerformed
        gantiTema(temaToggle.isSelected());
}

        private void gantiTema(boolean gelap) {

    if (gelap) {
        FlatDarkLaf.setup();
        temaToggle.setText("Mode Terang");
    } else {
        FlatLightLaf.setup();
        temaToggle.setText("Mode Gelap");
    }

    FlatLaf.updateUI();
    javax.swing.SwingUtilities.updateComponentTreeUI(this);

    }//GEN-LAST:event_temaToggleActionPerformed
public static void main(String args[]) {

    FlatLightLaf.setup();

    java.awt.EventQueue.invokeLater(() -> {
        new FormPendaftaran().setVisible(true);
    });
}
        
        
    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
             tampilkanRingkasan();
    }//GEN-LAST:event_daftarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarButton;
    private javax.swing.JCheckBox javaCheck;
    private javax.swing.ButtonGroup jeniskelaminGroup;
    private javax.swing.JLabel jeniskelaminLabel;
    private javax.swing.JRadioButton lakiRadio;
    private javax.swing.JLabel minatLabel;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JRadioButton perempuanRadio;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JCheckBox pythonCheck;
    private javax.swing.JToggleButton temaToggle;
    private javax.swing.JCheckBox webCheck;
    // End of variables declaration//GEN-END:variables
}


