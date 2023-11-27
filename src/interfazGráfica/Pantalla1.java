package interfazGráfica;

public class Pantalla1 extends javax.swing.JFrame {

    public Pantalla1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblConcesionaria = new javax.swing.JLabel();
        btnAgregarVehiculo = new javax.swing.JButton();
        btnListaDeVehiculos = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblConcesionaria.setBackground(new java.awt.Color(0, 0, 0));
        lblConcesionaria.setFont(new java.awt.Font("Microsoft JhengHei", 1, 38)); // NOI18N
        lblConcesionaria.setForeground(new java.awt.Color(0, 0, 0));
        lblConcesionaria.setText("CONCESIONARIA");

        btnAgregarVehiculo.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVehiculo.setText("AGREGAR VEHICULO");
        btnAgregarVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        btnListaDeVehiculos.setBackground(new java.awt.Color(51, 51, 51));
        btnListaDeVehiculos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnListaDeVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        btnListaDeVehiculos.setText("LISTA DE VEHICULOS");
        btnListaDeVehiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEliminarVehiculo.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarVehiculo.setText("ELIMINAR VEHICULO");
        btnEliminarVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnListaDeVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConcesionaria)
                .addGap(212, 212, 212))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblConcesionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaDeVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVehiculoActionPerformed
        AgregarVehiculo av = new AgregarVehiculo();
        av.setVisible(true);
        av.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnListaDeVehiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConcesionaria;
    // End of variables declaration//GEN-END:variables
}
