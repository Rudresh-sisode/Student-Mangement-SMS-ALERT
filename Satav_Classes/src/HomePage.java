
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
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
public class HomePage extends javax.swing.JFrame {
     String filename=null;
    byte[] person_image=null; 

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        initComponents();
        
        setIcon();
    }
     public void setIcon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gc.png")));
    }
    public void setClear()
    {
        txt_last_name.setText("");
       txt_first_name.setText("");
        txt_middle_name.setText("");
         txt_stand.setSelectedIndex(0);
         txt_batch.setSelectedIndex(0);
         ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
         
         txt_gender.setSelectedIndex(0);
         txt_age.setText("");
        txt_mob.setText("");
        txt_address.setText("");
         txt_images.setIcon(null);
                txt_images.revalidate();
                fill_up_fees.setText("00");
                remaining_fees.setText("00");
                total_fees.setText("");
    }
   
    
     public void fe_class1()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
        String sql="insert into Class_fees_1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                        pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class2()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                          pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                        pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class3()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_3 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                         pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                         pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class4()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_4 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
           pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                         pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class5()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
         String sql="insert into Class_fees_5 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                         pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                        pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class6()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_6 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                          pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                         pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class7()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_7 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                          pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                        pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class8()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_8 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                         pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                         pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class9()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_9 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                         pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                         pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                        
                       
                            pst.execute();
                            
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
                
         
     }
     public void fe_class10()
     {
          Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     try
     {
          String sql="insert into Class_fees_10 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                          pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_first_name.getText());
                        pst.setString(3, txt_middle_name.getText());
                        pst.setString(4, txt_last_name.getText());
                        pst.setString(5, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        pst.setString(6, fill_up_fees.getText());
                        pst.setString(7, remaining_fees.getText());
                        pst.setString(8, "");
                        pst.setString(9, "");
                        pst.setString(10, "");
                        pst.setString(11, "");
                        pst.setString(12,"");
                        pst.setString(13, "");
                        pst.setString(14, "");
                        pst.setString(15, "");
                        pst.setString(16, "");
                        
                        
                       
                            pst.execute();
                            
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        save_btn = new javax.swing.JButton();
        log_btn = new javax.swing.JButton();
        new_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        new_txt_ = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        clear_txt_ = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        class_1st = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        class_2nd = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        class_3rd = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        class_4th = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        class_5th = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        class_6th = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        class_7th = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        class_8th = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        class_9th = new javax.swing.JMenuItem();
        jSeparator32 = new javax.swing.JPopupMenu.Separator();
        class_10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        view_notice = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        print_notice = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        student_report_menu = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenu7 = new javax.swing.JMenu();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        as = new javax.swing.JMenu();
        Class_fees_1st = new javax.swing.JMenuItem();
        jSeparator23 = new javax.swing.JPopupMenu.Separator();
        Class_fees_2nd = new javax.swing.JMenuItem();
        jSeparator24 = new javax.swing.JPopupMenu.Separator();
        Class_fees_3rd = new javax.swing.JMenuItem();
        jSeparator25 = new javax.swing.JPopupMenu.Separator();
        Class_fees_4rth = new javax.swing.JMenuItem();
        jSeparator26 = new javax.swing.JPopupMenu.Separator();
        Class_fees_5th = new javax.swing.JMenuItem();
        jSeparator27 = new javax.swing.JPopupMenu.Separator();
        Class_fees_6th = new javax.swing.JMenuItem();
        jSeparator28 = new javax.swing.JPopupMenu.Separator();
        Class_fees_7th = new javax.swing.JMenuItem();
        jSeparator29 = new javax.swing.JPopupMenu.Separator();
        Class_fees_8th = new javax.swing.JMenuItem();
        jSeparator30 = new javax.swing.JPopupMenu.Separator();
        Class_fees_9th = new javax.swing.JMenuItem();
        jSeparator31 = new javax.swing.JPopupMenu.Separator();
        Class_fees_10th = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gurukul Coaching Classes,Main Window");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 121, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Fees");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 220, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Mob");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 50, 30));

        txt_age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 130, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Middle Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 120, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Standard");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 80, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Rs");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 60, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 70, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("D.O.B");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 60, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Total Fees");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 90, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Batch");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 60, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Photo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, 60, 30));

        txt_last_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 200, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Student ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 100, 30));

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

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 140, 160));

        txt_first_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 200, 30));

        txt_student_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_student_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 200, 30));

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 310, 30));

        txt_middle_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_middle_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 200, 30));

        txt_stand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_stand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        txt_stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_standActionPerformed(evt);
            }
        });
        jPanel1.add(txt_stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 110, 30));

        txt_gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Boy", "Girl" }));
        jPanel1.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 110, 30));

        txt_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_date.setPreferredSize(new java.awt.Dimension(6, 23));
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 190, 30));

        txt_batch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Semi-1", "Semi-2", "Non-semi-1", "Non-semi-2" }));
        jPanel1.add(txt_batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 140, 30));

        txt_mob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mobKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mobKeyTyped(evt);
            }
        });
        jPanel1.add(txt_mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 200, 30));

        capture_btn.setBackground(new java.awt.Color(22, 101, 158));
        capture_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        capture_btn.setForeground(new java.awt.Color(255, 255, 255));
        capture_btn.setText("Upload");
        capture_btn.setBorderPainted(false);
        capture_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capture_btnActionPerformed(evt);
            }
        });
        jPanel1.add(capture_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 120, 30));

        take_a_photo.setBackground(new java.awt.Color(22, 101, 158));
        take_a_photo.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        take_a_photo.setForeground(new java.awt.Color(255, 255, 255));
        take_a_photo.setText("Take a Photo");
        take_a_photo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_a_photoActionPerformed(evt);
            }
        });
        jPanel1.add(take_a_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 150, 140, 30));

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Student Information");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 40));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Address");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 70, 30));

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
        remaining_fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                remaining_feesKeyTyped(evt);
            }
        });
        jPanel1.add(remaining_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 160, 30));

        total_fees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_fees.setText("00");
        total_fees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_feesKeyTyped(evt);
            }
        });
        jPanel1.add(total_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, 160, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Age");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 40, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Rs");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 60, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setText("Rs");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1210, 690));

        jPanel2.setBackground(new java.awt.Color(107, 136, 245));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(107, 136, 245));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save_btn.setBackground(new java.awt.Color(22, 101, 158));
        save_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user-icon (1).png"))); // NOI18N
        save_btn.setText("Save");
        save_btn.setBorderPainted(false);
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        jPanel3.add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        log_btn.setBackground(new java.awt.Color(204, 0, 0));
        log_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        log_btn.setForeground(new java.awt.Color(255, 255, 255));
        log_btn.setText("Log Out");
        log_btn.setBorderPainted(false);
        log_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_btnActionPerformed(evt);
            }
        });
        jPanel3.add(log_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 40));

        new_btn.setBackground(new java.awt.Color(22, 101, 158));
        new_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        new_btn.setForeground(new java.awt.Color(255, 255, 255));
        new_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misc-New-Database-icon.png"))); // NOI18N
        new_btn.setText("New");
        new_btn.setBorderPainted(false);
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });
        jPanel3.add(new_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 40));

        clear_btn.setBackground(new java.awt.Color(22, 101, 158));
        clear_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(255, 255, 255));
        clear_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Refresh-icon.png"))); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.setBorderPainted(false);
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        jPanel3.add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 190, -1, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 690));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 690));

        new_txt_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        new_txt_.setText("File");
        new_txt_.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        new_txt_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_txt_ActionPerformed(evt);
            }
        });

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("New");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        new_txt_.add(jMenuItem8);
        new_txt_.add(jSeparator1);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Save");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        new_txt_.add(jMenuItem9);
        new_txt_.add(jSeparator2);

        clear_txt_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        clear_txt_.setText("Clear");
        clear_txt_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_txt_ActionPerformed(evt);
            }
        });
        new_txt_.add(clear_txt_);
        new_txt_.add(jSeparator3);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem12.setText("Log Out");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        new_txt_.add(jMenuItem12);
        new_txt_.add(jSeparator4);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setText("Exit");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        new_txt_.add(jMenuItem13);
        new_txt_.add(jSeparator5);

        jMenuItem14.setText("More Info");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        new_txt_.add(jMenuItem14);
        new_txt_.add(jSeparator6);

        jMenuBar1.add(new_txt_);

        jMenu3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("Class");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        class_1st.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD1, java.awt.event.InputEvent.CTRL_MASK));
        class_1st.setText(" 1st Class");
        class_1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_1stActionPerformed(evt);
            }
        });
        jMenu3.add(class_1st);
        jMenu3.add(jSeparator10);

        class_2nd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD2, java.awt.event.InputEvent.CTRL_MASK));
        class_2nd.setText("2nd Class");
        class_2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_2ndActionPerformed(evt);
            }
        });
        jMenu3.add(class_2nd);
        jMenu3.add(jSeparator11);

        class_3rd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD3, java.awt.event.InputEvent.CTRL_MASK));
        class_3rd.setText("3rd Class");
        class_3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_3rdActionPerformed(evt);
            }
        });
        jMenu3.add(class_3rd);
        jMenu3.add(jSeparator12);

        class_4th.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD4, java.awt.event.InputEvent.CTRL_MASK));
        class_4th.setText("4th Class");
        class_4th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_4thActionPerformed(evt);
            }
        });
        jMenu3.add(class_4th);
        jMenu3.add(jSeparator13);

        class_5th.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD5, java.awt.event.InputEvent.CTRL_MASK));
        class_5th.setText("5th Class");
        class_5th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_5thActionPerformed(evt);
            }
        });
        jMenu3.add(class_5th);
        jMenu3.add(jSeparator14);

        class_6th.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD6, java.awt.event.InputEvent.CTRL_MASK));
        class_6th.setText("6th Class");
        class_6th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_6thActionPerformed(evt);
            }
        });
        jMenu3.add(class_6th);
        jMenu3.add(jSeparator15);

        class_7th.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD7, java.awt.event.InputEvent.CTRL_MASK));
        class_7th.setText("7th Class");
        class_7th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_7thActionPerformed(evt);
            }
        });
        jMenu3.add(class_7th);
        jMenu3.add(jSeparator16);

        class_8th.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD8, java.awt.event.InputEvent.CTRL_MASK));
        class_8th.setText("8th Class");
        class_8th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_8thActionPerformed(evt);
            }
        });
        jMenu3.add(class_8th);
        jMenu3.add(jSeparator17);

        class_9th.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD9, java.awt.event.InputEvent.CTRL_MASK));
        class_9th.setText("9th Class");
        class_9th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_9thActionPerformed(evt);
            }
        });
        jMenu3.add(class_9th);
        jMenu3.add(jSeparator32);

        class_10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD0, java.awt.event.InputEvent.CTRL_MASK));
        class_10.setText("10th Class");
        class_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_10ActionPerformed(evt);
            }
        });
        jMenu3.add(class_10);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setText("Notice");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        view_notice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        view_notice.setText("View Notice");
        view_notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_noticeActionPerformed(evt);
            }
        });
        jMenu4.add(view_notice);
        jMenu4.add(jSeparator18);

        print_notice.setText("Print Notice");
        print_notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_noticeActionPerformed(evt);
            }
        });
        jMenu4.add(print_notice);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setText("Report");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu5.add(jSeparator19);

        student_report_menu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        student_report_menu.setText("Student Report");
        student_report_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_report_menuActionPerformed(evt);
            }
        });
        jMenu5.add(student_report_menu);
        jMenu5.add(jSeparator8);

        jMenuBar1.add(jMenu5);

        jMenu7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu7.setText("Fees");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu7.add(jSeparator22);

        as.setText("Student Fees");

        Class_fees_1st.setText("1st Class");
        Class_fees_1st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_1stActionPerformed(evt);
            }
        });
        as.add(Class_fees_1st);
        as.add(jSeparator23);

        Class_fees_2nd.setText("2nd Class");
        Class_fees_2nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_2ndActionPerformed(evt);
            }
        });
        as.add(Class_fees_2nd);
        as.add(jSeparator24);

        Class_fees_3rd.setText("3rd Class");
        Class_fees_3rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_3rdActionPerformed(evt);
            }
        });
        as.add(Class_fees_3rd);
        as.add(jSeparator25);

        Class_fees_4rth.setText("4th Class");
        Class_fees_4rth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_4rthActionPerformed(evt);
            }
        });
        as.add(Class_fees_4rth);
        as.add(jSeparator26);

        Class_fees_5th.setText("5th Class");
        Class_fees_5th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_5thActionPerformed(evt);
            }
        });
        as.add(Class_fees_5th);
        as.add(jSeparator27);

        Class_fees_6th.setText("6th Class");
        Class_fees_6th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_6thActionPerformed(evt);
            }
        });
        as.add(Class_fees_6th);
        as.add(jSeparator28);

        Class_fees_7th.setText("7th Class");
        Class_fees_7th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_7thActionPerformed(evt);
            }
        });
        as.add(Class_fees_7th);
        as.add(jSeparator29);

        Class_fees_8th.setText("8th Class");
        Class_fees_8th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_8thActionPerformed(evt);
            }
        });
        as.add(Class_fees_8th);
        as.add(jSeparator30);

        Class_fees_9th.setText("9th Class");
        Class_fees_9th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_9thActionPerformed(evt);
            }
        });
        as.add(Class_fees_9th);
        as.add(jSeparator31);

        Class_fees_10th.setText("10th Class");
        Class_fees_10th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class_fees_10thActionPerformed(evt);
            }
        });
        as.add(Class_fees_10th);

        jMenu7.add(as);
        jMenu7.add(jSeparator7);

        jMenuItem1.setText("Student SMS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
         Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     String a=txt_stand.getSelectedItem().toString();
     String b=txt_batch.getSelectedItem().toString();
     String c=txt_gender.getSelectedItem().toString();
     String d=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
     String e= fill_up_fees.getText();
        try
        {
            if(txt_student_id.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Student Id First");
            }
            else if(txt_last_name.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Last Name");
            }
            else if(txt_first_name.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null, "Please Enter First Name");
            }
            else if(txt_middle_name.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Middle Name");
            }
            
            else if(a.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Please Select Standard");
            }
            else if(b.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Please Select Batch");
            }
            else if(d.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Date");
            }
            else if(c.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Gender");
            }
            else if(txt_age.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Age");
            }
            else if(txt_mob.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Mobile Nomber");
            }
            else if(txt_address.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Address");
            }
            else if(e.equals("00"))
            {
                 JOptionPane.showMessageDialog(null, "Please Enter Fees");
            }
            else
            {
                switch (a) {
                    case "1":
                        {
                            String sql="insert into Student_Info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                fe_class1();
                                JOptionPane.showMessageDialog(null, "Saved");
                                //
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 1st Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        } ///1
                    case "2":
                        {
                            String sql="insert into Student_Info_2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class2();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 2nd Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                               
                            }              break;
                        } //2
                    case "3":
                        {
                            String sql="insert into Student_Info_3 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class3();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 3rd Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        } //3
                    case "4":
                        {
                            String sql="insert into Student_Info_4 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class4();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 4th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        } //4
                    case "5":
                        {
                            String sql="insert into Student_Info_5 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class5();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 5th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        }
                    case "6":
                        {
                            String sql="insert into Student_Info_6 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class6();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 6th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        }
                    case "7":
                        {
                            String sql="insert into Student_Info_7 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class7();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 7th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        }
                    case "8":
                        {
                            String sql="insert into Student_Info_8 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class8();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 8th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        }
                    case "9":
                        {
                            String sql="insert into Student_Info_9 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class9();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 9th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        }
                    case "10":
                        {
                            String sql="insert into Student_Info_10 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                            pst=conn.prepareStatement(sql);
                            pst.setString(1,txt_student_id.getText());
                            pst.setString(2, txt_last_name.getText());
                            pst.setString(3, txt_first_name.getText());
                            pst.setString(4, txt_middle_name.getText());
                            pst.setString(5, txt_stand.getSelectedItem().toString());
                            pst.setString(6, txt_batch.getSelectedItem().toString());
                            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                            pst.setString(8, txt_gender.getSelectedItem().toString());
                            pst.setString(9, txt_age.getText());
                            pst.setString(10, txt_mob.getText());
                            pst.setString(11, txt_address.getText());
                            pst.setBytes(12,person_image );
                            pst.setString(13, fill_up_fees.getText());
                            pst.setString(14, remaining_fees.getText());
                            pst.setString(15, total_fees.getText());
                            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                            if(p==0)
                            {
                                pst.execute();
                                 fe_class10();
                                JOptionPane.showMessageDialog(null, "Saved");
                                try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message=" +"Your Addmition has been Completed Successfully in 10th Standard in Gurukul Coaching Classes";
			String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +numb;
			
			// Send data
			HttpURLConnection conni = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
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
                                
                                
                            }              break;
                        }
                    default:
                        JOptionPane.showMessageDialog(null, "Please Select Standard");
                        break;
                }
                 setClear();
              
            //((JTextField)txt_date.getDateEditor().getUiComponent()).getText()
           
            }
        }
        catch(HeadlessException | NumberFormatException | SQLException ex)
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
    }//GEN-LAST:event_save_btnActionPerformed

    private void capture_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capture_btnActionPerformed
        // TODO add your handling code here:
         
      try
      { 
          JFileChooser chooser=new JFileChooser();
      
      chooser.showOpenDialog(this);
      FileNameExtensionFilter filter=new FileNameExtensionFilter("*.IMAGE","JPG","GIF","PNG");
      chooser.addChoosableFileFilter(filter);
      
      File f=chooser.getSelectedFile();
      filename=f.getAbsolutePath();
      /*
      below from we want to use this code line into our hospital_bill.java jFrame program
      */
      ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(txt_images.getWidth(), txt_images.getHeight(), Image.SCALE_SMOOTH));
      txt_images.setIcon(imageicon);
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
      catch(NullPointerException ex)
      {
          JOptionPane.showMessageDialog(null, "Please Make sure Select or Not");
      }
        
        
    }//GEN-LAST:event_capture_btnActionPerformed

    private void take_a_photoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_a_photoActionPerformed
        // TODO add your handling code here:
        new WebCam().setVisible(true);
    }//GEN-LAST:event_take_a_photoActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        // TODO add your handling code here:
        
        setClear();
    }//GEN-LAST:event_clear_btnActionPerformed

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        // TODO add your handling code here:
    
         setClear();
        
    }//GEN-LAST:event_new_btnActionPerformed

    private void log_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_btnActionPerformed
        // TODO add your handling code here:
       
        new Login_Window().setVisible(true);
         dispose();
    }//GEN-LAST:event_log_btnActionPerformed

    private void clear_txt_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_txt_ActionPerformed
        // TODO add your handling code here:
        txt_last_name.setText("");
       txt_first_name.setText("");
        txt_middle_name.setText("");
         txt_stand.setSelectedIndex(0);
         txt_batch.setSelectedIndex(0);
         ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
         
         txt_gender.setSelectedIndex(0);
         txt_age.setText("");
        txt_mob.setText("");
        txt_address.setText("");
         txt_images.setIcon(null);
                txt_images.revalidate();
                fill_up_fees.setText("00");
                remaining_fees.setText("00");
                total_fees.setText("");
    }//GEN-LAST:event_clear_txt_ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
       
        new Login_Window().setVisible(true);
         dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        /*
        new
        
        */
       
        txt_last_name.setText("");
       txt_first_name.setText("");
        txt_middle_name.setText("");
         txt_stand.setSelectedIndex(0);
         txt_batch.setSelectedIndex(0);
         ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
         
         txt_gender.setSelectedIndex(0);
         txt_age.setText("");
        txt_mob.setText("");
        txt_address.setText("");
         txt_images.setIcon(null);
                txt_images.revalidate();
                fill_up_fees.setText("00");
                remaining_fees.setText("00");
                total_fees.setText("");
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void new_txt_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_txt_ActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_new_txt_ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
         Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;  
     conn=JavaConnect.ConnectDB();
     String a=txt_stand.getSelectedItem().toString();
     String b=txt_batch.getSelectedItem().toString();
     String c=txt_gender.getSelectedItem().toString();
     String d=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
     String e= fill_up_fees.getText();
        try
        {
            if(txt_student_id.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Student Id First");
            }
            else if(txt_last_name.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Last Name");
            }
            else if(txt_first_name.getText().isEmpty())
            {
                 JOptionPane.showMessageDialog(null, "Please Enter First Name");
            }
            else if(txt_middle_name.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Middle Name");
            }
            
            else if(a.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Standard");
            }
            else if(b.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Batch");
            }
            else if(d.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Date");
            }
            else if(c.equals("None"))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Gender");
            }
            else if(txt_age.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Age");
            }
            else if(txt_mob.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Mobile Nomber");
            }
            else if(txt_address.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Address");
            }
            else if(e.equals("00"))
            {
                 JOptionPane.showMessageDialog(null, "Please Enter Fees");
            }
            else
            {
              
            //((JTextField)txt_date.getDateEditor().getUiComponent()).getText()
            String sql="insert into Student_Info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_student_id.getText());
            pst.setString(2, txt_last_name.getText());
            pst.setString(3, txt_first_name.getText());
            pst.setString(4, txt_middle_name.getText());
            pst.setString(5, txt_stand.getSelectedItem().toString());
           
            pst.setString(6, txt_batch.getSelectedItem().toString());
            pst.setString(7, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
            pst.setString(8, txt_gender.getSelectedItem().toString());
            pst.setString(9, txt_age.getText());
            pst.setString(10, txt_mob.getText());
            pst.setString(11, txt_address.getText());
            pst.setBytes(12,person_image );
            pst.setString(13, fill_up_fees.getText());
            pst.setString(14, remaining_fees.getText());
            pst.setString(15, total_fees.getText());
           
            int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
             if(p==0)
             { 
              pst.execute();
             JOptionPane.showMessageDialog(null, "Saved");  
            
              
             }
            }
        }
        catch(HeadlessException | NumberFormatException | SQLException ex)
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
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        /*
        new info
        more info
        */
        dispose();
        new View_all().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void txt_standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_standActionPerformed
        // TODO add your handling code here:
        if(txt_stand.getSelectedItem().equals("1"))
        {
            total_fees.setText("");
          
          
            
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

    private void txt_mobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobKeyTyped
        // TODO add your handling code here:
        
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_txt_mobKeyTyped

    private void fill_up_feesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fill_up_feesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
        
    }//GEN-LAST:event_fill_up_feesKeyTyped

    private void txt_mobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mobKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_mobKeyPressed

    private void class_1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_1stActionPerformed
        // TODO add your handling code here:
        
        new Class_1().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_1stActionPerformed

    private void class_2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_2ndActionPerformed
        // TODO add your handling code here:
        
        new Class_2().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_2ndActionPerformed

    private void class_3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_3rdActionPerformed
        // TODO add your handling code here:.
       
        new Class_3().setVisible(true);
         dispose();
    }//GEN-LAST:event_class_3rdActionPerformed

    private void class_4thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_4thActionPerformed
        // TODO add your handling code here:
        
        new Class_4().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_4thActionPerformed

    private void class_5thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_5thActionPerformed
        // TODO add your handling code here:
        
        new Class_5().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_5thActionPerformed

    private void class_6thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_6thActionPerformed
        // TODO add your handling code here:
        
        new Class_6().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_6thActionPerformed

    private void class_7thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_7thActionPerformed
        // TODO add your handling code here:
       
        new Class_7().setVisible(true);
         dispose();
    }//GEN-LAST:event_class_7thActionPerformed

    private void class_8thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_8thActionPerformed
        // TODO add your handling code here:
        
        new Class_8().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_8thActionPerformed

    private void class_9thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_9thActionPerformed
        // TODO add your handling code here:
        
        new Class_9().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_9thActionPerformed

    private void class_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_10ActionPerformed
        // TODO add your handling code here:
        
        new Class_10().setVisible(true);
        dispose();
    }//GEN-LAST:event_class_10ActionPerformed

    private void view_noticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_noticeActionPerformed
        // TODO add your handling code here:
       
      
        new Absent_report().setVisible(true);
         dispose();
    }//GEN-LAST:event_view_noticeActionPerformed

    private void print_noticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_noticeActionPerformed
        // TODO add your handling code here:
       
        new Absent().setVisible(true);
         dispose();
    }//GEN-LAST:event_print_noticeActionPerformed

    private void student_report_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_report_menuActionPerformed
        // TODO add your handling code here:
       
        new Student_Report().setVisible(true);
         dispose();
    }//GEN-LAST:event_student_report_menuActionPerformed

    private void Class_fees_2ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_2ndActionPerformed
        // TODO add your handling code here:
         new Class_fees_2().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_2ndActionPerformed

    private void Class_fees_6thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_6thActionPerformed
        // TODO add your handling code here:
         new Class_fees_6().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_6thActionPerformed

    private void Class_fees_1stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_1stActionPerformed
        // TODO add your handling code here:
        new Class_fees_1().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_Class_fees_1stActionPerformed

    private void Class_fees_3rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_3rdActionPerformed
        // TODO add your handling code here:
         new Class_fees_3().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_3rdActionPerformed

    private void Class_fees_4rthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_4rthActionPerformed
        // TODO add your handling code here:
         new Class_fees_4().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_4rthActionPerformed

    private void Class_fees_5thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_5thActionPerformed
        // TODO add your handling code here:
         new Class_fees_5().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_5thActionPerformed

    private void Class_fees_7thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_7thActionPerformed
        // TODO add your handling code here:
         new Class_fees_7().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_7thActionPerformed

    private void Class_fees_8thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_8thActionPerformed
        // TODO add your handling code here:
         new Class_fees_8().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_8thActionPerformed

    private void Class_fees_9thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_9thActionPerformed
        // TODO add your handling code here:
         new Class_fees_9().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_9thActionPerformed

    private void Class_fees_10thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class_fees_10thActionPerformed
        // TODO add your handling code here:
         new Class_fees_10().setVisible(true);
        dispose();
    }//GEN-LAST:event_Class_fees_10thActionPerformed

    private void remaining_feesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_remaining_feesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
        
    }//GEN-LAST:event_remaining_feesKeyTyped

    private void total_feesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_feesKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
        
    }//GEN-LAST:event_total_feesKeyTyped

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new About_fees().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Class_fees_10th;
    private javax.swing.JMenuItem Class_fees_1st;
    private javax.swing.JMenuItem Class_fees_2nd;
    private javax.swing.JMenuItem Class_fees_3rd;
    private javax.swing.JMenuItem Class_fees_4rth;
    private javax.swing.JMenuItem Class_fees_5th;
    private javax.swing.JMenuItem Class_fees_6th;
    private javax.swing.JMenuItem Class_fees_7th;
    private javax.swing.JMenuItem Class_fees_8th;
    private javax.swing.JMenuItem Class_fees_9th;
    private javax.swing.JMenu as;
    private javax.swing.JButton capture_btn;
    private javax.swing.JMenuItem class_10;
    private javax.swing.JMenuItem class_1st;
    private javax.swing.JMenuItem class_2nd;
    private javax.swing.JMenuItem class_3rd;
    private javax.swing.JMenuItem class_4th;
    private javax.swing.JMenuItem class_5th;
    private javax.swing.JMenuItem class_6th;
    private javax.swing.JMenuItem class_7th;
    private javax.swing.JMenuItem class_8th;
    private javax.swing.JMenuItem class_9th;
    private javax.swing.JButton clear_btn;
    private javax.swing.JMenuItem clear_txt_;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JPopupMenu.Separator jSeparator23;
    private javax.swing.JPopupMenu.Separator jSeparator24;
    private javax.swing.JPopupMenu.Separator jSeparator25;
    private javax.swing.JPopupMenu.Separator jSeparator26;
    private javax.swing.JPopupMenu.Separator jSeparator27;
    private javax.swing.JPopupMenu.Separator jSeparator28;
    private javax.swing.JPopupMenu.Separator jSeparator29;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator30;
    private javax.swing.JPopupMenu.Separator jSeparator31;
    private javax.swing.JPopupMenu.Separator jSeparator32;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JButton log_btn;
    private javax.swing.JButton new_btn;
    private javax.swing.JMenu new_txt_;
    private javax.swing.JMenuItem print_notice;
    private javax.swing.JTextField remaining_fees;
    private javax.swing.JButton save_btn;
    private javax.swing.JMenuItem student_report_menu;
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
    private javax.swing.JComboBox<String> txt_stand;
    private javax.swing.JTextField txt_student_id;
    private javax.swing.JMenuItem view_notice;
    // End of variables declaration//GEN-END:variables
}
