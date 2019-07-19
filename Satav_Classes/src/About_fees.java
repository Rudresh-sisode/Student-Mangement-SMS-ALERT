
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rudr'a
 */
public class About_fees extends javax.swing.JFrame {

    /**
     * Creates new form About_fees
     */
    public About_fees() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gc.png")));
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_mob = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        student_sms = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mob_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(22, 101, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Send Fees SMS to Student");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 40));

        txt_mob.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        txt_mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mobKeyTyped(evt);
            }
        });
        jPanel1.add(txt_mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 210, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 310, 420));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        jLabel3.setText("Mobile No");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, 30));

        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 80, 30));

        student_sms.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        student_sms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail-message-send-icon.png"))); // NOI18N
        student_sms.setText("Send");
        student_sms.setBorder(null);
        student_sms.setOpaque(false);
        student_sms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_smsActionPerformed(evt);
            }
        });
        jPanel1.add(student_sms, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 130, 30));

        jLabel4.setFont(new java.awt.Font("Kruti Dev 051", 0, 24)); // NOI18N
        jLabel4.setText("ikydakuk lqfpr dj.;kr ;srs fd] vkiY;k ikY;kph Dyklph moZjhr Qh yodjkr yodj Hkjkoh-");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 720, 140));

        jTabbedPane1.addTab("Student Fees", jPanel1);

        jPanel2.setBackground(new java.awt.Color(22, 101, 158));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Send SMS as you want");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 40));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jLabel5.setText("Type SMS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 100, 30));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jLabel6.setText("Enter Mobile Number");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 200, 30));

        mob_txt.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jPanel2.add(mob_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 250, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 370, 150));

        jButton3.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail-message-send-icon.png"))); // NOI18N
        jButton3.setText("Send");
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 130, 30));

        jButton4.setFont(new java.awt.Font("Book Antiqua", 0, 20)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 80, 30));

        jTabbedPane1.addTab("SMS", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void student_smsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_smsActionPerformed
        // TODO add your handling code here:
        if(txt_mob.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter Mobile Number");
        }
        else
        {
            try {
			// Construct data
			//String apiKey = "apikey=" + "DFytTrNNZ8A-47geSM5Oah1rFgyTpmkksp4b6FAdvu";//SATAV
                        String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
                        
			String message = "&message="+"पालकांना सूचित करण्यात येते कि आपल्या पाल्याची क्लासची उर्वरित फी लवकरात लवकर भरावी.(Gurukul Coaching Classes)";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			String unicode="&unicode="+"true";
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender + unicode;
			conni.setDoOutput(true);
			conni.setRequestMethod("POST");
			conni.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conni.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conni.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
                       
			while ((line = rd.readLine()) != null) {
                            
                            JOptionPane.showMessageDialog(null, "Message\n"+line);
                            
				stringBuffer.append(line);
                                //System.out.println("the value of line is\t"+line);
                                if(line.startsWith("{\"errors\""))
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Sorry Error Occured");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Message Send Successfully");
                                }
                                    
			}
			rd.close();
			
			//return stringBuffer.toString();
		} 
                                catch (HeadlessException | IOException ex) {
			/*System.out.println("Error SMS "+e);
			return "Error "+e;*/
                        JOptionPane.showMessageDialog(null,ex+ "\n\nMessage Send Not Successfully");
		}
        txt_mob.setText("");
            
        }
        
        
        
    }//GEN-LAST:event_student_smsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(mob_txt.getText().isEmpty() && jTextArea1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Enter Number And Message");
        }
        else
        {
            try {
			// Construct data
			 String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message="+jTextArea1.getText();
			String sender = "&sender=" +"GURUKL";
                        String numb=mob_txt.getText();
			String numbers = "&numbers=" +numb;
			String unicode="&unicode="+"true";
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender + unicode;
			conni.setDoOutput(true);
			conni.setRequestMethod("POST");
			conni.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conni.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conni.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
                       
			while ((line = rd.readLine()) != null) {
                            
                            //JOptionPane.showMessageDialog(null, "Message\n"+line);
                            
				stringBuffer.append(line);
                                //System.out.println("the value of line is\t"+line);
                                if(line.startsWith("{\"errors\""))
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Sorry Error Occured");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Message Send Successfully");
                                }
                                    
			}
			rd.close();
			
			//return stringBuffer.toString();
		} 
                                catch (HeadlessException | IOException ex) {
			/*System.out.println("Error SMS "+e);
			return "Error "+e;*/
                        JOptionPane.showMessageDialog(null,ex+ "\n\nMessage Send Not Successfully");
		}
        mob_txt.setText("");
            
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_mobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_txt_mobKeyTyped

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
            java.util.logging.Logger.getLogger(About_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(About_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(About_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(About_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About_fees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mob_txt;
    private javax.swing.JButton student_sms;
    private javax.swing.JTextField txt_mob;
    // End of variables declaration//GEN-END:variables
}
