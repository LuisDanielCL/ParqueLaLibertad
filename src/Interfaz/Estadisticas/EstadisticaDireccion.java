/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Estadisticas;

import Interfaz.VentanaMenu;

/**
 *
 * @author LuisDanielCL
 */
public class EstadisticaDireccion extends javax.swing.JFrame {

    /**
     * Creates new form EstadisticaDireccion
     */
    VentanaMenu ventanaMenu;
    public EstadisticaDireccion(VentanaMenu pVentanaMenu) {
        ventanaMenu = pVentanaMenu;
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

        idSelect3 = new javax.swing.JComboBox();
        idSelect2 = new javax.swing.JComboBox();
        idSelect4 = new javax.swing.JComboBox();
        jrPais = new javax.swing.JRadioButton();
        jrProvincia = new javax.swing.JRadioButton();
        jrCanton = new javax.swing.JRadioButton();
        jrDistrito = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        idSelect5 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idSelect3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Provincia 1", "Provincia 2", "Provincia 3" }));

        idSelect2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "País 1", "País 2", "País 3" }));

        idSelect4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cantón 1", "Cantón 2", "Cantón 3" }));

        jrPais.setText("País");
        jrPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrPaisActionPerformed(evt);
            }
        });

        jrProvincia.setText("Provincia");
        jrProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrProvinciaActionPerformed(evt);
            }
        });

        jrCanton.setText("Cantón");
        jrCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCantonActionPerformed(evt);
            }
        });

        jrDistrito.setText("Distrito");
        jrDistrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDistritoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Finalizar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda por");

        jButton4.setText("Buscar");

        idSelect5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Distrito 1", "Distrito 2", "Distrito 3" }));

        jLabel2.setText("Cantidad : 000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrProvincia)
                            .addComponent(jrPais)
                            .addComponent(jrCanton)
                            .addComponent(jrDistrito))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idSelect4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idSelect3, 0, 178, Short.MAX_VALUE)
                            .addComponent(idSelect2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idSelect5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSelect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrPais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSelect3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrProvincia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSelect4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrCanton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSelect5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrDistrito))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrPaisActionPerformed
        jrProvincia.setSelected(false);
        jrCanton.setSelected(false);
        jrDistrito.setSelected(false);

    }//GEN-LAST:event_jrPaisActionPerformed

    private void jrProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrProvinciaActionPerformed
        jrPais.setSelected(false);
        jrCanton.setSelected(false);
        jrDistrito.setSelected(false);
    }//GEN-LAST:event_jrProvinciaActionPerformed

    private void jrCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCantonActionPerformed
        jrPais.setSelected(false);
        jrProvincia.setSelected(false);
        jrDistrito.setSelected(false);
    }//GEN-LAST:event_jrCantonActionPerformed

    private void jrDistritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDistritoActionPerformed
        jrPais.setSelected(false);
        jrProvincia.setSelected(false);
        jrCanton.setSelected(false);
    }//GEN-LAST:event_jrDistritoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ventanaMenu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox idSelect2;
    private javax.swing.JComboBox idSelect3;
    private javax.swing.JComboBox idSelect4;
    private javax.swing.JComboBox idSelect5;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrCanton;
    private javax.swing.JRadioButton jrDistrito;
    private javax.swing.JRadioButton jrPais;
    private javax.swing.JRadioButton jrProvincia;
    // End of variables declaration//GEN-END:variables
}