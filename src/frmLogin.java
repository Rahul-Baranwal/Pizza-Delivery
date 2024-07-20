import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dell
 */
public class frmLogin extends javax.swing.JFrame {

    int n,l;
    int s=0;
    int t=200;
    Timer tim;
    int price=0;
    int bill=0,total=0;
    int totalPrice=0;
    String pizza="";
    int qty=0;
    int first=0;
    int r=0,g=0,b=0;
    String name,userid,number,password;
    Random rand=new Random();
    Connection con = null;
    PreparedStatement pst = null;
    public frmLogin() {
        initComponents();
//        move panel to top and remove start of windows from comment 1204
//        increase t from 20 to 200
        lblLoad.setVisible(false);
        frmLogin.setSize(715,465);
        frmSignUp.setSize(715,450);
        frmBill.setSize(720,425);
        pnlOrderlist.setBackground(new java.awt.Color(255,255,255,150));
        pnlServices.setBackground(new java.awt.Color(255,255,255,150));
        lblBillAmount.setBackground(new java.awt.Color(255,255,255,150));
        n=0;
        tim=new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                r=rand.nextInt(255);
                g=rand.nextInt(255);
                b=rand.nextInt(255);
                lblColor.setForeground(new java.awt.Color(r,g,b));
            }
        }); 
        tim.start();
        txtSignUpMob.addKeyListener(new KeyAdapter(){
        @Override
        public void keyTyped(KeyEvent e){
            char c = e.getKeyChar();
            if(!((c>='0' && c<='9') || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE))
                e.consume();
        }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmSignUp = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        btnEye1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSignUpName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSignUpMob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSignUpUserId = new javax.swing.JTextField();
        txtSignUpPass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnSignUpSignUp = new javax.swing.JButton();
        btnSignUpClear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        frmLogin = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        btnEye = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtLoginUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLoginPass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btnLoginLogin = new javax.swing.JButton();
        btnLoginClear = new javax.swing.JButton();
        btnLoginSignUp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        frmMenu = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        pnlCPizza = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        pnlSPizza = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        pnlOrderlist = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taBill = new javax.swing.JTextArea();
        lblTotal = new javax.swing.JLabel();
        lblMyName = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        frmBill = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        pnlPay = new javax.swing.JPanel();
        rbUPI = new javax.swing.JRadioButton();
        rbCard = new javax.swing.JRadioButton();
        rbNet = new javax.swing.JRadioButton();
        rbCod = new javax.swing.JRadioButton();
        lblBillAmount = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        lblVideo = new javax.swing.JLabel();
        lblTextLoad = new javax.swing.JLabel();
        jBarLoad = new javax.swing.JProgressBar();
        jLabel14 = new javax.swing.JLabel();
        pnlServices = new javax.swing.JPanel();
        lblService = new javax.swing.JLabel();
        lblService1 = new javax.swing.JLabel();
        lblService2 = new javax.swing.JLabel();
        lblService20 = new javax.swing.JLabel();
        lblService3 = new javax.swing.JLabel();
        lblService4 = new javax.swing.JLabel();
        lblService5 = new javax.swing.JLabel();
        lblService6 = new javax.swing.JLabel();
        lblService7 = new javax.swing.JLabel();
        lblService8 = new javax.swing.JLabel();
        lblService9 = new javax.swing.JLabel();
        lblService19 = new javax.swing.JLabel();
        lblService11 = new javax.swing.JLabel();
        lblService12 = new javax.swing.JLabel();
        lblService13 = new javax.swing.JLabel();
        lblService14 = new javax.swing.JLabel();
        lblService15 = new javax.swing.JLabel();
        lblService18 = new javax.swing.JLabel();
        lblLoad = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblColor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        frmSignUp.setTitle("Sign Up");
        frmSignUp.setBackground(new java.awt.Color(255, 255, 255));
        frmSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frmSignUp.setMinimumSize(new java.awt.Dimension(700, 450));
        frmSignUp.setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 455));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 455));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-close.png"))); // NOI18N
        btnEye1.setBorderPainted(false);
        btnEye1.setContentAreaFilled(false);
        btnEye1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEye1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEye1MouseReleased(evt);
            }
        });
        jPanel1.add(btnEye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 40, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 220, 67));

        txtSignUpName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSignUpName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSignUpName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSignUpCaretUpdate(evt);
            }
        });
        jPanel1.add(txtSignUpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 280, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mobile Number : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, 67));

        txtSignUpMob.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSignUpMob.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSignUpMob.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSignUpCaretUpdate(evt);
                txtMobileCaretUpdate(evt);
            }
        });
        jPanel1.add(txtSignUpMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 280, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("User ID : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 90));

        txtSignUpUserId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSignUpUserId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSignUpUserId.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSignUpCaretUpdate(evt);
            }
        });
        jPanel1.add(txtSignUpUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 280, 50));

        txtSignUpPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSignUpPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSignUpPass.setEchoChar('*');
        txtSignUpPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSignUpCaretUpdate(evt);
            }
        });
        jPanel1.add(txtSignUpPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 280, 50));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 210, 67));

        btnSignUpSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUpSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUpSignUp.setText("SignUp");
        btnSignUpSignUp.setBorderPainted(false);
        btnSignUpSignUp.setContentAreaFilled(false);
        btnSignUpSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUpSignUp.setEnabled(false);
        btnSignUpSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpSignUpMouseExited(evt);
            }
        });
        btnSignUpSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUpSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 140, 50));

        btnSignUpClear.setBackground(new java.awt.Color(255, 255, 255));
        btnSignUpClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUpClear.setText("Clear");
        btnSignUpClear.setBorderPainted(false);
        btnSignUpClear.setContentAreaFilled(false);
        btnSignUpClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUpClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpClearMouseExited(evt);
            }
        });
        btnSignUpClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUpClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 130, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sign Up");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 330, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 720, 430));

        frmSignUp.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        frmLogin.setTitle("Login");
        frmLogin.setLocationByPlatform(true);
        frmLogin.setMinimumSize(new java.awt.Dimension(670, 440));
        frmLogin.setResizable(false);
        frmLogin.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(680, 430));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-close.png"))); // NOI18N
        btnEye.setBorderPainted(false);
        btnEye.setContentAreaFilled(false);
        btnEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEyeMouseReleased(evt);
            }
        });
        jPanel2.add(btnEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 40, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Username :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        txtLoginUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLoginUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLoginUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtLoginCaretUpdate(evt);
            }
        });
        jPanel2.add(txtLoginUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 290, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Password :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        txtLoginPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtLoginPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLoginPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtLoginCaretUpdate(evt);
            }
        });
        txtLoginPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginPassActionPerformed(evt);
            }
        });
        jPanel2.add(txtLoginPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 290, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Login");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 170, 60));

        btnLoginLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoginLogin.setText("Login");
        btnLoginLogin.setBorderPainted(false);
        btnLoginLogin.setContentAreaFilled(false);
        btnLoginLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginLogin.setEnabled(false);
        btnLoginLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginLoginMouseExited(evt);
            }
        });
        btnLoginLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoginLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 110, 40));

        btnLoginClear.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoginClear.setText("Clear");
        btnLoginClear.setBorderPainted(false);
        btnLoginClear.setContentAreaFilled(false);
        btnLoginClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginClearMouseExited(evt);
            }
        });
        btnLoginClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoginClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 110, 40));

        btnLoginSignUp.setBackground(new java.awt.Color(255, 255, 255));
        btnLoginSignUp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnLoginSignUp.setForeground(new java.awt.Color(74, 180, 251));
        btnLoginSignUp.setText("                                    Sign Up");
        btnLoginSignUp.setBorderPainted(false);
        btnLoginSignUp.setContentAreaFilled(false);
        btnLoginSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoginSignUp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLoginSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnLoginSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 200, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Not On Foodie Yet ?");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 140, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 388, 470, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 700, 450));

        frmLogin.getContentPane().add(jPanel2);

        frmMenu.setTitle("Menu");
        frmMenu.setBackground(new java.awt.Color(255, 255, 255));
        frmMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frmMenu.setMinimumSize(new java.awt.Dimension(1220, 550));
        frmMenu.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(720, 455));
        jPanel3.setPreferredSize(new java.awt.Dimension(720, 455));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCPizza.setBackground(new java.awt.Color(230, 230, 230));
        pnlCPizza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Combos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlCPizza.setOpaque(false);
        pnlCPizza.setLayout(new java.awt.GridLayout(3, 5));

        lbl8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl8.setForeground(new java.awt.Color(255, 255, 255));
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl8.setText("Cheese Tomato Pizza");
        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl8);

        lbl9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl9.setForeground(new java.awt.Color(255, 255, 255));
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl9.setText("Tomato Onion Pizza");
        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl9);

        lbl10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl10.setForeground(new java.awt.Color(255, 255, 255));
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl10.setText("Cheese Onion Pizza");
        lbl10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl10);

        lbl11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl11.setForeground(new java.awt.Color(255, 255, 255));
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl11.setText("Cheese Jalepeno Pizza");
        lbl11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl11);

        lbl12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl12.setForeground(new java.awt.Color(255, 255, 255));
        lbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl12.setText("Extra Cheese Pizza");
        lbl12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl12);

        lbl13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl13.setForeground(new java.awt.Color(255, 255, 255));
        lbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl13.setText("Cheese Corn Pizza");
        lbl13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl13MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl13);

        lbl14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl14.setForeground(new java.awt.Color(255, 255, 255));
        lbl14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl14.setText("Corn Onion Pizza");
        lbl14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl14MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl14);

        lbl15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl15.setForeground(new java.awt.Color(255, 255, 255));
        lbl15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl15.setText("Chesse Capsicum Pizza");
        lbl15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl15MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl15);

        lbl16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl16.setForeground(new java.awt.Color(255, 255, 255));
        lbl16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl16.setText("Chilli Chicken Pizza");
        lbl16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl16MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl16);

        lbl17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl17.setForeground(new java.awt.Color(255, 255, 255));
        lbl17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl17.setText("Manchurian Pizza");
        lbl17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl17MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl17);

        lbl18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl18.setForeground(new java.awt.Color(255, 255, 255));
        lbl18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl18.setText("Fully Loaded Pizza");
        lbl18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl18MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl18);

        lbl19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl19.setForeground(new java.awt.Color(255, 255, 255));
        lbl19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl19.setText("Mushroom Pizza");
        lbl19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl19MouseClicked(evt);
            }
        });
        pnlCPizza.add(lbl19);

        jPanel3.add(pnlCPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 790, 300));

        pnlSPizza.setBackground(new java.awt.Color(230, 230, 230));
        pnlSPizza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Regular", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlSPizza.setOpaque(false);
        pnlSPizza.setLayout(new java.awt.GridLayout(1, 0));

        lbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl1.setText("Cheese Pizza");
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl1);

        lbl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl2.setText("Tomato Pizza");
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl2);

        lbl3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl3.setText("Onion Pizza");
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl3);

        lbl4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl4.setText("Jalepeno Pizza");
        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl4);

        lbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl5.setForeground(new java.awt.Color(255, 255, 255));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl5.setText("Corn Pizza");
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl5);

        lbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl6.setForeground(new java.awt.Color(255, 255, 255));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl6.setText("Capsicum Pizza");
        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl6);

        lbl7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl7.setForeground(new java.awt.Color(255, 255, 255));
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lbl7.setText("Chicken Pizza");
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        pnlSPizza.add(lbl7);

        jPanel3.add(pnlSPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 790, 120));

        pnlOrderlist.setBackground(new java.awt.Color(255, 255, 255));
        pnlOrderlist.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Billing");
        pnlOrderlist.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 40));

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrder.setText("Checkout");
        btnOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrderMouseExited(evt);
            }
        });
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        pnlOrderlist.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, 40));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        taBill.setEditable(false);
        taBill.setColumns(20);
        taBill.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        taBill.setLineWrap(true);
        taBill.setRows(10);
        taBill.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        taBill.setFocusable(false);
        jScrollPane1.setViewportView(taBill);

        pnlOrderlist.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 320, 300));

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        lblTotal.setOpaque(true);
        pnlOrderlist.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 160, 50));

        jPanel3.add(pnlOrderlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 340, 410));

        lblMyName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMyName.setForeground(new java.awt.Color(255, 255, 255));
        lblMyName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMyName.setText("Hello ");
        jPanel3.add(lblMyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 350, 50));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Menu");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 350, 50));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food.jpg"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1210, 570));

        frmMenu.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        frmBill.setTitle("Payment");
        frmBill.setBackground(new java.awt.Color(255, 255, 255));
        frmBill.setLocationByPlatform(true);
        frmBill.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPay.setBackground(new java.awt.Color(255, 255, 255));
        pnlPay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Payment Method", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pnlPay.setLayout(new java.awt.GridLayout(2, 2));

        rbUPI.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbUPI);
        rbUPI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbUPI.setText("UPI");
        rbUPI.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlPay.add(rbUPI);

        rbCard.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbCard);
        rbCard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbCard.setText("Card");
        rbCard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlPay.add(rbCard);

        rbNet.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbNet);
        rbNet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbNet.setText("Net Banking");
        rbNet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlPay.add(rbNet);

        rbCod.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbCod);
        rbCod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbCod.setSelected(true);
        rbCod.setText("Cash on Delivery");
        rbCod.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pnlPay.add(rbCod);

        jPanel4.add(pnlPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 290, 180));

        lblBillAmount.setBackground(new java.awt.Color(255, 255, 255));
        lblBillAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBillAmount.setText("Total Billing Amount : ");
        lblBillAmount.setOpaque(true);
        jPanel4.add(lblBillAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 310, 50));

        btnPay.setBackground(new java.awt.Color(255, 255, 255));
        btnPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPay.setText("Pay");
        btnPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPay.setEnabled(false);
        btnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPayMouseExited(evt);
            }
        });
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel4.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 210, 50));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Enter Address :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 40));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtAddress.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtAddressCaretUpdate(evt);
            }
        });
        jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Payment");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 310, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza.png"))); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        frmBill.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza And Grill");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("logo.jpg")).getImage()
        );
        setMinimumSize(new java.awt.Dimension(1240, 700));
        setPreferredSize(new java.awt.Dimension(1240, 690));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVideo.setBackground(new java.awt.Color(207, 207, 170));
        lblVideo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homepage.gif"))); // NOI18N
        lblVideo.setOpaque(true);
        pnlMain.add(lblVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1230, 610));

        lblTextLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTextLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMain.add(lblTextLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1240, 30));

        jBarLoad.setBackground(new java.awt.Color(255, 255, 255));
        jBarLoad.setForeground(new java.awt.Color(255, 51, 51));
        jBarLoad.setBorderPainted(false);
        jBarLoad.setOpaque(true);
        pnlMain.add(jBarLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 639, 1280, 10));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 670));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Copyright @ Sahil and Rahul");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 180, 30));

        pnlServices.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Our Serviceable Locations", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlServices.setOpaque(false);
        pnlServices.setLayout(new java.awt.GridLayout(3, 5));

        lblService.setBackground(new java.awt.Color(0, 0, 0));
        lblService.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService.setForeground(new java.awt.Color(255, 255, 255));
        lblService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService.setText("Mess");
        pnlServices.add(lblService);

        lblService1.setBackground(new java.awt.Color(0, 0, 0));
        lblService1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService1.setForeground(new java.awt.Color(255, 255, 255));
        lblService1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService1.setText("Canteen");
        pnlServices.add(lblService1);

        lblService2.setBackground(new java.awt.Color(0, 0, 0));
        lblService2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService2.setForeground(new java.awt.Color(255, 255, 255));
        lblService2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService2.setText("Mess 1st year");
        pnlServices.add(lblService2);

        lblService20.setBackground(new java.awt.Color(0, 0, 0));
        lblService20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService20.setForeground(new java.awt.Color(255, 255, 255));
        lblService20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService20.setText("Hostel 1st year ");
        pnlServices.add(lblService20);

        lblService3.setBackground(new java.awt.Color(0, 0, 0));
        lblService3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService3.setForeground(new java.awt.Color(255, 255, 255));
        lblService3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService3.setText("Indoor Stadium");
        pnlServices.add(lblService3);

        lblService4.setBackground(new java.awt.Color(0, 0, 0));
        lblService4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService4.setForeground(new java.awt.Color(255, 255, 255));
        lblService4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService4.setText("Mini Project Lab");
        pnlServices.add(lblService4);

        lblService5.setBackground(new java.awt.Color(0, 0, 0));
        lblService5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService5.setForeground(new java.awt.Color(255, 255, 255));
        lblService5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService5.setText("A-Block");
        pnlServices.add(lblService5);

        lblService6.setBackground(new java.awt.Color(0, 0, 0));
        lblService6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService6.setForeground(new java.awt.Color(255, 255, 255));
        lblService6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService6.setText("B-Block");
        pnlServices.add(lblService6);

        lblService7.setBackground(new java.awt.Color(0, 0, 0));
        lblService7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService7.setForeground(new java.awt.Color(255, 255, 255));
        lblService7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService7.setText("C-Block");
        pnlServices.add(lblService7);

        lblService8.setBackground(new java.awt.Color(0, 0, 0));
        lblService8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService8.setForeground(new java.awt.Color(255, 255, 255));
        lblService8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService8.setText("D-Block");
        pnlServices.add(lblService8);

        lblService9.setBackground(new java.awt.Color(0, 0, 0));
        lblService9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService9.setForeground(new java.awt.Color(255, 255, 255));
        lblService9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService9.setText("B.Pharma");
        pnlServices.add(lblService9);

        lblService19.setBackground(new java.awt.Color(0, 0, 0));
        lblService19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService19.setForeground(new java.awt.Color(255, 255, 255));
        lblService19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService19.setText("Boys Hostel");
        pnlServices.add(lblService19);

        lblService11.setBackground(new java.awt.Color(0, 0, 0));
        lblService11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService11.setForeground(new java.awt.Color(255, 255, 255));
        lblService11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService11.setText("E-Block");
        pnlServices.add(lblService11);

        lblService12.setBackground(new java.awt.Color(0, 0, 0));
        lblService12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService12.setForeground(new java.awt.Color(255, 255, 255));
        lblService12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService12.setText("F-Block");
        pnlServices.add(lblService12);

        lblService13.setBackground(new java.awt.Color(0, 0, 0));
        lblService13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService13.setForeground(new java.awt.Color(255, 255, 255));
        lblService13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService13.setText("G-Block");
        pnlServices.add(lblService13);

        lblService14.setBackground(new java.awt.Color(0, 0, 0));
        lblService14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService14.setForeground(new java.awt.Color(255, 255, 255));
        lblService14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService14.setText("H-Block");
        pnlServices.add(lblService14);

        lblService15.setBackground(new java.awt.Color(0, 0, 0));
        lblService15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService15.setForeground(new java.awt.Color(255, 255, 255));
        lblService15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService15.setText("MBA");
        pnlServices.add(lblService15);

        lblService18.setBackground(new java.awt.Color(0, 0, 0));
        lblService18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblService18.setForeground(new java.awt.Color(255, 255, 255));
        lblService18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblService18.setText("Girls Hostel");
        pnlServices.add(lblService18);

        getContentPane().add(pnlServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 490, 1250, 160));

        lblLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/327.gif"))); // NOI18N
        lblLoad.setToolTipText("");
        lblLoad.setMaximumSize(new java.awt.Dimension(700, 180));
        lblLoad.setMinimumSize(new java.awt.Dimension(600, 180));
        lblLoad.setName(""); // NOI18N
        lblLoad.setPreferredSize(new java.awt.Dimension(500, 180));
        getContentPane().add(lblLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 170, 110));

        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, -1, 40));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setPreferredSize(new java.awt.Dimension(69, 23));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 90, 40));

        lblColor.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        lblColor.setForeground(new java.awt.Color(255, 255, 255));
        lblColor.setText("Pizza And Grill");
        getContentPane().add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 780, 150));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(700, 180));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 180));
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 180));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        frmLogin.setLocationRelativeTo(this);
        n=0;
        tim=new Timer(t,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                lblLoad.setVisible(true);
                n++;
                if(n==10){
                    lblLoad.setVisible(false);
                    frmLogin.setVisible(true);
                    tim.stop();
                }
            }
        }); 
        tim.start();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnSignUpMouseExited

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        frmSignUp.setLocationRelativeTo(this);
        n=0;
        tim=new Timer(t,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                lblLoad.setVisible(true);
                n++;
                if(n==10){
                    lblLoad.setVisible(false);
                    frmSignUp.setVisible(true);
                    tim.stop();
                }
            }
        }); 
        tim.start();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        l=0;
        tim=new Timer(233,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                    l++;
                    jBarLoad.setValue(l);
                    if(l==0)
                        lblTextLoad.setText("Starting...");
                    else if(l==10)
                        lblTextLoad.setText("Loading Modules...");
                    else if(l==20)
                        lblTextLoad.setText("Creating Database...");
                    else if(l==35)
                        lblTextLoad.setText("Establising Connection...");
                    else if(l==50)
                        lblTextLoad.setText("Almost Done...");
                    else if(l==70)
                        lblTextLoad.setText("Opening Application...");
                    else if(l==95)
                        lblTextLoad.setText("Completed...");
                    else if(l==100){
                        pnlMain.setVisible(false);
                        tim.stop();
                    }
            }
        }); 
        tim.start();
    }//GEN-LAST:event_formWindowActivated

    private void btnLoginSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginSignUpActionPerformed
        frmSignUp.setLocationRelativeTo(this);
        frmLogin.setVisible(false);
        frmSignUp.setVisible(true);
    }//GEN-LAST:event_btnLoginSignUpActionPerformed

    private void btnSignUpClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpClearActionPerformed
        txtSignUpName.setText("");
        txtSignUpMob.setText("");
        txtSignUpUserId.setText("");
        txtSignUpPass.setText("");
    }//GEN-LAST:event_btnSignUpClearActionPerformed

    private void btnSignUpSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpSignUpMouseEntered
        btnSignUpSignUp.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnSignUpSignUpMouseEntered

    private void btnSignUpSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpSignUpMouseExited
        btnSignUpSignUp.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnSignUpSignUpMouseExited

    private void btnSignUpClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpClearMouseEntered
        btnSignUpClear.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnSignUpClearMouseEntered

    private void btnSignUpClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpClearMouseExited
        btnSignUpClear.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnSignUpClearMouseExited

    private void btnOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseEntered
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnOrderMouseEntered

    private void btnOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseExited
        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 16));
    }//GEN-LAST:event_btnOrderMouseExited

    private void btnLoginLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginLoginActionPerformed
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false","root","tiger");
    String username = txtLoginUser.getText();
    String password = txtLoginPass.getText();

    Statement stm = con.createStatement();

    String sql = "select * from login where username ='"+username+"' and Password='"+password+"'";
    ResultSet rs = stm.executeQuery(sql);
    
    if(rs.next())
    {
        dispose();
       frmMenu.setLocationRelativeTo(this);
        frmMenu.setVisible(true);
        lblMyName.setText("Hello, "+txtLoginUser.getText());
        
    }
    else
            JOptionPane.showMessageDialog(this,"Please enter valid UserId / Password","Warning" ,JOptionPane.WARNING_MESSAGE);
    
}
catch(Exception e){
    System.out.println(e.getMessage());
}


    }//GEN-LAST:event_btnLoginLoginActionPerformed

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
        s=1;
        dialog(s);
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
        s=2;
        dialog(s);
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
        s=3;
        dialog(s);
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
        s=4;
        dialog(s);
    }//GEN-LAST:event_lbl4MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
        s=5;
        dialog(s);
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
        s=6;
        dialog(s);
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
        s=7;
        dialog(s);
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
        s=8;
        dialog(s);
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
        s=9;
        dialog(s);
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        s=10;
        dialog(s);
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        s=11;
        dialog(s);
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        s=12;
        dialog(s);
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl13MouseClicked
        s=13;
        dialog(s);
    }//GEN-LAST:event_lbl13MouseClicked

    private void lbl14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl14MouseClicked
        s=14;
        dialog(s);
    }//GEN-LAST:event_lbl14MouseClicked

    private void lbl15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl15MouseClicked
        s=15;
        dialog(s);
    }//GEN-LAST:event_lbl15MouseClicked

    private void lbl16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl16MouseClicked
        s=16;
        dialog(s);
    }//GEN-LAST:event_lbl16MouseClicked

    private void lbl17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl17MouseClicked
        s=17;
        dialog(s);
    }//GEN-LAST:event_lbl17MouseClicked

    private void lbl18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl18MouseClicked
        s=18;
        dialog(s);
    }//GEN-LAST:event_lbl18MouseClicked

    private void lbl19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl19MouseClicked
        s=19;
        dialog(s);
    }//GEN-LAST:event_lbl19MouseClicked

    private void btnSignUpSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpSignUpActionPerformed
try
{
    String query= "insert into 1`login(username,password,phonenumber,userId) VALUES (?,?,?,?)";
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false","root","tiger");
    pst = con.prepareStatement(query);
    pst.setString(1, txtSignUpName.getText());
    pst.setString(3, txtSignUpMob.getText());
    pst.setString(4, txtSignUpUserId.getText());
    pst.setString(2, txtSignUpPass.getText());
    pst.executeUpdate();
    JOptionPane.showMessageDialog(null,"REGISTER SUCCESSFULLY");
    frmLogin.setLocationRelativeTo(this);
    frmSignUp.setVisible(false);
    frmLogin.setVisible(true);

}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(null,ex);
}
    }//GEN-LAST:event_btnSignUpSignUpActionPerformed

    private void btnLoginLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLoginMouseEntered
        btnLoginLogin.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnLoginLoginMouseEntered

    private void btnLoginLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLoginMouseExited
        btnLoginLogin.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnLoginLoginMouseExited

    private void btnLoginClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginClearMouseEntered
        btnLoginClear.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnLoginClearMouseEntered

    private void btnLoginClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginClearMouseExited
        btnLoginClear.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnLoginClearMouseExited

    private void btnPayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseExited
        btnPay.setFont(new java.awt.Font("Tahoma", 1, 18));
    }//GEN-LAST:event_btnPayMouseExited

    private void btnPayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseEntered
        btnPay.setFont(new java.awt.Font("Tahoma", 1, 20));
    }//GEN-LAST:event_btnPayMouseEntered

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        int sel=JOptionPane.showConfirmDialog(this,"Proceed to pay..." ,"Confirm Order!!!" ,JOptionPane.YES_NO_OPTION);
        if(sel==0){
            frmBill.setLocationRelativeTo(this);
            frmMenu.setVisible(false);
            frmBill.setVisible(true);
            lblBillAmount.setText("Total Billing Amount : Rs. "+totalPrice);
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        payment();
        JOptionPane.showMessageDialog(this,"Payment Successful , Your order will be delivered in 30 Years!!!","Thank You!",JOptionPane.INFORMATION_MESSAGE);
        frmBill.setVisible(false);
        this.setVisible(true);
        txtAddress.setText("");
        txtLoginPass.setText("");
        txtLoginUser.setText("");
        txtSignUpMob.setText("");
        txtSignUpName.setText("");
        txtSignUpPass.setText("");
        txtSignUpUserId.setText("");
        taBill.setText("");
        first=0;
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnLoginClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginClearActionPerformed
        txtLoginUser.setText("");
        txtLoginPass.setText("");
    }//GEN-LAST:event_btnLoginClearActionPerformed

    private void txtSignUpCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSignUpCaretUpdate
        if(txtSignUpMob.getText().trim().isEmpty() || txtSignUpName.getText().trim().isEmpty() || txtSignUpPass.getText().trim().isEmpty() || txtSignUpUserId.getText().trim().isEmpty() )
            btnSignUpSignUp.setEnabled(false);
        else
            btnSignUpSignUp.setEnabled(true);
    }//GEN-LAST:event_txtSignUpCaretUpdate

    private void txtLoginCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtLoginCaretUpdate
       if(txtLoginUser.getText().trim().isEmpty() || txtLoginPass.getText().trim().isEmpty() )
            btnLoginLogin.setEnabled(false);
        else
            btnLoginLogin.setEnabled(true);
    }//GEN-LAST:event_txtLoginCaretUpdate

    private void btnEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMousePressed
        txtLoginPass.setEchoChar((char)0);
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-open.png")));
    }//GEN-LAST:event_btnEyeMousePressed

    private void btnEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEyeMouseReleased
        txtLoginPass.setEchoChar('*');
        btnEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-close.png")));
    }//GEN-LAST:event_btnEyeMouseReleased

    private void btnEye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEye1MousePressed
        txtSignUpPass.setEchoChar((char)0);
        btnEye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-open.png")));
    }//GEN-LAST:event_btnEye1MousePressed

    private void btnEye1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEye1MouseReleased
        txtSignUpPass.setEchoChar('*');
        btnEye1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eye-close.png")));
    }//GEN-LAST:event_btnEye1MouseReleased

    private void txtAddressCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtAddressCaretUpdate
        if(txtAddress.getText().trim().isEmpty())
            btnPay.setEnabled(false);
        else
            btnPay.setEnabled(true);
    }//GEN-LAST:event_txtAddressCaretUpdate

    private void txtMobileCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMobileCaretUpdate
    
    }//GEN-LAST:event_txtMobileCaretUpdate

    private void txtLoginPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginPassActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
                
            }
        });
    }
    void dialog(int s){
        qty=0;
        if(s==2 || s==3 || s==5 || s==6){
            price=70;
        }
        if(s==1 || s==4 || s==7){
            price=100;
        }
        if(s==8 || s==9 || s==10  || s==13 || s==14 || s==15){
            price=150;
        }
        if(s==11 || s==12 || s==17 ){
            price=200;
        }
        if(s==16 || s==18 || s==19){
            price=250;
        }
        switch(s){
            case 1 -> pizza=lbl1.getText();
            case 2 -> pizza=lbl2.getText();
            case 3 -> pizza=lbl3.getText();
            case 4 -> pizza=lbl4.getText();
            case 5 -> pizza=lbl5.getText();
            case 6 -> pizza=lbl6.getText();
            case 7 -> pizza=lbl7.getText();
            case 8 -> pizza=lbl8.getText();
            case 9 -> pizza=lbl9.getText();
            case 10 -> pizza=lbl10.getText();
            case 11 -> pizza=lbl11.getText();
            case 12 -> pizza=lbl12.getText();
            case 13 -> pizza=lbl13.getText();
            case 14 -> pizza=lbl14.getText();
            case 15 -> pizza=lbl15.getText();
            case 16 -> pizza=lbl16.getText();
            case 17 -> pizza=lbl17.getText();
            case 18 -> pizza=lbl18.getText();
            case 19 -> pizza=lbl19.getText();
        }
                
        
        try{
        qty=Integer.parseInt(JOptionPane.showInputDialog("Price : Rs. "+price+" , Enter your quantity ?", null));
        if(qty!=0)
            bill++;
        total=price*qty; 
        if(first<1)
                taBill.append("-------------------------------------------------\n");
        taBill.append(bill+". "+pizza+"   X   "+qty+"   =  Rs. "+total+"\n");
        totalPrice=totalPrice+total;
        first++;
        taBill.append("-------------------------------------------------\n");
        lblTotal.setText("Rs."+totalPrice);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please Enter a valid number","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    void payment(){
        if(rbUPI.isSelected())
            JOptionPane.showInputDialog("Enter your UPI", null);
        if(rbCard.isSelected())
            JOptionPane.showInputDialog("Enter Card Number", null);
        if(rbNet.isSelected())
            JOptionPane.showInputDialog("Enter Account Number", null);
        if(rbCod.isSelected())
            JOptionPane.showMessageDialog(this,"Keep your cash ready!!!");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEye;
    private javax.swing.JButton btnEye1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLoginClear;
    private javax.swing.JButton btnLoginLogin;
    private javax.swing.JButton btnLoginSignUp;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnSignUpClear;
    private javax.swing.JButton btnSignUpSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame frmBill;
    private javax.swing.JFrame frmLogin;
    private javax.swing.JFrame frmMenu;
    private javax.swing.JFrame frmSignUp;
    private javax.swing.JProgressBar jBarLoad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblBillAmount;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblLoad;
    private javax.swing.JLabel lblMyName;
    private javax.swing.JLabel lblService;
    private javax.swing.JLabel lblService1;
    private javax.swing.JLabel lblService11;
    private javax.swing.JLabel lblService12;
    private javax.swing.JLabel lblService13;
    private javax.swing.JLabel lblService14;
    private javax.swing.JLabel lblService15;
    private javax.swing.JLabel lblService18;
    private javax.swing.JLabel lblService19;
    private javax.swing.JLabel lblService2;
    private javax.swing.JLabel lblService20;
    private javax.swing.JLabel lblService3;
    private javax.swing.JLabel lblService4;
    private javax.swing.JLabel lblService5;
    private javax.swing.JLabel lblService6;
    private javax.swing.JLabel lblService7;
    private javax.swing.JLabel lblService8;
    private javax.swing.JLabel lblService9;
    private javax.swing.JLabel lblTextLoad;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVideo;
    private javax.swing.JPanel pnlCPizza;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlOrderlist;
    private javax.swing.JPanel pnlPay;
    private javax.swing.JPanel pnlSPizza;
    private javax.swing.JPanel pnlServices;
    private javax.swing.JRadioButton rbCard;
    private javax.swing.JRadioButton rbCod;
    private javax.swing.JRadioButton rbNet;
    private javax.swing.JRadioButton rbUPI;
    private javax.swing.JTextArea taBill;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtLoginPass;
    private javax.swing.JTextField txtLoginUser;
    private javax.swing.JTextField txtSignUpMob;
    private javax.swing.JTextField txtSignUpName;
    private javax.swing.JPasswordField txtSignUpPass;
    private javax.swing.JTextField txtSignUpUserId;
    // End of variables declaration//GEN-END:variables
}
