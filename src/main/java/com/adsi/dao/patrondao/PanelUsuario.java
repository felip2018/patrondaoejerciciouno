package com.adsi.dao.patrondao;

import com.adsi.dao.patrondao.dao.UsuarioDao;
import com.adsi.dao.patrondao.dao.impl.UsuarioDaoImpl;
import com.adsi.dao.patrondao.entity.Usuario;
import java.util.Date;
import javax.swing.JOptionPane;

public class PanelUsuario extends javax.swing.JFrame {
    
    UsuarioDao usuarioDao;
    
    public PanelUsuario() {
        initComponents();
        usuarioDao = new UsuarioDaoImpl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrarUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnActualizarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        campoBusqueda = new javax.swing.JTextField();
        tipoDocumento = new javax.swing.JComboBox<>();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeroDocumento = new javax.swing.JTextField();
        perfil = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        idUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Aplicacion DAO");

        btnRegistrarUsuario.setText("Registrar Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setText("Consultar Usuario");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setText("Actualizar Usuario");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        campoBusqueda.setToolTipText("");

        tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione", "Cédula de ciudadanía", "Cédula de extranjería", "Pasaporte", "Tarjeta de identidad" }));

        nombre.setToolTipText("");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");
        jLabel2.setToolTipText("");

        jLabel3.setText("Apellido");
        jLabel3.setToolTipText("");

        jLabel4.setText("Tipo de documento");

        jLabel5.setText("Número documento");

        perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione", "Administrador", "Auxiliar", "Músico" }));

        jLabel6.setText("Perfil de usuario");
        jLabel6.setToolTipText("");

        jLabel7.setText("Correo electrónico");

        jLabel8.setText("Id");

        idUsuario.setEditable(false);

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tipoDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, 171, Short.MAX_VALUE))
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(correo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(perfil, javax.swing.GroupLayout.Alignment.LEADING, 0, 401, Short.MAX_VALUE)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5)
                                            .addComponent(apellido)
                                            .addComponent(numeroDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario)
                    .addComponent(jLabel8)
                    .addComponent(idUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(btnRegistrarUsuario)
                    .addComponent(btnActualizarUsuario))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        Usuario usuario = new Usuario();
        Date utilDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        
        try {
            
            usuario.setNombre(nombre.getText());
            usuario.setApellido(apellido.getText());
            usuario.setId_tipo_doc(tipoDocumento.getSelectedIndex());
            usuario.setNum_doc(Integer.parseInt(numeroDocumento.getText()));
            usuario.setId_perfil(perfil.getSelectedIndex());
            usuario.setCorreo(correo.getText());
            usuario.setTelefono("");
            usuario.setClave(numeroDocumento.getText());
            usuario.setFoto("");
            usuario.setCodigo_validacion("");
            usuario.setValidacion_cuenta(true);
            usuario.setFecha_registro(sqlDate);
            usuario.setEstado_registro("Activo");
            
            int rows = usuarioDao.guardarUsuario(usuario);
        
            String message = (rows > 0) ? "El usuario ha sido registrado con éxito!" : "No ha sido posible realizar el registro!";

            JOptionPane.showConfirmDialog(rootPane, 
                        message,
                        "Alerta",
                        JOptionPane.DEFAULT_OPTION);
            
            if (rows>0) {
                limpiarCampos();
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, 
                    e.getMessage(),
                    "Alerta",
                    JOptionPane.DEFAULT_OPTION);
        }
        
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        Usuario usuario = new Usuario();
        
        try {
            usuario.setId_usuario(Integer.parseInt(idUsuario.getText()));
            usuario.setNombre(nombre.getText());
            usuario.setApellido(apellido.getText());
            usuario.setId_tipo_doc(tipoDocumento.getSelectedIndex());
            usuario.setNum_doc(Integer.parseInt(numeroDocumento.getText()));
            usuario.setId_perfil(perfil.getSelectedIndex());
            usuario.setCorreo(correo.getText());
            
            int rows = usuarioDao.actualizarUsuario(usuario);
        
            String message = (rows > 0) ? "El usuario ha sido actualizado con éxito!" : "No ha sido posible realizar la actualización!";

            JOptionPane.showConfirmDialog(rootPane, 
                        message,
                        "Alerta",
                        JOptionPane.DEFAULT_OPTION);
            
            if (rows>0) {
                limpiarCampos();
            }
            
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(rootPane, 
                    "Debe realizar la consulta de un usuario antes de actualizarlo!",
                    "Alerta",
                    JOptionPane.DEFAULT_OPTION);
            campoBusqueda.setText("");
        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        
    }//GEN-LAST:event_nombreActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        double numDoc;
        try{
            numDoc = Double.parseDouble(campoBusqueda.getText());
            Usuario usuario = usuarioDao.seleccionarUsuario(numDoc);
            
            if (usuario.getNombre() != null) {
                //System.out.println("Nombre: "+usuario.getNombre()+" | Apellido: "+usuario.getApellido());
                idUsuario.setText(Integer.toString(usuario.getId_usuario()));
                nombre.setText(usuario.getNombre());
                apellido.setText(usuario.getApellido());
                tipoDocumento.setSelectedIndex(usuario.getId_tipo_doc());
                numeroDocumento.setText(Integer.toString(usuario.getNum_doc()));
                perfil.setSelectedIndex(usuario.getId_perfil());
                correo.setText(usuario.getCorreo());
                
            }else{
                JOptionPane.showConfirmDialog(rootPane, 
                        "No se ha encontrado el usuario!",
                        "Alerta",
                        JOptionPane.DEFAULT_OPTION);
                limpiarCampos();
            }
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(rootPane, 
                    "El valor ingresado no es un número de documento válido!",
                    "Alerta",
                    JOptionPane.DEFAULT_OPTION);
            campoBusqueda.setText("");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed
    
    private void limpiarCampos(){
        idUsuario.setText("");
        nombre.setText("");
        apellido.setText("");
        tipoDocumento.setSelectedIndex(0);
        numeroDocumento.setText("");
        perfil.setSelectedIndex(0);
        correo.setText("");
    }
    
    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        
        try{
            int idU = Integer.parseInt(idUsuario.getText());

            int rows = usuarioDao.eliminarUsuario(idU);

            String message = (rows > 0) ? "El usuario ha sido eliminado!" : "No ha sido posible realizar la eliminación!";

            JOptionPane.showConfirmDialog(rootPane, 
                        message,
                        "Alerta",
                        JOptionPane.DEFAULT_OPTION);
            limpiarCampos();
        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(rootPane, 
                    "Debe realizar la consulta de un usuario antes de eliminarlo!",
                    "Alerta",
                    JOptionPane.DEFAULT_OPTION);
            campoBusqueda.setText("");
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JTextField campoBusqueda;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField idUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroDocumento;
    private javax.swing.JComboBox<String> perfil;
    private javax.swing.JComboBox<String> tipoDocumento;
    // End of variables declaration//GEN-END:variables
}
