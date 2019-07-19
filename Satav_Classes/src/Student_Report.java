
import com.sun.glass.events.KeyEvent;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
public class Student_Report extends javax.swing.JFrame {

    /**
     * Creates new form Student_Report
     */
    public Student_Report() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        initComponents();
        setIcon();
         std_1.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
          std_2.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
           std_3.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
            std_4.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
             std_5.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
              std_6.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
               std_7.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
                std_8.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
                 std_9.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
                  std_10.getTableHeader().setFont(new Font("Tohoma", Font.BOLD, 12));
        update_table();
      update_table_2();
                update_table_3();
                        update_table_4();
                                update_table_5();
                                        update_table_6();
                                                update_table_7();
                                                        update_table_8();
                                                                update_table_9();
                                                                        update_table_10();
    }
     public void setIcon()
    {
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("sc_logo.png")));
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("gc.png")));
    }
    public void update_table()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_1 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_1.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_2()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_2 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_2.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_3()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_3 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_3.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_4()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_4 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_4.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_5()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_5 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_5.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_6()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_6 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_6.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_7()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_7 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_7.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_8()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_8 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_8.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_9()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_9 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_9.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    public void update_table_10()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            /*
            update table
            */
         String sql="select Student_id,Last_Name,First_Name,Exam_Name,Math,Science,English,Marathi,G_total,A_total,Date from Examination_10 order by Student_id";
            
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            std_10.setModel(DbUtils.resultSetToTableModel(rs));
           // rs=pst.executeQuery();

        }
         catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null,"Exception 8 "+e);
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
    
    public void check()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC1-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC1-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC1-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_2()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC2-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_2 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC2-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC2-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_3()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC3-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_3 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC3-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC3-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_4()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC4-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_4 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC4-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC4-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_5()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC5-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_5 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC5-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC5-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_6()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC6-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_6 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC6-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC6-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_7()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC7-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_7 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC7-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC7-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_8()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC8-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_8 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC8-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC8-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_9()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC9-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_9 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC9-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC9-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void check_10()
    {
        Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    conn=JavaConnect.ConnectDB();
        try
        {
            //b_nom.getText();
            String a="STVC10-0001";
            // b_nom.setText("MH-3000");
          //  String check= b_nom.getText();
            for(int i=0;i<2000;i++)
            {
            String sql="select Student_id from Student_Info_10 where Student_id>'"+a+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next())
            {
               
               a=rs.getString("Student_id");
              
            }
        }
            //b_nom.setText(a);
            String value=a;
            String va2=value.replaceAll("STVC10-", "");
            int VALUE=Integer.parseInt(va2);
            ++VALUE;
             txt_student_id.setText("STVC10-"+VALUE);
            /*
             String VALUE    ="MH-1001";
        String v2=VALUE.replaceAll("MH-", "");
        int value=Integer.parseInt(v2);
        ++value;
        JOptionPane.showMessageDialog(null, "my replace code is\n\t\t\tMH-"+value);
            */
                    
                    
                    
            
            
            
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex+"\nConnection error\n\tplease check out");
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
     public void clear()
     {
         txt_student_id.setText("");
          txt_last_name.setText("");
           txt_first_name.setText("");
            txt_middle_name.setText("");
             txt_exam_name.setText("");
              math_txt.setText("");
               math_txt1.setText("");
                scien_txt.setText("");
                 scien_txt1.setText("");
                  english_txt.setText("");
                   english_txt1.setText("");
                    marthi_txt.setText("");
                     marthi_txt2.setText("");
                      total_.setText("");
                       total_2.setText("");
                       txt_stand.setSelectedIndex(0);
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText("");
             
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
        jLabel22 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        txt_first_name = new javax.swing.JTextField();
        txt_middle_name = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_student_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_stand = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        marthi_txt = new javax.swing.JTextField();
        math_txt = new javax.swing.JTextField();
        scien_txt = new javax.swing.JTextField();
        english_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        total_ = new javax.swing.JTextField();
        marthi_txt2 = new javax.swing.JTextField();
        math_txt1 = new javax.swing.JTextField();
        scien_txt1 = new javax.swing.JTextField();
        english_txt1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        total_2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_exam_name = new javax.swing.JTextField();
        Search_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        new_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        send_sms_btn = new javax.swing.JButton();
        txt_mob = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        std_1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        print_btn = new javax.swing.JButton();
        back_btn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        std_2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        std_print_2 = new javax.swing.JButton();
        back_btn2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        std_3 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        std_print_3 = new javax.swing.JButton();
        back_btn3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        std_4 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        std_print_4 = new javax.swing.JButton();
        back_btn4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        std_5 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        std_print_5 = new javax.swing.JButton();
        back_btn5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        std_6 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        std_print_6 = new javax.swing.JButton();
        back_btn6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        std_7 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        std_print_7 = new javax.swing.JButton();
        back_btn7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        std_8 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        std_print_8 = new javax.swing.JButton();
        back_btn8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        std_9 = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        std_print_9 = new javax.swing.JButton();
        back_btn9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        std_10 = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        std_print_10 = new javax.swing.JButton();
        back_btn10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marks Report(View Here to All Student mark report and fill also)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Bookman Old Style", 0, 20)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(22, 101, 158));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 100, 310, 420));

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fill Examination");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("First Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 100, 30));

        txt_last_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 200, 30));

        txt_first_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 200, 30));

        txt_middle_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_middle_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 200, 30));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21.setText("Middle Name");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 120, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Student ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 110, 30));

        txt_student_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_student_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 170, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Marathi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 80, 30));

        txt_stand.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_stand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        txt_stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_standActionPerformed(evt);
            }
        });
        jPanel1.add(txt_stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Subjects");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 50, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 80, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Science");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 80, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("English");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 80, 30));

        marthi_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        marthi_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marthi_txtKeyTyped(evt);
            }
        });
        jPanel1.add(marthi_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 140, 30));

        math_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        math_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                math_txtActionPerformed(evt);
            }
        });
        math_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                math_txtKeyTyped(evt);
            }
        });
        jPanel1.add(math_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 140, 30));

        scien_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scien_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scien_txtKeyTyped(evt);
            }
        });
        jPanel1.add(scien_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 140, 30));

        english_txt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        english_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                english_txtKeyTyped(evt);
            }
        });
        jPanel1.add(english_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 140, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setText("Math");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Marks");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 80, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setText("Marks");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 80, 30));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Marks");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 80, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setText("Marks");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 80, 30));

        total_.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_KeyTyped(evt);
            }
        });
        jPanel1.add(total_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 140, 30));

        marthi_txt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        marthi_txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marthi_txt2KeyTyped(evt);
            }
        });
        jPanel1.add(marthi_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 140, 30));

        math_txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        math_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                math_txt1KeyTyped(evt);
            }
        });
        jPanel1.add(math_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 140, 30));

        scien_txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scien_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                scien_txt1KeyTyped(evt);
            }
        });
        jPanel1.add(scien_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 140, 30));

        english_txt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        english_txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                english_txt1KeyTyped(evt);
            }
        });
        jPanel1.add(english_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 140, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setText("Out of");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 120, 30));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setText("Out of");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 120, 30));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel24.setText("Out of");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 120, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel25.setText("Out of");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 120, 30));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel26.setText("Total");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, 80, 30));

        total_2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_2KeyTyped(evt);
            }
        });
        jPanel1.add(total_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 140, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel27.setText("Standard");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, 30));

        txt_exam_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_exam_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 340, 30));

        Search_btn.setBackground(new java.awt.Color(22, 102, 158));
        Search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-icon.png"))); // NOI18N
        Search_btn.setToolTipText("Search");
        Search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_btnActionPerformed(evt);
            }
        });
        jPanel1.add(Search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 40, 30, 30));

        delete_btn.setBackground(new java.awt.Color(22, 101, 158));
        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete All");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel1.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 600, -1, 30));

        save_btn.setBackground(new java.awt.Color(22, 101, 158));
        save_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save_btn.setForeground(new java.awt.Color(255, 255, 255));
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        jPanel1.add(save_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, -1, 30));

        update_btn.setBackground(new java.awt.Color(22, 101, 158));
        update_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update_btn.setForeground(new java.awt.Color(255, 255, 255));
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        jPanel1.add(update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 600, -1, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setText("Mob");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 530, 50, 30));

        txt_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 30));

        new_btn.setBackground(new java.awt.Color(22, 101, 158));
        new_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        new_btn.setForeground(new java.awt.Color(255, 255, 255));
        new_btn.setText("New");
        new_btn.setToolTipText("");
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });
        jPanel1.add(new_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, -1, 30));

        back_btn.setBackground(new java.awt.Color(22, 101, 158));
        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("<< Back");
        back_btn.setToolTipText("");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 120, 30));

        send_sms_btn.setBackground(new java.awt.Color(22, 101, 158));
        send_sms_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        send_sms_btn.setForeground(new java.awt.Color(255, 255, 255));
        send_sms_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail-message-send-icon.png"))); // NOI18N
        send_sms_btn.setText("Send");
        send_sms_btn.setToolTipText("SMS");
        send_sms_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        send_sms_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_sms_btnActionPerformed(evt);
            }
        });
        jPanel1.add(send_sms_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 600, 140, 30));

        txt_mob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txt_mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 530, 200, 30));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel45.setText("Exam Name");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 110, 30));

        jTabbedPane1.addTab("Fill Exam", jPanel1);

        jPanel2.setBackground(new java.awt.Color(22, 108, 158));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(std_1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Standard 1st");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        print_btn.setBackground(new java.awt.Color(22, 101, 158));
        print_btn.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        print_btn.setForeground(new java.awt.Color(255, 255, 255));
        print_btn.setText("Print");
        print_btn.setBorderPainted(false);
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });
        jPanel2.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn1.setBackground(new java.awt.Color(22, 101, 158));
        back_btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn1.setForeground(new java.awt.Color(255, 255, 255));
        back_btn1.setText("<< Back");
        back_btn1.setToolTipText("");
        back_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(back_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 1st", jPanel2);

        jPanel3.setBackground(new java.awt.Color(22, 108, 158));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(std_2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Standard 2nd");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_2.setBackground(new java.awt.Color(22, 101, 158));
        std_print_2.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_2.setForeground(new java.awt.Color(255, 255, 255));
        std_print_2.setText("Print");
        std_print_2.setBorderPainted(false);
        std_print_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_2ActionPerformed(evt);
            }
        });
        jPanel3.add(std_print_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn2.setBackground(new java.awt.Color(22, 101, 158));
        back_btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn2.setForeground(new java.awt.Color(255, 255, 255));
        back_btn2.setText("<< Back");
        back_btn2.setToolTipText("");
        back_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn2ActionPerformed(evt);
            }
        });
        jPanel3.add(back_btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 2nd", jPanel3);

        jPanel4.setBackground(new java.awt.Color(22, 108, 158));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(std_3);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Standard 3rd");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_3.setBackground(new java.awt.Color(22, 101, 158));
        std_print_3.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_3.setForeground(new java.awt.Color(255, 255, 255));
        std_print_3.setText("Print");
        std_print_3.setBorderPainted(false);
        std_print_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_3ActionPerformed(evt);
            }
        });
        jPanel4.add(std_print_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn3.setBackground(new java.awt.Color(22, 101, 158));
        back_btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn3.setForeground(new java.awt.Color(255, 255, 255));
        back_btn3.setText("<< Back");
        back_btn3.setToolTipText("");
        back_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(back_btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 3rd", jPanel4);

        jPanel5.setBackground(new java.awt.Color(22, 108, 158));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(std_4);

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Standard 4th");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_4.setBackground(new java.awt.Color(22, 101, 158));
        std_print_4.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_4.setForeground(new java.awt.Color(255, 255, 255));
        std_print_4.setText("Print");
        std_print_4.setBorderPainted(false);
        std_print_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_4ActionPerformed(evt);
            }
        });
        jPanel5.add(std_print_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn4.setBackground(new java.awt.Color(22, 101, 158));
        back_btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn4.setForeground(new java.awt.Color(255, 255, 255));
        back_btn4.setText("<< Back");
        back_btn4.setToolTipText("");
        back_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn4ActionPerformed(evt);
            }
        });
        jPanel5.add(back_btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 4th", jPanel5);

        jPanel6.setBackground(new java.awt.Color(22, 108, 158));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(std_5);

        jPanel6.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Standard 5th");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_5.setBackground(new java.awt.Color(22, 101, 158));
        std_print_5.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_5.setForeground(new java.awt.Color(255, 255, 255));
        std_print_5.setText("Print");
        std_print_5.setBorderPainted(false);
        std_print_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_5ActionPerformed(evt);
            }
        });
        jPanel6.add(std_print_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn5.setBackground(new java.awt.Color(22, 101, 158));
        back_btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn5.setForeground(new java.awt.Color(255, 255, 255));
        back_btn5.setText("<< Back");
        back_btn5.setToolTipText("");
        back_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn5ActionPerformed(evt);
            }
        });
        jPanel6.add(back_btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 5th", jPanel6);

        jPanel7.setBackground(new java.awt.Color(22, 108, 158));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(std_6);

        jPanel7.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Standard 6th");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_6.setBackground(new java.awt.Color(22, 101, 158));
        std_print_6.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_6.setForeground(new java.awt.Color(255, 255, 255));
        std_print_6.setText("Print");
        std_print_6.setBorderPainted(false);
        std_print_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_6ActionPerformed(evt);
            }
        });
        jPanel7.add(std_print_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn6.setBackground(new java.awt.Color(22, 101, 158));
        back_btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn6.setForeground(new java.awt.Color(255, 255, 255));
        back_btn6.setText("<< Back");
        back_btn6.setToolTipText("");
        back_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn6ActionPerformed(evt);
            }
        });
        jPanel7.add(back_btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 6th", jPanel7);

        jPanel8.setBackground(new java.awt.Color(22, 108, 158));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(std_7);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Standard 7th");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_7.setBackground(new java.awt.Color(22, 101, 158));
        std_print_7.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_7.setForeground(new java.awt.Color(255, 255, 255));
        std_print_7.setText("Print");
        std_print_7.setBorderPainted(false);
        std_print_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_7ActionPerformed(evt);
            }
        });
        jPanel8.add(std_print_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn7.setBackground(new java.awt.Color(22, 101, 158));
        back_btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn7.setForeground(new java.awt.Color(255, 255, 255));
        back_btn7.setText("<< Back");
        back_btn7.setToolTipText("");
        back_btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn7ActionPerformed(evt);
            }
        });
        jPanel8.add(back_btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 7th", jPanel8);

        jPanel9.setBackground(new java.awt.Color(22, 108, 158));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(std_8);

        jPanel9.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Standard 8th");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_8.setBackground(new java.awt.Color(22, 101, 158));
        std_print_8.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_8.setForeground(new java.awt.Color(255, 255, 255));
        std_print_8.setText("Print");
        std_print_8.setBorderPainted(false);
        std_print_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_8ActionPerformed(evt);
            }
        });
        jPanel9.add(std_print_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn8.setBackground(new java.awt.Color(22, 101, 158));
        back_btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn8.setForeground(new java.awt.Color(255, 255, 255));
        back_btn8.setText("<< Back");
        back_btn8.setToolTipText("");
        back_btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn8ActionPerformed(evt);
            }
        });
        jPanel9.add(back_btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 8th", jPanel9);

        jPanel10.setBackground(new java.awt.Color(22, 108, 158));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std_9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(std_9);

        jPanel10.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel10.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel42.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Standard 9th");
        jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 210, 50));

        std_print_9.setBackground(new java.awt.Color(22, 101, 158));
        std_print_9.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_9.setForeground(new java.awt.Color(255, 255, 255));
        std_print_9.setText("Print");
        std_print_9.setBorderPainted(false);
        std_print_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_9ActionPerformed(evt);
            }
        });
        jPanel10.add(std_print_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn9.setBackground(new java.awt.Color(22, 101, 158));
        back_btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn9.setForeground(new java.awt.Color(255, 255, 255));
        back_btn9.setText("<< Back");
        back_btn9.setToolTipText("");
        back_btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn9ActionPerformed(evt);
            }
        });
        jPanel10.add(back_btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 9th", jPanel10);

        jPanel11.setBackground(new java.awt.Color(22, 108, 158));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        std_10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(std_10);

        jPanel11.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 130, 1040, 630));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/th.png"))); // NOI18N
        jPanel11.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 310, 420));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Standard 10th");
        jPanel11.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 50));

        std_print_10.setBackground(new java.awt.Color(22, 101, 158));
        std_print_10.setFont(new java.awt.Font("Book Antiqua", 0, 24)); // NOI18N
        std_print_10.setForeground(new java.awt.Color(255, 255, 255));
        std_print_10.setText("Print");
        std_print_10.setBorderPainted(false);
        std_print_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_print_10ActionPerformed(evt);
            }
        });
        jPanel11.add(std_print_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        back_btn10.setBackground(new java.awt.Color(22, 101, 158));
        back_btn10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn10.setForeground(new java.awt.Color(255, 255, 255));
        back_btn10.setText("<< Back");
        back_btn10.setToolTipText("");
        back_btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn10ActionPerformed(evt);
            }
        });
        jPanel11.add(back_btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 120, 30));

        jTabbedPane1.addTab("std 10th", jPanel11);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_standActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_standActionPerformed

    private void marthi_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marthi_txtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_marthi_txtKeyTyped

    private void math_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_math_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_math_txtActionPerformed

    private void math_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math_txtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_math_txtKeyTyped

    private void scien_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scien_txtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_scien_txtKeyTyped

    private void english_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_english_txtKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_english_txtKeyTyped

    private void total_KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_total_KeyTyped

    private void marthi_txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marthi_txt2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_marthi_txt2KeyTyped

    private void math_txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_math_txt1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_math_txt1KeyTyped

    private void scien_txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scien_txt1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_scien_txt1KeyTyped

    private void english_txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_english_txt1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_english_txt1KeyTyped

    private void total_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            evt.consume();
        }
    }//GEN-LAST:event_total_2KeyTyped

    private void Search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_btnActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();

        try
        {

            if(txt_stand.getSelectedItem().equals("1"))
            {

                String sql="select * from Examination_1 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }
            }

            else if(txt_stand.getSelectedItem().equals("2"))
            {
                String sql="select * from Examination_2 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("3"))
            {
                String sql="select * from Examination_3 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("4"))
            {
                String sql="select * from Examination_4 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("5"))
            {
                String sql="select * from Examination_5 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("6"))
            {
                String sql="select * from Examination_6 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("7"))
            {
                String sql="select * from Examination_7 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("8"))
            {
                String sql="select * from Examination_8 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("9"))
            {
                String sql="select * from Examination_9 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else if(txt_stand.getSelectedItem().equals("10"))
            {
                String sql="select * from Examination_10 where Student_id=?";
                String st=txt_student_id.getText();
                if(st.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Search Field is Empty");
                }
                else
                {
                    pst=conn.prepareStatement(sql);
                    pst.setString(1,txt_student_id.getText());
                    rs=pst.executeQuery();
                    if(rs.next())
                    {

                        String b=rs.getString("Last_Name");
                        txt_last_name.setText(b);
                        String c=rs.getString("First_Name");//
                        txt_first_name.setText(c);
                        String d=rs.getString("Middle_Name");
                        txt_middle_name.setText(d);
                        String e=rs.getString("Standard");
                        txt_stand.setSelectedItem(e);
                        String f=rs.getString("Exam_Name");
                        txt_exam_name.setText(f);
                        String g=rs.getString("Math");
                        math_txt.setText(g);
                        String h=rs.getString("M_mark");
                        math_txt1.setText(h);
                        String i=rs.getString("Science");
                        scien_txt.setText(i);
                        String j=rs.getString("S_mark");
                        scien_txt1.setText(j);
                        String k=rs.getString("English");
                        english_txt.setText(k);
                        String l=rs.getString("E_mark");
                        english_txt1.setText(l);
                        String m=rs.getString("Marathi");
                        marthi_txt.setText(m);
                        String n=rs.getString("Mr_mark");
                        marthi_txt2.setText(n);
                        String o=rs.getString("G_total");
                        total_.setText(o);
                        String p=rs.getString("A_total");
                        total_2.setText(p);
                        String q=rs.getString("Date");
                        ((JTextField)txt_date.getDateEditor().getUiComponent()).setText(q);

                    }

                }

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry No Result");

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

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        if(txt_stand.getSelectedItem().equals("1"))
        {
            String sql="delete from Examination_1";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("2"))
        {
            String sql="delete from Examination_2";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("3"))
        {
            String sql="delete from Examination_3";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("4"))
        {
            String sql="delete from Examination_4";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("5"))
        {
            String sql="delete from Examination_5";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("6"))
        {
            String sql="delete from Examination_6";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("7"))
        {
            String sql="delete from Examination_7";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("8"))
        {
            String sql="delete from Examination_8";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("9"))
        {
            String sql="delete from Examination_9";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
        else if(txt_stand.getSelectedItem().equals("10"))
        {
            String sql="delete from Examination_10";
            try
            {
                pst=conn.prepareStatement(sql);
                int p=JOptionPane.showConfirmDialog(null,"Do you want to Delete","Conform Delete",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Deleted");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, "Sorry Error Occured\n"+ex);
            }

        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String a=txt_stand.getSelectedItem().toString();
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
            else if(txt_exam_name.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please Enter Exam Name");
            }

            else
            {
                switch (a) {
                    case "1":
                    {
                        String sql="insert into Examination_1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "2":
                    {
                        String sql="insert into Examination_2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "3":
                    {
                        String sql="insert into Examination_3 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "4":
                    {
                        String sql="insert into Examination_4 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "5":
                    {
                        String sql="insert into Examination_5 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "6":
                    {
                        String sql="insert into Examination_6 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "7":
                    {
                        String sql="insert into Examination_7 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "8":
                    {
                        String sql="insert into Examination_8 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "9":
                    {
                        String sql="insert into Examination_9 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    case "10":
                    {
                        String sql="insert into Examination_10 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        pst=conn.prepareStatement(sql);
                        pst.setString(1,txt_student_id.getText());
                        pst.setString(2, txt_last_name.getText());
                        pst.setString(3, txt_first_name.getText());
                        pst.setString(4, txt_middle_name.getText());
                        pst.setString(5, txt_stand.getSelectedItem().toString());
                        pst.setString(6, txt_exam_name.getText());
                        pst.setString(7, math_txt.getText());
                        pst.setString(8, math_txt1.getText());
                        pst.setString(9, scien_txt.getText());
                        pst.setString(10, scien_txt1.getText());
                        pst.setString(11, english_txt.getText());
                        pst.setString(12, english_txt1.getText());
                        pst.setString(13, marthi_txt.getText());
                        pst.setString(14, marthi_txt2.getText());
                        pst.setString(15, total_.getText());
                        pst.setString(16, total_2.getText());
                        pst.setString(17, ((JTextField)txt_date.getDateEditor().getUiComponent()).getText());
                        int p=JOptionPane.showConfirmDialog(null,"Do you want to save","Conform Save",JOptionPane.YES_NO_OPTION);
                        if(p==0)
                        {
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");

                        }       break;
                    }
                    default:
                    break;
                }
                clear();
            }
        }
        catch(HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Sorry Error Occured\n"+ex );

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

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        // TODO add your handling code here:
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement pst=null;
        conn=JavaConnect.ConnectDB();
        String select=txt_stand.getSelectedItem().toString();
        String aa=txt_student_id.getText();
        String a=txt_last_name.getText();
        String b=txt_first_name.getText();
        String c=txt_middle_name.getText();
        String d=txt_stand.getSelectedItem().toString();
        String e=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
        String f=txt_exam_name.getText();
        String g=math_txt.getText();
        String h=math_txt1.getText();
        String i=scien_txt.getText();
        String j=scien_txt1.getText();
        String k=english_txt.getText();
        String l=english_txt1.getText();
        String m=marthi_txt.getText();
        String n=marthi_txt2.getText();
        String o=total_.getText();
        String p=total_2.getText();
        try
        {
            if(aa.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Student Id is Empty");
            }
            else
            {
                switch (select) {
                    case "1":
                    {
                        String sql="update Examination_1 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "2":
                    {
                        String sql="update Examination_2 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "3":
                    {
                        String sql="update Examination_3 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "4":
                    {
                        String sql="update Examination_4 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "5":
                    {
                        String sql="update Examination_5 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "6":
                    {
                        String sql="update Examination_6 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "7":
                    {
                        String sql="update Examination_7 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "8":
                    {
                        String sql="update Examination_8 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "9":
                    {
                        String sql="update Examination_9 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    case "10":
                    {
                        String sql="update Examination_10 set Last_Name='"+a+"',First_Name='"+b+"',Middle_Name='"+c+"',Standard='"+d+"',Exam_Name='"+f+"',Math='"+g+"',M_mark='"+h+"',Science='"+i+"',S_mark='"+j+"',English='"+k+"',E_mark='"+l+"',Marathi='"+m+"',Mr_mark='"+n+"',G_total='"+o+"',A_total='"+p+"'where Student_id='"+aa+"'";
                        pst=conn.prepareStatement(sql);
                        pst.execute();
                        JOptionPane.showMessageDialog(null,"UPDATED Successfully");
                        break;
                    }
                    default:
                    JOptionPane.showMessageDialog(null,"UPDATED FAIL");
                    break;
                }
                clear();

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

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed
        // TODO add your handling code here:
        clear();
        txt_mob.setText("");
        update_table();
      update_table_2();
                update_table_3();
                        update_table_4();
                                update_table_5();
                                        update_table_6();
                                                update_table_7();
                                                        update_table_8();
                                                                update_table_9();
                                                                        update_table_10();
    }//GEN-LAST:event_new_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
     
        new HomePage().setVisible(true);
           dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        // TODO add your handling code here:
        
       MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }//GEN-LAST:event_print_btnActionPerformed

    private void std_print_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_2ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_2.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_2ActionPerformed

    private void std_print_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_3ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_3.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_3ActionPerformed

    private void std_print_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_4ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_4.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_4ActionPerformed

    private void std_print_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_5ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_5.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_5ActionPerformed

    private void std_print_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_6ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_6.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_6ActionPerformed

    private void std_print_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_7ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_7.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_7ActionPerformed

    private void std_print_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_8ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_8.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_8ActionPerformed

    private void std_print_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_9ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_9.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_9ActionPerformed

    private void std_print_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_print_10ActionPerformed
        // TODO add your handling code here:
         MessageFormat header=new MessageFormat("Report print");       
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try
        {
            std_10.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_std_print_10ActionPerformed

    private void back_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn1ActionPerformed

    private void back_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn2ActionPerformed

    private void back_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn3ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn3ActionPerformed

    private void back_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn4ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn4ActionPerformed

    private void back_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn5ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn5ActionPerformed

    private void back_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn6ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn6ActionPerformed

    private void back_btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn7ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn7ActionPerformed

    private void back_btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn8ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn8ActionPerformed

    private void back_btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn9ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn9ActionPerformed

    private void back_btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn10ActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_back_btn10ActionPerformed

    private void send_sms_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_sms_btnActionPerformed
        // TODO add your handling code here:\
        
        String a=math_txt.getText();
        String b=math_txt1.getText();
         String c=scien_txt.getText();
          String d=scien_txt1.getText();
           String e=english_txt.getText();
            String f=english_txt1.getText();
             String g=marthi_txt.getText();
               String h=marthi_txt2.getText();
               String k=txt_exam_name.getText();
               String gg=((JTextField)txt_date.getDateEditor().getUiComponent()).getText();
               String hh=txt_stand.getSelectedItem().toString();
        if(!a.isEmpty() && !b.isEmpty())//math only
        {
            try {
			// Construct data
			//String apiKey = "apikey=" + "DFytTrNNZ8A-47geSM5Oah1rFgyTpmkksp4b6FAdvu";//satav
                        //String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
                        String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			//String message = "&message="+"दिनांक "+gg+" रोजी इयत्ता "+hh+" ची "+k+" परीक्षा झाली त्यात आपल्या पाल्याला गणितात "+a+"/"+b+" मार्क मिळाले आहे.(Gurukul Coaching Classes)";
			String message="&message="+"This is to inform Miss Komal Salunke, that your softwar has been completed by Ruresh Sisode at 10:51 pm march,8 2019.";
                        String sender = "&sender=" +"GURUKL";
                        String numb=txt_mob.getText();
			String numbers = "&numbers=" +txt_mob.getText();
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
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Sorry Error Occured\nMessage not send");
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
			
                        JOptionPane.showMessageDialog(null,ex+ "\n\nMessage Send Not Successfully");
		}
            
            
        } 
        else if(!c.isEmpty() && !d.isEmpty()) {
            try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message="+"दिनांक "+gg+" रोजी इयत्ता "+hh+" ची "+k+" परीक्षा झाली त्यात आपल्या पाल्याला विज्ञानात "+c+"/"+d+" मार्क मिळाले आहे.(Gurukul Coaching Classes)";
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
                            
                            //JOptionPane.showMessageDialog(null, "Message\n"+line);
                            
				stringBuffer.append(line);
                                //System.out.println("the value of line is\t"+line);
                                if(line.startsWith("{\"errors\""))
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Sorry Error Occured\nMessage not send");
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
			
                        JOptionPane.showMessageDialog(null,ex+ "\n\nMessage Send Not Successfully");
		}
            
        }
        else if(!e.isEmpty() && !f.isEmpty())
        {
            try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message="+"दिनांक "+gg+" रोजी इयत्ता "+hh+" ची "+k+" परीक्षा झाली त्यात आपल्या पाल्याला इंग्लिशमध्ये "+e+"/"+f+" मार्क मिळाले आहे.(Gurukul Coaching Classes)";
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
                            
                            //JOptionPane.showMessageDialog(null, "Message\n"+line);
                            
				stringBuffer.append(line);
                                
                                if(line.startsWith("{\"errors\""))
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Sorry Error Occured\nMessage not Send");
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
			
                        JOptionPane.showMessageDialog(null,ex+ "\n\nMessage Send Not Successfully");
		}
            
        }
        else if(!g.isEmpty() && !h.isEmpty())
        {
            try {
			// Construct data
			String apiKey = "apikey=" + "3GOVz3IiClk-mvKVagPUKvEBSzp0eCfRKI6qjL8ECZ";//GURU
			String message = "&message="+"दिनांक "+gg+" रोजी इयत्ता "+hh+" ची "+k+" परीक्षा झाली त्यात आपल्या पाल्याला मराठीत "+g+"/"+h+" मार्क मिळाले आहे.(Gurukul Coaching Classes)";
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
                            
                            //JOptionPane.showMessageDialog(null, "Message\n"+line);
                            
				stringBuffer.append(line);
                                //System.out.println("the value of line is\t"+line);
                                if(line.startsWith("{\"errors\""))
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Sorry Error Occured\nMessage not send");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Alert\n"+"Message Send Successfully");
                                }
                                    
			}
			rd.close();
			
			//return str ingBuffer.toString();
		} 
                                catch (HeadlessException | IOException ex) {
			/*System.out.println("Error SMS "+e);
			return "Error "+e;*/
                        JOptionPane.showMessageDialog(null,ex+ "\n\nMessage Send Not Successfully");
		}
            
            
        }
        
        
        
    }//GEN-LAST:event_send_sms_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton back_btn1;
    private javax.swing.JButton back_btn10;
    private javax.swing.JButton back_btn2;
    private javax.swing.JButton back_btn3;
    private javax.swing.JButton back_btn4;
    private javax.swing.JButton back_btn5;
    private javax.swing.JButton back_btn6;
    private javax.swing.JButton back_btn7;
    private javax.swing.JButton back_btn8;
    private javax.swing.JButton back_btn9;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField english_txt;
    private javax.swing.JTextField english_txt1;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField marthi_txt;
    private javax.swing.JTextField marthi_txt2;
    private javax.swing.JTextField math_txt;
    private javax.swing.JTextField math_txt1;
    private javax.swing.JButton new_btn;
    private javax.swing.JButton print_btn;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField scien_txt;
    private javax.swing.JTextField scien_txt1;
    private javax.swing.JButton send_sms_btn;
    private javax.swing.JTable std_1;
    private javax.swing.JTable std_10;
    private javax.swing.JTable std_2;
    private javax.swing.JTable std_3;
    private javax.swing.JTable std_4;
    private javax.swing.JTable std_5;
    private javax.swing.JTable std_6;
    private javax.swing.JTable std_7;
    private javax.swing.JTable std_8;
    private javax.swing.JTable std_9;
    private javax.swing.JButton std_print_10;
    private javax.swing.JButton std_print_2;
    private javax.swing.JButton std_print_3;
    private javax.swing.JButton std_print_4;
    private javax.swing.JButton std_print_5;
    private javax.swing.JButton std_print_6;
    private javax.swing.JButton std_print_7;
    private javax.swing.JButton std_print_8;
    private javax.swing.JButton std_print_9;
    private javax.swing.JTextField total_;
    private javax.swing.JTextField total_2;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_exam_name;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_middle_name;
    private javax.swing.JTextField txt_mob;
    private javax.swing.JComboBox<String> txt_stand;
    private javax.swing.JTextField txt_student_id;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
