
import java.awt.HeadlessException;
import java.awt.Toolkit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class View_all extends javax.swing.JFrame {

    /**
     * Creates new form View_all
     */
    public View_all() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        initComponents();
        setIcon();
    }
    public void setIcon()
    {
       // setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("sc_logo.png")));
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gc.png")));
    }
    public void Update_Class_1()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //2
    public void Update_Class_2()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_2 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //3
    public void Update_Class_3()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_3 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //4
    public void Update_Class_4()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_4 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //5
    public void Update_Class_5()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_5 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //6
    public void Update_Class_6()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_6 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //7
    public void Update_Class_7()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_7 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //8
    public void Update_Class_8()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_8 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //9
    public void Update_Class_9()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_9 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
    }
    //10
    public void Update_Class_10()
    {
         Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        try
        {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_10 order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,e+"\nConnection Error\nplease check..");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_class_table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_stand = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        txt_first_name = new javax.swing.JTextField();
        Search_btn = new javax.swing.JButton();
        view_all = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View All Student");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 121, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_class_table.setFont(new java.awt.Font("Bookman Old Style", 0, 16)); // NOI18N
        txt_class_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        txt_class_table.setRowHeight(25);
        txt_class_table.setRowMargin(2);
        jScrollPane1.setViewportView(txt_class_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 150, 1350, 550));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Standard");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, 30));

        txt_stand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_stand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        txt_stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_standActionPerformed(evt);
            }
        });
        jPanel1.add(txt_stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 110, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 100, 30));

        txt_last_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 200, 30));

        txt_first_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 200, 30));

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
        jPanel1.add(Search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 110, 30));

        view_all.setBackground(new java.awt.Color(22, 101, 158));
        view_all.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        view_all.setForeground(new java.awt.Color(255, 255, 255));
        view_all.setText("View All");
        view_all.setToolTipText("View All");
        view_all.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_allActionPerformed(evt);
            }
        });
        jPanel1.add(view_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 130, 30));

        back_btn.setBackground(new java.awt.Color(22, 101, 158));
        back_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("<<");
        back_btn.setToolTipText("back");
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 50, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_standActionPerformed
        // TODO add your handling code here:
        
        if(txt_stand.getSelectedItem().equals("1"))
        {
       
            Update_Class_1();

        }
        else if(txt_stand.getSelectedItem().equals("2"))
        {
           Update_Class_2();

        }
        else if(txt_stand.getSelectedItem().equals("3"))
        {
            Update_Class_3();
        }
        else if(txt_stand.getSelectedItem().equals("4"))
        {
            Update_Class_4();

        }
        else if(txt_stand.getSelectedItem().equals("5"))
        {
           Update_Class_5();
            
        }
        else if(txt_stand.getSelectedItem().equals("6"))
        {
           Update_Class_6();

        }
        else if(txt_stand.getSelectedItem().equals("7"))
        {
            Update_Class_7();

        }
        else if(txt_stand.getSelectedItem().equals("8"))
        {
            Update_Class_8();

        }
        else if(txt_stand.getSelectedItem().equals("9"))
        {
            Update_Class_9();
        }
        else if(txt_stand.getSelectedItem().equals("10"))
        {
            Update_Class_10();

        }
    }//GEN-LAST:event_txt_standActionPerformed

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
        // TODO add your handling code here:
        if(txt_stand.getSelectedItem().equals("None"))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Standard");
        }
        else if(txt_stand.getSelectedItem().equals("1"))
        {
       Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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

        }
        else if(txt_stand.getSelectedItem().equals("2"))
        {
            Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_2 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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
           

        }
        else if(txt_stand.getSelectedItem().equals("3"))
        {
            Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_3 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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
            
        }
        else if(txt_stand.getSelectedItem().equals("4"))
        {
            Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_4 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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
            

        }
        else if(txt_stand.getSelectedItem().equals("5"))
        {
           Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_5 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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
            
        }
        else if(txt_stand.getSelectedItem().equals("6"))
        {
           Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_6 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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

        }
        else if(txt_stand.getSelectedItem().equals("7"))
        {
           Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_7 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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

        }
        else if(txt_stand.getSelectedItem().equals("8"))
        {
            Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_8 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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

        }
        else if(txt_stand.getSelectedItem().equals("9"))
        {
            Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_9 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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
        }
        else if(txt_stand.getSelectedItem().equals("10"))
        {
            Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
           try
        {
            if(a.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your First Name");
            }
            else if(b.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Sir Name");
            }
            else
            {
            String sql="select Student_id,Last_Name,First_Name,Middle_Name,Standard,D_O_B,Mob from Student_Info_10 where Last_Name='"+ txt_last_name.getText()+"'and First_Name='"+txt_first_name.getText()+"'order by Student_id";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            txt_class_table.setModel(DbUtils.resultSetToTableModel(rs));
            }   
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
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

        }
       
        
    }//GEN-LAST:event_Search_btnActionPerformed

    private void view_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_allActionPerformed
        // TODO add your handling code here:
        txt_last_name.setText("");
        txt_first_name.setText("");
        if(txt_stand.getSelectedItem().equals("1"))
        {
       
            Update_Class_1();

        }
        else if(txt_stand.getSelectedItem().equals("2"))
        {
           Update_Class_2();

        }
        else if(txt_stand.getSelectedItem().equals("3"))
        {
            Update_Class_3();
        }
        else if(txt_stand.getSelectedItem().equals("4"))
        {
            Update_Class_4();

        }
        else if(txt_stand.getSelectedItem().equals("5"))
        {
           Update_Class_5();
            
        }
        else if(txt_stand.getSelectedItem().equals("6"))
        {
           Update_Class_6();

        }
        else if(txt_stand.getSelectedItem().equals("7"))
        {
            Update_Class_7();

        }
        else if(txt_stand.getSelectedItem().equals("8"))
        {
            Update_Class_8();

        }
        else if(txt_stand.getSelectedItem().equals("9"))
        {
            Update_Class_9();
        }
        else if(txt_stand.getSelectedItem().equals("10"))
        {
            Update_Class_10();

        }
    }//GEN-LAST:event_view_allActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(View_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_all.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_all().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable txt_class_table;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JComboBox<String> txt_stand;
    private javax.swing.JButton view_all;
    // End of variables declaration//GEN-END:variables
}
