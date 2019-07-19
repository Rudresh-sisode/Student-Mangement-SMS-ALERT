
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Class_6 extends javax.swing.JFrame {

    /**
     * Creates new form Class_6
     */
     String filename=null;
    byte[] person_image=null;
    public Class_6() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        initComponents();
        setIcon();
    }
     public void setIcon()
    {
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("sc_logo.png")));
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gc.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        txt_images = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        txt_student_id = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_middle_name = new javax.swing.JTextField();
        txt_stand = new javax.swing.JComboBox<>();
        txt_gender = new javax.swing.JComboBox<>();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_batch = new javax.swing.JComboBox<>();
        txt_mob = new javax.swing.JTextField();
        capture_btn = new javax.swing.JButton();
        take_a_photo = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fill_up_fees = new javax.swing.JTextField();
        remaining_fees = new javax.swing.JTextField();
        total_fees = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Search_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        clear_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class 6th");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 121, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Fees");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 220, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Mob");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 50, 30));

        txt_age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 100, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 110, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Standard");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Rs");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 60, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 70, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("D.O.B");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 60, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Total Fees");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 90, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Batch");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Photo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 60, 30));

        txt_last_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Search");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 80, 30));

        jDesktopPane1.setLayer(txt_images, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_images, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_images, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 140, 160));

        txt_first_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 200, 30));

        txt_student_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_student_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 170, 30));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 310, 30));

        txt_middle_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_middle_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 200, 30));

        txt_stand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_stand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        txt_stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_standActionPerformed(evt);
            }
        });
        jPanel1.add(txt_stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, 30));

        txt_gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Boy", "Girl" }));
        jPanel1.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 110, 30));

        txt_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_date.setPreferredSize(new java.awt.Dimension(6, 23));
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 190, 30));

        txt_batch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Semi-1", "Semi-2", "Non-semi-1", "Non-semi-2" }));
        jPanel1.add(txt_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 140, 30));

        txt_mob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mobKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mobKeyTyped(evt);
            }
        });
        jPanel1.add(txt_mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 200, 30));

        capture_btn.setBackground(new java.awt.Color(22, 101, 158));
        capture_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        capture_btn.setForeground(new java.awt.Color(255, 255, 255));
        capture_btn.setText("Upload");
        capture_btn.setBorderPainted(false);
        capture_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        capture_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capture_btnActionPerformed(evt);
            }
        });
        jPanel1.add(capture_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 120, 30));

        take_a_photo.setBackground(new java.awt.Color(22, 101, 158));
        take_a_photo.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        take_a_photo.setForeground(new java.awt.Color(255, 255, 255));
        take_a_photo.setText("Take a Photo");
        take_a_photo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        take_a_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_a_photoActionPerformed(evt);
            }
        });
        jPanel1.add(take_a_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 140, 30));

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Class 6th");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 70, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Fill up Fees");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 110, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Remaining Fees");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 140, 30));

        fill_up_fees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fill_up_fees.setText("00");
        fill_up_fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fill_up_feesActionPerformed(evt);
            }
        });
        fill_up_fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fill_up_feesKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fill_up_feesKeyTyped(evt);
            }
        });
        jPanel1.add(fill_up_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 160, 30));

        remaining_fees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remaining_fees.setText("00");
        jPanel1.add(remaining_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 160, 30));

        total_fees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_fees.setText("00");
        jPanel1.add(total_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 160, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Age");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 40, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Rs");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 60, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setText("Rs");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 60, 30));

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_search.setToolTipText("Enter Student Id");
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 280, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21.setText("Middle Name");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 120, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 310, 420));

        Home.setBackground(new java.awt.Color(22, 101, 158));
        Home.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homee.png"))); // NOI18N
        Home.setText("Home");
        Home.setToolTipText("");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 640, 150, 50));

        Search_btn.setBackground(new java.awt.Color(22, 101, 158));
        Search_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        Search_btn.setForeground(new java.awt.Color(255, 255, 255));
        Search_btn.setText("Search");
        Search_btn.setToolTipText("Search");
        Search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 110, 30));

        update_btn.setBackground(new java.awt.Color(22, 101, 158));
        update_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Update");
        update_btn.setToolTipText("Update");
        update_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 112, 30));

        delete_btn.setBackground(new java.awt.Color(22, 101, 158));
        delete_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.setToolTipText("Delete");
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 110, 30));

        clear_btn.setBackground(new java.awt.Color(22, 101, 158));
        clear_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setText("Clear");
        clear_btn.setToolTipText("Clear");
        clear_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel1.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 110, 30));

        clear_btn1.setBackground(new java.awt.Color(22, 101, 158));
        clear_btn1.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        clear_btn1.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn1.setText("Table");
        clear_btn1.setToolTipText("view Table");
        clear_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_standActionPerformed
        // TODO add your handling code here:
        if(txt_stand.getSelectedItem().equals("1"))
        {
            total_fees.setText("1000");

        }
        else if(txt_stand.getSelectedItem().equals("2"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("3"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("4"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("5"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("6"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("7"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("8"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("9"))
        {
            total_fees.setText("");

        }
        else if(txt_stand.getSelectedItem().equals("10"))
        {
            total_fees.setText("");

        }
    }//GEN-LAST:event_txt_standActionPerformed

    private void txt_mobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobKeyPressed

    private void txt_mobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobKeyTyped
        // TODO add your handling code here:

        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_txt_mobKeyTyped

    private void capture_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capture_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();

        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.IMAGE","JPG","GIF","PNG");
        chooser.addChoosableFileFilter(filter);

        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        /*
        below from we want to use this code line into our hospital_bill.java jFrame program
        */
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(txt_images.getWidth(), txt_images.getHeight(), Image.SCALE_SMOOTH));
        txt_images.setIcon(imageicon);
        try
        {
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum;(readnum=fis.read(buf))!=-1;)
            {

                bos.write(buf,0,readnum);
            }
            person_image=bos.toByteArray();

        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "Some error occured  "+e);
        }
    }//GEN-LAST:event_capture_btnActionPerformed

    private void take_a_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_a_photoActionPerformed
        // TODO add your handling code here:
        new WebCam().setVisible(true);
    }//GEN-LAST:event_take_a_photoActionPerformed

    private void fill_up_feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fill_up_feesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fill_up_feesActionPerformed

    private void fill_up_feesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fill_up_feesKeyReleased
        // TODO add your handling code here:
        /* String a=fill_up_fees.getText();
        String b=remaining_fees.getText();
        int c=Integer.parseInt(a);
        int d=Integer.parseInt(b);
        int e=c+d;
        String f=Integer.toString(e);*/
      
        //int i = 1234;
        //String str = Integer.toString(i);
        //int xaxis1 = Integer.parseInt(text);
    }//GEN-LAST:event_fill_up_feesKeyReleased

    private void fill_up_feesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fill_up_feesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_fill_up_feesKeyTyped

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        
        new HomePage().setVisible(true);
         dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String sql="select * from Student_Info_6 where Student_id=?";
        try
        {
            String st=txt_search.getText();
            if(st.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Search Field is Empty");
            }
            else
            {
                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_search.getText());
                rs=pst.executeQuery();
                if(rs.next())
                {

                    String a=rs.getString("Student_id");
                    txt_student_id.setText(a);
                    String b=rs.getString("Last_Name");
                    txt_last_name.setText(b);
                    String c=rs.getString("First_Name");//
                    txt_first_name.setText(c);
                    String d=rs.getString("Middle_Name");
                    txt_middle_name.setText(d);
                    String e=rs.getString("Standard");
                    txt_stand.setSelectedItem(e);
                    String f=rs.getString("Batch");
                    txt_batch.setSelectedItem(f);
                    String g=rs.getString("D_O_B");
                    ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(g);
                    String h=rs.getString("Gender");
                    txt_gender.setSelectedItem(h);
                    String i=rs.getString("Age");
                    txt_age.setText(i);
                    String j=rs.getString("Mob");
                    txt_mob.setText(j);
                    String k=rs.getString("Address");
                    txt_address.setText(k);
                    byte[] bi=rs.getBytes("Images");
                    ImageIcon image=new ImageIcon(bi);
                    Image mi=image.getImage();
                    Image myimg=mi.getScaledInstance(txt_images.getWidth(),txt_images.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon newIcon=new ImageIcon(myimg);
                    txt_images.setIcon(newIcon);
                    txt_images.revalidate();
                    String m=rs.getString("Fill_fees");
                    fill_up_fees.setText(m);
                    String n=rs.getString("Remain_fees");
                    remaining_fees.setText(n);
                    String o=rs.getString("Total_fees");
                    total_fees.setText(o);

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Sorry No Result");
                }
            }

        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Sorry Error Found\n"+ex);
        }
        finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();

                }
                if(pst!=null)
                {
                    pst.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_Search_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        String aa=txt_search.getText();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
        String c=txt_middle_name.getText();
        String d=txt_stand.getSelectedItem().toString();
        String e=txt_batch.getSelectedItem().toString();
        String f= ((JTextField)txt_date.getDateEditor().getUiComponent()).getText();

        String g=txt_gender.getSelectedItem().toString();
        String h=txt_age.getText();
        String i=txt_mob.getText();
        String j=txt_address.getText();
        String k=fill_up_fees.getText();
        String l=remaining_fees.getText();

        String m=total_fees.getText();
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            if(aa.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Student Id is Empty");
            }
            else
            {
                String sql="update Student_Info_6 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Batch='"+e+"',D_O_B='"+f+"',Gender='"+g+"',Age='"+h+"',Mob='"+i+"',Address='"+j+"',Fill_fees='"+k+"',Remain_fees='"+l+"',Total_fees='"+m+"' where Student_id='"+aa+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();

                JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                txt_student_id.setText("");
                txt_search.setText("");
                txt_last_name.setText("");
                txt_first_name.setText("");
                txt_middle_name.setText("");
                txt_stand.setSelectedItem("");
                txt_batch.setSelectedItem("");
                ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
                txt_gender.setSelectedItem("");
                txt_age.setText("");
                txt_mob.setText("");
                txt_address.setText("");
                fill_up_fees.setText("00");
                remaining_fees.setText("00");
                total_fees.setText("00");
                txt_images.setIcon(null);
                txt_images.revalidate();

            }

        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Sorry Erro Occured\n"+ex);
        }
        finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();

                }
                if(pst!=null)
                {
                    pst.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {

            String st=txt_student_id.getText();
            if(st.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Student ID is Empty");

            }
            else
            {
                String ab=txt_search.getText();
                String sql="delete from Student_Info_6 where Student_id='"+ab+"'";
                pst=conn.prepareStatement(sql);
                //  pst.setString(1, in_patient_id.getText());

                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                    txt_search.setText("");
                    txt_last_name.setText("");
                    txt_first_name.setText("");
                    txt_middle_name.setText("");
                    ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
                    txt_stand.setSelectedItem("");
                    txt_batch.setSelectedItem("");
                    txt_gender.setSelectedItem("");
                    txt_age.setText("");
                    txt_mob.setText("");
                    txt_student_id.setText("");
                    txt_address.setText("");

                    txt_images.setIcon(null);
                    txt_images.revalidate();
                    fill_up_fees.setText("00");
                    remaining_fees.setText("00");
                    total_fees.setText("00");

                }
            }
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
        }
        finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();

                }
                if(pst!=null)
                {
                    pst.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        txt_search.setText("");
        txt_student_id.setText("");
        txt_search.setText("");
        txt_last_name.setText("");
        txt_first_name.setText("");
        txt_middle_name.setText("");
        txt_stand.setSelectedItem("");
        txt_batch.setSelectedItem("");
        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
        txt_gender.setSelectedItem("");
        txt_age.setText("");
        txt_mob.setText("");
        txt_address.setText("");
        fill_up_fees.setText("00");
        remaining_fees.setText("00");
        total_fees.setText("00");
        txt_images.setIcon(null);
        txt_images.revalidate();
    }//GEN-LAST:event_clear_btnActionPerformed

    private void clear_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btn1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Classes_6().setVisible(true);
    }//GEN-LAST:event_clear_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(Class_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Class_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Class_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Class_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Class_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton Search_btn;
    private javax.swing.JButton capture_btn;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton clear_btn1;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField fill_up_fees;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField remaining_fees;
    private javax.swing.JButton take_a_photo;
    private javax.swing.JTextField total_fees;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JComboBox<String> txt_batch;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JComboBox<String> txt_gender;
    private javax.swing.JLabel txt_images;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_middle_name;
    private javax.swing.JTextField txt_mob;
    private javax.swing.JTextField txt_search;
    private javax.swing.JComboBox<String> txt_stand;
    private javax.swing.JTextField txt_student_id;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}