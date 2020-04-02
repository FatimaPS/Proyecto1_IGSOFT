
package problemas;

import java.awt.Panel;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class principal extends javax.swing.JFrame 
{
    
    public void cambiopanel(JPanel panel)
    {
        
        problemas.removeAll();
        problemas.add(panel);
        problemas.repaint();
        problemas.revalidate();
        problemas.setVisible(true);
    }
    
    public void cambiopanel2(JPanel panel)
    {
        
        areaPruebas.removeAll();
        areaPruebas.add(panel);
        areaPruebas.repaint();
        areaPruebas.revalidate();
        areaPruebas.setVisible(true);
    }
           
    public principal() 
    {
        initComponents();
        areaPruebas.setVisible(false);
        problemas.setVisible(false);

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
        areaPruebas = new javax.swing.JLayeredPane();
        Panel1 = new javax.swing.JPanel();
        problem1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        problem2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        problem3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        problem4 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        problem5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

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
                .addContainerGap(170, Short.MAX_VALUE))
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
                .addContainerGap(141, Short.MAX_VALUE))
        );
        problema2Layout.setVerticalGroup(
            problema2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problema2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(184, Short.MAX_VALUE))
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
                .addContainerGap(183, Short.MAX_VALUE))
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
                .addContainerGap(174, Short.MAX_VALUE))
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
                .addGap(0, 20, Short.MAX_VALUE))
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
                    .addComponent(problema4, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
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
                    .addGap(0, 22, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(problema4, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problema5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(problemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(problemasLayout.createSequentialGroup()
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 22, Short.MAX_VALUE)))
        );

        getContentPane().add(problemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 258, -1, -1));

        areaPruebas.setPreferredSize(new java.awt.Dimension(225, 351));

        Panel1.setPreferredSize(new java.awt.Dimension(225, 351));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        problem1.setBackground(new java.awt.Color(102, 204, 255));
        problem1.setPreferredSize(new java.awt.Dimension(225, 351));

        jLabel17.setText("titulo: ");

        jLabel18.setText("Descripción: ");

        jLabel19.setText("Codigo Fuente: ");

        jLabel20.setText("Pruebas Unitarias: ");

        javax.swing.GroupLayout problem1Layout = new javax.swing.GroupLayout(problem1);
        problem1.setLayout(problem1Layout);
        problem1Layout.setHorizontalGroup(
            problem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(problem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        problem1Layout.setVerticalGroup(
            problem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addGap(39, 39, 39)
                .addComponent(jLabel19)
                .addGap(65, 65, 65)
                .addComponent(jLabel20)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        problem2.setBackground(new java.awt.Color(255, 153, 255));
        problem2.setPreferredSize(new java.awt.Dimension(225, 351));

        jLabel21.setText("titulo: ");

        jLabel22.setText("Descripción: ");

        jLabel23.setText("Codigo Fuente: ");

        jLabel24.setText("Pruebas Unitarias: ");

        javax.swing.GroupLayout problem2Layout = new javax.swing.GroupLayout(problem2);
        problem2.setLayout(problem2Layout);
        problem2Layout.setHorizontalGroup(
            problem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(problem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        problem2Layout.setVerticalGroup(
            problem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel21)
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addGap(39, 39, 39)
                .addComponent(jLabel23)
                .addGap(65, 65, 65)
                .addComponent(jLabel24)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        problem3.setBackground(new java.awt.Color(255, 204, 102));
        problem3.setPreferredSize(new java.awt.Dimension(225, 351));

        jLabel25.setText("titulo: ");

        jLabel26.setText("Descripción: ");

        jLabel27.setText("Codigo Fuente: ");

        jLabel28.setText("Pruebas Unitarias: ");

        javax.swing.GroupLayout problem3Layout = new javax.swing.GroupLayout(problem3);
        problem3.setLayout(problem3Layout);
        problem3Layout.setHorizontalGroup(
            problem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(problem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        problem3Layout.setVerticalGroup(
            problem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel25)
                .addGap(34, 34, 34)
                .addComponent(jLabel26)
                .addGap(39, 39, 39)
                .addComponent(jLabel27)
                .addGap(65, 65, 65)
                .addComponent(jLabel28)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        problem4.setBackground(new java.awt.Color(102, 255, 102));
        problem4.setPreferredSize(new java.awt.Dimension(225, 351));

        jLabel29.setText("titulo: ");

        jLabel30.setText("Descripción: ");

        jLabel31.setText("Codigo Fuente: ");

        jLabel32.setText("Pruebas Unitarias: ");

        javax.swing.GroupLayout problem4Layout = new javax.swing.GroupLayout(problem4);
        problem4.setLayout(problem4Layout);
        problem4Layout.setHorizontalGroup(
            problem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(problem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        problem4Layout.setVerticalGroup(
            problem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel29)
                .addGap(34, 34, 34)
                .addComponent(jLabel30)
                .addGap(39, 39, 39)
                .addComponent(jLabel31)
                .addGap(65, 65, 65)
                .addComponent(jLabel32)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        problem5.setBackground(new java.awt.Color(255, 204, 153));
        problem5.setPreferredSize(new java.awt.Dimension(225, 351));

        jLabel33.setText("titulo: ");

        jLabel34.setText("Descripción: ");

        jLabel35.setText("Codigo Fuente: ");

        jLabel36.setText("Pruebas Unitarias: ");

        javax.swing.GroupLayout problem5Layout = new javax.swing.GroupLayout(problem5);
        problem5.setLayout(problem5Layout);
        problem5Layout.setHorizontalGroup(
            problem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(problem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        problem5Layout.setVerticalGroup(
            problem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(problem5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel33)
                .addGap(34, 34, 34)
                .addComponent(jLabel34)
                .addGap(39, 39, 39)
                .addComponent(jLabel35)
                .addGap(65, 65, 65)
                .addComponent(jLabel36)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        areaPruebas.setLayer(Panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPruebas.setLayer(problem1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPruebas.setLayer(problem2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPruebas.setLayer(problem3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPruebas.setLayer(problem4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        areaPruebas.setLayer(problem5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout areaPruebasLayout = new javax.swing.GroupLayout(areaPruebas);
        areaPruebas.setLayout(areaPruebasLayout);
        areaPruebasLayout.setHorizontalGroup(
            areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problem1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problem2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problem3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problem4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problem5, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        areaPruebasLayout.setVerticalGroup(
            areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(problem1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(problem2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(problem3, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(problem4, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(areaPruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(areaPruebasLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(problem5, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(areaPruebas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 320, 468));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // maxmod5
    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        cambiopanel(problema1);
        cambiopanel2(problem1);
        
    }//GEN-LAST:event_opcion1ActionPerformed

    //equalsisNot 
    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        cambiopanel(problema3);
        cambiopanel2(problem3);
    }//GEN-LAST:event_opcion3ActionPerformed

    //worldMultiple
    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        cambiopanel(problema4);
        cambiopanel2(problem4);
    }//GEN-LAST:event_opcion4ActionPerformed

    //makeBricks
    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
       cambiopanel(problema2);
       cambiopanel2(problem2);
    }//GEN-LAST:event_opcion2ActionPerformed

    //fix45
    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
       cambiopanel(problema5);
       cambiopanel2(problem5);
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
    private javax.swing.JPanel Panel1;
    private javax.swing.JLayeredPane areaPruebas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> opcion1;
    private javax.swing.JComboBox<String> opcion2;
    private javax.swing.JComboBox<String> opcion3;
    private javax.swing.JComboBox<String> opcion4;
    private javax.swing.JComboBox<String> opcion5;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel problem1;
    private javax.swing.JPanel problem2;
    private javax.swing.JPanel problem3;
    private javax.swing.JPanel problem4;
    private javax.swing.JPanel problem5;
    private javax.swing.JPanel problema1;
    private javax.swing.JPanel problema2;
    private javax.swing.JPanel problema3;
    private javax.swing.JPanel problema4;
    private javax.swing.JPanel problema5;
    private javax.swing.JLayeredPane problemas;
    // End of variables declaration//GEN-END:variables
}
