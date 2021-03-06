/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author ivanita
 */
public class Interfaz extends javax.swing.JFrame {
    private Cafe cafeExpreso1;
    private Cafe cafeCapuchino1;
    private Cafe cafeCortado1;
    
    
    public Interfaz() {
        initComponents();
        cafeExpreso1 = new CafeExpreso("Cafe Expreso", "Mediano", 23);
        cafeCapuchino1 = new CafeCapuchino("Cafe capuchino", "Mediano", 20);
        cafeCortado1 = new CafeCortado("Cafe cortado", "chico", 15);
        
        LabelCapuchino.setText(cafeCapuchino1.getNombre()+ "--" + cafeCapuchino1.getTamaño() + "--" + cafeCapuchino1.getPrecio() + "Bs.");
        LabelCortado.setText(cafeCortado1.getNombre()+ "--" + cafeCortado1.getTamaño() + "--" + cafeCortado1.getPrecio() + "Bs");
        LabelExpreso.setText(cafeExpreso1.getNombre() + "--" + cafeExpreso1.getTamaño() + "--" + cafeExpreso1.getPrecio() + "Bs");
    }

   
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelCapuchino = new javax.swing.JLabel();
        LabelCortado = new javax.swing.JLabel();
        LabelExpreso = new javax.swing.JLabel();
        ButtonCapuchino = new javax.swing.JButton();
        ButtonCortado = new javax.swing.JButton();
        ButtonExpreso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaCortado = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaExpreso = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TexAreaCapuchino = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafeteria/4426633.png"))); // NOI18N

        LabelCapuchino.setText("Capuchino");

        LabelCortado.setText("jLabel3");

        LabelExpreso.setText("jLabel4");

        ButtonCapuchino.setText("Preparar");
        ButtonCapuchino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCapuchinoActionPerformed(evt);
            }
        });

        ButtonCortado.setText("Preparar");
        ButtonCortado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCortadoActionPerformed(evt);
            }
        });

        ButtonExpreso.setText("Preparar");
        ButtonExpreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExpresoActionPerformed(evt);
            }
        });

        TextAreaCortado.setColumns(20);
        TextAreaCortado.setRows(5);
        jScrollPane1.setViewportView(TextAreaCortado);

        TextAreaExpreso.setColumns(20);
        TextAreaExpreso.setRows(5);
        jScrollPane2.setViewportView(TextAreaExpreso);

        TexAreaCapuchino.setColumns(20);
        TexAreaCapuchino.setRows(5);
        jScrollPane3.setViewportView(TexAreaCapuchino);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(ButtonCapuchino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelCapuchino, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(LabelCortado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelExpreso)
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(ButtonCortado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonExpreso)
                        .addGap(194, 194, 194))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCapuchino)
                    .addComponent(LabelCortado)
                    .addComponent(LabelExpreso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCapuchino)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonExpreso)
                        .addComponent(ButtonCortado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCapuchinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCapuchinoActionPerformed
        
        TexAreaCapuchino.setText(cafeCapuchino1.prepararCafe());
    }//GEN-LAST:event_ButtonCapuchinoActionPerformed

    private void ButtonCortadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCortadoActionPerformed
        TextAreaCortado.setText(cafeCortado1.prepararCafe());
    }//GEN-LAST:event_ButtonCortadoActionPerformed

    private void ButtonExpresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExpresoActionPerformed
        TextAreaExpreso.setText(cafeExpreso1.prepararCafe());
    }//GEN-LAST:event_ButtonExpresoActionPerformed

    
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCapuchino;
    private javax.swing.JButton ButtonCortado;
    private javax.swing.JButton ButtonExpreso;
    private javax.swing.JLabel LabelCapuchino;
    private javax.swing.JLabel LabelCortado;
    private javax.swing.JLabel LabelExpreso;
    private javax.swing.JTextArea TexAreaCapuchino;
    private javax.swing.JTextArea TextAreaCortado;
    private javax.swing.JTextArea TextAreaExpreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
