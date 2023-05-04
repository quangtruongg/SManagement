/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import App.connect.ConnectDB;
import App.model.tbl_Teacher;
import App.panel.Panel_Account;
import App.panel.Panel_Chart1;
import App.panel.Panel_Class;
import App.panel.Panel_Home;
import App.panel.Panel_Student;
import App.panel.Panel_Subject;
import App.panel.Panel_User;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PC Hoang Anh
 */
public class MainFrame extends javax.swing.JFrame implements Panel_Home.Call_Back, Panel_Account.ChangeAcc {

    ConnectDB c = new ConnectDB();
    Cursor cur = new Cursor(Cursor.HAND_CURSOR);
    Connection conn = c.connect();
    tbl_Teacher acc = null;
    /**
     * Creates new form MainFrame
     */
    public interface Call_Logout {

        public void logout();
    };
    Call_Logout CL;

    public void setCallBack(Call_Logout CL, tbl_Teacher acc) {
        this.CL = CL;
        this.acc = acc;
        Panel_Home home = new Panel_Home(conn, acc, this);
        setLayer(home);
        switch (acc.getRole_ID()) {
            case 2:
                JClass_P.setVisible(false);
                Subject.setVisible(false);
                Chart.setVisible(false);
                break;
            case 3:
            case 4:
                User.setVisible(false);
                Student.setVisible(false);
                Subject.setVisible(false);
                break;
            default:
                break;
        }
    }

    public MainFrame() {
        initComponents();
        Home.setBackground(Color.CYAN);
    }

    public void setLayer(JPanel panel) {
        jLayeredPane.removeAll();
        jLayeredPane.add(panel);
        jLayeredPane.repaint();
        jLayeredPane.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane = new javax.swing.JLayeredPane();
        jPanel = new javax.swing.JPanel();
        jToolBar = new javax.swing.JToolBar();
        Home = new javax.swing.JButton();
        User = new javax.swing.JButton();
        Student = new javax.swing.JButton();
        JClass_P = new javax.swing.JButton();
        Chart = new javax.swing.JButton();
        Edit_Accout = new javax.swing.JButton();
        Subject = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm quản lý sinh viên");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(951, 752));

        jLayeredPane.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane.setLayout(new java.awt.CardLayout());

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 951, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );

        jLayeredPane.add(jPanel, "card2");

        jToolBar.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar.setRollover(true);

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/home-icon.png"))); // NOI18N
        Home.setText("Trang Chủ");
        Home.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.setFocusable(false);
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home.setMargin(new java.awt.Insets(2, 15, 2, 15));
        Home.setMaximumSize(new java.awt.Dimension(100, 57));
        Home.setMinimumSize(new java.awt.Dimension(100, 57));
        Home.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jToolBar.add(Home);

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/user-icon.png"))); // NOI18N
        User.setText("Giảng Viên");
        User.setToolTipText("");
        User.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        User.setFocusable(false);
        User.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        User.setMargin(new java.awt.Insets(2, 15, 2, 15));
        User.setMaximumSize(new java.awt.Dimension(100, 57));
        User.setMinimumSize(new java.awt.Dimension(100, 57));
        User.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        jToolBar.add(User);

        Student.setBackground(new java.awt.Color(255, 255, 255));
        Student.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/student-icon.png"))); // NOI18N
        Student.setText("Sinh Viên");
        Student.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        Student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Student.setFocusable(false);
        Student.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Student.setMargin(new java.awt.Insets(2, 15, 2, 15));
        Student.setMaximumSize(new java.awt.Dimension(100, 57));
        Student.setMinimumSize(new java.awt.Dimension(100, 57));
        Student.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentMouseClicked(evt);
            }
        });
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        jToolBar.add(Student);

        JClass_P.setBackground(new java.awt.Color(255, 255, 255));
        JClass_P.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JClass_P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/Teacher-icon.png"))); // NOI18N
        JClass_P.setText("Lớp Học");
        JClass_P.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        JClass_P.setFocusable(false);
        JClass_P.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JClass_P.setMaximumSize(new java.awt.Dimension(101, 57));
        JClass_P.setMinimumSize(new java.awt.Dimension(101, 57));
        JClass_P.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JClass_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JClass_PActionPerformed(evt);
            }
        });
        jToolBar.add(JClass_P);

        Chart.setBackground(new java.awt.Color(255, 255, 255));
        Chart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Chart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/Bar-chart-icon.png"))); // NOI18N
        Chart.setText("Thóng Kê");
        Chart.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        Chart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Chart.setFocusable(false);
        Chart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Chart.setMargin(new java.awt.Insets(2, 15, 2, 15));
        Chart.setMaximumSize(new java.awt.Dimension(100, 57));
        Chart.setMinimumSize(new java.awt.Dimension(100, 57));
        Chart.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Chart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChartMouseClicked(evt);
            }
        });
        Chart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChartActionPerformed(evt);
            }
        });
        jToolBar.add(Chart);

        Edit_Accout.setBackground(new java.awt.Color(255, 255, 255));
        Edit_Accout.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Edit_Accout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/edit_user.png"))); // NOI18N
        Edit_Accout.setText("Thông Tin  Tài Khoản");
        Edit_Accout.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        Edit_Accout.setFocusable(false);
        Edit_Accout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Edit_Accout.setMaximumSize(new java.awt.Dimension(101, 57));
        Edit_Accout.setMinimumSize(new java.awt.Dimension(101, 57));
        Edit_Accout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Edit_Accout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_AccoutActionPerformed(evt);
            }
        });
        jToolBar.add(Edit_Accout);

        Subject.setBackground(new java.awt.Color(255, 255, 255));
        Subject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Subject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/Subjec-icon.png"))); // NOI18N
        Subject.setText("Môn Học & Khóa Học");
        Subject.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        Subject.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Subject.setFocusable(false);
        Subject.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Subject.setMargin(new java.awt.Insets(2, 15, 2, 15));
        Subject.setMaximumSize(new java.awt.Dimension(100, 57));
        Subject.setMinimumSize(new java.awt.Dimension(100, 57));
        Subject.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubjectMouseClicked(evt);
            }
        });
        Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectActionPerformed(evt);
            }
        });
        jToolBar.add(Subject);

        jToolBar4.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/image/Lock-icon.png"))); // NOI18N
        logout.setText("Đăng Xuất");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setFocusable(false);
        logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logout.setMaximumSize(new java.awt.Dimension(100, 57));
        logout.setMinimumSize(new java.awt.Dimension(100, 57));
        logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jToolBar4.add(logout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked

    }//GEN-LAST:event_HomeMouseClicked

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        setLayer(new Panel_User(acc, conn));
    }//GEN-LAST:event_UserMouseClicked

    private void StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentMouseClicked

    }//GEN-LAST:event_StudentMouseClicked

    private void SubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectMouseClicked

    }//GEN-LAST:event_SubjectMouseClicked

    private void ChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChartMouseClicked

    }//GEN-LAST:event_ChartMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Cảm ơn đã sử dụng dịch vụ");
        acc = null;
        CL.logout();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        setLayer(new Panel_User(acc, conn));
        User.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }//GEN-LAST:event_UserActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        setLayer(new Panel_Student(acc, conn));
        Student.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
    }//GEN-LAST:event_StudentActionPerformed

    private void SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectActionPerformed
        Panel_Subject Sub = new Panel_Subject(conn, acc);
        setLayer(Sub);
        Subject.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }//GEN-LAST:event_SubjectActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Panel_Home home = new Panel_Home(conn, acc, this);
        setLayer(home);
        Home.setBackground(Color.CYAN);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }//GEN-LAST:event_HomeActionPerformed

    private void ChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChartActionPerformed
        Panel_Chart1 PC = new Panel_Chart1(conn, acc);
        setLayer(PC);
        Chart.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }//GEN-LAST:event_ChartActionPerformed

    private void JClass_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JClass_PActionPerformed
        Panel_Class P_C = new Panel_Class(conn, acc);
        setLayer(P_C);
        JClass_P.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }//GEN-LAST:event_JClass_PActionPerformed

    private void Edit_AccoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_AccoutActionPerformed
        Panel_Account PA = new Panel_Account(this, conn, acc);
        setLayer(PA);
        Edit_Accout.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
    }//GEN-LAST:event_Edit_AccoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chart;
    private javax.swing.JButton Edit_Accout;
    private javax.swing.JButton Home;
    private javax.swing.JButton JClass_P;
    private javax.swing.JButton Student;
    private javax.swing.JButton Subject;
    private javax.swing.JButton User;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JPanel jPanel;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables

    @Override
    public void view_Teacher() {
        setLayer(new Panel_User(acc, conn));
        User.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }

    @Override
    public void view_Student() {
        if (acc.getRole_ID() == 2) {
            setLayer(new Panel_Student(acc, conn));
            Student.setBackground(Color.CYAN);
            Home.setBackground(Color.WHITE);
            User.setBackground(Color.WHITE);
            Subject.setBackground(Color.WHITE);
            Chart.setBackground(Color.WHITE);
            JClass_P.setBackground(Color.WHITE);
            Edit_Accout.setBackground(Color.WHITE);
        } else {
            setLayer(new Panel_Class(conn, acc));
            JClass_P.setBackground(Color.CYAN);
            Home.setBackground(Color.WHITE);
            Chart.setBackground(Color.WHITE);
            User.setBackground(Color.WHITE);
            Student.setBackground(Color.WHITE);
            Subject.setBackground(Color.WHITE);
            Edit_Accout.setBackground(Color.WHITE);
        }
    }

    @Override
    public void view_Subject() {
        Panel_Subject Sub = new Panel_Subject(conn, acc);
        setLayer(Sub);
        Subject.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Chart.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }

    @Override
    public void view_Chart() {
        Panel_Chart1 PC = new Panel_Chart1(conn, acc);
        setLayer(PC);
        Chart.setBackground(Color.CYAN);
        Home.setBackground(Color.WHITE);
        User.setBackground(Color.WHITE);
        Student.setBackground(Color.WHITE);
        Subject.setBackground(Color.WHITE);
        JClass_P.setBackground(Color.WHITE);
        Edit_Accout.setBackground(Color.WHITE);
    }
    
    @Override
    public void change(tbl_Teacher new_acc) {
        acc = new_acc;
    }

}