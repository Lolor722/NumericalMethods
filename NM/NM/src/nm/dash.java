package nm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class dash extends javax.swing.JFrame {
    public dash() {
        initComponents();
        bisection.setVisible(false);
        incremental.setVisible(false);
        graph.setVisible(false);
        regula.setVisible(false);
        fixed.setVisible(false);
        Newton.setVisible(false);
        secant.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        bisection = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        graph3 = new javax.swing.JPanel();
        bmRoot = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bmEqt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        xl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        xu = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        incremental = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        imEqt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        deltaX = new javax.swing.JTextField();
        imRoot = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        graph2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        graph = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        eqt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        approRoot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        graph1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        regula = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl4 = new javax.swing.JTable();
        graph4 = new javax.swing.JPanel();
        rootR = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        equationR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        xl1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        xU2 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        fixed = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        equationF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        rootF = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        graph5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl5 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        Newton = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        equationN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        rootN = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        graph6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl6 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        secant = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl7 = new javax.swing.JTable();
        graph7 = new javax.swing.JPanel();
        rootS = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        equationS = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        xl2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        xu2 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(225, 221, 191));
        jPanel1.setForeground(new java.awt.Color(225, 221, 191));
        jPanel1.setMaximumSize(new java.awt.Dimension(1184, 715));
        jPanel1.setMinimumSize(new java.awt.Dimension(1184, 715));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 151, 147));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Method:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 10, 160, 40);

        jButton2.setBackground(new java.awt.Color(225, 221, 191));
        jButton2.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Graphing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 10, 140, 40);

        jButton3.setBackground(new java.awt.Color(225, 221, 191));
        jButton3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("Incremental");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(290, 10, 140, 40);

        jButton8.setBackground(new java.awt.Color(225, 221, 191));
        jButton8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 102, 102));
        jButton8.setText("Fixed Point");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(710, 10, 140, 40);

        jButton9.setBackground(new java.awt.Color(225, 221, 191));
        jButton9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 102, 102));
        jButton9.setText("Newton");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);
        jButton9.setBounds(850, 10, 140, 40);

        jButton10.setBackground(new java.awt.Color(225, 221, 191));
        jButton10.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 102, 102));
        jButton10.setText("Bisection");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(430, 10, 140, 40);

        jButton11.setBackground(new java.awt.Color(225, 221, 191));
        jButton11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 102, 102));
        jButton11.setText("Regula Falsi");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(570, 10, 140, 40);

        jButton7.setBackground(new java.awt.Color(225, 221, 191));
        jButton7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 102));
        jButton7.setText("Secant");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(990, 10, 140, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 1140, 60);

        background.setBackground(new java.awt.Color(255, 151, 147));
        background.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        background.setLayout(null);

        bisection.setBackground(new java.awt.Color(255, 151, 147));
        bisection.setLayout(null);

        tbl3.setBackground(new java.awt.Color(255, 255, 255));
        tbl3.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tbl3.setForeground(new java.awt.Color(0, 0, 0));
        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error"
            }
        ));
        tbl3.setEnabled(false);
        tbl3.setFocusable(false);
        tbl3.getTableHeader().setResizingAllowed(false);
        tbl3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tbl3);

        bisection.add(jScrollPane4);
        jScrollPane4.setBounds(420, 140, 690, 400);

        graph3.setBackground(new java.awt.Color(255, 255, 255));
        graph3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph3.setForeground(new java.awt.Color(0, 0, 0));
        graph3.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph3Layout = new javax.swing.GroupLayout(graph3);
        graph3.setLayout(graph3Layout);
        graph3Layout.setHorizontalGroup(
            graph3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph3Layout.setVerticalGroup(
            graph3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        bisection.add(graph3);
        graph3.setBounds(10, 140, 400, 400);

        bmRoot.setBackground(new java.awt.Color(222, 171, 176));
        bmRoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        bmRoot.setForeground(new java.awt.Color(255, 255, 255));
        bmRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bmRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmRootActionPerformed(evt);
            }
        });
        bisection.add(bmRoot);
        bmRoot.setBounds(500, 80, 310, 40);

        jLabel10.setBackground(new java.awt.Color(74, 120, 125));
        jLabel10.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Approximate Root:");
        bisection.add(jLabel10);
        jLabel10.setBounds(320, 80, 190, 40);

        jLabel11.setBackground(new java.awt.Color(74, 120, 125));
        jLabel11.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Equation:");
        bisection.add(jLabel11);
        jLabel11.setBounds(210, 20, 130, 40);

        bmEqt.setBackground(new java.awt.Color(222, 171, 176));
        bmEqt.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        bmEqt.setForeground(new java.awt.Color(255, 255, 255));
        bmEqt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bmEqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmEqtActionPerformed(evt);
            }
        });
        bmEqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bmEqtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bmEqtKeyTyped(evt);
            }
        });
        bisection.add(bmEqt);
        bmEqt.setBounds(320, 20, 190, 40);

        jLabel12.setBackground(new java.awt.Color(74, 120, 125));
        jLabel12.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("xL");
        bisection.add(jLabel12);
        jLabel12.setBounds(520, 20, 30, 40);

        xl.setBackground(new java.awt.Color(222, 171, 176));
        xl.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xl.setForeground(new java.awt.Color(255, 255, 255));
        xl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xlActionPerformed(evt);
            }
        });
        xl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xlKeyTyped(evt);
            }
        });
        bisection.add(xl);
        xl.setBounds(560, 20, 80, 40);

        jLabel13.setBackground(new java.awt.Color(74, 120, 125));
        jLabel13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("xU");
        bisection.add(jLabel13);
        jLabel13.setBounds(650, 20, 40, 40);

        xu.setBackground(new java.awt.Color(222, 171, 176));
        xu.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xu.setForeground(new java.awt.Color(255, 255, 255));
        xu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuActionPerformed(evt);
            }
        });
        xu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xuKeyTyped(evt);
            }
        });
        bisection.add(xu);
        xu.setBounds(700, 20, 90, 40);

        jButton6.setBackground(new java.awt.Color(225, 221, 191));
        jButton6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 102, 102));
        jButton6.setText("Calculate");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        bisection.add(jButton6);
        jButton6.setBounds(820, 20, 140, 40);

        background.add(bisection);
        bisection.setBounds(10, 10, 1120, 550);

        incremental.setBackground(new java.awt.Color(255, 151, 147));
        incremental.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Equation:");
        incremental.add(jLabel5);
        jLabel5.setBounds(200, 10, 130, 40);

        imEqt.setBackground(new java.awt.Color(222, 171, 176));
        imEqt.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        imEqt.setForeground(new java.awt.Color(255, 255, 255));
        imEqt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        imEqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imEqtActionPerformed(evt);
            }
        });
        imEqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imEqtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                imEqtKeyTyped(evt);
            }
        });
        incremental.add(imEqt);
        imEqt.setBounds(290, 10, 190, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("xL");
        incremental.add(jLabel7);
        jLabel7.setBounds(500, 10, 30, 40);

        lb.setBackground(new java.awt.Color(222, 171, 176));
        lb.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 255, 255));
        lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbActionPerformed(evt);
            }
        });
        lb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lbKeyTyped(evt);
            }
        });
        incremental.add(lb);
        lb.setBounds(530, 10, 80, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("deltaX");
        incremental.add(jLabel9);
        jLabel9.setBounds(620, 10, 60, 40);

        deltaX.setBackground(new java.awt.Color(222, 171, 176));
        deltaX.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        deltaX.setForeground(new java.awt.Color(255, 255, 255));
        deltaX.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        deltaX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deltaXActionPerformed(evt);
            }
        });
        deltaX.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deltaXKeyTyped(evt);
            }
        });
        incremental.add(deltaX);
        deltaX.setBounds(680, 10, 90, 40);

        imRoot.setEditable(false);
        imRoot.setBackground(new java.awt.Color(222, 171, 176));
        imRoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        imRoot.setForeground(new java.awt.Color(255, 255, 255));
        imRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        imRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imRootActionPerformed(evt);
            }
        });
        incremental.add(imRoot);
        imRoot.setBounds(510, 70, 310, 40);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Approximate Root:");
        incremental.add(jLabel6);
        jLabel6.setBounds(320, 70, 180, 40);

        graph2.setBackground(new java.awt.Color(255, 255, 255));
        graph2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout graph2Layout = new javax.swing.GroupLayout(graph2);
        graph2.setLayout(graph2Layout);
        graph2Layout.setHorizontalGroup(
            graph2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph2Layout.setVerticalGroup(
            graph2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        incremental.add(graph2);
        graph2.setBounds(0, 140, 400, 400);

        tbl2.setBackground(new java.awt.Color(255, 255, 255));
        tbl2.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tbl2.setForeground(new java.awt.Color(0, 0, 0));
        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error", "f(xL) * f(xU)"
            }
        ));
        tbl2.setEnabled(false);
        tbl2.setFocusable(false);
        tbl2.getTableHeader().setResizingAllowed(false);
        tbl2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbl2);

        incremental.add(jScrollPane3);
        jScrollPane3.setBounds(410, 140, 710, 400);

        jButton5.setBackground(new java.awt.Color(225, 221, 191));
        jButton5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 102, 102));
        jButton5.setText("Calculate");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        incremental.add(jButton5);
        jButton5.setBounds(780, 10, 140, 40);

        background.add(incremental);
        incremental.setBounds(10, 10, 1120, 550);

        graph.setBackground(new java.awt.Color(255, 151, 147));
        graph.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Equation:");
        graph.add(jLabel3);
        jLabel3.setBounds(210, 10, 130, 40);

        eqt.setBackground(new java.awt.Color(222, 171, 176));
        eqt.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        eqt.setForeground(new java.awt.Color(255, 255, 255));
        eqt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        eqt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eqtActionPerformed(evt);
            }
        });
        eqt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eqtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eqtKeyTyped(evt);
            }
        });
        graph.add(eqt);
        eqt.setBounds(310, 10, 250, 40);

        jLabel8.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("xL");
        graph.add(jLabel8);
        jLabel8.setBounds(590, 10, 30, 40);

        a.setBackground(new java.awt.Color(222, 171, 176));
        a.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aKeyTyped(evt);
            }
        });
        graph.add(a);
        a.setBounds(630, 10, 100, 40);

        approRoot.setEditable(false);
        approRoot.setBackground(new java.awt.Color(222, 171, 176));
        approRoot.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        approRoot.setForeground(new java.awt.Color(255, 255, 255));
        approRoot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        approRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approRootActionPerformed(evt);
            }
        });
        graph.add(approRoot);
        approRoot.setBounds(510, 70, 190, 40);

        jLabel4.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Approximate Root:");
        graph.add(jLabel4);
        jLabel4.setBounds(330, 70, 170, 40);

        graph1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph1.setForeground(new java.awt.Color(255, 255, 255));
        graph1.setLayout(null);
        graph.add(graph1);
        graph1.setBounds(20, 140, 500, 400);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        tb1.setBackground(new java.awt.Color(255, 255, 255));
        tb1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        tb1.setForeground(new java.awt.Color(0, 0, 0));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "x", "f(x)"
            }
        ));
        tb1.setEnabled(false);
        tb1.setFocusable(false);
        tb1.getTableHeader().setResizingAllowed(false);
        tb1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tb1);

        graph.add(jScrollPane2);
        jScrollPane2.setBounds(540, 140, 560, 400);

        jButton1.setBackground(new java.awt.Color(225, 221, 191));
        jButton1.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("CALCULATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        graph.add(jButton1);
        jButton1.setBounds(760, 10, 140, 40);

        background.add(graph);
        graph.setBounds(10, 10, 1120, 550);

        regula.setBackground(new java.awt.Color(255, 151, 147));
        regula.setLayout(null);

        tbl4.setBackground(new java.awt.Color(255, 255, 255));
        tbl4.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tbl4.setForeground(new java.awt.Color(0, 0, 0));
        tbl4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xU", "xR", "f(xR)", "Error"
            }
        ));
        tbl4.setEnabled(false);
        tbl4.setFocusable(false);
        tbl4.getTableHeader().setResizingAllowed(false);
        tbl4.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tbl4);

        regula.add(jScrollPane5);
        jScrollPane5.setBounds(420, 140, 690, 400);

        graph4.setBackground(new java.awt.Color(255, 255, 255));
        graph4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph4.setForeground(new java.awt.Color(0, 0, 0));
        graph4.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph4Layout = new javax.swing.GroupLayout(graph4);
        graph4.setLayout(graph4Layout);
        graph4Layout.setHorizontalGroup(
            graph4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph4Layout.setVerticalGroup(
            graph4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        regula.add(graph4);
        graph4.setBounds(10, 140, 400, 400);

        rootR.setBackground(new java.awt.Color(222, 171, 176));
        rootR.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        rootR.setForeground(new java.awt.Color(255, 255, 255));
        rootR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        rootR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootRActionPerformed(evt);
            }
        });
        regula.add(rootR);
        rootR.setBounds(500, 80, 310, 40);

        jLabel14.setBackground(new java.awt.Color(74, 120, 125));
        jLabel14.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Approximate Root:");
        regula.add(jLabel14);
        jLabel14.setBounds(320, 80, 190, 40);

        jLabel15.setBackground(new java.awt.Color(74, 120, 125));
        jLabel15.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Equation:");
        regula.add(jLabel15);
        jLabel15.setBounds(210, 20, 130, 40);

        equationR.setBackground(new java.awt.Color(222, 171, 176));
        equationR.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        equationR.setForeground(new java.awt.Color(255, 255, 255));
        equationR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        equationR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationRActionPerformed(evt);
            }
        });
        equationR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equationRKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                equationRKeyTyped(evt);
            }
        });
        regula.add(equationR);
        equationR.setBounds(320, 20, 190, 40);

        jLabel16.setBackground(new java.awt.Color(74, 120, 125));
        jLabel16.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("xL");
        regula.add(jLabel16);
        jLabel16.setBounds(520, 20, 30, 40);

        xl1.setBackground(new java.awt.Color(222, 171, 176));
        xl1.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xl1.setForeground(new java.awt.Color(255, 255, 255));
        xl1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xl1ActionPerformed(evt);
            }
        });
        xl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xl1KeyTyped(evt);
            }
        });
        regula.add(xl1);
        xl1.setBounds(560, 20, 80, 40);

        jLabel17.setBackground(new java.awt.Color(74, 120, 125));
        jLabel17.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("xU");
        regula.add(jLabel17);
        jLabel17.setBounds(650, 20, 40, 40);

        xU2.setBackground(new java.awt.Color(222, 171, 176));
        xU2.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xU2.setForeground(new java.awt.Color(255, 255, 255));
        xU2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xU2ActionPerformed(evt);
            }
        });
        xU2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xU2KeyTyped(evt);
            }
        });
        regula.add(xU2);
        xU2.setBounds(700, 20, 90, 40);

        jButton12.setBackground(new java.awt.Color(225, 221, 191));
        jButton12.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 102, 102));
        jButton12.setText("Calculate");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        regula.add(jButton12);
        jButton12.setBounds(820, 20, 140, 40);

        background.add(regula);
        regula.setBounds(10, 10, 1120, 550);

        fixed.setBackground(new java.awt.Color(255, 151, 147));
        fixed.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Equation:");
        fixed.add(jLabel18);
        jLabel18.setBounds(210, 10, 130, 40);

        equationF.setBackground(new java.awt.Color(222, 171, 176));
        equationF.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        equationF.setForeground(new java.awt.Color(255, 255, 255));
        equationF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        equationF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationFActionPerformed(evt);
            }
        });
        equationF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equationFKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                equationFKeyTyped(evt);
            }
        });
        fixed.add(equationF);
        equationF.setBounds(310, 10, 250, 40);

        jLabel19.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("xL");
        fixed.add(jLabel19);
        jLabel19.setBounds(590, 10, 30, 40);

        x1.setBackground(new java.awt.Color(222, 171, 176));
        x1.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        x1.setForeground(new java.awt.Color(255, 255, 255));
        x1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        x1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x1KeyTyped(evt);
            }
        });
        fixed.add(x1);
        x1.setBounds(630, 10, 100, 40);

        rootF.setEditable(false);
        rootF.setBackground(new java.awt.Color(222, 171, 176));
        rootF.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        rootF.setForeground(new java.awt.Color(255, 255, 255));
        rootF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        rootF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootFActionPerformed(evt);
            }
        });
        fixed.add(rootF);
        rootF.setBounds(510, 70, 190, 40);

        jLabel20.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Approximate Root:");
        fixed.add(jLabel20);
        jLabel20.setBounds(330, 70, 170, 40);

        graph5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph5.setForeground(new java.awt.Color(255, 255, 255));
        graph5.setLayout(null);
        fixed.add(graph5);
        graph5.setBounds(20, 140, 500, 400);

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setForeground(new java.awt.Color(0, 0, 0));

        tbl5.setBackground(new java.awt.Color(255, 255, 255));
        tbl5.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        tbl5.setForeground(new java.awt.Color(0, 0, 0));
        tbl5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "x0", "f(x0)", "Error"
            }
        ));
        tbl5.setEnabled(false);
        tbl5.setFocusable(false);
        tbl5.getTableHeader().setResizingAllowed(false);
        tbl5.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tbl5);

        fixed.add(jScrollPane6);
        jScrollPane6.setBounds(540, 140, 560, 400);

        jButton4.setBackground(new java.awt.Color(225, 221, 191));
        jButton4.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setText("CALCULATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fixed.add(jButton4);
        jButton4.setBounds(760, 10, 140, 40);

        background.add(fixed);
        fixed.setBounds(10, 10, 1120, 550);

        Newton.setBackground(new java.awt.Color(255, 151, 147));
        Newton.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Equation:");
        Newton.add(jLabel21);
        jLabel21.setBounds(210, 10, 130, 40);

        equationN.setBackground(new java.awt.Color(222, 171, 176));
        equationN.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        equationN.setForeground(new java.awt.Color(255, 255, 255));
        equationN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        equationN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationNActionPerformed(evt);
            }
        });
        equationN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equationNKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                equationNKeyTyped(evt);
            }
        });
        Newton.add(equationN);
        equationN.setBounds(310, 10, 250, 40);

        jLabel22.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("xL");
        Newton.add(jLabel22);
        jLabel22.setBounds(590, 10, 30, 40);

        x2.setBackground(new java.awt.Color(222, 171, 176));
        x2.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        x2.setForeground(new java.awt.Color(255, 255, 255));
        x2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x2ActionPerformed(evt);
            }
        });
        x2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                x2KeyTyped(evt);
            }
        });
        Newton.add(x2);
        x2.setBounds(620, 10, 100, 40);

        rootN.setEditable(false);
        rootN.setBackground(new java.awt.Color(222, 171, 176));
        rootN.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        rootN.setForeground(new java.awt.Color(255, 255, 255));
        rootN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        rootN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootNActionPerformed(evt);
            }
        });
        Newton.add(rootN);
        rootN.setBounds(510, 70, 190, 40);

        jLabel23.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Approximate Root:");
        Newton.add(jLabel23);
        jLabel23.setBounds(330, 70, 170, 40);

        graph6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph6.setForeground(new java.awt.Color(255, 255, 255));
        graph6.setLayout(null);
        Newton.add(graph6);
        graph6.setBounds(20, 140, 500, 400);

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setForeground(new java.awt.Color(0, 0, 0));

        tbl6.setBackground(new java.awt.Color(255, 255, 255));
        tbl6.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 12)); // NOI18N
        tbl6.setForeground(new java.awt.Color(0, 0, 0));
        tbl6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "x0", "f(x0)", "x1", "f(x1)", "Error"
            }
        ));
        tbl6.setEnabled(false);
        tbl6.setFocusable(false);
        tbl6.getTableHeader().setResizingAllowed(false);
        tbl6.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tbl6);

        Newton.add(jScrollPane7);
        jScrollPane7.setBounds(540, 140, 560, 400);

        jButton13.setBackground(new java.awt.Color(225, 221, 191));
        jButton13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 102, 102));
        jButton13.setText("CALCULATE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Newton.add(jButton13);
        jButton13.setBounds(760, 10, 140, 40);

        background.add(Newton);
        Newton.setBounds(10, 10, 1120, 550);

        secant.setBackground(new java.awt.Color(255, 151, 147));
        secant.setLayout(null);

        tbl7.setBackground(new java.awt.Color(255, 255, 255));
        tbl7.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        tbl7.setForeground(new java.awt.Color(0, 0, 0));
        tbl7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteration", "xL", "xR", "xU", "f(xL)", "f(xU)", "Error"
            }
        ));
        tbl7.setEnabled(false);
        tbl7.setFocusable(false);
        tbl7.getTableHeader().setResizingAllowed(false);
        tbl7.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tbl7);

        secant.add(jScrollPane8);
        jScrollPane8.setBounds(420, 140, 690, 400);

        graph7.setBackground(new java.awt.Color(255, 255, 255));
        graph7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        graph7.setForeground(new java.awt.Color(0, 0, 0));
        graph7.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout graph7Layout = new javax.swing.GroupLayout(graph7);
        graph7.setLayout(graph7Layout);
        graph7Layout.setHorizontalGroup(
            graph7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        graph7Layout.setVerticalGroup(
            graph7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        secant.add(graph7);
        graph7.setBounds(10, 140, 400, 400);

        rootS.setBackground(new java.awt.Color(222, 171, 176));
        rootS.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        rootS.setForeground(new java.awt.Color(255, 255, 255));
        rootS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        rootS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootSActionPerformed(evt);
            }
        });
        secant.add(rootS);
        rootS.setBounds(500, 80, 310, 40);

        jLabel24.setBackground(new java.awt.Color(74, 120, 125));
        jLabel24.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Approximate Root:");
        secant.add(jLabel24);
        jLabel24.setBounds(320, 80, 190, 40);

        jLabel25.setBackground(new java.awt.Color(74, 120, 125));
        jLabel25.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Equation:");
        secant.add(jLabel25);
        jLabel25.setBounds(210, 20, 130, 40);

        equationS.setBackground(new java.awt.Color(222, 171, 176));
        equationS.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        equationS.setForeground(new java.awt.Color(255, 255, 255));
        equationS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        equationS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equationSActionPerformed(evt);
            }
        });
        equationS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                equationSKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                equationSKeyTyped(evt);
            }
        });
        secant.add(equationS);
        equationS.setBounds(320, 20, 190, 40);

        jLabel26.setBackground(new java.awt.Color(74, 120, 125));
        jLabel26.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("xL");
        secant.add(jLabel26);
        jLabel26.setBounds(520, 20, 30, 40);

        xl2.setBackground(new java.awt.Color(222, 171, 176));
        xl2.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xl2.setForeground(new java.awt.Color(255, 255, 255));
        xl2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xl2ActionPerformed(evt);
            }
        });
        xl2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xl2KeyTyped(evt);
            }
        });
        secant.add(xl2);
        xl2.setBounds(560, 20, 80, 40);

        jLabel27.setBackground(new java.awt.Color(74, 120, 125));
        jLabel27.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("xU");
        secant.add(jLabel27);
        jLabel27.setBounds(650, 20, 40, 40);

        xu2.setBackground(new java.awt.Color(222, 171, 176));
        xu2.setFont(new java.awt.Font("Swis721 LtEx BT", 0, 16)); // NOI18N
        xu2.setForeground(new java.awt.Color(255, 255, 255));
        xu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        xu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xu2ActionPerformed(evt);
            }
        });
        xu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xu2KeyTyped(evt);
            }
        });
        secant.add(xu2);
        xu2.setBounds(700, 20, 90, 40);

        jButton14.setBackground(new java.awt.Color(225, 221, 191));
        jButton14.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 102, 102));
        jButton14.setText("Calculate");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        secant.add(jButton14);
        jButton14.setBounds(820, 20, 140, 40);

        background.add(secant);
        secant.setBounds(10, 10, 1120, 550);

        jPanel1.add(background);
        background.setBounds(20, 110, 1140, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eqtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqtActionPerformed

    private void eqtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eqtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_eqtKeyPressed

    private void eqtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eqtKeyTyped
    
    }//GEN-LAST:event_eqtKeyTyped

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_aKeyTyped

    private void approRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_approRootActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(true);
     regula.setVisible(false);
     fixed.setVisible(false);
     Newton.setVisible(false);
     secant.setVisible(false);
     
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();
     
      // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tbl3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();
//        clear the regula
        DefaultTableModel model3 = (DefaultTableModel) tbl4.getModel();
        equationR.setText("");
        lb.setText("");
        xU2.setText("");
        rootR.setText("");
        model3.setRowCount(0);
        graph4.removeAll();
        graph4.revalidate();
        graph4.repaint();
        
        //clear the fixed
        DefaultTableModel model4 = (DefaultTableModel) tbl5.getModel();
        equationF.setText("");
        x1.setText("");
        rootF.setText("");
        model4.setRowCount(0);
        graph5.removeAll();
        graph5.revalidate();
        graph5.repaint();
        
        // clear the newton
        DefaultTableModel model5 = (DefaultTableModel) tbl6.getModel();
        equationN.setText("");
        x2.setText("");
        rootN.setText("");
        model5.setRowCount(0);
        graph6.removeAll();
        graph6.revalidate();
        graph6.repaint();
        
         // clear the secant
        DefaultTableModel model6 = (DefaultTableModel) tbl7.getModel();
        equationS.setText("");
        xl2.setText("");
        xu2.setText("");
        rootS.setText("");
        model6.setRowCount(0);
        graph7.removeAll();
        graph7.revalidate();
        graph7.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//graph
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);
        String eqStr = eqt.getText().replaceAll("\\s", "");
        double valX = Double.parseDouble(a.getText());
        DecimalFormat format = new DecimalFormat("#.#####");

        ArrayList<Object[]> dataList = new ArrayList<>();

        double prevY = evaluateFunc(eqStr, valX);
        String decX = format.format(valX);
        String decY = format.format(prevY);
        dataList.add(new Object[]{decX, decY});

        double step = 0.2;
        double currX = valX + step;
        double currY = evaluateFunc(eqStr, currX);
        boolean signChange = false;

        double rootVal = Double.NaN;
        
        
    try {

        while (!signChange) {
            decX = format.format(currX);
            decY = format.format(currY);
            dataList.add(new Object[]{decX, decY});
            model.setRowCount(0);

            for (Object[] row : dataList) {
                model.addRow(row);
            }
             int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tb1.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tb1.setSelectionBackground(Color.YELLOW);
            }

            if (prevY * currY < 0) {
                // Find the root directly here
                double tolerance = 0.001;
                double root = 0;
                double lowerBound = currX - step;
                double upperBound = currX;

                do {
                    root = (lowerBound * evaluateFunc(eqStr, upperBound) - upperBound * evaluateFunc(eqStr, lowerBound)) 
                            / (evaluateFunc(eqStr, upperBound) - evaluateFunc(eqStr, lowerBound));

                    double fA = evaluateFunc(eqStr, lowerBound);
                    double fC = evaluateFunc(eqStr, root);

                    if (fC == 0.0) {
                        break;
                    } else if (fA * fC < 0) {
                        upperBound = root;
                    } else {
                        lowerBound = root;
                    }
                } while (Math.abs(upperBound - lowerBound) > tolerance);

                rootVal = root;
                approRoot.setText(format.format(rootVal));
             
                signChange = true; // Set signChange to true to exit the loop
                
                XYSeries series = new XYSeries("Function");

            // Determine the range of x values based on the root and function behavior
            double minX = rootVal - 10; // Adjust as needed
            double maxX = rootVal + 10; // Adjust as needed

            // Set up the range of y-values
            double minY = Double.MAX_VALUE;
            double maxY = -Double.MAX_VALUE;
            double steps = 0.1; // Define the step size

            for (double x = minX; x <= maxX; x += steps) {
                double y = evaluateFunc(eqt.getText(), x);
                series.add(x, y);

                // Update min and max y values
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            // Set up the range of y-values
            double yPadding = (maxY - minY) * 0.1;
            minY -= yPadding;
            maxY += yPadding;

            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(series);

            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Graph",
                    "X",
                    "f(X)",
                    dataset
            );
            chart.setBackgroundPaint(Color.WHITE);

            XYPlot plot = (XYPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

            // Customize the appearance of the axes
            plot.setDomainZeroBaselineVisible(true);
            plot.setRangeZeroBaselineVisible(true);
            plot.setDomainZeroBaselinePaint(Color.BLACK);
            plot.setRangeZeroBaselinePaint(Color.BLACK);

            plot.getRenderer().setSeriesPaint(0, Color.BLUE);

            XYSeries rootSeries = new XYSeries("Root");
            rootSeries.add(root, evaluateFunc(eqt.getText(), root));

            XYSeriesCollection rootDataset = new XYSeriesCollection();
            rootDataset.addSeries(rootSeries);
            plot.setDataset(1, rootDataset);
            plot.mapDatasetToDomainAxis(1, 0);
            plot.mapDatasetToRangeAxis(1, 0);
            XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
            renderer.setSeriesPaint(0, Color.RED);
            plot.setRenderer(1, renderer);

            // Set the range of the axes
            plot.getDomainAxis().setRange(minX, maxX);
            plot.getRangeAxis().setRange(minY, maxY);

            // Create ChartPanel with panning enabled
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setMouseWheelEnabled(true);
            chartPanel.setDomainZoomable(true);
            chartPanel.setRangeZoomable(true);
            chartPanel.setPreferredSize(new Dimension(660, 210));

            graph1.setLayout(new BorderLayout());
            graph1.removeAll();
            graph1.add(chartPanel, BorderLayout.CENTER);
            graph1.revalidate();
            graph1.repaint();
            } else {
                prevY = currY;
                currX += step;
                currY = evaluateFunc(eqStr, currX);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     bisection.setVisible(false);
     incremental.setVisible(true);
     graph.setVisible(false);
     regula.setVisible(false);
     fixed.setVisible(false);
     Newton.setVisible(false);
     secant.setVisible(false);
     
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
      // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tbl3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();
        
       // clear the regula
        DefaultTableModel model3 = (DefaultTableModel) tbl4.getModel();
        equationR.setText("");
        lb.setText("");
        xU2.setText("");
        rootR.setText("");
        model3.setRowCount(0);
        graph4.removeAll();
        graph4.revalidate();
        graph4.repaint();
       
          // clear the fixed
        DefaultTableModel model4 = (DefaultTableModel) tbl5.getModel();
        equationF.setText("");
        x1.setText("");
        rootF.setText("");
        model4.setRowCount(0);
        graph5.removeAll();
        graph5.revalidate();
        graph5.repaint();
        
        // clear the newton
        DefaultTableModel model5 = (DefaultTableModel) tbl6.getModel();
        equationN.setText("");
        x2.setText("");
        rootN.setText("");
        model5.setRowCount(0);
        graph6.removeAll();
        graph6.revalidate();
        graph6.repaint();
        
         // clear the secant
        DefaultTableModel model6 = (DefaultTableModel) tbl7.getModel();
        equationS.setText("");
        xl2.setText("");
        xu2.setText("");
        rootS.setText("");
        model6.setRowCount(0);
        graph7.removeAll();
        graph7.revalidate();
        graph7.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void imEqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imEqtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imEqtActionPerformed

    private void imEqtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imEqtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_imEqtKeyPressed

    private void imEqtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imEqtKeyTyped
        char a = evt.getKeyChar();
        if (!(Character.isDigit(a) || a == 'x' || a == '+' || a == '-' || a == '^' || a == 'e' || a == KeyEvent.VK_BACK_SPACE || a == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_imEqtKeyTyped

    private void lbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbActionPerformed

    private void lbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_lbKeyTyped

    private void deltaXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deltaXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deltaXActionPerformed

    private void deltaXKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deltaXKeyTyped

    }//GEN-LAST:event_deltaXKeyTyped

    private void imRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imRootActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//incremental
        DecimalFormat format = new DecimalFormat("#.#####");
        ArrayList<Object[]> dataList = new ArrayList<>();
        double marginE = 0.0001;
        double valL = Double.parseDouble(lb.getText());
        double delta = Double.parseDouble(deltaX.getText());
        double root = 0;
        double valU = valL + delta;
        int iterCount = 0;
        double prevU = 0; 
        double error = Math.abs(valU - prevU) / Math.abs(valU) * 100;
        
        try {
        while (error > marginE) {
            iterCount++;
            double fxL = evaluateFunc(imEqt.getText(), valL);
            double fxU = evaluateFunc(imEqt.getText(), valU);
            double product = fxL * fxU;

            String lowerbound = format.format(valL);
            String deltax = format.format(delta);
            String upperbound = format.format(valU);
            String FLowerB = format.format(fxL);
            String FUpperB = format.format(fxU);
            String Error;

            if (iterCount == 1) {
                Error = "--";
            } else {
                double currentError = Math.abs(valU - prevU) / Math.abs(valU) * 100;
                Error = format.format(currentError);
            }
            
            String sign;
            if (product < 0) {
                sign = "<0";
            } else if (product > 0) {
                sign = ">0";
            } else {
                sign = "0";
            }

            Object[] rowData = {iterCount, lowerbound, deltax,
                    upperbound, FLowerB, FUpperB, Error, sign};
            dataList.add(rowData);

            if (error < marginE && fxL * fxU == 0) {
                root = valU;
                break;
            }

            if (fxL * fxU < 0) {
                valL = valL;
                delta /= 10.0;
                root = valU;
            } else if (fxL * fxU > 0){
                valL = valU;
                delta = delta;
                root = valU;
            }

            prevU = valU;
            valU = valL + delta;
            error = Math.abs(valU - prevU) / Math.abs(valU) * 100;
        }

        DefaultTableModel model = (DefaultTableModel) tbl2.getModel();
        model.setRowCount(0);

        for (Object[] row : dataList) {
            model.addRow(row);
        }
         int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tbl2.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tbl2.setSelectionBackground(Color.YELLOW);
            }
        if (root != 0) {
            String decRoot = format.format(root);
            imRoot.setText(decRoot);
            XYSeries series = new XYSeries("Function");

            // Determine the range of x values based on the root and function behavior
            double minX = root - 10; // Adjust as needed
            double maxX = root + 10; // Adjust as needed

            // Set up the range of y-values
            double minY = Double.MAX_VALUE;
            double maxY = -Double.MAX_VALUE;
            double step = 0.1; // Define the step size

            for (double x = minX; x <= maxX; x += step) {
                double y = evaluateFunc(imEqt.getText(), x);
                series.add(x, y);

                // Update min and max y values
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            // Set up the range of y-values
            double yPadding = (maxY - minY) * 0.1;
            minY -= yPadding;
            maxY += yPadding;

            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(series);

            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Graph",
                    "X",
                    "f(X)",
                    dataset
            );
            chart.setBackgroundPaint(Color.WHITE);

            XYPlot plot = (XYPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

            // Customize the appearance of the axes
            plot.setDomainZeroBaselineVisible(true);
            plot.setRangeZeroBaselineVisible(true);
            plot.setDomainZeroBaselinePaint(Color.BLACK);
            plot.setRangeZeroBaselinePaint(Color.BLACK);

            plot.getRenderer().setSeriesPaint(0, Color.BLUE);

            XYSeries rootSeries = new XYSeries("Root");
            rootSeries.add(root, evaluateFunc(imEqt.getText(), root));

            XYSeriesCollection rootDataset = new XYSeriesCollection();
            rootDataset.addSeries(rootSeries);
            plot.setDataset(1, rootDataset);
            plot.mapDatasetToDomainAxis(1, 0);
            plot.mapDatasetToRangeAxis(1, 0);
            XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
            renderer.setSeriesPaint(0, Color.RED);
            plot.setRenderer(1, renderer);

            // Set the range of the axes
            plot.getDomainAxis().setRange(minX, maxX);
            plot.getRangeAxis().setRange(minY, maxY);

            // Create ChartPanel with panning enabled
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setMouseWheelEnabled(true);
            chartPanel.setDomainZoomable(true);
            chartPanel.setRangeZoomable(true);
            chartPanel.setPreferredSize(new Dimension(660, 210));

            graph2.setLayout(new BorderLayout());
            graph2.removeAll();
            graph2.add(chartPanel, BorderLayout.CENTER);
            graph2.revalidate();
            graph2.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "No root found within the specified range.");
        }
    } catch (Exception ex) {
    ex.printStackTrace();
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void bmRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmRootActionPerformed

    private void bmEqtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmEqtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmEqtActionPerformed

    private void bmEqtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bmEqtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmEqtKeyPressed

    private void bmEqtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bmEqtKeyTyped
       
    }//GEN-LAST:event_bmEqtKeyTyped

    private void xlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xlActionPerformed

    private void xlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xlKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_xlKeyTyped

    private void xuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xuActionPerformed

    private void xuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xuKeyTyped
        /*  char a = evt.getKeyChar();
        if(!(Character.isDigit(a) || a=='-' || (a==KeyEvent.VK_BACK_SPACE)||a==KeyEvent.VK_DELETE)){
            evt.consume();
        }*/
    }//GEN-LAST:event_xuKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //bisection
     IterationCount = 1;
     DecimalFormat decimalFormat = new DecimalFormat("#.####");
     ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double xL = Double.parseDouble(xl.getText());
            double xU = Double.parseDouble(xu.getText());
            double roott = 0;
            double xM = (xL + xU) / 2.0;
            int iterations = 0;
            double prevXM = 0; 

            double Error = Math.abs(xM - prevXM) / Math.abs(xM) * 100;
            
      try {
        if (bmEqt.getText().isEmpty() || xl.getText().isEmpty() || xu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
        } else {
            while (Error > MarginE) {
                iterations++;
                double fxL = evaluateFunc(bmEqt.getText(), xL);
                double fxU = evaluateFunc(bmEqt.getText(), xU);
                double fxM = evaluateFunc(bmEqt.getText(), xM);

                String lowerbound = decimalFormat.format(xL);
                String upperbound = decimalFormat.format(xU);
                String xAr = decimalFormat.format(xM);
                String FLowerB = decimalFormat.format(fxL);
                String FUpperB = decimalFormat.format(fxU);
                String decimalnumERROR;

                if (iterations == 1) {
                    decimalnumERROR = " ";
                } else {
                    double currentError = Math.abs(xM - prevXM) / Math.abs(xM) * 100;
                    decimalnumERROR = decimalFormat.format(currentError);
                }

                Object[] rowData = {iterations, lowerbound, xAr,
                        upperbound, FLowerB, FUpperB, decimalnumERROR};
                data.add(rowData);

                if (Error < MarginE || fxL * fxM == 0) {
                    roott = xM;
                    break;
                } else if (fxL * fxM < 0) {
                    xL = xL;
                    xU = xM;
                    roott = xU;
                } else if (fxL * fxM > 0){
                    xL = xM;
                    roott = xL;
                }

                prevXM = xM;
                xM = (xL + xU) / 2;
                Error = Math.abs(xM - prevXM) / Math.abs(xM) * 100; 
            }

            DefaultTableModel model = (DefaultTableModel) tbl3.getModel();
            model.setRowCount(0);

            for (Object[] row : data) {
                model.addRow(row);
            }
             int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tbl3.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tbl3.setSelectionBackground(Color.YELLOW);
            }
            
            if (roott != 0) {
                String decimalRoot = decimalFormat.format(roott);
                bmRoot.setText(decimalRoot);
                 XYSeries series = new XYSeries("Function");

            // Determine the range of x values based on the root and function behavior
            double minX = roott - 10; // Adjust as needed
            double maxX = roott + 10; // Adjust as needed

            // Set up the range of y-values
            double minY = Double.MAX_VALUE;
            double maxY = -Double.MAX_VALUE;
            double step = 0.1; // Define the step size

            for (double x = minX; x <= maxX; x += step) {
                double y = evaluateFunc(bmEqt.getText(), x);
                series.add(x, y);

                // Update min and max y values
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            // Set up the range of y-values
            double yPadding = (maxY - minY) * 0.1;
            minY -= yPadding;
            maxY += yPadding;

            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(series);

            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Graph",
                    "X",
                    "f(X)",
                    dataset
            );
            chart.setBackgroundPaint(Color.WHITE);

            XYPlot plot = (XYPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

            // Customize the appearance of the axes
            plot.setDomainZeroBaselineVisible(true);
            plot.setRangeZeroBaselineVisible(true);
            plot.setDomainZeroBaselinePaint(Color.BLACK);
            plot.setRangeZeroBaselinePaint(Color.BLACK);

            plot.getRenderer().setSeriesPaint(0, Color.BLUE);

            XYSeries rootSeries = new XYSeries("Root");
            rootSeries.add(roott, evaluateFunc(bmEqt.getText(), roott));

            XYSeriesCollection rootDataset = new XYSeriesCollection();
            rootDataset.addSeries(rootSeries);
            plot.setDataset(1, rootDataset);
            plot.mapDatasetToDomainAxis(1, 0);
            plot.mapDatasetToRangeAxis(1, 0);
            XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
            renderer.setSeriesPaint(0, Color.RED);
            plot.setRenderer(1, renderer);

            // Set the range of the axes
            plot.getDomainAxis().setRange(minX, maxX);
            plot.getRangeAxis().setRange(minY, maxY);

            // Create ChartPanel with panning enabled
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setMouseWheelEnabled(true);
            chartPanel.setDomainZoomable(true);
            chartPanel.setRangeZoomable(true);
            chartPanel.setPreferredSize(new Dimension(660, 210));

            graph3.setLayout(new BorderLayout());
            graph3.removeAll();
            graph3.add(chartPanel, BorderLayout.CENTER);
            graph3.revalidate();
            graph3.repaint();

            } else {
                JOptionPane.showMessageDialog(this, "No root found within the specified range.");
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
   bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(false);
     regula.setVisible(false);
     fixed.setVisible(false);
     Newton.setVisible(false);
     secant.setVisible(true);
     
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();
     
      // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tbl3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();
        
       // clear the regula
        DefaultTableModel model3 = (DefaultTableModel) tbl4.getModel();
        equationR.setText("");
        lb.setText("");
        xU2.setText("");
        rootR.setText("");
        model3.setRowCount(0);
        graph4.removeAll();
        graph4.revalidate();
        graph4.repaint();
       
          // clear the fixed
        DefaultTableModel model4 = (DefaultTableModel) tbl5.getModel();
        equationF.setText("");
        x1.setText("");
        rootF.setText("");
        model4.setRowCount(0);
        graph5.removeAll();
        graph5.revalidate();
        graph5.repaint();
        
        // clear the newton
        DefaultTableModel model5 = (DefaultTableModel) tbl6.getModel();
        equationN.setText("");
        x2.setText("");
        rootN.setText("");
        model5.setRowCount(0);
        graph6.removeAll();
        graph6.revalidate();
        graph6.repaint();
          
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
     bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(false);
     regula.setVisible(false);
     fixed.setVisible(true);
     Newton.setVisible(false);
     secant.setVisible(false);
     
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();
     
      // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tbl3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();
        
       // clear the regula
        DefaultTableModel model3 = (DefaultTableModel) tbl4.getModel();
        equationR.setText("");
        lb.setText("");
        xU2.setText("");
        rootR.setText("");
        model3.setRowCount(0);
        graph4.removeAll();
        graph4.revalidate();
        graph4.repaint();
       
        
        // clear the newton
        DefaultTableModel model5 = (DefaultTableModel) tbl6.getModel();
        equationN.setText("");
        x2.setText("");
        rootN.setText("");
        model5.setRowCount(0);
        graph6.removeAll();
        graph6.revalidate();
        graph6.repaint();
        
         // clear the secant
        DefaultTableModel model6 = (DefaultTableModel) tbl7.getModel();
        equationS.setText("");
        xl2.setText("");
        xu2.setText("");
        rootS.setText("");
        model6.setRowCount(0);
        graph7.removeAll();
        graph7.revalidate();
        graph7.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(false);
     regula.setVisible(false);
     fixed.setVisible(false);
     Newton.setVisible(true);
     secant.setVisible(false);
     
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();
     
      // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tbl3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();
        
       // clear the regula
        DefaultTableModel model3 = (DefaultTableModel) tbl4.getModel();
        equationR.setText("");
        lb.setText("");
        xU2.setText("");
        rootR.setText("");
        model3.setRowCount(0);
        graph4.removeAll();
        graph4.revalidate();
        graph4.repaint();
       
          // clear the fixed
        DefaultTableModel model4 = (DefaultTableModel) tbl5.getModel();
        equationF.setText("");
        x1.setText("");
        rootF.setText("");
        model4.setRowCount(0);
        graph5.removeAll();
        graph5.revalidate();
        graph5.repaint();
        
         // clear the secant
        DefaultTableModel model6 = (DefaultTableModel) tbl7.getModel();
        equationS.setText("");
        xl2.setText("");
        xu2.setText("");
        rootS.setText("");
        model6.setRowCount(0);
        graph7.removeAll();
        graph7.revalidate();
        graph7.repaint();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      bisection.setVisible(true);
     incremental.setVisible(false);
     graph.setVisible(false);
     regula.setVisible(false);
     fixed.setVisible(false);
     Newton.setVisible(false);
     secant.setVisible(false);
     
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();
        
       // clear the regula
        DefaultTableModel model3 = (DefaultTableModel) tbl4.getModel();
        equationR.setText("");
        lb.setText("");
        xU2.setText("");
        rootR.setText("");
        model3.setRowCount(0);
        graph4.removeAll();
        graph4.revalidate();
        graph4.repaint();
       
          // clear the fixed
        DefaultTableModel model4 = (DefaultTableModel) tbl5.getModel();
        equationF.setText("");
        x1.setText("");
        rootF.setText("");
        model4.setRowCount(0);
        graph5.removeAll();
        graph5.revalidate();
        graph5.repaint();
        
        // clear the newton
        DefaultTableModel model5 = (DefaultTableModel) tbl6.getModel();
        equationN.setText("");
        x2.setText("");
        rootN.setText("");
        model5.setRowCount(0);
        graph6.removeAll();
        graph6.revalidate();
        graph6.repaint();
        
         // clear the secant
        DefaultTableModel model6 = (DefaultTableModel) tbl7.getModel();
        equationS.setText("");
        xl2.setText("");
        xu2.setText("");
        rootS.setText("");
        model6.setRowCount(0);
        graph7.removeAll();
        graph7.revalidate();
        graph7.repaint();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
     bisection.setVisible(false);
     incremental.setVisible(false);
     graph.setVisible(false);
     regula.setVisible(true);
     fixed.setVisible(false);
     Newton.setVisible(false);
     secant.setVisible(false);
     
        
     //clear the graph panel
     DefaultTableModel model = (DefaultTableModel) tb1.getModel();
     eqt.setText("");
     a.setText("");
     approRoot.setText("");
     model.setRowCount(0);
     graph1.removeAll();
     graph1.revalidate();
     graph1.repaint();
     
     // clear the incremental
     DefaultTableModel model1 = (DefaultTableModel) tbl2.getModel();
     imEqt.setText("");
     lb.setText("");
     imRoot.setText("");
     model1.setRowCount(0);
     graph2.removeAll();
     graph2.revalidate();
     graph2.repaint();
     
      // clear the bisection
        DefaultTableModel model2 = (DefaultTableModel) tbl3.getModel();
        bmEqt.setText("");
        xl.setText("");
        xu.setText("");
        bmRoot.setText("");
        model2.setRowCount(0);
        graph3.removeAll();
        graph3.revalidate();
        graph3.repaint();
       
       
          // clear the fixed
        DefaultTableModel model4 = (DefaultTableModel) tbl5.getModel();
        equationF.setText("");
        x1.setText("");
        rootF.setText("");
        model4.setRowCount(0);
        graph5.removeAll();
        graph5.revalidate();
        graph5.repaint();
        
        // clear the newton
        DefaultTableModel model5 = (DefaultTableModel) tbl6.getModel();
        equationN.setText("");
        x2.setText("");
        rootN.setText("");
        model5.setRowCount(0);
        graph6.removeAll();
        graph6.revalidate();
        graph6.repaint();
        
         // clear the secant
        DefaultTableModel model6 = (DefaultTableModel) tbl7.getModel();
        equationS.setText("");
        xl2.setText("");
        xu2.setText("");
        rootS.setText("");
        model6.setRowCount(0);
        graph7.removeAll();
        graph7.revalidate();
        graph7.repaint();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void rootRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootRActionPerformed

    private void equationRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationRActionPerformed

    private void equationRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationRKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationRKeyPressed

    private void equationRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationRKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_equationRKeyTyped

    private void xl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xl1ActionPerformed

    private void xl1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xl1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xl1KeyTyped

    private void xU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xU2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xU2ActionPerformed

    private void xU2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xU2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xU2KeyTyped

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    try {
        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        if (equationR.getText().isEmpty() || xl1.getText().isEmpty() || xU2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double xL = Double.parseDouble(xl1.getText());
            double xU = Double.parseDouble(xU2.getText());
            double fxL, fxU, fxR, xR;
            int iterations = 0;
            double prevXU = 0;
            double Error = Double.MAX_VALUE;

            while (Error > MarginE) {
                iterations++;
                fxL = evaluateFunc(equationR.getText(), xL);
                fxU = evaluateFunc(equationR.getText(), xU);

                // Regula Falsi formula for finding next approximation
                xR = (fxU * xL - fxL * xU) / (fxU - fxL);
                fxR = evaluateFunc(equationR.getText(), xR);

                String decimalnumA = decimalFormat.format(xL);
                String decimalnumB = decimalFormat.format(xU);
                String decimalnumC = decimalFormat.format(xR);
                String decimalnumFC = decimalFormat.format(fxR);
                String decimalnumERROR;

                if (iterations == 1) {
                    decimalnumERROR = " ";
                } else {
                    double currentError = Math.abs(xR - prevXU) / Math.abs(xR) * 100;
                    decimalnumERROR = decimalFormat.format(currentError);
                }

                Object[] rowData = {iterations, decimalnumA, decimalnumB,
                        decimalnumC, decimalnumFC, decimalnumERROR};
                data.add(rowData);

                if (fxL * fxR < 0) {
                    xU = xR;
                    
                } else if (fxL * fxR > 0) {
                    xL = xR;
                }

                prevXU = xR;
                Error = Math.abs(fxR); // Error is now based on the value of f(xR)
            }

            DefaultTableModel model = (DefaultTableModel) tbl4.getModel();
            model.setRowCount(0);

            for (Object[] row : data) {
                model.addRow(row);
            }

            int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tbl4.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tbl4.setSelectionBackground(Color.YELLOW);
            }

            // Displaying the root, assuming it's the last computed xR
            String decimalRoot = decimalFormat.format(prevXU); // Assuming the last computed xR is the root
            rootR.setText(decimalRoot);
            
            XYSeries series = new XYSeries("Function");

            // Determine the range of x values based on the root and function behavior
            double minX = prevXU - 10; // Adjust as needed
            double maxX = prevXU + 10; // Adjust as needed

            // Set up the range of y-values
               double minY = Double.MAX_VALUE;
               double maxY = -Double.MAX_VALUE;;
            double step = 0.1; // Define the step size

            for (double x = minX; x <= maxX; x += step) {
                double y = evaluateFunc(equationR.getText(), x);
                series.add(x, y);

                // Update min and max y values
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            // Set up the range of y-values
            double yPadding = (maxY - minY) * 0.1;
            minY -= yPadding;
            maxY += yPadding;

            XYSeriesCollection dataset = new XYSeriesCollection();
            dataset.addSeries(series);

            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Graph",
                    "X",
                    "f(X)",
                    dataset
            );
            chart.setBackgroundPaint(Color.WHITE);

            XYPlot plot = (XYPlot) chart.getPlot();
            plot.setBackgroundPaint(Color.WHITE);
            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

            // Customize the appearance of the axes
            plot.setDomainZeroBaselineVisible(true);
            plot.setRangeZeroBaselineVisible(true);
            plot.setDomainZeroBaselinePaint(Color.BLACK);
            plot.setRangeZeroBaselinePaint(Color.BLACK);

            plot.getRenderer().setSeriesPaint(0, Color.BLUE);

            XYSeries rootSeries = new XYSeries("Root");
            rootSeries.add(prevXU, evaluateFunc(equationR.getText(), prevXU));

            XYSeriesCollection rootDataset = new XYSeriesCollection();
            rootDataset.addSeries(rootSeries);
            plot.setDataset(1, rootDataset);
            plot.mapDatasetToDomainAxis(1, 0);
            plot.mapDatasetToRangeAxis(1, 0);
            XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
            renderer.setSeriesPaint(0, Color.RED);
            plot.setRenderer(1, renderer);

            // Set the range of the axes
            plot.getDomainAxis().setRange(minX, maxX);
            plot.getRangeAxis().setRange(minY, maxY);

            // Create ChartPanel with panning enabled
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setMouseWheelEnabled(true);
            chartPanel.setDomainZoomable(true);
            chartPanel.setRangeZoomable(true);
            chartPanel.setPreferredSize(new Dimension(660, 210));

            graph4.setLayout(new BorderLayout());
            graph4.removeAll();
            graph4.add(chartPanel, BorderLayout.CENTER);
            graph4.revalidate();
            graph4.repaint();
        }
    } catch (NumberFormatException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers for lower and upper bounds.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void equationFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationFActionPerformed

    private void equationFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationFKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationFKeyPressed

    private void equationFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationFKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_equationFKeyTyped

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    private void x1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_x1KeyTyped

    private void rootFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootFActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("#.##############");
        if (equationF.getText().isEmpty() || x1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(x1.getText()); // Initial guess
            double x1;
            int iterations = 0;
            double error = Double.MAX_VALUE;

            while (error > MarginE) {
                iterations++;
                x1 = g(x0); // Fixed-point iteration: x1 = g(x0)
                
                System.out.println(x1);

                String decimalnumX0 = decimalFormat.format(x0);
                String decimalnumX1 = decimalFormat.format(x1);
                String decimalnumError;

                if (iterations == 1) {
                    decimalnumError = " ";
                } else {
                    double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                    error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                    decimalnumError = decimalFormat.format(error);
                }

                Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumError};
                data.add(rowData);

                x0 = x1;
            }

            DefaultTableModel model = (DefaultTableModel) tbl5.getModel();
            model.setRowCount(0);

            for (Object[] row : data) {
                model.addRow(row);
            }

            int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tbl5.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tbl5.setSelectionBackground(Color.YELLOW);
            }

            // Displaying the root, assuming it's the last computed x1
            String decimalRoot = decimalFormat.format(x0);
            rootF.setText(decimalRoot);
            XYSeries series = new XYSeries("Function");

    // Determine the range of x values based on the root and function behavior
    double minX = x0 - 10; // Adjust as needed
    double maxX = x0 + 10; // Adjust as needed

    // Set up the range of y-values
    double minY = Double.MAX_VALUE;
    double maxY = -Double.MAX_VALUE;
    double step = 0.1; // Define the step size

    for (double x = minX; x <= maxX; x += step) {
        double y = evaluateFunc(equationF.getText(), x);
        series.add(x, y);

        // Update min and max y values
        minY = Math.min(minY, y);
        maxY = Math.max(maxY, y);
    }

    // Set up the range of y-values
    double yPadding = (maxY - minY) * 0.1;
    minY -= yPadding;
    maxY += yPadding;

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Graph",
            "X",
            "f(X)",
            dataset
    );
    chart.setBackgroundPaint(Color.WHITE);

    XYPlot plot = (XYPlot) chart.getPlot();
    plot.setBackgroundPaint(Color.WHITE);
    plot.setDomainGridlinesVisible(true);
    plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
    plot.setRangeGridlinesVisible(true);
    plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

    // Customize the appearance of the axes
    plot.setDomainZeroBaselineVisible(true);
    plot.setRangeZeroBaselineVisible(true);
    plot.setDomainZeroBaselinePaint(Color.BLACK);
    plot.setRangeZeroBaselinePaint(Color.BLACK);

    plot.getRenderer().setSeriesPaint(0, Color.BLUE);

    XYSeries rootSeries = new XYSeries("Root");
    rootSeries.add(x0, evaluateFunc(equationF.getText(), x0));
    
    XYSeriesCollection rootDataset = new XYSeriesCollection();
    rootDataset.addSeries(rootSeries);
    plot.setDataset(1, rootDataset);
    plot.mapDatasetToDomainAxis(1, 0);
    plot.mapDatasetToRangeAxis(1, 0);
    XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
    renderer.setSeriesPaint(0, Color.RED);
    plot.setRenderer(1, renderer);

    // Set the range of the axes
    plot.getDomainAxis().setRange(minX, maxX);
    plot.getRangeAxis().setRange(minY, maxY);

    // Create ChartPanel with panning enabled
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setMouseWheelEnabled(true);
    chartPanel.setDomainZoomable(true);
    chartPanel.setRangeZoomable(true);
    chartPanel.setPreferredSize(new Dimension(660, 210));

    graph5.setLayout(new BorderLayout());
    graph5.removeAll();
    graph5.add(chartPanel, BorderLayout.CENTER);
    graph5.revalidate();
    graph5.repaint();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void equationNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationNActionPerformed

    private void equationNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationNKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationNKeyPressed

    private void equationNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationNKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_equationNKeyTyped

    private void x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x2ActionPerformed

    private void x2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_x2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_x2KeyTyped

    private void rootNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootNActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        if (equationN.getText().isEmpty() || x2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the data needed, Thank you!");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(x2.getText()); // Initial guess
            double fx0, fDashX0, x1, fx1;
            int iterations = 0;
            double error = Double.MAX_VALUE;

            while (error > MarginE) {
                iterations++;
                fx0 = evaluateFunc(equationN.getText(), x0);
                fDashX0 = differentiateFunction(equationN.getText(), x0);
                System.out.println(fDashX0);

                // Newton-Raphson formula for finding next approximation
                x1 = x0 - (fx0 / fDashX0);
                fx1 = evaluateFunc(equationN.getText(), x1);
                
                String decimalnumX0 = decimalFormat.format(x0);
                String decimalnumX1 = decimalFormat.format(x1);
                String decimalnumFX0 = decimalFormat.format(fx0);
                String decimalnumFX1 = decimalFormat.format(fx1);
                String decimalnumError;

                if (iterations == 1) {
                    decimalnumError = " ";
                } else {
                    double prevX0 = Double.parseDouble(data.get(iterations - 2)[1].toString());
                    error = Math.abs(x1 - prevX0) / Math.abs(x1) * 100;
                    decimalnumError = decimalFormat.format(error);
                }

                Object[] rowData = {iterations, decimalnumX0, decimalnumFX0, decimalnumX1, decimalnumFX1, decimalnumError};
                data.add(rowData);

                x0 = x1;
            }

            DefaultTableModel model = (DefaultTableModel) tbl6.getModel();
            model.setRowCount(0);

            for (Object[] row : data) {
                model.addRow(row);
            }

            int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tbl6.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tbl6.setSelectionBackground(Color.YELLOW);
            }

            // Displaying the root, assuming it's the last computed x1
            String decimalRoot = decimalFormat.format(x0);
            rootN.setText(decimalRoot);
             XYSeries series = new XYSeries("Function");

    // Determine the range of x values based on the root and function behavior
    double minX = x0 - 10; // Adjust as needed
    double maxX = x0 + 10; // Adjust as needed

    // Set up the range of y-values
    double minY = Double.MAX_VALUE;
    double maxY = -Double.MAX_VALUE;
    double step = 0.1; // Define the step size

    for (double x = minX; x <= maxX; x += step) {
        double y = evaluateFunc(equationN.getText(), x);
        series.add(x, y);

        // Update min and max y values
        minY = Math.min(minY, y);
        maxY = Math.max(maxY, y);
    }

    // Set up the range of y-values
    double yPadding = (maxY - minY) * 0.1;
    minY -= yPadding;
    maxY += yPadding;

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Graph",
            "X",
            "f(X)",
            dataset
    );
    chart.setBackgroundPaint(Color.WHITE);

    XYPlot plot = (XYPlot) chart.getPlot();
    plot.setBackgroundPaint(Color.WHITE);
    plot.setDomainGridlinesVisible(true);
    plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
    plot.setRangeGridlinesVisible(true);
    plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

    // Customize the appearance of the axes
    plot.setDomainZeroBaselineVisible(true);
    plot.setRangeZeroBaselineVisible(true);
    plot.setDomainZeroBaselinePaint(Color.BLACK);
    plot.setRangeZeroBaselinePaint(Color.BLACK);

    plot.getRenderer().setSeriesPaint(0, Color.BLUE);

    XYSeries rootSeries = new XYSeries("Root");
    rootSeries.add(x0, evaluateFunc(equationN.getText(), x0));
    
    XYSeriesCollection rootDataset = new XYSeriesCollection();
    rootDataset.addSeries(rootSeries);
    plot.setDataset(1, rootDataset);
    plot.mapDatasetToDomainAxis(1, 0);
    plot.mapDatasetToRangeAxis(1, 0);
    XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
    renderer.setSeriesPaint(0, Color.RED);
    plot.setRenderer(1, renderer);

    // Set the range of the axes
    plot.getDomainAxis().setRange(minX, maxX);
    plot.getRangeAxis().setRange(minY, maxY);

    // Create ChartPanel with panning enabled
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setMouseWheelEnabled(true);
    chartPanel.setDomainZoomable(true);
    chartPanel.setRangeZoomable(true);
    chartPanel.setPreferredSize(new Dimension(660, 210));

    graph6.setLayout(new BorderLayout());
    graph6.removeAll();
    graph6.add(chartPanel, BorderLayout.CENTER);
    graph6.revalidate();
    graph6.repaint();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void rootSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootSActionPerformed

    private void equationSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equationSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationSActionPerformed

    private void equationSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationSKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_equationSKeyPressed

    private void equationSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_equationSKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_equationSKeyTyped

    private void xl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xl2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xl2ActionPerformed

    private void xl2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xl2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xl2KeyTyped

    private void xu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xu2ActionPerformed

    private void xu2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xu2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_xu2KeyTyped

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
          DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        if (equationS.getText().isEmpty() || xl2.getText().isEmpty() || xu2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ENTER THE NECESSARY DATA NEEDED!");
        } else {
            ArrayList<Object[]> data = new ArrayList<>();
            double MarginE = 0.001;
            double x0 = Double.parseDouble(xl2.getText());
            double x1 = Double.parseDouble(xu2.getText());
            int iterations = 0;
            double roott = 0;
            double error = Double.MAX_VALUE; // Initialize error with a large value
            
            while (error > MarginE) {
                iterations++;
                double fx0 = evaluateFunc(equationS.getText(), x0);
                double fx1 = evaluateFunc(equationS.getText(), x1);
                double numerator = fx1 * (x0 - x1);
                double denominator = fx0 - fx1;
                double x2 = x1 - numerator / denominator;
                double fx2 = evaluateFunc(equationS.getText(), x2);

                // Update error based on the difference between x2 and x1
                error = Math.abs(x2 - x1);

                // Check if the error is within the acceptable range
                if (error <= MarginE) {
                    roott = x2; // Update the root
                    break; // Terminate the loop if error is within the acceptable range
                }

                // Update values for next iteration
                x0 = x1;
                x1 = x2;

                // Decimal formatting and adding data to the table
                String decimalnumX0 = decimalFormat.format(x0);
                String decimalnumX1 = decimalFormat.format(x1);
                String decimalnumX2 = decimalFormat.format(x2);
                String decimalnumFx0 = decimalFormat.format(fx0);
                String decimalnumFx1 = decimalFormat.format(fx1);
                String decimalnumFx2 = decimalFormat.format(fx2);
                String decimalnumE = decimalFormat.format(error);

                Object[] rowData = {iterations, decimalnumX0, decimalnumX1, decimalnumX2, decimalnumFx0, decimalnumFx1, decimalnumFx2, decimalnumE};
                data.add(rowData);
            }

            // Update table model with data
            DefaultTableModel model = (DefaultTableModel) tbl7.getModel();
            model.setRowCount(0);
            for (Object[] row : data) {
                model.addRow(row);
            }

            // Highlight the last row
            int lastRowIndex = model.getRowCount() - 1;
            if (lastRowIndex >= 0) {
                tbl7.addRowSelectionInterval(lastRowIndex, lastRowIndex);
                tbl7.setSelectionBackground(Color.YELLOW);
            }

            // Update the root value
            String decimalRoot = decimalFormat.format(roott);
            rootS.setText(decimalRoot);

            // Update the graph
             XYSeries series = new XYSeries("Function");

    // Determine the range of x values based on the root and function behavior
    double minX = roott - 10; // Adjust as needed
    double maxX = roott + 10; // Adjust as needed

    // Set up the range of y-values
    double minY = Double.MAX_VALUE;
    double maxY = -Double.MAX_VALUE;
    double step = 0.1; // Define the step size

    for (double x = minX; x <= maxX; x += step) {
        double y = evaluateFunc(equationS.getText(), x);
        series.add(x, y);

        // Update min and max y values
        minY = Math.min(minY, y);
        maxY = Math.max(maxY, y);
    }

    // Set up the range of y-values
    double yPadding = (maxY - minY) * 0.1;
    minY -= yPadding;
    maxY += yPadding;

    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);

    JFreeChart chart = ChartFactory.createXYLineChart(
            "Graph",
            "X",
            "f(X)",
            dataset
    );
    chart.setBackgroundPaint(Color.WHITE);

    XYPlot plot = (XYPlot) chart.getPlot();
    plot.setBackgroundPaint(Color.WHITE);
    plot.setDomainGridlinesVisible(true);
    plot.setDomainGridlinePaint(Color.LIGHT_GRAY);
    plot.setRangeGridlinesVisible(true);
    plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

    // Customize the appearance of the axes
    plot.setDomainZeroBaselineVisible(true);
    plot.setRangeZeroBaselineVisible(true);
    plot.setDomainZeroBaselinePaint(Color.BLACK);
    plot.setRangeZeroBaselinePaint(Color.BLACK);

    plot.getRenderer().setSeriesPaint(0, Color.BLUE);

    XYSeries rootSeries = new XYSeries("Root");
    rootSeries.add(roott, evaluateFunc(equationS.getText(), roott));
    
    XYSeriesCollection rootDataset = new XYSeriesCollection();
    rootDataset.addSeries(rootSeries);
    plot.setDataset(1, rootDataset);
    plot.mapDatasetToDomainAxis(1, 0);
    plot.mapDatasetToRangeAxis(1, 0);
    XYItemRenderer renderer = new XYLineAndShapeRenderer(false, true);
    renderer.setSeriesPaint(0, Color.RED);
    plot.setRenderer(1, renderer);

    // Set the range of the axes
    plot.getDomainAxis().setRange(minX, maxX);
    plot.getRangeAxis().setRange(minY, maxY);

    // Create ChartPanel with panning enabled
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setMouseWheelEnabled(true);
    chartPanel.setDomainZoomable(true);
    chartPanel.setRangeZoomable(true);
    chartPanel.setPreferredSize(new Dimension(660, 210));

    graph7.setLayout(new BorderLayout());
    graph7.removeAll();
    graph7.add(chartPanel, BorderLayout.CENTER);
    graph7.revalidate();
    graph7.repaint();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

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
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Newton;
    private javax.swing.JTextField a;
    private javax.swing.JTextField approRoot;
    private javax.swing.JPanel background;
    private javax.swing.JPanel bisection;
    private javax.swing.JTextField bmEqt;
    private javax.swing.JTextField bmRoot;
    private javax.swing.JTextField deltaX;
    private javax.swing.JTextField eqt;
    private javax.swing.JTextField equationF;
    private javax.swing.JTextField equationN;
    private javax.swing.JTextField equationR;
    private javax.swing.JTextField equationS;
    private javax.swing.JPanel fixed;
    private javax.swing.JPanel graph;
    private javax.swing.JPanel graph1;
    private javax.swing.JPanel graph2;
    private javax.swing.JPanel graph3;
    private javax.swing.JPanel graph4;
    private javax.swing.JPanel graph5;
    private javax.swing.JPanel graph6;
    private javax.swing.JPanel graph7;
    private javax.swing.JTextField imEqt;
    private javax.swing.JTextField imRoot;
    private javax.swing.JPanel incremental;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField lb;
    private javax.swing.JPanel regula;
    private javax.swing.JTextField rootF;
    private javax.swing.JTextField rootN;
    private javax.swing.JTextField rootR;
    private javax.swing.JTextField rootS;
    private javax.swing.JPanel secant;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    private javax.swing.JTable tbl4;
    private javax.swing.JTable tbl5;
    private javax.swing.JTable tbl6;
    private javax.swing.JTable tbl7;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField xU2;
    private javax.swing.JTextField xl;
    private javax.swing.JTextField xl1;
    private javax.swing.JTextField xl2;
    private javax.swing.JTextField xu;
    private javax.swing.JTextField xu2;
    // End of variables declaration//GEN-END:variables
   private double valL = Double.NEGATIVE_INFINITY; // Initialize xL and xU as global variables
   private double valU = Double.POSITIVE_INFINITY;
   private int IterationCount = 1; // Initialize total iteration count as global variable
 private static double evaluateFunc(String expression, double x) {
        // Create an expression with the given string and variable
        Expression e = new ExpressionBuilder(expression)
                .variable("x")
                .build()
                .setVariable("x", x);

        // Evaluate the expression
        return e.evaluate();
    }
 private double g(double x) {
    // Example: Let's choose g(x) = x - f(x) / f'(x), similar to the Newton-Raphson method
    double fx = evaluateFunc(equationF.getText(), x);
    double fDashX = differentiateFunction(equationF.getText(), x);

    // Avoid division by zero
    if (fDashX == 0) {
        throw new ArithmeticException("Derivative is zero. Division by zero error.");
    }

    return x - (fx / fDashX);
}

private double differentiateFunction(String equationStr, double xValue) {
    double h = 0.000001; // a small value
    return (evaluateFunc(equationStr, xValue + h) - evaluateFunc(equationStr, xValue)) / h;
}
}