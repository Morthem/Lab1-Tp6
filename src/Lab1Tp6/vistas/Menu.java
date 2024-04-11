/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1Tp6.vistas;

import java.util.ArrayList;
import Lab1Tp6.entidades.Producto;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {
    //private static ArrayList<Producto> productos=new ArrayList<>();
    private static TreeSet<Producto> productos = new TreeSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    
    public static TreeSet<Producto> getListaProductos() {
        return productos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmiAdministrarProductos = new javax.swing.JMenuItem();
        jmCategoria = new javax.swing.JMenu();
        jmiConsultaCategoria = new javax.swing.JMenuItem();
        jmiConsultaNombre = new javax.swing.JMenuItem();
        jmiConultaPrecio = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );

        jmAdministracion.setText("Administración");

        jmiAdministrarProductos.setText("Productos");
        jmiAdministrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministrarProductosActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiAdministrarProductos);

        jMenuBar1.add(jmAdministracion);

        jmCategoria.setText("Consultas");

        jmiConsultaCategoria.setText("Categoria");
        jmiConsultaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaCategoriaActionPerformed(evt);
            }
        });
        jmCategoria.add(jmiConsultaCategoria);

        jmiConsultaNombre.setText("Nombre");
        jmiConsultaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaNombreActionPerformed(evt);
            }
        });
        jmCategoria.add(jmiConsultaNombre);

        jmiConultaPrecio.setText("Precio");
        jmiConultaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConultaPrecioActionPerformed(evt);
            }
        });
        jmCategoria.add(jmiConultaPrecio);

        jMenuBar1.add(jmCategoria);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAdministrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministrarProductosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AdministrarProductos consulta = new AdministrarProductos();
        consulta.setVisible(true);
        escritorio.add(consulta);
        escritorio.moveToFront(consulta);
    }//GEN-LAST:event_jmiAdministrarProductosActionPerformed

    private void jmiConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaCategoriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaCategoria categoria = new ConsultaCategoria();
        categoria.setVisible(true);
        escritorio.add(categoria);
        escritorio.moveToFront(categoria);
    }//GEN-LAST:event_jmiConsultaCategoriaActionPerformed

    private void jmiConsultaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaNombreActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaNombre nombre = new ConsultaNombre();
        nombre.setVisible(true);
        escritorio.add(nombre);
        escritorio.moveToFront(nombre);
    }//GEN-LAST:event_jmiConsultaNombreActionPerformed

    private void jmiConultaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConultaPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaPrecio precio = new ConsultaPrecio();
        precio.setVisible(true);
        escritorio.add(precio);
        escritorio.moveToFront(precio);
    }//GEN-LAST:event_jmiConultaPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public static TreeSet<Producto> getProductos() {
        return productos;
    }

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmCategoria;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAdministrarProductos;
    private javax.swing.JMenuItem jmiConsultaCategoria;
    private javax.swing.JMenuItem jmiConsultaNombre;
    private javax.swing.JMenuItem jmiConultaPrecio;
    // End of variables declaration//GEN-END:variables
}
