/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package practica1conant.Interfaz;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import practica1conant.Flex.Token;
import practica1conant.Flex.TokenConstant;

/**
 *
 * @author DAVID
 */
public class Reporte_colores extends javax.swing.JFrame {

    /**
     * Creates new form Reporte_colores
     */
    
    
    DefaultTableModel modelos = new DefaultTableModel();
    
    
    public Reporte_colores(ArrayList<Token> tokens, Principal prin) {
        initComponents();
        setModelo();
        setDatos(tokens);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                prin.setVisible(true); // Mostrar el frame principal cuando se cierre el nuevo frame
            }
        });
    }
    
    private void setModelo(){
        String[] columnNames = {"Color", "Cantidad de uso"};
        modelos.setColumnIdentifiers(columnNames);
        this.jTable1.setModel(modelos);
    }

    private void setDatos(ArrayList<Token> tokens){
        int azul=0;
        int rojo = 0 ;
        int amarillo = 0;
        int verde =0;
        int negro=0;
        int morado=0;
        int gris=0;
        int naranja=0;
        int rosa=0;
        
        for (Token token : tokens) {
            if(token.getTokenType() == TokenConstant.ROJO){
                rojo+=1;
            } else if(token.getTokenType() == TokenConstant.AMARILLO){
                amarillo+=1;
            }else if(token.getTokenType() == TokenConstant.AZUL){
                azul+=1;
            }else if(token.getTokenType() == TokenConstant.GRIS){
                gris+=1;
            }else if(token.getTokenType() == TokenConstant.MORADO){
                morado+=1;
            } else if(token.getTokenType() == TokenConstant.NARANJA){
                naranja+=1;
            } else if(token.getTokenType() == TokenConstant.NEGRO){
                negro+=1;
            } else if(token.getTokenType() == TokenConstant.ROSA){
                rosa+=1;
            }else if(token.getTokenType() == TokenConstant.VERDE){
                verde+=1;
            }
        }
        Object[] datos = new Object[modelos.getColumnCount()];

        if (azul >= 0) {
            datos[0] = "Azul";
            datos[1] = azul;
            modelos.addRow(datos);
        }
        if (rojo >= 0) {
            datos[0] = "Rojo";
            datos[1] = rojo;
            modelos.addRow(datos);
        }
        if (amarillo >= 0) {
            datos[0] = "Amarillo";
            datos[1] = amarillo;
            modelos.addRow(datos);
        }
        if (rosa >= 0) {
            datos[0] = "Rosa";
            datos[1] = rosa;
            modelos.addRow(datos);
        }
        if (verde >= 0) {
            datos[0] = "Verde";
            datos[1] = verde;
            modelos.addRow(datos);
        }
        if (negro >= 0) {
            datos[0] = "Negro";
            datos[1] = negro;
            modelos.addRow(datos);
        }
        if (morado >= 0) {
            datos[0] = "Morado";
            datos[1] = morado;
            modelos.addRow(datos);
        }
        
        if (gris >= 0) {
            datos[0] = "Gris";
            datos[1] = gris;
            modelos.addRow(datos);
        }
        if (naranja >= 0) {
            datos[0] = "Naranja";
            datos[1] = naranja;
            modelos.addRow(datos);
        }

        // Actualizar la tabla con el modelo
        this.jTable1.setModel(modelos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        colores.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        colores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        colores.setText("Reporte de Colores");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(colores, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Reporte_colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_colores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
