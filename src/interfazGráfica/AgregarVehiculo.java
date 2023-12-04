
package interfazGráfica;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import programacionparcial.concesionaria.Controladora;

public class AgregarVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form AgregarVehiculo
     */
    public static Controladora control = new Controladora();
    public AgregarVehiculo() {
        
        initComponents(); //Iniciamos los componetes
        setLocationRelativeTo(this); //Hacemos que la pantalla aparezca en el medio
        ButtonGroup grupo = new ButtonGroup(); //Creamos un ButtonGroup para que solo se pueda seleccionar un radio button
        //Metemos los radio button al grupo
        grupo.add(rbtnAuto);
        grupo.add(rbtnMoto);
        grupo.add(rbtnCamioneta);
        
        
        rbtnAuto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                SeleccionTipoVehiculo();
            }
        });
        
        rbtnMoto.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                SeleccionTipoVehiculo();
            }
        });
        
        rbtnCamioneta.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                SeleccionTipoVehiculo();
            }
        });
                
        
        SeleccionTipoVehiculo();
        
    }
    
    private String tipoDeVehiculo;
    
    public void SeleccionTipoVehiculo(){
        if (rbtnAuto.isSelected()) {
            tipoDeVehiculo= "Auto";
            lblCantPuertas.setVisible(true);
            txtCantPuertas.setVisible(true);
            lblCilindrada.setVisible(false);
            txtCilindrada.setVisible(false);
            lblPesoMax.setVisible(false);
            txtPesoMax.setVisible(false);
        } else if (rbtnMoto.isSelected()){
            tipoDeVehiculo= "moto";
            lblCantPuertas.setVisible(false);
            txtCantPuertas.setVisible(false);
            lblCilindrada.setVisible(true);
            txtCilindrada.setVisible(true);
            lblPesoMax.setVisible(false);
            txtPesoMax.setVisible(false);
        } else if (rbtnCamioneta.isSelected()){
            tipoDeVehiculo= "Camioneta";
            lblCantPuertas.setVisible(false);
            txtCantPuertas.setVisible(false);
            lblCilindrada.setVisible(false);
            txtCilindrada.setVisible(false);
            lblPesoMax.setVisible(true);
            txtPesoMax.setVisible(true);
        } else {
            tipoDeVehiculo= " ";
            lblCantPuertas.setVisible(false);
            txtCantPuertas.setVisible(false);
            lblCilindrada.setVisible(false);
            txtCilindrada.setVisible(false);
            lblPesoMax.setVisible(false);
            txtPesoMax.setVisible(false);
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblPatente = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        btnAgregarVehiculo = new javax.swing.JButton();
        lblTipoVehiculo = new javax.swing.JLabel();
        rbtnAuto = new javax.swing.JRadioButton();
        rbtnMoto = new javax.swing.JRadioButton();
        rbtnCamioneta = new javax.swing.JRadioButton();
        lblCantPuertas = new javax.swing.JLabel();
        txtCantPuertas = new javax.swing.JTextField();
        lblCilindrada = new javax.swing.JLabel();
        txtCilindrada = new javax.swing.JTextField();
        txtPesoMax = new javax.swing.JTextField();
        lblPesoMax = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblMarca.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(0, 0, 0));
        lblMarca.setText("Marca:");

        lblModelo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(0, 0, 0));
        lblModelo.setText("Modelo:");

        lblColor.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblColor.setForeground(new java.awt.Color(0, 0, 0));
        lblColor.setText("Color:");

        lblPatente.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblPatente.setForeground(new java.awt.Color(0, 0, 0));
        lblPatente.setText("Patente");

        lblPrecio.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("Precio:");

        lblAño.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblAño.setForeground(new java.awt.Color(0, 0, 0));
        lblAño.setText("Año:");

        txtMarca.setBackground(new java.awt.Color(51, 51, 51));
        txtMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(null);

        txtColor.setBackground(new java.awt.Color(51, 51, 51));
        txtColor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtColor.setForeground(new java.awt.Color(255, 255, 255));
        txtColor.setBorder(null);

        txtModelo.setBackground(new java.awt.Color(51, 51, 51));
        txtModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtModelo.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo.setBorder(null);

        txtPatente.setBackground(new java.awt.Color(51, 51, 51));
        txtPatente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPatente.setForeground(new java.awt.Color(255, 255, 255));
        txtPatente.setBorder(null);

        txtPrecio.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);

        txtAño.setBackground(new java.awt.Color(51, 51, 51));
        txtAño.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAño.setForeground(new java.awt.Color(255, 255, 255));
        txtAño.setBorder(null);

        btnAgregarVehiculo.setBackground(new java.awt.Color(51, 51, 51));
        btnAgregarVehiculo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnAgregarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVehiculo.setText("AGREGAR VEHICULO");
        btnAgregarVehiculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAgregarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVehiculoActionPerformed(evt);
            }
        });

        lblTipoVehiculo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblTipoVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoVehiculo.setText("Seleccione el tipo de vehiculo:");

        rbtnAuto.setBackground(new java.awt.Color(204, 204, 204));
        rbtnAuto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        rbtnAuto.setForeground(new java.awt.Color(0, 0, 0));
        rbtnAuto.setText("Auto");

        rbtnMoto.setBackground(new java.awt.Color(204, 204, 204));
        rbtnMoto.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        rbtnMoto.setForeground(new java.awt.Color(0, 0, 0));
        rbtnMoto.setText("Moto");

        rbtnCamioneta.setBackground(new java.awt.Color(204, 204, 204));
        rbtnCamioneta.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        rbtnCamioneta.setForeground(new java.awt.Color(0, 0, 0));
        rbtnCamioneta.setText("Camioneta");

        lblCantPuertas.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblCantPuertas.setForeground(new java.awt.Color(0, 0, 0));
        lblCantPuertas.setText("Cant Puertas:");

        txtCantPuertas.setBackground(new java.awt.Color(51, 51, 51));
        txtCantPuertas.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        txtCantPuertas.setForeground(new java.awt.Color(255, 255, 255));
        txtCantPuertas.setBorder(null);

        lblCilindrada.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblCilindrada.setForeground(new java.awt.Color(0, 0, 0));
        lblCilindrada.setText("Cilindrada:");

        txtCilindrada.setBackground(new java.awt.Color(51, 51, 51));
        txtCilindrada.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        txtCilindrada.setForeground(new java.awt.Color(255, 255, 255));
        txtCilindrada.setBorder(null);

        txtPesoMax.setBackground(new java.awt.Color(51, 51, 51));
        txtPesoMax.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        txtPesoMax.setForeground(new java.awt.Color(255, 255, 255));
        txtPesoMax.setBorder(null);

        lblPesoMax.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        lblPesoMax.setForeground(new java.awt.Color(0, 0, 0));
        lblPesoMax.setText("Peso Max:");

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipoVehiculo)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(rbtnMoto)
                        .addGap(26, 26, 26)
                        .addComponent(rbtnCamioneta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModelo)
                            .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColor)
                            .addComponent(lblPatente)
                            .addComponent(lblPrecio)
                            .addComponent(lblAño))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAño)
                                .addComponent(txtPrecio)
                                .addComponent(txtPatente)
                                .addComponent(txtColor)
                                .addComponent(txtModelo)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93)))
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnMoto)
                    .addComponent(rbtnCamioneta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAño))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
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
        
        Pantalla1 pantallaPrincipal = new Pantalla1();
        try{
            
            //Obtenemos los datos ingresados en los label y los guardamos
            String marca= txtMarca.getText();
            String modelo = txtModelo.getText();
            String color = txtColor.getText();
            String patente = txtPatente.getText();
            String precioText = txtPrecio.getText();    
            double precio = 0; 
            if (!precioText.isEmpty()){
                precio = Double.parseDouble(precioText);
            }
            String año = txtAño.getText();
            String tipo = tipoDeVehiculo;
            String cantPuertasTxt = txtCantPuertas.getText();
            int cantPuertas = 0;
            if (!cantPuertasTxt.isEmpty()){
            cantPuertas = Integer.parseInt(cantPuertasTxt);
            }
            String cilindradaTxt= txtCilindrada.getText();
            int cilindrada = 0;
            if (!cilindradaTxt.isEmpty()){
                cilindrada = Integer.parseInt(cilindradaTxt);
            }
        
            String pesoMaxTxt = txtPesoMax.getText();
            double pesoMax=0;
            if (!pesoMaxTxt.isEmpty()){
                pesoMax = Double.parseDouble(pesoMaxTxt);
            }
            
            //Mandamos los datos a la instancia concesionaria y utilizamos el metodo de agregarvehiculo
            control.agregarVehiculo(marca, modelo, color, patente, precio, año, tipo, cantPuertas, cilindrada, pesoMax);

            
            /*/Cuando presionemos el boton de agregar vehiculo hacemos que se cierre la ventana y
            se haga visible de nuevo la pantalla principal/*/
            this.setVisible(false);
            pantallaPrincipal.setVisible(true);
            pantallaPrincipal.setLocationRelativeTo(null);
            
            } catch (Exception ex) {
            // Mostrar mensaje de error  
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
            }
    }//GEN-LAST:event_btnAgregarVehiculoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Pantalla1 pantallaPrincipal = new Pantalla1();
        this.setVisible(false);
        pantallaPrincipal.setVisible(true);
        pantallaPrincipal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarVehiculo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCantPuertas;
    private javax.swing.JLabel lblCilindrada;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPatente;
    private javax.swing.JLabel lblPesoMax;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoVehiculo;
    private javax.swing.JRadioButton rbtnAuto;
    private javax.swing.JRadioButton rbtnCamioneta;
    private javax.swing.JRadioButton rbtnMoto;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtCilindrada;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtPesoMax;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
