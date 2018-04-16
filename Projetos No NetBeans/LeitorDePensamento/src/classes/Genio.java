/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Borin
 */
public class Genio extends javax.swing.JFrame {

    /**
     * Creates new form Genio
     */
    public Genio() 
    {
    
        initComponents();
    
        lblFrase.setText ( "<html>Vou pensar em um valor inteiro entre <strong>1 e 5</strong>. Tente adivinhar se for capaz !</html> " ) ;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        txtVal = new javax.swing.JSpinner();
        lblFrase = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPalpite = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 134, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Borin\\Documents\\Minhas Imagens\\Akinator_11_deception.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 320, 460, 480));

        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setText("Valor De Palpite");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 170, 30));

        txtVal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 470, 180, -1));

        lblFrase.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFrase.setForeground(new java.awt.Color(0, 0, 0));
        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase");
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 320, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/bub.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        btnPalpite.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPalpite.setLabel("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        
        double n = 1 + Math.random ( ) * ( 5 - 1 ) ;
        int valor = ( int ) n ;
        
        int palpite = Integer.parseInt( txtVal.getValue ( ).toString ( ) ) ;
        System.out.println( valor );
        
        String f1 = "<html>Acertou !!!</html>" ;
        String f2 = "<html>Errou !!! Eu pensei no valor "+valor+"</html>" ;
        
        String res = ( valor == palpite )? f1 : f2 ;
        
        lblFrase.setText( res );
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and  display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label2;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtVal;
    // End of variables declaration//GEN-END:variables
}
