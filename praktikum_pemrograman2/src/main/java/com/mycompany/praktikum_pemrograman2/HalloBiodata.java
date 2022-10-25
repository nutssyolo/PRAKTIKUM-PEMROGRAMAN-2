/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praktikum_pemrograman2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author anand
 */

    public class HalloBiodata extends javax.swing.JFrame {

        private final boolean checkBoxSelected;

        /**
         * Creates new form HalloBiodata
         */
        public HalloBiodata() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.checkBoxSelected = false;
            JLabel labelHeader = new JLabel("BIODATA", JLabel.CENTER);
            labelHeader.setBounds(0, 10, 545, 20);

            JLabel labelName = new JLabel("Nama :");
            labelName.setBounds(15, 40, 500, 10);

            JTextField txtNama = new JTextField();
            txtNama.setBounds(15, 60, 500, 30);

            JLabel labelNoHP = new JLabel("No. HP : ");
            labelNoHP.setBounds(15, 100, 500, 10);

            JTextField txtNoHP = new JTextField();
            txtNoHP.setBounds(15, 120, 500, 30);

            JLabel labelJK = new JLabel("Jenis Kelamin :");
            labelJK.setBounds(15, 160, 500, 10);

            JRadioButton radioJK1 = new JRadioButton("Laki-Laki");
            radioJK1.setBounds(15, 180, 500, 10);

            JRadioButton radioJK2 = new JRadioButton("Perempuan");
            radioJK2.setBounds(15, 200, 500, 10);

            JLabel labelAlamat = new JLabel("Alamat :");
            labelAlamat.setBounds(15, 230, 500, 10);

            JTextArea txaAlamat = new JTextArea();
            txaAlamat.setBounds(15, 250, 500, 100);

            JButton btnSubmit = new JButton("SIMPAN");
            btnSubmit.setBounds(15, 380, 100, 30);

            ButtonGroup bg = new ButtonGroup();
            bg.add(radioJK1);
            bg.add(radioJK2);

            javax.swing.JTable table = new JTable();
            JScrollPane scrollTable = new JScrollPane(table);
            scrollTable.setBounds(15, 450, 500, 150);

            MyTableModel tabelModel = new MyTableModel();
            table.setModel(tabelModel);

            btnSubmit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String nama = txtNama.getText();
                    String NoHP = txtNoHP.getText();
                    String jk = "";
                    String alamat = txaAlamat.getText();

                    if (radioJK1.isSelected()) {
                        jk = radioJK1.getText();
                    }
                    if (radioJK2.isSelected()) {
                        jk = radioJK2.getText();
                    }

                    if (nama.equalsIgnoreCase("") || NoHP.equalsIgnoreCase("") || jk.equalsIgnoreCase("")
                            || alamat.equalsIgnoreCase("")) {
                        JOptionPane.showMessageDialog(HalloBiodata.this, "Data yang anda input kosong", "Swing Tester!",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        int confirmation = JOptionPane.showConfirmDialog(HalloBiodata.this,
                                "Apakah anda yakin ingin menyimpan data?", "konfirmasi", JOptionPane.YES_NO_OPTION);
                        if (confirmation == JOptionPane.YES_OPTION) {
                            tabelModel.add(new ArrayList<>(Arrays.asList(nama, NoHP, jk, alamat)));
                            JOptionPane.showMessageDialog(HalloBiodata.this, "Data berhasil disimpan");
                        } else {
                            JOptionPane.showMessageDialog(HalloBiodata.this, "Silahkan periksa kembali data anda");
                        }
                    }
                }
            });

            this.add(labelHeader);
            this.add(labelName);
            this.add(txtNama);
            this.add(labelNoHP);
            this.add(txtNoHP);
            this.add(labelJK);
            this.add(radioJK1);
            this.add(radioJK2);
            this.add(labelAlamat);
            this.add(txaAlamat);
            this.add(btnSubmit);
            this.add(scrollTable);

            this.setSize(545, 700);
            this.setLayout(null);

        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 400, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGap(0, 300, Short.MAX_VALUE)
            );

            pack();
        }                                          
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
            java.util.logging.Logger.getLogger(HalloBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalloBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalloBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalloBiodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalloBiodata().setVisible(true);
            }
        });
    }
}
