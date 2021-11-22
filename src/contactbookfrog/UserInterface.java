/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contactbookfrog;
import java.awt.Color;
/**
 *
 * @author Jolou
 */
public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
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

        InputContact = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        middle_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        mobile_number = new javax.swing.JTextField();
        email_address = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(32767, 0));
        clear_all_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Book Frog");
        setPreferredSize(new java.awt.Dimension(420, 720));
        setResizable(false);

        InputContact.setBackground(new java.awt.Color(254, 185, 20));
        InputContact.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 15));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        logo.setFocusable(true);
        InputContact.add(logo);

        first_name.setBackground(new java.awt.Color(188, 211, 95));
        first_name.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        first_name.setText("First Name");
        first_name.setForeground(Color.BLACK);
        first_name.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        first_name.setPreferredSize(new java.awt.Dimension(350, 60));
        first_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                first_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                first_nameFocusLost(evt);
            }
        });
        InputContact.add(first_name);

        middle_name.setBackground(new java.awt.Color(188, 211, 95));
        middle_name.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        middle_name.setText("Middle Name");
        middle_name.setForeground(Color.BLACK);
        middle_name.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        middle_name.setPreferredSize(new java.awt.Dimension(350, 60));
        middle_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middle_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middle_nameFocusLost(evt);
            }
        });
        InputContact.add(middle_name);

        last_name.setBackground(new java.awt.Color(188, 211, 95));
        last_name.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        last_name.setText("Last Name");
        last_name.setForeground(Color.BLACK);
        last_name.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        last_name.setPreferredSize(new java.awt.Dimension(350, 60));
        last_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                last_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                last_nameFocusLost(evt);
            }
        });
        InputContact.add(last_name);

        mobile_number.setBackground(new java.awt.Color(188, 211, 95));
        mobile_number.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        mobile_number.setText("Mobile Number");
        mobile_number.setForeground(Color.BLACK);
        mobile_number.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        mobile_number.setPreferredSize(new java.awt.Dimension(350, 60));
        mobile_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobile_numberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobile_numberFocusLost(evt);
            }
        });
        InputContact.add(mobile_number);

        email_address.setBackground(new java.awt.Color(188, 211, 95));
        email_address.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        email_address.setText("Email Address");
        email_address.setForeground(Color.BLACK);
        email_address.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        email_address.setPreferredSize(new java.awt.Dimension(350, 60));
        email_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_addressFocusLost(evt);
            }
        });
        InputContact.add(email_address);

        submit_button.setBackground(new java.awt.Color(232, 228, 228));
        submit_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submit_button.setText("Submit");
        submit_button.setFocusPainted(false);
        submit_button.setForeground(Color.BLACK);
        submit_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        submit_button.setContentAreaFilled(false);
        submit_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit_button.setOpaque(true);
        submit_button.setPreferredSize(new java.awt.Dimension(90, 40));
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });
        InputContact.add(submit_button);
        InputContact.add(filler2);

        clear_all_button.setBackground(new java.awt.Color(232, 228, 228));
        clear_all_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clear_all_button.setText("Clear All");
        clear_all_button.setFocusPainted(false);
        clear_all_button.setForeground(Color.BLACK);
        clear_all_button.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        clear_all_button.setContentAreaFilled(false);
        clear_all_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_all_button.setOpaque(true);
        clear_all_button.setPreferredSize(new java.awt.Dimension(90, 40));
        clear_all_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_all_buttonActionPerformed(evt);
            }
        });
        InputContact.add(clear_all_button);

        getContentPane().add(InputContact, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void clear_all_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_all_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clear_all_buttonActionPerformed

    private void first_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_first_nameFocusGained
        // TODO add your handling code here:
        if(first_name.getText().equals("First Name"))
            first_name.setText("");
    }//GEN-LAST:event_first_nameFocusGained

    private void first_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_first_nameFocusLost
        // TODO add your handling code here:
        if(first_name.getText().equals(""))
            first_name.setText("First Name");
    }//GEN-LAST:event_first_nameFocusLost

    private void middle_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middle_nameFocusGained
        // TODO add your handling code here:
        if(middle_name.getText().equals("Middle Name"))
            middle_name.setText("");
    }//GEN-LAST:event_middle_nameFocusGained

    private void middle_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middle_nameFocusLost
        // TODO add your handling code here:
        if(middle_name.getText().equals(""))
            middle_name.setText("Middle Name");
    }//GEN-LAST:event_middle_nameFocusLost

    private void last_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_last_nameFocusGained
        // TODO add your handling code here:
        if(last_name.getText().equals("Last Name"))
            last_name.setText("");
    }//GEN-LAST:event_last_nameFocusGained

    private void last_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_last_nameFocusLost
        // TODO add your handling code here:
        if(last_name.getText().equals(""))
            last_name.setText("Last Name");
    }//GEN-LAST:event_last_nameFocusLost

    private void mobile_numberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_numberFocusGained
        // TODO add your handling code here:
        if(mobile_number.getText().equals("Mobile Number"))
            mobile_number.setText("");
    }//GEN-LAST:event_mobile_numberFocusGained

    private void mobile_numberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobile_numberFocusLost
        // TODO add your handling code here:
        if(mobile_number.getText().equals(""))
            mobile_number.setText("Mobile Number");
    }//GEN-LAST:event_mobile_numberFocusLost

    private void email_addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_addressFocusGained
        // TODO add your handling code here:
        if(email_address.getText().equals("Email Address"))
            email_address.setText("");
    }//GEN-LAST:event_email_addressFocusGained

    private void email_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_addressFocusLost
        // TODO add your handling code here:
        if(email_address.getText().equals(""))
            email_address.setText("Email Address");
    }//GEN-LAST:event_email_addressFocusLost

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
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InputContact;
    private javax.swing.JButton clear_all_button;
    private javax.swing.JTextField email_address;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JTextField first_name;
    private javax.swing.JTextField last_name;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField middle_name;
    private javax.swing.JTextField mobile_number;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
