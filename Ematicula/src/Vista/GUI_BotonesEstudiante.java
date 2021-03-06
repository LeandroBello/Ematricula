/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_MantenimientoEstudiantes;
import Modelo.MetodosCursos;
import Modelo.MetodosEstudiantes;

/**
 *
 * @author Leandro
 */
public class GUI_BotonesEstudiante extends javax.swing.JPanel {

    /**
     * Creates new form GUI_BotonesEstudiante
     */
    
    Controlador_FRM_MantenimientoEstudiantes controlador;
    MetodosEstudiantes metodosEstudiante;
    public GUI_BotonesEstudiante() {
        initComponents();
        
    }
    public void mostrarInformacion(String  arreglo[])///muestra en el jTextNombre
    {
        this.jtArea_InformacionEstudiante.setText("Carnet: "+arreglo[0]+"\n Nombre: "+arreglo[1]);  
    }
    
     public void mostrarInformacionTodos(String  mensaje)///muestra en el jText de todos los nombres y carnet de los estudiantes
    {
        this.jtArea_InformacionEstudiante.setText(mensaje);  
    }
  
         
    
    
     public void limpiarInformacionJtArea(String  arreglo[])///muestra en el jTextNombre
    {
        this.jtArea_InformacionEstudiante.setText("Estudiante Eliminado");  
    }
     
     
    
   
    public void agregarEvento(Controlador_FRM_MantenimientoEstudiantes controlador)
    {
    this.controlador=controlador;
    this.btn_AgregarEstudiante.addActionListener(controlador);
    this.btn_ConsultarEstudiante.addActionListener(controlador);
    this.btn_ModificarEstudiante.addActionListener(controlador);
    this.btn_EliminarEstudiante.addActionListener(controlador);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_AgregarEstudiante = new javax.swing.JToggleButton();
        btn_ModificarEstudiante = new javax.swing.JToggleButton();
        btn_ConsultarEstudiante = new javax.swing.JToggleButton();
        btn_EliminarEstudiante = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtArea_InformacionEstudiante = new javax.swing.JTextArea();

        btn_AgregarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_AgregarEstudiante.setActionCommand("Agregar");

        btn_ModificarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modificar.png"))); // NOI18N
        btn_ModificarEstudiante.setActionCommand("Modificar");

        btn_ConsultarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_ConsultarEstudiante.setActionCommand("Consultar");

        btn_EliminarEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btn_EliminarEstudiante.setSelected(true);
        btn_EliminarEstudiante.setActionCommand("Eliminar");

        jtArea_InformacionEstudiante.setColumns(20);
        jtArea_InformacionEstudiante.setRows(5);
        jScrollPane1.setViewportView(jtArea_InformacionEstudiante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_AgregarEstudiante)
                        .addGap(29, 29, 29)
                        .addComponent(btn_ModificarEstudiante)
                        .addGap(34, 34, 34)
                        .addComponent(btn_ConsultarEstudiante)
                        .addGap(29, 29, 29)
                        .addComponent(btn_EliminarEstudiante)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AgregarEstudiante)
                    .addComponent(btn_ModificarEstudiante)
                    .addComponent(btn_ConsultarEstudiante)
                    .addComponent(btn_EliminarEstudiante))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_AgregarEstudiante;
    private javax.swing.JToggleButton btn_ConsultarEstudiante;
    private javax.swing.JToggleButton btn_EliminarEstudiante;
    private javax.swing.JToggleButton btn_ModificarEstudiante;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtArea_InformacionEstudiante;
    // End of variables declaration//GEN-END:variables
}
