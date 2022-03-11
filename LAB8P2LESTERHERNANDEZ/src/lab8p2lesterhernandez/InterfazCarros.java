package lab8p2lesterhernandez;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class InterfazCarros extends javax.swing.JFrame {

    private Color col;
    private String pista;
    private long distance;

    public InterfazCarros() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarComboCox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pause_bt = new javax.swing.JButton();
        Start_bt = new javax.swing.JButton();
        pista_lb = new javax.swing.JLabel();
        largo_lb = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Carros_cb = new javax.swing.JComboBox<>();
        Add_bt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        identify_tf = new javax.swing.JTextField();
        corredor_tf = new javax.swing.JTextField();
        Type_cb = new javax.swing.JComboBox<>();
        Color_bt = new javax.swing.JButton();
        save_bt = new javax.swing.JButton();
        pista_tf = new javax.swing.JTextField();
        largo_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usar_bt = new javax.swing.JButton();
        reboot_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pause_bt.setText("Pausar");

        Start_bt.setText("Comenzar");
        Start_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_btActionPerformed(evt);
            }
        });

        pista_lb.setText("Pista: ____");

        largo_lb.setText("Largo: ____");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Add_bt.setText("Agregar");
        Add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero Identificador");

        jLabel4.setText("Numero Corredor");

        Type_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));

        Color_bt.setText("Color");
        Color_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Color_btActionPerformed(evt);
            }
        });

        save_bt.setText("Guardar");
        save_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre Pista");

        jLabel6.setText("Largo");

        usar_bt.setText("Usar Pista");
        usar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usar_btActionPerformed(evt);
            }
        });

        reboot_bt.setText("Reiniciar");
        reboot_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reboot_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Pause_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(pista_lb)
                        .addGap(81, 81, 81)
                        .addComponent(largo_lb))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(identify_tf))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Carros_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Add_bt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(44, 44, 44)
                                        .addComponent(corredor_tf))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(save_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Color_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(pista_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usar_bt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(largo_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                            .addComponent(reboot_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(Start_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(831, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pause_bt)
                    .addComponent(pista_lb)
                    .addComponent(largo_lb))
                .addGap(38, 38, 38)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carros_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_bt)
                    .addComponent(pista_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(identify_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(largo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(corredor_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usar_bt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Color_bt)
                    .addComponent(reboot_bt))
                .addGap(18, 18, 18)
                .addComponent(save_bt)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(Start_bt)
                    .addContainerGap(720, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btActionPerformed
        try {
            Autos ats = new Autos();
            int num = Integer.parseInt(identify_tf.getText());
            String type = Type_cb.getSelectedItem().toString();
            String racer = corredor_tf.getText();

            int red = col.getRed();
            int green = col.getGreen();
            int blue = col.getBlue();

            try {
                if (!ats.searchNum(num)) {
                    ats.addCar(num, type, racer, red, green, blue);
                    JOptionPane.showMessageDialog(this, "Se ha creado el carro");
                } else {
                    JOptionPane.showMessageDialog(this, "Ya existe un carro con este numero");
                }
            } catch (IOException ex) {
            }
            llenarComboCox();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(InterfazCarros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_save_btActionPerformed

    private void Color_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Color_btActionPerformed
        JColorChooser colorChooser = new JColorChooser();
        col = JColorChooser.showDialog(this, "Escoja un color", Color.white);
        Color_bt.setBackground(col);
    }//GEN-LAST:event_Color_btActionPerformed

    private void Add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btActionPerformed
        try {
            llenarTable();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_Add_btActionPerformed

    private void usar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usar_btActionPerformed
        if (Integer.parseInt(largo_tf.getText()) >= 0) {
            distance = Integer.parseInt(largo_tf.getText());
            pista = pista_tf.getText();
            pista_lb.setText("Pista: " + pista);
            largo_lb.setText("Largo: " + distance);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
        }

    }//GEN-LAST:event_usar_btActionPerformed

    private void reboot_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reboot_btActionPerformed
        pista = pista_tf.getText();
        pista_lb.setText("Pista: _____");
        largo_lb.setText("Largo: _____");
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        table.setRowCount(0);
    }//GEN-LAST:event_reboot_btActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void Start_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_btActionPerformed
        progressbar pb = new progressbar();
        pb.start();
    }//GEN-LAST:event_Start_btActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InterfazCarros().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfazCarros.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void llenarComboCox() throws IOException {
        Autos ats = new Autos();
        ats.carro.seek(0);
        Carros_cb.removeAllItems();
        while (ats.carro.getFilePointer() < ats.carro.length()) {
            Carros_cb.addItem(String.valueOf(ats.carro.readInt()));
            ats.carro.readLong();
            ats.carro.readUTF();
            ats.carro.readUTF();
            ats.carro.skipBytes(12);
        }
    }

    static boolean ganador = false;
    static int win = 0;

    private void llenarTable() throws IOException {
        Autos ats = new Autos();
        ats.carro.seek(0);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int id = Integer.parseInt(String.valueOf(Carros_cb.getSelectedItem()));
        ats.searchNum(id);
        long dis = ats.carro.readLong();
        ats.carro.readUTF();
        String racer = ats.carro.readUTF();
        model.addRow(new Object[]{id, racer, dis});
        jTable1.setModel(model);

    }

    class progressbar extends Thread {

        public void reset() {
            jProgressBar1.setValue(0);
            jProgressBar1.repaint();
        }

        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                if (ganador) {
                    break;
                }

                jProgressBar1.setValue(i);
                jProgressBar1.repaint();

                if (i == distance) {
                    win = 1;
                    end(i);
                }

                try {
                    Thread.sleep(Math.abs(UUID.randomUUID().getMostSignificantBits()) % 60);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public synchronized void end(int contar) {
        if (contar == distance) {
            ganador = true;
            JOptionPane.showMessageDialog(null, "El carro: " + win + " gana la carrera");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_bt;
    private javax.swing.JComboBox<String> Carros_cb;
    private javax.swing.JButton Color_bt;
    private javax.swing.JButton Pause_bt;
    private javax.swing.JButton Start_bt;
    private javax.swing.JComboBox<String> Type_cb;
    private javax.swing.JTextField corredor_tf;
    private javax.swing.JTextField identify_tf;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel largo_lb;
    private javax.swing.JTextField largo_tf;
    private javax.swing.JLabel pista_lb;
    private javax.swing.JTextField pista_tf;
    private javax.swing.JButton reboot_bt;
    private javax.swing.JButton save_bt;
    private javax.swing.JButton usar_bt;
    // End of variables declaration//GEN-END:variables
}
