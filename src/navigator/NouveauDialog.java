/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator;

import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author abdel
 */
public class NouveauDialog extends javax.swing.JDialog {
    private String titre;
    private String adresse;
    private Image image;
    private String description;
    private boolean valide;

    public String getTitre() {
        return titre;
    }

    public String getAdresse() {
        return adresse;
    }

    public Image getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public boolean isValide() {
        return valide;
    }
    
    

    /**
     * Creates new form NouveauDialog
     */
    public NouveauDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.valide = false;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        input_text = new javax.swing.JTextField();
        input_adresse = new javax.swing.JTextField();
        input_image = new javax.swing.JTextField();
        btn_choisir_image = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_description = new javax.swing.JTextArea();
        label_titre = new javax.swing.JLabel();
        label_adresse = new javax.swing.JLabel();
        label_image = new javax.swing.JLabel();
        label_description = new javax.swing.JLabel();
        btn_ajouter = new javax.swing.JButton();
        btn_annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_choisir_image.setText("Choisir");
        btn_choisir_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_choisir_imageActionPerformed(evt);
            }
        });

        input_description.setColumns(20);
        input_description.setRows(5);
        jScrollPane1.setViewportView(input_description);

        label_titre.setText("Titre");

        label_adresse.setText("Adresse");

        label_image.setText("Image");

        label_description.setText("Description");

        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });

        btn_annuler.setText("Annuler");
        btn_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_annulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_annuler)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ajouter))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_adresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_titre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_adresse)
                            .addComponent(input_text)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(input_image, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_choisir_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_titre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_adresse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_choisir_image)
                    .addComponent(label_image))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_description))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ajouter)
                    .addComponent(btn_annuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annulerActionPerformed
        this.valide = false;
        dispose();
    }//GEN-LAST:event_btn_annulerActionPerformed

    private void btn_choisir_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_choisir_imageActionPerformed
        // TODO add your handling code here:
        JFileChooser file_chooser = new JFileChooser();
        file_chooser.setFileFilter(new FileNameExtensionFilter("Images", new String[]{"jpg","png","gif","jpeg"}));
        file_chooser.showDialog(this, "Charger");
        if(file_chooser.getSelectedFile().exists()){
            input_image.setText(file_chooser.getSelectedFile().getAbsolutePath());   
        }    
    }//GEN-LAST:event_btn_choisir_imageActionPerformed

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
        // TODO add your handling code here:
        titre = input_text.getText();
        adresse = input_adresse.getText();
        description = input_description.getText();
        ImageIcon icon = new ImageIcon(input_image.getText());
        if(icon.getImageLoadStatus()==MediaTracker.COMPLETE)image = icon.getImage();else image=null;
        boolean validation=true;
        if(titre.isEmpty()){label_titre.setForeground(Color.red); validation=false;}else label_titre.setForeground(Color.BLACK);
        if(adresse.isEmpty()){label_adresse.setForeground(Color.red); validation=false;}else label_adresse.setForeground(Color.BLACK);
        if(description.isEmpty()){label_description.setForeground(Color.red); validation=false;}else label_description.setForeground(Color.BLACK);
        if(Objects.isNull(image)){label_image.setForeground(Color.red); validation=false;}else label_image.setForeground(Color.BLACK);
        repaint();
        if(validation){valide=true;dispose();}
    }//GEN-LAST:event_btn_ajouterActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NouveauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NouveauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NouveauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NouveauDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NouveauDialog dialog = new NouveauDialog(new javax.swing.JFrame(), true);
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_annuler;
    private javax.swing.JButton btn_choisir_image;
    private javax.swing.JTextField input_adresse;
    private javax.swing.JTextArea input_description;
    private javax.swing.JTextField input_image;
    private javax.swing.JTextField input_text;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_adresse;
    private javax.swing.JLabel label_description;
    private javax.swing.JLabel label_image;
    private javax.swing.JLabel label_titre;
    // End of variables declaration//GEN-END:variables
}