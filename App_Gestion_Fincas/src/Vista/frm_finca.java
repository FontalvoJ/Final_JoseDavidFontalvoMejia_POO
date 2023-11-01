
package Vista;
import Controlador.cls_finca; 
import java.util.LinkedList; 
import javax.swing.JOptionPane;

public class frm_finca extends javax.swing.JFrame {
 LinkedList<cls_finca> Finca = new LinkedList<>();
    boolean bln_sw_finca;
    int int_pfinca;
   
    
    public frm_finca() {
        initComponents();
        btn_actualizarfinca.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_limpiarcamposcultivos = new javax.swing.JButton();
        btn_asociarcultivo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_produccioncultivo = new javax.swing.JTextField();
        txt_nombrecultivo = new javax.swing.JTextField();
        txt_descripcioncultivo = new javax.swing.JTextField();
        txt_codigotrabajador_cultivo = new javax.swing.JTextField();
        txt_codigocultivo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btn_limpiarcampostrabajadores = new javax.swing.JButton();
        btn_actualizartrabajador = new javax.swing.JButton();
        btn_consultartrabajador = new javax.swing.JButton();
        btn_agregartrabajador = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_codigotrabajador = new javax.swing.JTextField();
        txt_contactotrabajador = new javax.swing.JTextField();
        txt_nombretrabajador = new javax.swing.JTextField();
        txt_nitfinca_trabajador = new javax.swing.JTextField();
        txt_cargotrabajador = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btn_agregarfinca = new javax.swing.JButton();
        btn_consultarfinca = new javax.swing.JButton();
        btn_actualizarfinca = new javax.swing.JButton();
        btn_limpiarcamposfinca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_nitfinca = new javax.swing.JTextField();
        txt_nombrefinca = new javax.swing.JTextField();
        txt_ubicacionfinca = new javax.swing.JTextField();
        txt_propietariofinca = new javax.swing.JTextField();
        txt_correofinca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(253, 254, 254));

        jPanel3.setBackground(new java.awt.Color(253, 254, 254));

        jLabel2.setBackground(new java.awt.Color(233, 214, 175));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/granja (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel3.setText("Sistema de Gestión de Fincas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(655, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(232, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(22, 22, 22)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel3)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(253, 254, 254));

        jPanel4.setBackground(new java.awt.Color(235, 245, 251));

        btn_limpiarcamposcultivos.setBackground(new java.awt.Color(235, 245, 251));
        btn_limpiarcamposcultivos.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_limpiarcamposcultivos.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiarcamposcultivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpio.png"))); // NOI18N
        btn_limpiarcamposcultivos.setBorder(null);
        btn_limpiarcamposcultivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarcamposcultivosActionPerformed(evt);
            }
        });

        btn_asociarcultivo.setBackground(new java.awt.Color(235, 245, 251));
        btn_asociarcultivo.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_asociarcultivo.setForeground(new java.awt.Color(255, 255, 255));
        btn_asociarcultivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enlazar (1).png"))); // NOI18N
        btn_asociarcultivo.setBorder(null);
        btn_asociarcultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_asociarcultivoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setText("Cultivos");

        txt_produccioncultivo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_produccioncultivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producción (kg)", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_produccioncultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_produccioncultivoActionPerformed(evt);
            }
        });

        txt_nombrecultivo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_nombrecultivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Cultivo", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_nombrecultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombrecultivoActionPerformed(evt);
            }
        });

        txt_descripcioncultivo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_descripcioncultivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_descripcioncultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descripcioncultivoActionPerformed(evt);
            }
        });

        txt_codigotrabajador_cultivo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_codigotrabajador_cultivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código Trabajador", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_codigotrabajador_cultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigotrabajador_cultivoActionPerformed(evt);
            }
        });

        txt_codigocultivo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_codigocultivo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_codigocultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigocultivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btn_limpiarcamposcultivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btn_asociarcultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigocultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigotrabajador_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_produccioncultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_descripcioncultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombrecultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigocultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombrecultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_descripcioncultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_produccioncultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_codigotrabajador_cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_asociarcultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiarcamposcultivos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(235, 245, 251));

        btn_limpiarcampostrabajadores.setBackground(new java.awt.Color(235, 245, 251));
        btn_limpiarcampostrabajadores.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_limpiarcampostrabajadores.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiarcampostrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pagina-web.png"))); // NOI18N
        btn_limpiarcampostrabajadores.setBorder(null);
        btn_limpiarcampostrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarcampostrabajadoresActionPerformed(evt);
            }
        });

        btn_actualizartrabajador.setBackground(new java.awt.Color(235, 245, 251));
        btn_actualizartrabajador.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_actualizartrabajador.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizartrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/procesamiento-de-datos.png"))); // NOI18N
        btn_actualizartrabajador.setBorder(null);
        btn_actualizartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizartrabajadorActionPerformed(evt);
            }
        });

        btn_consultartrabajador.setBackground(new java.awt.Color(235, 245, 251));
        btn_consultartrabajador.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_consultartrabajador.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultartrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aumentador.png"))); // NOI18N
        btn_consultartrabajador.setBorder(null);
        btn_consultartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultartrabajadorActionPerformed(evt);
            }
        });

        btn_agregartrabajador.setBackground(new java.awt.Color(235, 245, 251));
        btn_agregartrabajador.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_agregartrabajador.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregartrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seguidores.png"))); // NOI18N
        btn_agregartrabajador.setBorder(null);
        btn_agregartrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregartrabajadorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setText("Trabajadores");

        txt_codigotrabajador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_codigotrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_codigotrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigotrabajadorActionPerformed(evt);
            }
        });

        txt_contactotrabajador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_contactotrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacto", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_contactotrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactotrabajadorActionPerformed(evt);
            }
        });

        txt_nombretrabajador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_nombretrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_nombretrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombretrabajadorActionPerformed(evt);
            }
        });

        txt_nitfinca_trabajador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_nitfinca_trabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nit Finca", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_nitfinca_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitfinca_trabajadorActionPerformed(evt);
            }
        });

        txt_cargotrabajador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_cargotrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cargo", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_cargotrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cargotrabajadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_agregartrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultartrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btn_limpiarcampostrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(95, 95, 95))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_codigotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cargotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nitfinca_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contactotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombretrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombretrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_contactotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nitfinca_trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cargotrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_limpiarcampostrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizartrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(235, 245, 251));

        btn_agregarfinca.setBackground(new java.awt.Color(235, 245, 251));
        btn_agregarfinca.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_agregarfinca.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarfinca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-archivo.png"))); // NOI18N
        btn_agregarfinca.setBorder(null);
        btn_agregarfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarfincaActionPerformed(evt);
            }
        });

        btn_consultarfinca.setBackground(new java.awt.Color(235, 245, 251));
        btn_consultarfinca.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_consultarfinca.setForeground(new java.awt.Color(255, 255, 255));
        btn_consultarfinca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/consulta.png"))); // NOI18N
        btn_consultarfinca.setBorder(null);
        btn_consultarfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarfincaActionPerformed(evt);
            }
        });

        btn_actualizarfinca.setBackground(new java.awt.Color(235, 245, 251));
        btn_actualizarfinca.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_actualizarfinca.setForeground(new java.awt.Color(255, 255, 255));
        btn_actualizarfinca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar-datos.png"))); // NOI18N
        btn_actualizarfinca.setBorder(null);
        btn_actualizarfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarfincaActionPerformed(evt);
            }
        });

        btn_limpiarcamposfinca.setBackground(new java.awt.Color(235, 245, 251));
        btn_limpiarcamposfinca.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btn_limpiarcamposfinca.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiarcamposfinca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora.png"))); // NOI18N
        btn_limpiarcamposfinca.setBorder(null);
        btn_limpiarcamposfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarcamposfincaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Fincas");

        txt_nitfinca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_nitfinca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nit ", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_nitfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nitfincaActionPerformed(evt);
            }
        });

        txt_nombrefinca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_nombrefinca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre de la Finca", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_nombrefinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombrefincaActionPerformed(evt);
            }
        });

        txt_ubicacionfinca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_ubicacionfinca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ubicación", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_ubicacionfinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ubicacionfincaActionPerformed(evt);
            }
        });

        txt_propietariofinca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_propietariofinca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propietario", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_propietariofinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_propietariofincaActionPerformed(evt);
            }
        });

        txt_correofinca.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txt_correofinca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 12))); // NOI18N
        txt_correofinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correofincaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_nitfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_agregarfinca, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultarfinca, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizarfinca, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpiarcamposfinca, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_correofinca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_propietariofinca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ubicacionfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombrefinca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nitfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombrefinca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ubicacionfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_propietariofinca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txt_correofinca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_limpiarcamposfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_consultarfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizarfinca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void btn_agregarfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarfincaActionPerformed
        // Verificar si todos los campos están llenos
    if (txt_nitfinca.getText().isEmpty() || txt_nombrefinca.getText().isEmpty() || txt_ubicacionfinca.getText().isEmpty() || txt_propietariofinca.getText().isEmpty() || txt_correofinca.getText().isEmpty()) {
        // Mostrar un mensaje de que todos los datos deben ser llenados
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
    } else {
        // Verificar si el campo txt_nitfinca solo contiene números
        if (!txt_nitfinca.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El campo NIT de la finca debe contener solo números.", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
        } else {
            // Agregar la finca solo si todos los campos están llenos y el campo txt_nitfinca contiene solo números
            Finca.add(new cls_finca(txt_nitfinca.getText(), txt_nombrefinca.getText(), txt_ubicacionfinca.getText(), txt_propietariofinca.getText(), txt_correofinca.getText()));
            JOptionPane.showMessageDialog(null, "¡Registro de finca completado satisfactoriamente!", "Éxito en el Registro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }//GEN-LAST:event_btn_agregarfincaActionPerformed

    private void btn_consultarfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarfincaActionPerformed
                                                  
        bln_sw_finca = false;
        int_pfinca = 0;
        
        for (int i = 0; i < Finca.size(); i++){
            if(txt_nitfinca.getText().equals(Finca.get(i).getStr_nit())){
            bln_sw_finca = true;
            int_pfinca = i;
            break;
            }
        }
        
        if (bln_sw_finca == false){
        JOptionPane.showMessageDialog(null, "No se encontraron registros de fincas que coincidan con la búsqueda. Por favor, intente nuevamente.", "Sin Resultados", JOptionPane.WARNING_MESSAGE);
        }else{
            txt_nombrefinca.setText(Finca.get(int_pfinca).getStr_nombre());
            txt_ubicacionfinca.setText(Finca.get(int_pfinca).getStr_ubicacion());
            txt_propietariofinca.setText(Finca.get(int_pfinca).getStr_propietario());
            txt_correofinca.setText(Finca.get(int_pfinca).getStr_correo());
            btn_actualizarfinca.setEnabled(true); 
        }
    
    }//GEN-LAST:event_btn_consultarfincaActionPerformed

    private void btn_limpiarcampostrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarcampostrabajadoresActionPerformed
    txt_codigotrabajador.setText("");
    txt_nombretrabajador.setText("");
    txt_contactotrabajador.setText("");
    txt_nitfinca_trabajador.setText("");
    txt_cargotrabajador.setText("");
    }//GEN-LAST:event_btn_limpiarcampostrabajadoresActionPerformed

    private void btn_limpiarcamposcultivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarcamposcultivosActionPerformed
    txt_codigocultivo.setText("");
    txt_nombrecultivo.setText("");
    txt_descripcioncultivo.setText("");
    txt_produccioncultivo.setText("");
    txt_codigotrabajador_cultivo.setText("");
    }//GEN-LAST:event_btn_limpiarcamposcultivosActionPerformed

    private void btn_asociarcultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_asociarcultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_asociarcultivoActionPerformed

    private void btn_actualizarfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarfincaActionPerformed
     // Verificar si todos los campos están llenos
    if (txt_nitfinca.getText().isEmpty() || txt_nombrefinca.getText().isEmpty() || txt_ubicacionfinca.getText().isEmpty() || txt_propietariofinca.getText().isEmpty() || txt_correofinca.getText().isEmpty()) {
      
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
    } else {
        // Realizar la actualización de la finca si todos los campos están llenos
        Finca.get(int_pfinca).setStr_nombre(txt_nombrefinca.getText());
        Finca.get(int_pfinca).setStr_ubicacion(txt_ubicacionfinca.getText());
        Finca.get(int_pfinca).setStr_propietario(txt_propietariofinca.getText());
        Finca.get(int_pfinca).setStr_correo(txt_correofinca.getText());
        JOptionPane.showMessageDialog(null, "La información de la finca se ha actualizado satisfactoriamente.", "Actualización Exitosa", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btn_actualizarfincaActionPerformed

    private void btn_actualizartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizartrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizartrabajadorActionPerformed

    private void btn_consultartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultartrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultartrabajadorActionPerformed

    private void btn_agregartrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregartrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregartrabajadorActionPerformed

    private void btn_limpiarcamposfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarcamposfincaActionPerformed
      txt_nitfinca.setText("");
      txt_nombrefinca.setText("");
      txt_ubicacionfinca.setText("");
      txt_propietariofinca.setText("");
      txt_correofinca.setText("");
    }//GEN-LAST:event_btn_limpiarcamposfincaActionPerformed

    private void txt_nitfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitfincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitfincaActionPerformed

    private void txt_nombrefincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombrefincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombrefincaActionPerformed

    private void txt_ubicacionfincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ubicacionfincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ubicacionfincaActionPerformed

    private void txt_propietariofincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_propietariofincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_propietariofincaActionPerformed

    private void txt_correofincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correofincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correofincaActionPerformed

    private void txt_codigotrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigotrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigotrabajadorActionPerformed

    private void txt_nombretrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombretrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombretrabajadorActionPerformed

    private void txt_contactotrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactotrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactotrabajadorActionPerformed

    private void txt_nitfinca_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nitfinca_trabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nitfinca_trabajadorActionPerformed

    private void txt_cargotrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cargotrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cargotrabajadorActionPerformed

    private void txt_codigocultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigocultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigocultivoActionPerformed

    private void txt_nombrecultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombrecultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombrecultivoActionPerformed

    private void txt_descripcioncultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descripcioncultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcioncultivoActionPerformed

    private void txt_produccioncultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_produccioncultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_produccioncultivoActionPerformed

    private void txt_codigotrabajador_cultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigotrabajador_cultivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigotrabajador_cultivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_finca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarfinca;
    private javax.swing.JButton btn_actualizartrabajador;
    private javax.swing.JButton btn_agregarfinca;
    private javax.swing.JButton btn_agregartrabajador;
    private javax.swing.JButton btn_asociarcultivo;
    private javax.swing.JButton btn_consultarfinca;
    private javax.swing.JButton btn_consultartrabajador;
    private javax.swing.JButton btn_limpiarcamposcultivos;
    private javax.swing.JButton btn_limpiarcamposfinca;
    private javax.swing.JButton btn_limpiarcampostrabajadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField txt_cargotrabajador;
    private javax.swing.JTextField txt_codigocultivo;
    private javax.swing.JTextField txt_codigotrabajador;
    private javax.swing.JTextField txt_codigotrabajador_cultivo;
    private javax.swing.JTextField txt_contactotrabajador;
    private javax.swing.JTextField txt_correofinca;
    private javax.swing.JTextField txt_descripcioncultivo;
    private javax.swing.JTextField txt_nitfinca;
    private javax.swing.JTextField txt_nitfinca_trabajador;
    private javax.swing.JTextField txt_nombrecultivo;
    private javax.swing.JTextField txt_nombrefinca;
    private javax.swing.JTextField txt_nombretrabajador;
    private javax.swing.JTextField txt_produccioncultivo;
    private javax.swing.JTextField txt_propietariofinca;
    private javax.swing.JTextField txt_ubicacionfinca;
    // End of variables declaration//GEN-END:variables
}
