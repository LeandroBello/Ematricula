/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Leandro
 */
public class GUI_InformacionEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionEstudiante
     */
    public GUI_InformacionEstudiante() {
        initComponents();
        
    }

    public String[] devolverInformacion()
    {
        String arreglo[];
        arreglo = new String[2];
        arreglo[0] = this.jt_CarnetEstudiante.getText();
        arreglo[1] = this.jt_NombreEstudiante.getText();
        return arreglo;
    }
    
    public void mostrarInformacion(String  arreglo[])///muestra en el jTextNombre
    {
        this.jt_NombreEstudiante.setText(arreglo[1]);
    }
    
      
    public String devolverCarnet()
    {
    return this.jt_CarnetEstudiante.getText();
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NombreEstudiante = new javax.swing.JLabel();
        jl_CarnetEstudiante = new javax.swing.JLabel();
        jt_NombreEstudiante = new javax.swing.JTextField();
        jt_CarnetEstudiante = new javax.swing.JTextField();

        jl_NombreEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_NombreEstudiante.setText("Nombre Completo");

        jl_CarnetEstudiante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_CarnetEstudiante.setText("Carnet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_NombreEstudiante)
                    .addComponent(jl_CarnetEstudiante))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_NombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jt_CarnetEstudiante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CarnetEstudiante)
                    .addComponent(jt_CarnetEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreEstudiante)
                    .addComponent(jt_NombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CarnetEstudiante;
    private javax.swing.JLabel jl_NombreEstudiante;
    private javax.swing.JTextField jt_CarnetEstudiante;
    private javax.swing.JTextField jt_NombreEstudiante;
    // End of variables declaration//GEN-END:variables
}
