/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class GUI_InformacionCurso extends javax.swing.JPanel {

    /**
     * Creates new form GUI_InformacionCurso
     */
    public GUI_InformacionCurso() 
    {
        initComponents();
        
    }
    
    public String []devolverInformacion()
    {
    String arreglo[];
    arreglo=new String[3];
    arreglo[0]=this.jt_SiglasDelCurso.getText();
    arreglo[1]=this.jt_NombreDelCurso.getText();
    arreglo[2]=this.jt_CantidadDeCreditos.getText();
    return arreglo;
    }
    
    
     public void mostrarInformacion(String  arreglo[])///muestra jText.
    {
        this.jt_NombreDelCurso.setText(arreglo[1]);
        this.jt_CantidadDeCreditos.setText(arreglo[2]);      
    }
     
     public String devolverSiglasCurso()
    {
    return this.jt_SiglasDelCurso.getText();
    } 

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_NombreCurso = new javax.swing.JLabel();
        jl_SiglasDelCurso = new javax.swing.JLabel();
        jl_CantidadDeCreditos = new javax.swing.JLabel();
        jt_NombreDelCurso = new javax.swing.JTextField();
        jt_SiglasDelCurso = new javax.swing.JTextField();
        jt_CantidadDeCreditos = new javax.swing.JTextField();

        jl_NombreCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_NombreCurso.setText("Nombre del curso");

        jl_SiglasDelCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_SiglasDelCurso.setText("Siglas del curso");

        jl_CantidadDeCreditos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_CantidadDeCreditos.setText("Cantidad de creditos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_NombreCurso)
                    .addComponent(jl_SiglasDelCurso)
                    .addComponent(jl_CantidadDeCreditos))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_SiglasDelCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jt_NombreDelCurso)
                    .addComponent(jt_CantidadDeCreditos))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_SiglasDelCurso)
                    .addComponent(jt_SiglasDelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_NombreCurso)
                    .addComponent(jt_NombreDelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_CantidadDeCreditos)
                    .addComponent(jt_CantidadDeCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jl_CantidadDeCreditos;
    private javax.swing.JLabel jl_NombreCurso;
    private javax.swing.JLabel jl_SiglasDelCurso;
    private javax.swing.JTextField jt_CantidadDeCreditos;
    private javax.swing.JTextField jt_NombreDelCurso;
    private javax.swing.JTextField jt_SiglasDelCurso;
    // End of variables declaration//GEN-END:variables
}
