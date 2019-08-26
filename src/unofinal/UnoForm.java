package unofinal;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class UnoForm extends javax.swing.JFrame {

    public static SwingWorker sw;

    public UnoForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RestFrame = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mainFrame = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p1name = new javax.swing.JTextField();
        p2name = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        p1h1 = new javax.swing.JTextField();
        p1b1 = new javax.swing.JTextField();
        p2h1 = new javax.swing.JTextField();
        p2b1 = new javax.swing.JTextField();
        p1h2 = new javax.swing.JTextField();
        p1b2 = new javax.swing.JTextField();
        p2h2 = new javax.swing.JTextField();
        p2b2 = new javax.swing.JTextField();
        p1h3 = new javax.swing.JTextField();
        p1b3 = new javax.swing.JTextField();
        p2h3 = new javax.swing.JTextField();
        p2b3 = new javax.swing.JTextField();
        p1h4 = new javax.swing.JTextField();
        p1b4 = new javax.swing.JTextField();
        p2h4 = new javax.swing.JTextField();
        p2b4 = new javax.swing.JTextField();
        p1h5 = new javax.swing.JTextField();
        p1b5 = new javax.swing.JTextField();
        p2h5 = new javax.swing.JTextField();
        p2b5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        WinnerFrame = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        winnerField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        pointsFrame = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        pointsp1name = new javax.swing.JTextField();
        ukuP1 = new javax.swing.JTextField();
        pointsp2name = new javax.swing.JTextField();
        ukuP2 = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        RestFrame.setBounds(new java.awt.Rectangle(430, 50, 400, 460));
        RestFrame.setMinimumSize(new java.awt.Dimension(400, 460));
        RestFrame.setPreferredSize(new java.awt.Dimension(400, 460));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Apple Braille", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Enter username and password to proceed");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 75, -1, -1));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Username: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 165, -1, -1));

        username.setColumns(12);
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 164, -1, -1));

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Password:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 206, -1, -1));

        pass.setColumns(12);
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 206, -1, -1));

        jPanel6.setBackground(new java.awt.Color(236, 27, 35));

        jLabel8.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("creator: Danis Preldzic");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel8)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 400, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 120, 40));

        javax.swing.GroupLayout RestFrameLayout = new javax.swing.GroupLayout(RestFrame.getContentPane());
        RestFrame.getContentPane().setLayout(RestFrameLayout);
        RestFrameLayout.setHorizontalGroup(
            RestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RestFrameLayout.setVerticalGroup(
            RestFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainFrame.setBounds(new java.awt.Rectangle(350, 50, 754, 550));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter player 1'st name:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Enter player 2'nd name:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        p1name.setBackground(new java.awt.Color(51, 51, 51));
        p1name.setColumns(12);
        jPanel7.add(p1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        p2name.setBackground(new java.awt.Color(51, 51, 51));
        p2name.setColumns(12);
        jPanel7.add(p2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Game");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        date.setBackground(new java.awt.Color(51, 51, 51));
        date.setColumns(8);
        jPanel7.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, -1));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setToolTipText("");
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Hand 1");
        jPanel10.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel19.setText("Hand 2");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel20.setText("Hand 3");
        jPanel10.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel21.setText("Hand 4");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel22.setText("Hand 5");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        p1h1.setEditable(false);
        p1h1.setColumns(6);
        p1h1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p1h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        p1b1.setColumns(6);
        jPanel10.add(p1b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        p2h1.setEditable(false);
        p2h1.setColumns(6);
        p2h1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p2h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        p2b1.setColumns(6);
        jPanel10.add(p2b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        p1h2.setEditable(false);
        p1h2.setColumns(6);
        p1h2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p1h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        p1b2.setColumns(6);
        jPanel10.add(p1b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        p2h2.setEditable(false);
        p2h2.setColumns(6);
        p2h2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p2h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        p2b2.setColumns(6);
        jPanel10.add(p2b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        p1h3.setEditable(false);
        p1h3.setColumns(6);
        p1h3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p1h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        p1b3.setColumns(6);
        jPanel10.add(p1b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        p2h3.setEditable(false);
        p2h3.setColumns(6);
        p2h3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p2h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        p2b3.setColumns(6);
        jPanel10.add(p2b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        p1h4.setEditable(false);
        p1h4.setColumns(6);
        p1h4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p1h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, -1, -1));

        p1b4.setColumns(6);
        jPanel10.add(p1b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        p2h4.setEditable(false);
        p2h4.setColumns(6);
        p2h4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p2h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        p2b4.setColumns(6);
        jPanel10.add(p2b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        p1h5.setEditable(false);
        p1h5.setColumns(6);
        p1h5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p1h5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, -1, -1));

        p1b5.setColumns(6);
        jPanel10.add(p1b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        p2h5.setEditable(false);
        p2h5.setColumns(6);
        p2h5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(p2h5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, -1, -1));

        p2b5.setColumns(6);
        jPanel10.add(p2b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jLabel12.setText("Enter points here");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton2.setText("Winner is");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jPanel7.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 760, 240));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setText("Enter players");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("You need to play 5 hands to proclaim the winner!!!");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Apple Braille", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_mala.png"))); // NOI18N
        jLabel9.setText("UnoRanking");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame.getContentPane());
        mainFrame.getContentPane().setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        WinnerFrame.setBounds(new java.awt.Rectangle(350, 50, 793, 668));
        WinnerFrame.setPreferredSize(new java.awt.Dimension(793, 668));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        winnerField.setColumns(12);
        winnerField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        winnerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(winnerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 220, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno_mala.png"))); // NOI18N
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 396, 150, 110));

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Bog otac, pejgamber, GAME MASTER, ");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("NAJJACI NA SVIJETU");
        jPanel11.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Save the winner");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/winner1.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 780, 650));

        javax.swing.GroupLayout WinnerFrameLayout = new javax.swing.GroupLayout(WinnerFrame.getContentPane());
        WinnerFrame.getContentPane().setLayout(WinnerFrameLayout);
        WinnerFrameLayout.setHorizontalGroup(
            WinnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        WinnerFrameLayout.setVerticalGroup(
            WinnerFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pointsFrame.setBounds(new java.awt.Rectangle(300, 50, 453, 300));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pointsp1name.setEditable(false);
        pointsp1name.setColumns(12);
        pointsp1name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(pointsp1name, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 43, -1, -1));

        ukuP1.setColumns(8);
        ukuP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel13.add(ukuP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 300));

        pointsp2name.setEditable(false);
        pointsp2name.setColumns(12);
        pointsp2name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(pointsp2name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        ukuP2.setColumns(8);
        ukuP2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel12.add(ukuP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        javax.swing.GroupLayout pointsFrameLayout = new javax.swing.GroupLayout(pointsFrame.getContentPane());
        pointsFrame.getContentPane().setLayout(pointsFrameLayout);
        pointsFrameLayout.setHorizontalGroup(
            pointsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
        pointsFrameLayout.setVerticalGroup(
            pointsFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(430, 50, 400, 440));
        setSize(new java.awt.Dimension(400, 440));

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setForeground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(236, 27, 35));

        jLabel7.setFont(new java.awt.Font("Apple Braille", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("creator: Danis Preldzic");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel7)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 400, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uno1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, -1));

        mainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String user = username.getText();

        String passs = pass.getText();

        if (user.equals("Danis") || passs.equals("kjpu8vk6")) {
            JOptionPane.showMessageDialog(null, "Welcome " + user);

            mainFrame.show();
            RestFrame.hide();
        } else {
            JOptionPane.showMessageDialog(null, "You entered wrong username or password");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed


    }//GEN-LAST:event_jButton1KeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed

        String user = username.getText();

        String passs = pass.getText();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (user.equals("Danis") || passs.equals("kjpu8vk6")) {
                JOptionPane.showMessageDialog(null, "Welcome " + user);

                mainFrame.show();
                RestFrame.hide();

            } else {
                JOptionPane.showMessageDialog(null, "You entered wrong username or password");
            }

        }

    }//GEN-LAST:event_passKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {

                String ig1 = p1name.getText();
                String ig2 = p2name.getText();

                p1h1.setText(ig1);
                p2h1.setText(ig2);
                p1h2.setText(ig1);
                p2h2.setText(ig2);
                p1h3.setText(ig1);
                p2h3.setText(ig2);
                p1h4.setText(ig1);
                p2h4.setText(ig2);
                p1h5.setText(ig1);
                p2h5.setText(ig2);

                return null;
            }

        };
        sw.execute();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {

                String p1n = p1name.getText();
                String p2n = p2name.getText();
                String dat = date.getText();

//                hand 1
                String pb1 = p1b1.getText();
                int p1b = Integer.parseInt(pb1);

                String pb2 = p2b1.getText();
                int p2b = Integer.parseInt(pb2);

//                hand 2
                String pb3 = p1b2.getText();
                int p3b = Integer.parseInt(pb3);

                String pb4 = p2b2.getText();
                int p4b = Integer.parseInt(pb4);

//                hand 3 
                String pb5 = p1b3.getText();
                int p5b = Integer.parseInt(pb5);

                String pb6 = p2b3.getText();
                int p6b = Integer.parseInt(pb6);

//                hand 4
                String pb7 = p1b4.getText();
                int p7b = Integer.parseInt(pb7);

                String pb8 = p2b4.getText();
                int p8b = Integer.parseInt(pb8);

//                hand 5
                String pb9 = p1b5.getText();
                int p9b = Integer.parseInt(pb9);

                String pb10 = p2b5.getText();
                int p10b = Integer.parseInt(pb9);

                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UnoRank?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "kjpu8vk6")) {

                    PreparedStatement st = conn.prepareStatement("insert into players(p1_name,p2_name,p1_bodovi1,p2_bodovi1,p1_bodovi2,p2_bodovi2,p1_bodovi3,p2_bodovi3,p1_bodovi4,p2_bodovi4,p1_bodovi5,p2_bodovi5,datum_igre) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    st.setString(1, p1n);
                    st.setString(2, p2n);
                    st.setInt(3, p1b);
                    st.setInt(4, p2b);
                    st.setInt(5, p3b);
                    st.setInt(6, p4b);
                    st.setInt(7, p5b);
                    st.setInt(8, p6b);
                    st.setInt(9, p7b);
                    st.setInt(10, p8b);
                    st.setInt(11, p9b);
                    st.setInt(12, p10b);
                    st.setString(13, dat);

                    st.execute();

                    

                    int ukupnop1 = p1b + p3b + p5b + p7b + p9b;
                    int ukupnop2 = p2b + p4b + p6b + p8b + p10b;

                    pointsp1name.setText(p1n);
                    pointsp2name.setText(p2n);

                    ukuP1.setText(Integer.toString(ukupnop1));
                    ukuP2.setText(Integer.toString(ukupnop2));

                    if (ukupnop1 < ukupnop2) {
                        winnerField.setText(p1n);
                    } else if (ukupnop1 > ukupnop2) {
                        winnerField.setText(p2n);
                    } else {
                        winnerField.setText("No winner X");
                    }
                    
                    

                } catch (SQLException ex) {

                    System.out.println("Greska u konekciji sa bazom: " + ex.getMessage());
                }

                return null;
            }

        };
        sw.execute();
        
        WinnerFrame.show();
        pointsFrame.show();

        p1name.setText("");
        p2name.setText("");
        date.setText("");
        p1b1.setText("");
        p2b1.setText("");
        p1b2.setText("");
        p2b2.setText("");
        p1b3.setText("");
        p2b3.setText("");
        p1b4.setText("");
        p2b4.setText("");
        p1b5.setText("");
        p2b5.setText("");
        p1h1.setText("");
        p2h1.setText("");
        p1h2.setText("");
        p2h2.setText("");
        p1h3.setText("");
        p2h3.setText("");
        p1h4.setText("");
        p2h4.setText("");
        p1h5.setText("");
        p2h5.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {

                String wname = winnerField.getText();

                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UnoRank?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "root", "kjpu8vk6")) {

                    PreparedStatement st = conn.prepareStatement("insert into winners(winner_name) values (?)");
                    st.setString(1, wname);

                    st.execute();

                    JOptionPane.showMessageDialog(null, "Congratulations!!!");

                } catch (SQLException ex) {

                    System.out.println("Greska u konekciji sa bazom: " + ex.getMessage());
                }

                return null;
            }

        };
        sw.execute();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        RestFrame.show();
        
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(UnoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame RestFrame;
    private javax.swing.JFrame WinnerFrame;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JFrame mainFrame;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField p1b1;
    private javax.swing.JTextField p1b2;
    private javax.swing.JTextField p1b3;
    private javax.swing.JTextField p1b4;
    private javax.swing.JTextField p1b5;
    private javax.swing.JTextField p1h1;
    private javax.swing.JTextField p1h2;
    private javax.swing.JTextField p1h3;
    private javax.swing.JTextField p1h4;
    private javax.swing.JTextField p1h5;
    private javax.swing.JTextField p1name;
    private javax.swing.JTextField p2b1;
    private javax.swing.JTextField p2b2;
    private javax.swing.JTextField p2b3;
    private javax.swing.JTextField p2b4;
    private javax.swing.JTextField p2b5;
    private javax.swing.JTextField p2h1;
    private javax.swing.JTextField p2h2;
    private javax.swing.JTextField p2h3;
    private javax.swing.JTextField p2h4;
    private javax.swing.JTextField p2h5;
    private javax.swing.JTextField p2name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JFrame pointsFrame;
    private javax.swing.JTextField pointsp1name;
    private javax.swing.JTextField pointsp2name;
    private javax.swing.JTextField ukuP1;
    private javax.swing.JTextField ukuP2;
    private javax.swing.JTextField username;
    private javax.swing.JTextField winnerField;
    // End of variables declaration//GEN-END:variables
}
