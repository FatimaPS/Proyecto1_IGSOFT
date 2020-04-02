
package problemas;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class principal extends javax.swing.JFrame 
{
    DB db;
    DBCollection tabla;
    
    public void cambiopanel(JPanel panel)
    {
        
        problemas.removeAll();
        problemas.add(panel);
        problemas.repaint();
        problemas.revalidate();
        problemas.setVisible(true);
    }
    
           
    public principal() 
    {
        initComponents();
        problemas.setVisible(false);
        
       
 
        try {
            
            Mongo mongo = new Mongo("LocalHost",27017);
            db = mongo.getDB("proyecto1");
            tabla = db.getCollection("categorias");
            tabla = db.getCollection("products");
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);

    }

      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opcion1 = new javax.swing.JComboBox<>();
        opcion2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        opcion3 = new javax.swing.JComboBox<>();
        opcion4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        opcion5 = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        problemas = new javax.swing.JLayeredPane();
        panel1 = new javax.swing.JPanel();
        problema1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        problema2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        problema3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        problema4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        problema5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Logic 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 67, -1, -1));

        jLabel2.setText("Logic 2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 67, -1, -1));

        opcion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "maxMod5" }));
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 99, 101, -1));

        opcion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "makeBricks" }));
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 99, 102, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 547, -1, -1));

        jLabel4.setText("String 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 137, -1, -1));

        jLabel5.setText("Map 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 137, -1, -1));

        opcion3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "equalsisNot" }));
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 169, 101, -1));

        opcion4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "worldMultiple" }));
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 169, 102, -1));

        jLabel6.setText("Array 3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        opcion5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "fix45" }));
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });
        getContentPane().add(opcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, -1));

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setText("CATEGORIAS ");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 24, -1, -1));

        problemas.setBackground(new java.awt.Color(51, 153, 255));
        problemas.setForeground(new java.awt.Color(51, 153, 255));
        problemas.setPreferredSize(new java.awt.Dimension(318, 209));

        panel1.setPreferredSize(new java.awt.Dimension(318, 209));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        problema1.setBackground(new java.awt.Color(102, 204, 255));
        problema1.setPreferredSize(new java.awt.Dimension(318, 209));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("maxMod5");

        javax.swing.GroupLayout problema1Layout = new javax.swing.GroupLayout(problema1);
        problema1.setLayout(problema1Layout);
        problema1Layout.setHorizontalGroup(
            problema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        problema1Layout.setVerticalGroup(
            problema1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        problema2.setBackground(new java.awt.Color(255, 153, 255));
        problema2.setForeground(new java.awt.Color(255, 102, 255));
        problema2.setPreferredSize(new java.awt.Dimension(318, 209));

        jLabel16.setText("makeBricks");

        javax.swing.GroupLayout problema2Layout = new javax.swing.GroupLayout(problema2);
        problema2.setLayout(problema2Layout);
        problema2Layout.setHorizontalGroup(
            problema2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel16)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        problema2Layout.setVerticalGroup(
            problema2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        problema3.setBackground(new java.awt.Color(255, 204, 102));
        problema3.setForeground(new java.awt.Color(255, 204, 51));
        problema3.setPreferredSize(new java.awt.Dimension(318, 209));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("equlasisNot");

        javax.swing.GroupLayout problema3Layout = new javax.swing.GroupLayout(problema3);
        problema3.setLayout(problema3Layout);
        problema3Layout.setHorizontalGroup(
            problema3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel10)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        problema3Layout.setVerticalGroup(
            problema3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        problema4.setBackground(new java.awt.Color(102, 255, 102));
        problema4.setPreferredSize(new java.awt.Dimension(318, 209));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("WorldMultiple");

        javax.swing.GroupLayout problema4Layout = new javax.swing.GroupLayout(problema4);
        problema4.setLayout(problema4Layout);
        problema4Layout.setHorizontalGroup(
            problema4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema4Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel9)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        problema4Layout.setVerticalGroup(
            problema4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        problema5.setBackground(new java.awt.Color(255, 204, 153));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("fix5");

        javax.swing.GroupLayout problema5Layout = new javax.swing.GroupLayout(problema5);
        problema5.setLayout(problema5Layout);
        problema5Layout.setHorizontalGroup(
            problema5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema5Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel11)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        problema5Layout.setVerticalGroup(
            problema5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        problemas.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        problemas.setLayer(problema1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        problemas.setLayer(problema2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        problemas.setLayer(problema3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        problemas.setLayer(problema4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        problemas.setLayer(problema5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout problemasLayout = new javax.swing.GroupLayout(problemas);
        problemas.setLayout(problemasLayout);
        problemasLayout.setHorizontalGroup(
            problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problemasLayout.createSequentialGroup()
                .addComponent(problema1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema4, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problema5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        problemasLayout.setVerticalGroup(
            problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(problema1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 23, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema4, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problema5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        getContentPane().add(problemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 258, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 33, 380, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // maxmod5
    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        cambiopanel(problema1);
       
        if(jTextArea1.getText() != null)
            jTextArea1.setText(" ");
            
        
        DBCollection col = db.getCollection("categorias");
                BasicDBObject filtro = new BasicDBObject();
                filtro.put("Titulo", "maxMod5");
                DBCursor cursor = tabla.find(filtro);
             
                while(cursor.hasNext()){
                    jTextArea1.setText(jTextArea1.getText()+cursor.next());    
                }
                

        
    }//GEN-LAST:event_opcion1ActionPerformed

    //equalsisNot 
    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        cambiopanel(problema3);

       
        if(jTextArea1.getText() != null) 
            jTextArea1.setText(" ");
        
        
        DBCollection col = db.getCollection("categorias");
                BasicDBObject filtro = new BasicDBObject();
                filtro.put("Titulo", "equalsisNot");
                DBCursor cursor = tabla.find(filtro);
             
                while(cursor.hasNext()){
                    jTextArea1.setText(jTextArea1.getText()+cursor.next());    
                }
                
    }//GEN-LAST:event_opcion3ActionPerformed

    //worldMultiple
    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        cambiopanel(problema4);
        
        if(jTextArea1.getText() != null) 
            jTextArea1.setText(" ");
        
        
        DBCollection col = db.getCollection("categorias");
                BasicDBObject filtro = new BasicDBObject();
                filtro.put("Titulo", "worldMultiple");
                DBCursor cursor = tabla.find(filtro);
             
                while(cursor.hasNext()){
                    jTextArea1.setText(jTextArea1.getText()+cursor.next());    
                }
    }//GEN-LAST:event_opcion4ActionPerformed

    //makeBricks
    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
       cambiopanel(problema2);
       
       if(jTextArea1.getText() != null) 
            jTextArea1.setText(" ");
        
        
        DBCollection col = db.getCollection("categorias");
                BasicDBObject filtro = new BasicDBObject();
                filtro.put("Titulo", "makeBricks");
                DBCursor cursor = tabla.find(filtro);
             
                while(cursor.hasNext()){
                    jTextArea1.setText(jTextArea1.getText()+cursor.next());    
                }
    }//GEN-LAST:event_opcion2ActionPerformed

    //fix45
    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
       cambiopanel(problema5);
       
       if(jTextArea1.getText() != null) 
            jTextArea1.setText(" ");
        
        
        DBCollection col = db.getCollection("categorias");
                BasicDBObject filtro = new BasicDBObject();
                filtro.put("Titulo", "fix45");
                DBCursor cursor = tabla.find(filtro);
             
                while(cursor.hasNext()){
                    jTextArea1.setText(jTextArea1.getText()+cursor.next());    
                }
    }//GEN-LAST:event_opcion5ActionPerformed


    public static void main(String args[]) 
    {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> opcion1;
    private javax.swing.JComboBox<String> opcion2;
    private javax.swing.JComboBox<String> opcion3;
    private javax.swing.JComboBox<String> opcion4;
    private javax.swing.JComboBox<String> opcion5;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel problema1;
    private javax.swing.JPanel problema2;
    private javax.swing.JPanel problema3;
    private javax.swing.JPanel problema4;
    private javax.swing.JPanel problema5;
    private javax.swing.JLayeredPane problemas;
    // End of variables declaration//GEN-END:variables
}
