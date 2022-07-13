package System;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.util.HashNMap;

public class Dashbord extends javax.swing.JFrame {
    //globle variables for db connection setup
    Connection conn = null;
    Statement stmt = null;

    public Dashbord() {
        initComponents();
        conn = DBconn.getConn();//to get connection object
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContainerPanel = new javax.swing.JPanel();
        NavBarPanel = new javax.swing.JPanel();
        btnVehicle = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnService = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnCost = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        ImagePanel = new javax.swing.JPanel();
        Image = new javax.swing.JButton();
        lblClientName = new javax.swing.JLabel();
        HideBar = new javax.swing.JPanel();
        ModesContainerPanel = new javax.swing.JTabbedPane();
        VehicleMgrPanel = new javax.swing.JPanel();
        BtnBar = new javax.swing.JPanel();
        btnModv = new javax.swing.JButton();
        btnRemV = new javax.swing.JButton();
        btnAddV = new javax.swing.JButton();
        SubCatVehiclePanel = new javax.swing.JTabbedPane();
        AddVehi = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbVehiType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cmbCondition = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cmbMake = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGrade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbFuel = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtEngCC = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbYOM = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtEngNo = new javax.swing.JTextField();
        txtChasisNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtRegNo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cmbRegYr = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        cmbPrevO = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtImgPath = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txtPurchPrice = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ModifyVehi = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtRegNoMod = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtChasisMod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnSrcMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMod = new javax.swing.JTable();
        btnSelectRegMod = new javax.swing.JButton();
        btnSelecChasMod1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cmbVehiTypeMod = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cmbStatusMod = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cmbConditionMod = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        cmbMakeMod = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        txtModelMod = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtGradeMod = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtColorMod = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cmbFuelMod = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        txtEngCCMod = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        cmbYOMMod = new javax.swing.JComboBox<>();
        txtEngNoMod = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtChasisNoMod = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtRegNoModField = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        cmbRegYrMod = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        cmbPrevOwnerMod = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        txtPurcPriceMod = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtImgMod = new javax.swing.JTextField();
        btnUpdateMod = new javax.swing.JButton();
        btnClearMod = new javax.swing.JButton();
        RemoveVehi = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtRegNoRem = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtChasisRem = new javax.swing.JTextField();
        btnSrcRem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRem = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        btnDelRec = new javax.swing.JButton();
        ViewPanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        lblTypeView = new javax.swing.JLabel();
        txtRegNoView = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableView = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txtChasisView = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        btnSelecView = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        btnSrcView = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        lblStatusView = new javax.swing.JLabel();
        lblConditionView = new javax.swing.JLabel();
        lblMakeView = new javax.swing.JLabel();
        lblModelView = new javax.swing.JLabel();
        lblGradeView = new javax.swing.JLabel();
        lblEngineCapView = new javax.swing.JLabel();
        lblColorView = new javax.swing.JLabel();
        lblYOMView = new javax.swing.JLabel();
        lblRegNoView = new javax.swing.JLabel();
        lblRegYrView = new javax.swing.JLabel();
        lblPrevOwnView = new javax.swing.JLabel();
        lblChasNoView = new javax.swing.JLabel();
        lblEngNoView = new javax.swing.JLabel();
        lblPurcPriceView = new javax.swing.JLabel();
        lblRecDateView = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFuelView = new javax.swing.JLabel();
        ServicePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableVehiRec = new javax.swing.JTable();
        jLabel79 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtRegNoRec = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtChasisRec = new javax.swing.JTextField();
        btnSrcRec = new javax.swing.JButton();
        jLabel82 = new javax.swing.JLabel();
        txtSubjectRec = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txtDateRec = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        txtOdoRec = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        txtCostRec = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtFieldDiscView = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTabelRecordRec = new javax.swing.JTable();
        jLabel87 = new javax.swing.JLabel();
        btnAddRec = new javax.swing.JButton();
        btnDeleteRec = new javax.swing.JButton();
        btnClearRec = new javax.swing.JButton();
        btnViewRec = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        ReportsPanel = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        txtRegInv = new javax.swing.JTextField();
        btnSrcInv = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTableInv = new javax.swing.JTable();
        txtChasisInv = new javax.swing.JTextField();
        CostPanel = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtRegNoCost = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtChasisCost = new javax.swing.JTextField();
        btnSrcCost = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableCost = new javax.swing.JTable();
        btnCalCost = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        lblPurCost = new javax.swing.JLabel();
        lblSerCost = new javax.swing.JLabel();
        lblCurTotCost = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel96 = new javax.swing.JLabel();
        txtEstimCost = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        btnCalCost1 = new javax.swing.JButton();
        lblTotIncCost = new javax.swing.JLabel();
        BillingPanel = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        txtRegNoBill = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        txtChasisBill = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTableBill = new javax.swing.JTable();
        btnSrcBill = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        txtSellPriceBill = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        txtWarrnBill = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtAreaSPnote = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        txtCusNameBill = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        txtNICBill = new javax.swing.JTextField();
        txtCNoBill = new javax.swing.JTextField();
        btnOrderBil = new javax.swing.JButton();
        btnClearBill = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContainerPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ContainerPanel.setDoubleBuffered(false);
        ContainerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavBarPanel.setBackground(new java.awt.Color(255, 255, 255));

        btnVehicle.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnVehicle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Car-Front-Red-icon.png"))); // NOI18N
        btnVehicle.setText("Vehicle Management");
        btnVehicle.setDisabledIcon(null);
        btnVehicle.setDisabledSelectedIcon(null);
        btnVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/App-picture-view-icon.png"))); // NOI18N
        btnView.setText("View Vehicles");
        btnView.setDisabledIcon(null);
        btnView.setDisabledSelectedIcon(null);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnService.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attention-icon.png"))); // NOI18N
        btnService.setText("Service Records");
        btnService.setDisabledIcon(null);
        btnService.setDisabledSelectedIcon(null);
        btnService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiceActionPerformed(evt);
            }
        });

        btnReport.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SEO-icon.png"))); // NOI18N
        btnReport.setText("Invoices");
        btnReport.setDisabledIcon(null);
        btnReport.setDisabledSelectedIcon(null);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnCost.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/total-plan-cost-icon.png"))); // NOI18N
        btnCost.setText("Cost / Income");
        btnCost.setDisabledIcon(null);
        btnCost.setDisabledSelectedIcon(null);
        btnCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostActionPerformed(evt);
            }
        });

        btnUser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Billing-icon.png"))); // NOI18N
        btnUser.setText("Selling");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        ImagePanel.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout ImagePanelLayout = new javax.swing.GroupLayout(ImagePanel);
        ImagePanel.setLayout(ImagePanelLayout);
        ImagePanelLayout.setHorizontalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ImagePanelLayout.setVerticalGroup(
            ImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-the-mp-car-group-car-dealership-vehicle-auto-detai-car-logo-5acc63ad77f7c6.9011992615233443014914.png"))); // NOI18N
        Image.setBorder(null);

        lblClientName.setBackground(new java.awt.Color(255, 255, 255));
        lblClientName.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        lblClientName.setText("             M&M Automotives");
        lblClientName.setToolTipText("");

        javax.swing.GroupLayout NavBarPanelLayout = new javax.swing.GroupLayout(NavBarPanel);
        NavBarPanel.setLayout(NavBarPanelLayout);
        NavBarPanelLayout.setHorizontalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(NavBarPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblClientName, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        NavBarPanelLayout.setVerticalGroup(
            NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnService, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCost, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NavBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarPanelLayout.createSequentialGroup()
                        .addGap(0, 158, Short.MAX_VALUE)
                        .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        ContainerPanel.add(NavBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 636));

        HideBar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HideBarLayout = new javax.swing.GroupLayout(HideBar);
        HideBar.setLayout(HideBarLayout);
        HideBarLayout.setHorizontalGroup(
            HideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        HideBarLayout.setVerticalGroup(
            HideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        ContainerPanel.add(HideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 910, 30));

        ModesContainerPanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        VehicleMgrPanel.setBackground(new java.awt.Color(204, 204, 204));
        VehicleMgrPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModv.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accessories-text-editor-icon.png"))); // NOI18N
        btnModv.setText("Modify Vehicle");
        btnModv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModvActionPerformed(evt);
            }
        });

        btnRemV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRemV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-icon.png"))); // NOI18N
        btnRemV.setText("Remove Vehicle");
        btnRemV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemVActionPerformed(evt);
            }
        });

        btnAddV.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAddV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.png"))); // NOI18N
        btnAddV.setText("Add Vehicle");
        btnAddV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BtnBarLayout = new javax.swing.GroupLayout(BtnBar);
        BtnBar.setLayout(BtnBarLayout);
        BtnBarLayout.setHorizontalGroup(
            BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnBarLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnAddV, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModv, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemV)
                .addGap(184, 184, 184))
        );
        BtnBarLayout.setVerticalGroup(
            BtnBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRemV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnModv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VehicleMgrPanel.add(BtnBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 885, -1));

        SubCatVehiclePanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        SubCatVehiclePanel.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel6.setText("Type");

        cmbVehiType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "SUV / Jeep", "Motorcycle", "Crew Cab", "Wagon", "Pickup / Double Cab", "Bus", "Lorry", "Three Wheel", "Tractor", "Heavy-Duty", "Other", " " }));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setText("Status");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registerd", "Unregisterd" }));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setText("Condition");

        cmbCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recondition", "Brand-new" }));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setText("Make");

        cmbMake.setMaximumRowCount(50);
        cmbMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aston Martin", "Audi", "BMW", "Chevrolet", "Chrysler", "Daewoo", "Daihatsu", "Dodge", "Fiat", "Ford", "GMC - General Motors Company", "Honda", "Hummer", "Hyundai", "Isuzu", "Jaguar", "Jeep", "Kla", "Land Rover", "Lexus", "Lotus", "Mazda", "Mercedez-Benz", "MG", "Mini", "Mitsubishi", "Nissan", "Pontiac", "Porsche", "Rolls_Royce", "Subaru", "Susuki", "Tesla", "Toyota", "Volkswagen", "Volvo", "Yamaha", "Other" }));
        cmbMake.setSelectedIndex(33);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Model");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Grade");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Colour");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("Fuel Type");

        cmbFuel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Desel", "Hybrid", "Electric", "Fuel-cell (Hydrigon)" }));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("Engine Capacity");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setText("Manufacture Year");

        cmbYOM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2040", "2039", "2038", "2037", "2036", "2035", "2034", "2033", "2032", "2031", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        cmbYOM.setSelectedIndex(19);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel19.setText("Engine No");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setText("Chassis No");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Add Vehicle Details");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel21.setText("Only For Registerd Vehicles *");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel22.setText("Registration No");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel23.setText("Registration Year");

        cmbRegYr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2040", "2039", "2038", "2037", "2036", "2035", "2034", "2033", "2032", "2031", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        cmbRegYr.setSelectedIndex(19);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setText("Previous Owners");

        cmbPrevO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel25.setText("Image Section");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel26.setText("Select Image path ");

        btnSave.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/disk-save-yellow-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel44.setText("Purchase Price (Rs)");

        javax.swing.GroupLayout AddVehiLayout = new javax.swing.GroupLayout(AddVehi);
        AddVehi.setLayout(AddVehiLayout);
        AddVehiLayout.setHorizontalGroup(
            AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddVehiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(616, 616, 616))
            .addGroup(AddVehiLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddVehiLayout.createSequentialGroup()
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddVehiLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                                .addComponent(cmbYOM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(763, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEngNo)
                                    .addComponent(txtChasisNo))
                                .addGap(537, 537, 537))
                            .addGroup(AddVehiLayout.createSequentialGroup()
                                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEngCC)
                                    .addComponent(cmbFuel, 0, 186, Short.MAX_VALUE))
                                .addGap(628, 628, 628))))
                    .addGroup(AddVehiLayout.createSequentialGroup()
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtModel))
                            .addGroup(AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGrade))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtColor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbMake, 0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbCondition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddVehiLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbVehiType, 0, 192, Short.MAX_VALUE)))
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddVehiLayout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(199, 199, 199))
                            .addGroup(AddVehiLayout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                                    .addGroup(AddVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(232, 232, 232))
                                    .addGroup(AddVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbRegYr, 0, 1, Short.MAX_VALUE)
                                        .addGap(180, 180, 180))
                                    .addGroup(AddVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPrevO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(180, 180, 180))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator2)
                                            .addGroup(AddVehiLayout.createSequentialGroup()
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtRegNo)
                                                .addGap(69, 69, 69)))
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AddVehiLayout.createSequentialGroup()
                                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtImgPath, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78)))
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddVehiLayout.createSequentialGroup()
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPurchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82)))
                                        .addGap(68, 68, 68))))))))
        );
        AddVehiLayout.setVerticalGroup(
            AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddVehiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVehiType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRegYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPrevO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddVehiLayout.createSequentialGroup()
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddVehiLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPurchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddVehiLayout.createSequentialGroup()
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtImgPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(314, 314, 314))
                    .addGroup(AddVehiLayout.createSequentialGroup()
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEngCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbYOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEngNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChasisNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(290, 290, 290))))
        );

        SubCatVehiclePanel.addTab("tab1", AddVehi);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setText("Modify Vehicle Details");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel28.setText("Search By");

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel29.setText("Registration Number");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel30.setText("Chasis Number");

        btnSrcMod.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcMod.setText("Search");
        btnSrcMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcModActionPerformed(evt);
            }
        });

        jTableMod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "YOM", "Colour", "Registration Number", "Chassis Number"
            }
        ));
        jScrollPane1.setViewportView(jTableMod);

        btnSelectRegMod.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSelectRegMod.setText("Select Registration Number");
        btnSelectRegMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectRegModActionPerformed(evt);
            }
        });

        btnSelecChasMod1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSelecChasMod1.setText("Select Chasis Number");
        btnSelecChasMod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecChasMod1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel31.setText("-- Select ' Registration Number '  or ' Chasis Number ' in tabel then click related button bellow --");

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel32.setText("Type");

        cmbVehiTypeMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Van", "SUV / Jeep", "Motorcycle", "Crew Cab", "Wagon", "Pickup / Double Cab", "Bus", "Lorry", "Three Wheel", "Tractor", "Heavy-Duty", "Other", " " }));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel33.setText("Status");

        cmbStatusMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registerd", "Unregisterd" }));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel34.setText("Condition");

        cmbConditionMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recondition", "Brand-new" }));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel35.setText("Make");

        cmbMakeMod.setMaximumRowCount(50);
        cmbMakeMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aston Martin", "Audi", "BMW", "Chevrolet", "Chrysler", "Daewoo", "Daihatsu", "Dodge", "Fiat", "Ford", "GMC - General Motors Company", "Honda", "Hummer", "Hyundai", "Isuzu", "Jaguar", "Jeep", "Kla", "Land Rover", "Lexus", "Lotus", "Mazda", "Mercedez-Benz", "MG", "Mini", "Mitsubishi", "Nissan", "Pontiac", "Porsche", "Rolls_Royce", "Subaru", "Susuki", "Tesla", "Toyota", "Volkswagen", "Volvo", "Yamaha", "Other" }));
        cmbMakeMod.setSelectedIndex(33);

        jLabel36.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel36.setText("Model");

        jLabel37.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel37.setText("Grade");

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel38.setText("Colour");

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel39.setText("Fuel Type");

        cmbFuelMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petrol", "Desel", "Hybrid", "Electric", "Fuel-cell (Hydrigon)" }));

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel40.setText("Engine Capacity");

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel41.setText("Manufacture Year");

        cmbYOMMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2040", "2039", "2038", "2037", "2036", "2035", "2034", "2033", "2032", "2031", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        cmbYOMMod.setSelectedIndex(19);

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel42.setText("Engine No");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel43.setText("Chassis No");

        txtChasisNoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChasisNoModActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel45.setText("Registration No");

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel46.setText("Registration Year");

        cmbRegYrMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2040", "2039", "2038", "2037", "2036", "2035", "2034", "2033", "2032", "2031", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        cmbRegYrMod.setSelectedIndex(19);

        jLabel47.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel47.setText("Previous Owners");

        cmbPrevOwnerMod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel50.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel50.setText("Purchase Price");

        txtPurcPriceMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPurcPriceModActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel51.setText("Image Path");

        txtImgMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImgModActionPerformed(evt);
            }
        });

        btnUpdateMod.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnUpdateMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-validated-icon.png"))); // NOI18N
        btnUpdateMod.setText("Update");
        btnUpdateMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateModActionPerformed(evt);
            }
        });

        btnClearMod.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnClearMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        btnClearMod.setText("Clear");
        btnClearMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ModifyVehiLayout = new javax.swing.GroupLayout(ModifyVehi);
        ModifyVehi.setLayout(ModifyVehiLayout);
        ModifyVehiLayout.setHorizontalGroup(
            ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyVehiLayout.createSequentialGroup()
                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSelectRegMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelecChasMod1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(542, 542, 542)))
                .addContainerGap())
            .addGroup(ModifyVehiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModifyVehiLayout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(616, 616, 616))
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRegNoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChasisMod, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSrcMod)
                        .addGap(109, 109, 109))
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(771, 771, 771))
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbVehiTypeMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtModelMod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbStatusMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbMakeMod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbConditionMod, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtColorMod))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGradeMod, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                                .addComponent(jLabel41)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbYOMMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21)
                                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtEngCCMod)
                                                    .addComponent(cmbFuelMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(1, 1, 1))
                                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPurcPriceMod, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtChasisNoMod)
                                            .addComponent(txtEngNoMod)
                                            .addComponent(txtImgMod)))))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRegNoModField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81))
                                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbRegYrMod, 0, 1, Short.MAX_VALUE))
                                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbPrevOwnerMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(122, 122, 122))))
                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnClearMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(124, 124, 124))))))
        );
        ModifyVehiLayout.setVerticalGroup(
            ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyVehiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtRegNoMod)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtChasisMod)
                    .addComponent(btnSrcMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSelecChasMod1)
                            .addComponent(btnSelectRegMod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbVehiTypeMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbStatusMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbConditionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMakeMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ModifyVehiLayout.createSequentialGroup()
                                .addComponent(cmbFuelMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEngCCMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbYOMMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEngNoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChasisNoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGradeMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPurcPriceMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImgMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))
                    .addGroup(ModifyVehiLayout.createSequentialGroup()
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegNoModField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbRegYrMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ModifyVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPrevOwnerMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateMod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearMod, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))))
        );

        SubCatVehiclePanel.addTab("tab2", ModifyVehi);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel48.setText("Remove Vehicle Details");

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel49.setText("Search By");

        jLabel52.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel52.setText("Registration Number");

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel53.setText("Chasis Number");

        btnSrcRem.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcRem.setText("Search");
        btnSrcRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcRemActionPerformed(evt);
            }
        });

        jTableRem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "YOM", "Colour", "Registration Number", "Chassis Number"
            }
        ));
        jScrollPane2.setViewportView(jTableRem);

        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel54.setText("-- Select ' Chasis Number '  of the vehicle in tabel that you want to delete and then click delete button bellow --");

        btnDelRec.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        btnDelRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete-icon.png"))); // NOI18N
        btnDelRec.setText("Delete Selected Vehicle");
        btnDelRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RemoveVehiLayout = new javax.swing.GroupLayout(RemoveVehi);
        RemoveVehi.setLayout(RemoveVehiLayout);
        RemoveVehiLayout.setHorizontalGroup(
            RemoveVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RemoveVehiLayout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(547, 547, 547))
            .addGroup(RemoveVehiLayout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegNoRem, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChasisRem, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSrcRem)
                .addGap(144, 144, 144))
            .addGroup(RemoveVehiLayout.createSequentialGroup()
                .addGroup(RemoveVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RemoveVehiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RemoveVehiLayout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(btnDelRec)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RemoveVehiLayout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        RemoveVehiLayout.setVerticalGroup(
            RemoveVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemoveVehiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RemoveVehiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtRegNoRem)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtChasisRem)
                    .addComponent(btnSrcRem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnDelRec, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );

        SubCatVehiclePanel.addTab("tab3", RemoveVehi);

        VehicleMgrPanel.add(SubCatVehiclePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 720));
        SubCatVehiclePanel.getAccessibleContext().setAccessibleName("Add Vehicle");
        SubCatVehiclePanel.getAccessibleContext().setAccessibleDescription("");

        ModesContainerPanel.addTab("tab6", VehicleMgrPanel);

        jLabel55.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel55.setText("Purchase Price (Rs)");

        jLabel56.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel56.setText("Registration Year");

        jLabel57.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel57.setText("Search By");

        lblTypeView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel60.setText("Previous Owners");

        jTableView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "YOM", "Colour", "Registration Number", "Chassis Number"
            }
        ));
        jScrollPane3.setViewportView(jTableView);

        jLabel61.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel61.setText("Condition");

        jLabel62.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel62.setText("Model");

        jLabel63.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel63.setText("Make");

        jLabel64.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel64.setText("Manufacture Year");

        btnSelecView.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSelecView.setText("View More Details");
        btnSelecView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecViewActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel65.setText("Colour");

        jLabel66.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel66.setText("Fuel Type");

        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel67.setText("Status");

        jLabel68.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel68.setText("Chasis Number");

        btnSrcView.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcView.setText("Search");
        btnSrcView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcViewActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel69.setText("Grade");

        jLabel70.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel70.setText("Engine Capacity (cc)");

        jLabel71.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel71.setText("Registration Number");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel72.setText("View Vehicle Details");

        jLabel74.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel74.setText("Registration No");

        jLabel75.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel75.setText("Chassis No");

        jLabel76.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel76.setText("Engine No");

        jLabel58.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel58.setText("Recorded Date");

        jLabel73.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel73.setText("* To view more details select a Chassis Number from table and click  on ` ViewMore Details`");

        jLabel77.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel77.setText("Image");

        jLabel78.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel78.setText("Type");

        lblStatusView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblConditionView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblMakeView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblModelView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblGradeView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblEngineCapView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblColorView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblYOMView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblRegNoView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblRegYrView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblPrevOwnView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblChasNoView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblEngNoView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblPurcPriceView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblRecDateView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        lblFuelView.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewPanelLayout.createSequentialGroup()
                                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(lblTypeView, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(ViewPanelLayout.createSequentialGroup()
                                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                            .addComponent(lblYOMView, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(lblEngineCapView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(lblColorView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(lblGradeView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(lblModelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lblMakeView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lblConditionView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblStatusView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(55, 55, 55)
                                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblPrevOwnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblRegYrView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblRegNoView, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblPurcPriceView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblRecDateView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(59, 59, 59))
                                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblEngNoView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lblChasNoView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(29, 29, 29)))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64))
                                    .addGroup(ViewPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFuelView, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(501, 501, 501)
                                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(147, 147, 147))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewPanelLayout.createSequentialGroup()
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ViewPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRegNoView, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtChasisView, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnSrcView)))
                                .addGap(66, 66, 66)))
                        .addContainerGap())
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecView, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtRegNoView)
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtChasisView)
                    .addComponent(btnSrcView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecView)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(ViewPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTypeView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStatusView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblConditionView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMakeView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModelView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGradeView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblColorView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ViewPanelLayout.createSequentialGroup()
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegNoView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegYrView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrevOwnView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblChasNoView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEngNoView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPurcPriceView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRecDateView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEngineCapView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYOMView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFuelView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        ModesContainerPanel.addTab("tab5", ViewPanel);

        jTableVehiRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "YOM", "Colour", "Registration Number", "Chassis Number"
            }
        ));
        jScrollPane4.setViewportView(jTableVehiRec);

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel79.setText("Vehicle Service Records");

        jLabel59.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel59.setText("* To get records .. Select a `Chasis Number` in tabel Then click on `View Records`");

        jLabel80.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel80.setText("Registration Number");

        jLabel81.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel81.setText("Chasis Number");

        btnSrcRec.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcRec.setText("Search");
        btnSrcRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcRecActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel82.setText("Record Subject");

        jLabel83.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel83.setText("Record Date");

        jLabel84.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel84.setText("Odometer");

        jLabel85.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel85.setText("Cost");

        jLabel86.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel86.setText("Discription");

        txtFieldDiscView.setColumns(20);
        txtFieldDiscView.setRows(5);
        jScrollPane5.setViewportView(txtFieldDiscView);

        jTabelRecordRec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Subject", "Odometer", "Cost", "Discription"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTabelRecordRec);

        jLabel87.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel87.setText("Records");

        btnAddRec.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnAddRec.setText("Add Record");
        btnAddRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecActionPerformed(evt);
            }
        });

        btnDeleteRec.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnDeleteRec.setText("Delete Record");
        btnDeleteRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRecActionPerformed(evt);
            }
        });

        btnClearRec.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnClearRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        btnClearRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearRecActionPerformed(evt);
            }
        });

        btnViewRec.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnViewRec.setText("View Records");
        btnViewRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServicePanelLayout = new javax.swing.GroupLayout(ServicePanel);
        ServicePanel.setLayout(ServicePanelLayout);
        ServicePanelLayout.setHorizontalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtChasisRec)
                            .addComponent(txtRegNoRec, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDateRec, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubjectRec, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCostRec, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOdoRec, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(btnSrcRec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addComponent(btnAddRec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteRec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnClearRec, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        ServicePanelLayout.setVerticalGroup(
            ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegNoRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChasisRec))
                        .addGap(18, 18, 18)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSrcRec)
                            .addComponent(btnViewRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubjectRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOdoRec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCostRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(ServicePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ServicePanelLayout.createSequentialGroup()
                                .addGroup(ServicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnAddRec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteRec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addComponent(btnClearRec, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ServicePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ModesContainerPanel.addTab("tab4", ServicePanel);

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel102.setText("Invoices ");

        jLabel108.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel108.setText("Search By");

        jLabel109.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel109.setText("Registration Number");

        jLabel110.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel110.setText("Chasis Number");

        btnSrcInv.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcInv.setText("Search / View All");
        btnSrcInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcInvActionPerformed(evt);
            }
        });

        jTableInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Model", "Registration Number", "Chassis Number", "Customer Name", "Price"
            }
        ));
        jScrollPane10.setViewportView(jTableInv);

        javax.swing.GroupLayout ReportsPanelLayout = new javax.swing.GroupLayout(ReportsPanel);
        ReportsPanel.setLayout(ReportsPanelLayout);
        ReportsPanelLayout.setHorizontalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReportsPanelLayout.createSequentialGroup()
                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(txtRegInv, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtChasisInv, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSrcInv)
                .addGap(66, 66, 66))
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReportsPanelLayout.setVerticalGroup(
            ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReportsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtRegInv)
                    .addComponent(btnSrcInv)
                    .addComponent(txtChasisInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ModesContainerPanel.addTab("tab3", ReportsPanel);

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel89.setText("Vehicle Cost / Income Calculator");

        jLabel90.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel90.setText("Search Vehicle By");

        jLabel91.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel91.setText("Registration Number");

        jLabel92.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel92.setText("Chasis Number");

        btnSrcCost.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcCost.setText("Search");
        btnSrcCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcCostActionPerformed(evt);
            }
        });

        jTableCost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "YOM", "Colour", "Registration Number", "Chassis Number"
            }
        ));
        jScrollPane7.setViewportView(jTableCost);

        btnCalCost.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCalCost.setText("Calculate Cost");
        btnCalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalCostActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel93.setText("Purchase Cost (Rs)");

        jLabel94.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel94.setText("Service Costs (Rs)");

        jLabel95.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel95.setText("Current Total Cost (Rs)");

        lblPurCost.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblSerCost.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblCurTotCost.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        jLabel96.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel96.setText("Estimated Selling Price (Rs)");

        txtEstimCost.setText("0");

        jLabel97.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel97.setText("Total Income  (Rs)");

        btnCalCost1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnCalCost1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calculate-icon.png"))); // NOI18N
        btnCalCost1.setText("Calculate Income");
        btnCalCost1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalCost1ActionPerformed(evt);
            }
        });

        lblTotIncCost.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        javax.swing.GroupLayout CostPanelLayout = new javax.swing.GroupLayout(CostPanel);
        CostPanel.setLayout(CostPanelLayout);
        CostPanelLayout.setHorizontalGroup(
            CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CostPanelLayout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegNoCost, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChasisCost, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnSrcCost)
                .addGap(66, 66, 66))
            .addGroup(CostPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane7)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CostPanelLayout.createSequentialGroup()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(CostPanelLayout.createSequentialGroup()
                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CostPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CostPanelLayout.createSequentialGroup()
                                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96)
                                    .addGroup(CostPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPurCost, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CostPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblCurTotCost, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CostPanelLayout.createSequentialGroup()
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSerCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(541, 541, 541))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CostPanelLayout.createSequentialGroup()
                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CostPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotIncCost, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CostPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtEstimCost, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(513, 513, 513))
            .addGroup(CostPanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btnCalCost1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CostPanelLayout.setVerticalGroup(
            CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CostPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtRegNoCost)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtChasisCost)
                    .addComponent(btnSrcCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalCost)
                .addGap(26, 26, 26)
                .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CostPanelLayout.createSequentialGroup()
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPurCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSerCost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurTotCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstimCost)
                            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTotIncCost, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalCost1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        ModesContainerPanel.addTab("tab2", CostPanel);

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel88.setText("Billing Section");

        jLabel98.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel98.setText("Search Vehicle By");

        jLabel99.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel99.setText("Registration Number");

        jLabel100.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel100.setText("Chasis Number");

        jTableBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "YOM", "Colour", "Registration Number", "Chassis Number"
            }
        ));
        jScrollPane8.setViewportView(jTableBill);

        btnSrcBill.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        btnSrcBill.setText("Search");
        btnSrcBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcBillActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel101.setText("Selling Price ");

        jLabel103.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel103.setText("Warranty");

        jLabel104.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel104.setText("Special Notes ");

        txtAreaSPnote.setColumns(20);
        txtAreaSPnote.setRows(5);
        jScrollPane9.setViewportView(txtAreaSPnote);

        jLabel105.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel105.setText("Customer Name");

        jLabel106.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel106.setText("NIC Number");

        jLabel107.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel107.setText("Contact Number");

        btnOrderBil.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnOrderBil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Order-history-icon.png"))); // NOI18N
        btnOrderBil.setText("Place Order");
        btnOrderBil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderBilActionPerformed(evt);
            }
        });

        btnClearBill.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnClearBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Clear-icon.png"))); // NOI18N
        btnClearBill.setText("Clear");
        btnClearBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearBillActionPerformed(evt);
            }
        });

        btnPrintBill.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnPrintBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer-icon.png"))); // NOI18N
        btnPrintBill.setText("Print Bill");
        btnPrintBill.setEnabled(false);
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BillingPanelLayout = new javax.swing.GroupLayout(BillingPanel);
        BillingPanel.setLayout(BillingPanelLayout);
        BillingPanelLayout.setHorizontalGroup(
            BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillingPanelLayout.createSequentialGroup()
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegNoBill, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChasisBill, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnSrcBill)
                .addGap(76, 76, 76))
            .addGroup(BillingPanelLayout.createSequentialGroup()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BillingPanelLayout.createSequentialGroup()
                .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BillingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSellPriceBill, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWarrnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9)))
                        .addGap(18, 18, 18)
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCusNameBill, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNICBill, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCNoBill, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnOrderBil, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClearBill, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrintBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BillingPanelLayout.setVerticalGroup(
            BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtRegNoBill)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtChasisBill)
                    .addComponent(btnSrcBill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSellPriceBill, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCusNameBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillingPanelLayout.createSequentialGroup()
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNICBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCNoBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrderBil, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearBill, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrintBill, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BillingPanelLayout.createSequentialGroup()
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtWarrnBill, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BillingPanelLayout.createSequentialGroup()
                                .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addGap(147, 147, 147))
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        ModesContainerPanel.addTab("tab1", BillingPanel);

        ContainerPanel.add(ModesContainerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, -4, 890, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // to clear vehicle form fields
    private void clearAll() {
        txtModel.setText("");
        txtGrade.setText("");
        txtColor.setText("");
        txtEngCC.setText("");
        txtEngNo.setText("");
        txtChasisNo.setText("");
        txtPurchPrice.setText("");
        txtRegNo.setText("");
        txtImgPath.setText("");
        cmbVehiType.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
        cmbCondition.setSelectedIndex(0);
        cmbMake.setSelectedIndex(33);
        cmbFuel.setSelectedIndex(0);
        cmbYOM.setSelectedIndex(19);
        cmbRegYr.setSelectedIndex(19);
        cmbPrevO.setSelectedIndex(0);
    }
    //for layout tabs setting for view
    private void btnVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleActionPerformed
        ModesContainerPanel.setSelectedIndex(0);
    }//GEN-LAST:event_btnVehicleActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        ModesContainerPanel.setSelectedIndex(1);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiceActionPerformed
        ModesContainerPanel.setSelectedIndex(2);
    }//GEN-LAST:event_btnServiceActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        ModesContainerPanel.setSelectedIndex(3);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostActionPerformed
        ModesContainerPanel.setSelectedIndex(4);
    }//GEN-LAST:event_btnCostActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        ModesContainerPanel.setSelectedIndex(5);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnAddVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVActionPerformed
        SubCatVehiclePanel.setSelectedIndex(0);
    }//GEN-LAST:event_btnAddVActionPerformed

    private void btnModvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModvActionPerformed
        SubCatVehiclePanel.setSelectedIndex(1);
    }//GEN-LAST:event_btnModvActionPerformed

    private void btnRemVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemVActionPerformed
        SubCatVehiclePanel.setSelectedIndex(2);
    }//GEN-LAST:event_btnRemVActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearAll(); // to clear fileds
    }//GEN-LAST:event_btnClearActionPerformed
    // to save vehicle records
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if (txtChasisNo.getText().length() > 0 && txtEngNo.getText().length() > 0 && txtModel.getText().length() > 0) // they are common factors a vehicle must have
        {
            if (txtPurchPrice.getText().length() > 0) {
                try {

                    stmt = conn.createStatement();
                    String sql = "INSERT INTO `vehicle`(`type`, `status`, `condition`, `make`, `model`, `grade`, `color`, `fuel`, `eng_cap`, `manu_year`, `eng_no`, `chas_no`, `reg_no`, `reg_year`, `prev_own`, `img_path`,`pur_price`,`rec_date`) VALUES ('" + cmbVehiType.getSelectedItem().toString() + "','" + cmbStatus.getSelectedItem().toString() + "','" + cmbCondition.getSelectedItem().toString() + "','" + cmbMake.getSelectedItem().toString() + "','" + txtModel.getText() + "','" + txtGrade.getText() + "','" + txtColor.getText() + "','" + cmbFuel.getSelectedItem().toString() + "','" + txtEngCC.getText() + "','" + cmbYOM.getSelectedItem().toString() + "','" + txtEngNo.getText() + "','" + txtChasisNo.getText() + "','" + txtRegNo.getText() + "','" + cmbRegYr.getSelectedItem().toString() + "','" + cmbPrevO.getSelectedItem() + "','" + txtImgPath.getText() + "','" + txtPurchPrice.getText() + "','" + (java.time.LocalDate.now()) + "')";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Vehicle Added!!");
                    clearAll();

                } catch (HeadlessException | SQLException ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please type a vaild `Purchase Price`");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please fill all fields to add the vehicle");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtChasisNoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChasisNoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChasisNoModActionPerformed
    // vehicle serch with chasis number
    private void btnSelecChasMod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecChasMod1ActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableMod.getSelectedRow();
            final int column = jTableMod.getSelectedColumn();
            SelectedVal = (String) jTableMod.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle and then select the `Chasis Number` of the vehicle that want to update in `Vehcle Search Table`");
        }

        txtChasisMod.setText("");
        txtRegNoMod.setText("");

        if (!"".equals(SelectedVal)) {
            txtRegNoModField.setEnabled(true);
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where chas_no like '%" + SelectedVal + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                if (rs.next()) {
                    cmbVehiTypeMod.setSelectedItem(rs.getString("type"));
                    cmbStatusMod.setSelectedItem(rs.getString("status"));
                    cmbConditionMod.setSelectedItem(rs.getString("condition"));
                    cmbMakeMod.setSelectedItem(rs.getString("make"));
                    txtModelMod.setText(rs.getString("model"));
                    txtGradeMod.setText(rs.getString("grade"));
                    txtColorMod.setText(rs.getString("color"));
                    cmbFuelMod.setSelectedItem(rs.getString("fuel"));
                    txtEngCCMod.setText(rs.getString("eng_cap"));
                    cmbYOMMod.setSelectedItem(rs.getString("manu_year"));
                    txtEngNoMod.setText(rs.getString("eng_no"));
                    txtChasisNoMod.setText(rs.getString("chas_no"));
                    txtChasisNoMod.setEnabled(false);
                    txtPurcPriceMod.setText(rs.getString("pur_price"));
                    txtImgMod.setText(rs.getString("img_path"));
                    txtRegNoModField.setText(rs.getString("reg_no"));
                    cmbRegYrMod.setSelectedItem(rs.getString("reg_year"));
                    cmbPrevOwnerMod.setSelectedItem(rs.getString("prev_own"));
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSelecChasMod1ActionPerformed
    //vehicle search with Register number
    private void btnSelectRegModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectRegModActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableMod.getSelectedRow();
            final int column = jTableMod.getSelectedColumn();
            SelectedVal = (String) jTableMod.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle and then select the `Register Number` of the vehicle that want to update in `Vehcle Search Table`");
        }

        txtChasisMod.setText("");
        txtRegNoMod.setText("");

        if (!"".equals(SelectedVal)) {
            txtChasisNoMod.setEnabled(true);
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where reg_no like '%" + SelectedVal + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                if (rs.next()) {
                    cmbVehiTypeMod.setSelectedItem(rs.getString("type"));
                    cmbStatusMod.setSelectedItem(rs.getString("status"));
                    cmbConditionMod.setSelectedItem(rs.getString("condition"));
                    cmbMakeMod.setSelectedItem(rs.getString("make"));
                    txtModelMod.setText(rs.getString("model"));
                    txtGradeMod.setText(rs.getString("grade"));
                    txtColorMod.setText(rs.getString("color"));
                    cmbFuelMod.setSelectedItem(rs.getString("fuel"));
                    txtEngCCMod.setText(rs.getString("eng_cap"));
                    cmbYOMMod.setSelectedItem(rs.getString("manu_year"));
                    txtEngNoMod.setText(rs.getString("eng_no"));
                    txtChasisNoMod.setText(rs.getString("chas_no"));
                    txtRegNoModField.setText(rs.getString("reg_no"));
                    txtPurcPriceMod.setText(rs.getString("pur_price"));
                    txtImgMod.setText(rs.getString("img_path"));
                    txtRegNoModField.setEnabled(false);
                    txtChasisNoMod.setEnabled(false);
                    cmbRegYrMod.setSelectedItem(rs.getString("reg_year"));
                    cmbPrevOwnerMod.setSelectedItem(rs.getString("prev_own"));
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSelectRegModActionPerformed
    //vehicle search button in modify form
    private void btnSrcModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcModActionPerformed

        String regNo = txtRegNoMod.getText().toString();
        String chaNo = txtChasisMod.getText().toString();
        //to clear table
        jTableMod.setModel(new DefaultTableModel(null, new String[]{"Make", "Model", "YOM", "Colour", "Registration Number", "Chasis Number"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter 'Registration Number' or 'Chassis Number' to search !");
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where reg_no like '%" + txtRegNoMod.getText().toString() + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableMod.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where chas_no like '%" + txtChasisMod.getText().toString() + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableMod.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcModActionPerformed

    private void txtPurcPriceModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPurcPriceModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPurcPriceModActionPerformed

    private void txtImgModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImgModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImgModActionPerformed
    //update button in update form
    private void btnUpdateModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateModActionPerformed
        if (txtChasisNoMod.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Fisrt Search a vehicle and get  detalis to edit");
        } else {
            try {

                stmt = conn.createStatement();
                String sqlUpd = "UPDATE `vehicle` SET `type`='" + cmbVehiTypeMod.getSelectedItem().toString() + "',`status`='" + cmbStatusMod.getSelectedItem().toString() + "',`condition`='" + cmbConditionMod.getSelectedItem().toString() + "',`make`='" + cmbMakeMod.getSelectedItem().toString() + "',`model`='" + txtModelMod.getText() + "',`grade`='" + txtGradeMod.getText() + "',`color`='" + txtColorMod.getText() + "',`fuel`='" + cmbFuelMod.getSelectedItem().toString() + "',`eng_cap`='" + txtEngCCMod.getText() + "',`manu_year`='" + cmbYOMMod.getSelectedItem().toString() + "',`eng_no`='" + txtEngNoMod.getText() + "',`reg_no`='" + txtRegNoModField.getText() + "',`reg_year`='" + cmbRegYrMod.getSelectedItem().toString() + "',`prev_own`='" + cmbPrevOwnerMod.getSelectedItem().toString() + "',`img_path`='" + txtImgMod.getText() + "',`pur_price`='" + txtPurcPriceMod.getText() + "' WHERE  chas_no ='" + txtChasisNoMod.getText() + "'";
                stmt.executeUpdate(sqlUpd);
                JOptionPane.showMessageDialog(null, "Vehicle Record Updated!!");

            } catch (HeadlessException | SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnUpdateModActionPerformed
    //to clear modify form fields
    private void btnClearModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearModActionPerformed
        txtModelMod.setText("");
        txtGradeMod.setText("");
        txtColorMod.setText("");
        txtEngCCMod.setText("");
        txtEngNoMod.setText("");
        txtChasisNoMod.setText("");
        txtRegNoModField.setText("");
        txtPurcPriceMod.setText("");
        txtImgMod.setText("");
        cmbVehiTypeMod.setSelectedIndex(0);
        cmbStatusMod.setSelectedIndex(0);
        cmbConditionMod.setSelectedIndex(0);
        cmbMakeMod.setSelectedIndex(33);
        cmbFuelMod.setSelectedIndex(0);
        cmbYOMMod.setSelectedIndex(19);
        cmbRegYrMod.setSelectedIndex(19);
        cmbPrevOwnerMod.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearModActionPerformed
    //search button on remove vehicle form
    private void btnSrcRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcRemActionPerformed
        String regNo = txtRegNoRem.getText();
        String chaNo = txtChasisRem.getText();
        //to clear table
        jTableRem.setModel(new DefaultTableModel(null, new String[]{"Make", "Model", "YOM", "Colour", "Registration Number", "Chasis Number"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter 'Registration Number' or 'Chassis Number' to search !");
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where reg_no like '%" + txtRegNoRem.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableRem.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where chas_no like '%" + txtChasisRem.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableRem.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcRemActionPerformed
    //button delete record in remove forme
    private void btnDelRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelRecActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableRem.getSelectedRow();
            final int column = jTableRem.getSelectedColumn();
            SelectedVal = (String) jTableRem.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle and then select the `Chasis Number` of the vehicle that want to delete in `Vehcle Search Table`");
        }
        if (!"".equals(SelectedVal)) {
            try {

                stmt = conn.createStatement();
                String sqlUpd = "DELETE FROM `vehicle` WHERE chas_no='" + SelectedVal + "'";
                stmt.executeUpdate(sqlUpd);
                JOptionPane.showMessageDialog(null, "Vehicle Record Deleted!!");

                txtChasisRem.setText("");
                txtRegNoRem.setText("");

            } catch (HeadlessException | SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }

    }//GEN-LAST:event_btnDelRecActionPerformed
    //search button on view form
    private void btnSrcViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcViewActionPerformed
        String regNo = txtRegNoView.getText();
        String chaNo = txtChasisView.getText();
        //to clear table
        jTableView.setModel(new DefaultTableModel(null, new String[]{"Make", "Model", "YOM", "Colour", "Registration Number", "Chasis Number"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter 'Registration Number' or 'Chassis Number' to search !");
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where reg_no like '%" + txtRegNoView.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableView.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where chas_no like '%" + txtChasisView.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableView.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcViewActionPerformed
    //to select vehicle from search table
    private void btnSelecViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecViewActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableView.getSelectedRow();
            final int column = jTableView.getSelectedColumn();
            SelectedVal = (String) jTableView.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle and then select the `Chasis Number` of the vehicle that want to view details in `Vehcle Search Table`");
        }
        txtChasisView.setText("");
        txtRegNoView.setText("");

        if (!"".equals(SelectedVal)) {
            try {

                stmt = conn.createStatement();
                String sql3 = "select * from vehicle where chas_no like '%" + SelectedVal + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                if (rs.next()) {
                    lblTypeView.setText(rs.getString("type"));
                    lblStatusView.setText(rs.getString("status"));
                    lblConditionView.setText(rs.getString("condition"));
                    lblMakeView.setText(rs.getString("make"));
                    lblModelView.setText(rs.getString("model"));
                    lblGradeView.setText(rs.getString("grade"));
                    lblColorView.setText(rs.getString("color"));
                    lblFuelView.setText(rs.getString("fuel"));
                    lblEngineCapView.setText(rs.getString("eng_cap"));
                    lblYOMView.setText(rs.getString("manu_year"));
                    lblEngNoView.setText(rs.getString("eng_no"));
                    lblChasNoView.setText(rs.getString("chas_no"));
                    lblPurcPriceView.setText(rs.getString("pur_price"));
                    lblRegNoView.setText(rs.getString("reg_no"));
                    lblRegYrView.setText(rs.getString("reg_year"));
                    lblPrevOwnView.setText(rs.getString("prev_own"));
                    lblRecDateView.setText(rs.getString("rec_date"));
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSelecViewActionPerformed
    //for search records(service)
    private void btnSrcRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcRecActionPerformed
        String regNo = txtRegNoRec.getText();
        String chaNo = txtChasisRec.getText();
        //to clear table
        jTableVehiRec.setModel(new DefaultTableModel(null, new String[]{"Make", "Model", "YOM", "Colour", "Registration Number", "Chasis Number"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter 'Registration Number' or 'Chassis Number' to search !");
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql4 = "select * from vehicle where reg_no like '%" + txtRegNoRec.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql4);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableVehiRec.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql5 = "select * from vehicle where chas_no like '%" + txtChasisRec.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql5);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableVehiRec.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcRecActionPerformed
    //button for add service records
    private void btnAddRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableVehiRec.getSelectedRow();
            final int column = jTableVehiRec.getSelectedColumn();
            SelectedVal = (String) jTableVehiRec.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle and then select the `Chasis Number` of the vehicle that want to add the record in `Vehcle Search Table`");
        }

        if (!"".equals(SelectedVal)) {
            if (txtSubjectRec.getText().length() > 0 && txtDateRec.getText().length() > 0 && txtCostRec.getText().length() > 0 && txtOdoRec.getText().length() > 0) {

                try {

                    stmt = conn.createStatement();
                    String sql = "INSERT INTO `records`(`subject`, `date`, `odo`, `cost`, `disc`, `chas_no`) VALUES ('" + txtSubjectRec.getText() + "','" + txtDateRec.getText() + "','" + txtOdoRec.getText() + "','" + txtCostRec.getText() + "','" + txtFieldDiscView.getText() + "','" + SelectedVal + "')";
                    stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Record Added!!");
                    clearRecFields();

                } catch (HeadlessException | SQLException ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please fill all fields in record section !");
            }
        }


    }//GEN-LAST:event_btnAddRecActionPerformed
    //button for delete service records
    private void btnDeleteRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRecActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTabelRecordRec.getSelectedRow();
            final int column = jTabelRecordRec.getSelectedColumn();
            SelectedVal = (String) jTabelRecordRec.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please  select the ID of record that want to delete , on  `Record Table`");
        }

        if (!"".equals(SelectedVal)) {
            try {

                stmt = conn.createStatement();
                String sql = "DELETE FROM `records` WHERE rec_id = '" + SelectedVal + ";'";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Record Deleted!!");
                clearAll();

            } catch (HeadlessException | SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }

    }//GEN-LAST:event_btnDeleteRecActionPerformed
    //for clear record fields in service rec form
    private void clearRecFields() {
        txtDateRec.setText("");
        txtSubjectRec.setText("");
        txtOdoRec.setText("");
        txtCostRec.setText("");
        txtFieldDiscView.setText("");
    }
    private void btnClearRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearRecActionPerformed
        clearRecFields();
    }//GEN-LAST:event_btnClearRecActionPerformed
    // view full record
    private void btnViewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRecActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableVehiRec.getSelectedRow();
            final int column = jTableVehiRec.getSelectedColumn();
            SelectedVal = (String) jTableVehiRec.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle ");
        }

        //make a if to validate
        if (!"".equals(SelectedVal)) {
            txtChasisRec.setText("");
            txtRegNoRec.setText("");

            //to clear table
            jTabelRecordRec.setModel(new DefaultTableModel(null, new String[]{"ID", "Date", "Subject", "Odometer", "Cost", "Discription"}));

            try {

                stmt = conn.createStatement();
                String sql3 = "SELECT * FROM `records` WHERE chas_no like '%" + SelectedVal + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {
                    String id = rs.getString("rec_id");
                    String date = rs.getString("date");
                    String subject = rs.getString("subject");
                    String odo = rs.getString("odo");
                    String cost = rs.getString("cost");
                    String disc = rs.getString("disc");

                    String tbData[] = {id, date, subject, odo, cost, disc};
                    DefaultTableModel tblModel = (DefaultTableModel) jTabelRecordRec.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnViewRecActionPerformed
    //search vehicl in cost forme
    private void btnSrcCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcCostActionPerformed
        String regNo = txtRegNoCost.getText();
        String chaNo = txtChasisCost.getText();
        //to clear table
        jTableCost.setModel(new DefaultTableModel(null, new String[]{"Make", "Model", "YOM", "Colour", "Registration Number", "Chasis Number"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter 'Registration Number' or 'Chassis Number' to search !");
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql4 = "select * from vehicle where reg_no like '%" + txtRegNoCost.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql4);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableCost.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql5 = "select * from vehicle where chas_no like '%" + txtChasisCost.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql5);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableCost.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcCostActionPerformed
    // to get costs and calculate
    private void btnCalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalCostActionPerformed
        String SelectedVal = "";
        try {
            final int row = jTableCost.getSelectedRow();
            final int column = jTableCost.getSelectedColumn();
            SelectedVal = (String) jTableCost.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle ");
        }

        double sum_service = 0;
        double purcheasePrice = 0;

        if (!"".equals(SelectedVal)) {
            try {

                stmt = conn.createStatement();
                String sql3 = "SELECT Sum(cost)AS tot FROM `records` WHERE  chas_no like '%" + SelectedVal + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {

                    sum_service = Double.parseDouble(rs.getString("tot"));
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
            lblSerCost.setText(Double.toString(sum_service));

            try {

                stmt = conn.createStatement();
                String sql3 = "SELECT pur_price FROM `vehicle` WHERE  chas_no like '%" + SelectedVal + "%';";
                ResultSet rs = stmt.executeQuery(sql3);
                while (rs.next()) {

                    purcheasePrice = Double.parseDouble(rs.getString("pur_price"));
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
            lblPurCost.setText(Double.toString(purcheasePrice));
            lblCurTotCost.setText(Double.toString(purcheasePrice + sum_service));

        } else {
            JOptionPane.showMessageDialog(null, "Fisrt select a Chassis number from `Vehicle Search Table`");
        }
    }//GEN-LAST:event_btnCalCostActionPerformed
    // to calculate cost price
    private void btnCalCost1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalCost1ActionPerformed
        double estim = Double.parseDouble(txtEstimCost.getText());
        if (estim <= 0) {
            JOptionPane.showMessageDialog(null, "Enter a valid estimated selling price");
        } else {
            double totCost = Double.parseDouble(lblCurTotCost.getText());
            lblTotIncCost.setText(Double.toString(estim - totCost));
        }
    }//GEN-LAST:event_btnCalCost1ActionPerformed
    //to search vehicle 
    private void btnSrcBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcBillActionPerformed
        String regNo = txtRegNoBill.getText();
        String chaNo = txtChasisBill.getText();
        //to clear table
        jTableBill.setModel(new DefaultTableModel(null, new String[]{"Make", "Model", "YOM", "Colour", "Registration Number", "Chasis Number"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter 'Registration Number' or 'Chassis Number' to search !");
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql4 = "select * from vehicle where reg_no like '%" + txtRegNoBill.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql4);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableBill.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql5 = "select * from vehicle where chas_no like '%" + txtChasisBill.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql5);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String Yom = rs.getString("manu_year");
                    String color = rs.getString("color");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chas_no");

                    String tbData[] = {make, model, Yom, color, regNum, chasNum};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableBill.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcBillActionPerformed
    //to print bill but record viewer doesnt work in this java version
    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed

        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\Gayana Senarathna\\Documents\\NetBeansProjects\\EAD_CW2\\src\\System\\reportInventory.jrxml"));
            JasperDesign jasdi = JRXmlLoader.load(in);
            String sql = "select * from vehicle;";
            JRDesignQuery newQueary = new JRDesignQuery();
            newQueary.setText(sql);
            jasdi.setQuery(newQueary);

            // InaccessibleObjectException come from here when going to diplay report
            //JasperReport js = JasperCompileManager.compileReport(jasdi);
            //HashMap para = new HashMap();
            //JasperPrint jp = JasperFillManager.fillReport("", para, conn);
            //JasperViewer.viewReport(jp , true);
        } catch (FileNotFoundException ee) {
            JOptionPane.showMessageDialog(null, ee.toString());
        } catch (JRException ex) {
            Logger.getLogger(Dashbord.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPrintBillActionPerformed
    // to clear bill form lables
    private void clearBillForm()
    {
        txtCNoBill.setText("");
        txtSellPriceBill.setText("");
        txtWarrnBill.setText("");
        txtAreaSPnote.setText("");
        txtCusNameBill.setText("");
        txtNICBill.setText("");
        
    }
    //to store order data in db
    private void btnOrderBilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderBilActionPerformed
        String SelectedVal = "";
        String make = "";
        String model = "";
        String color = "";
        String regNo = "";
        String chasNo = "";
        String purPrice = "";
        //get selected vlaue from table
        try {
            final int row = jTableBill.getSelectedRow();
            final int column = jTableBill.getSelectedColumn();
            SelectedVal = (String) jTableBill.getModel().getValueAt(row, column);
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, "Please first search the vehicle ");
        }

        //get vehicle details
        if (!"".equals(SelectedVal)) {
            txtRegNoBill.setText("");
            txtChasisBill.setText("");

            try {

                stmt = conn.createStatement();
                String sql3 = "SELECT * FROM `vehicle` WHERE chas_no ='" + SelectedVal + "';";
                ResultSet rs = stmt.executeQuery(sql3);
                if (rs.next()) {
                    make = rs.getString("make");
                    model = rs.getString("model");
                    color = rs.getString("color");
                    regNo = rs.getString("reg_no");
                    chasNo = rs.getString("chas_no");
                    purPrice = rs.getString("pur_price");
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
            //trnsfer and add data to sold vehicle table
            
            try {

                    stmt = conn.createStatement();
                    String sql = "INSERT INTO `sold_vehicle`(`make`, `model`, `color`, `reg_no`, `chasis_no`, `purc_price`, `sold_price`, `cus_name`, `cus_nic`, `cus_cn`,`sold_date`) VALUES ('"+make+"','"+model+"','"+color+"','"+regNo+"','"+chasNo+"','"+purPrice+"','"+txtSellPriceBill.getText()+"','"+txtCusNameBill.getText()+"','"+txtNICBill.getText()+"','"+txtCNoBill.getText()+"','"+java.time.LocalDate.now().toString()+"')";
                    stmt.executeUpdate(sql);
                    clearRecFields();

                } catch (HeadlessException | SQLException ee) {
                    JOptionPane.showMessageDialog(null, ee.toString());
                }
            
            JOptionPane.showMessageDialog(null, "Sold Record Created");
            clearBillForm();
            //create status update later
        }
        else{
            JOptionPane.showMessageDialog(null, "First search vehicle and select a chassis no before press `place order` button");
        }
    }//GEN-LAST:event_btnOrderBilActionPerformed

    private void btnClearBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearBillActionPerformed
        clearBillForm(); // clear bill form fields
    }//GEN-LAST:event_btnClearBillActionPerformed

    private void btnSrcInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcInvActionPerformed
        String regNo = txtRegInv.getText();
        String chaNo = txtChasisInv.getText();
        //to clear table
        jTableInv.setModel(new DefaultTableModel(null, new String[]{"Date", "Model", "Reg No", "Chasis No", "Customer Name", "Sold Price"}));

        if (regNo.length() == 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql = "select * from sold_vehicle;";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chasis_no");
                    String cusName = rs.getString("cus_name");
                    String price = rs.getString("sold_price");
                    String date = rs.getString("sold_date");

                    String tbData[] = {date, (make+" "+model), regNum, chasNum, cusName, price};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableInv.getModel();
                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() > 0 && chaNo.length() > 0) {
            JOptionPane.showMessageDialog(null, "Enter one parameter to search !");
        } else if (regNo.length() > 0 && chaNo.length() == 0) {
            try {

                stmt = conn.createStatement();
                String sql = "select * from sold_vehicle where reg_no like '%" + txtRegInv.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chasis_no");
                    String cusName = rs.getString("cus_name");
                    String price = rs.getString("sold_price");
                    String date = rs.getString("sold_date");

                    String tbData[] = {date, (make+" "+model), regNum, chasNum, cusName, price};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableInv.getModel();
                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        } else if (regNo.length() == 0 && chaNo.length() > 0) {
            try {

                stmt = conn.createStatement();
                String sql5 = "select * from sold_vehicle where chas_no like '%" + txtChasisInv.getText() + "%';";
                ResultSet rs = stmt.executeQuery(sql5);
                while (rs.next()) {
                    String make = rs.getString("make");
                    String model = rs.getString("model");
                    String regNum = rs.getString("reg_no");
                    String chasNum = rs.getString("chasis_no");
                    String cusName = rs.getString("cus_name");
                    String price = rs.getString("sold_price");
                    String date = rs.getString("sold_date");

                    String tbData[] = {date, (make+" "+model), regNum, chasNum, cusName, price};
                    DefaultTableModel tblModel = (DefaultTableModel) jTableInv.getModel();

                    tblModel.addRow(tbData);
                }

            } catch (SQLException ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }//GEN-LAST:event_btnSrcInvActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Dashbord().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddVehi;
    private javax.swing.JPanel BillingPanel;
    private javax.swing.JPanel BtnBar;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JPanel CostPanel;
    private javax.swing.JPanel HideBar;
    private javax.swing.JButton Image;
    private javax.swing.JPanel ImagePanel;
    private javax.swing.JTabbedPane ModesContainerPanel;
    private javax.swing.JPanel ModifyVehi;
    private javax.swing.JPanel NavBarPanel;
    private javax.swing.JPanel RemoveVehi;
    private javax.swing.JPanel ReportsPanel;
    private javax.swing.JPanel ServicePanel;
    private javax.swing.JTabbedPane SubCatVehiclePanel;
    private javax.swing.JPanel VehicleMgrPanel;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JButton btnAddRec;
    private javax.swing.JButton btnAddV;
    private javax.swing.JButton btnCalCost;
    private javax.swing.JButton btnCalCost1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearBill;
    private javax.swing.JButton btnClearMod;
    private javax.swing.JButton btnClearRec;
    private javax.swing.JButton btnCost;
    private javax.swing.JButton btnDelRec;
    private javax.swing.JButton btnDeleteRec;
    private javax.swing.JButton btnModv;
    private javax.swing.JButton btnOrderBil;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JButton btnRemV;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelecChasMod1;
    private javax.swing.JButton btnSelecView;
    private javax.swing.JButton btnSelectRegMod;
    private javax.swing.JButton btnService;
    private javax.swing.JButton btnSrcBill;
    private javax.swing.JButton btnSrcCost;
    private javax.swing.JButton btnSrcInv;
    private javax.swing.JButton btnSrcMod;
    private javax.swing.JButton btnSrcRec;
    private javax.swing.JButton btnSrcRem;
    private javax.swing.JButton btnSrcView;
    private javax.swing.JButton btnUpdateMod;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnVehicle;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnViewRec;
    private javax.swing.JComboBox<String> cmbCondition;
    private javax.swing.JComboBox<String> cmbConditionMod;
    private javax.swing.JComboBox<String> cmbFuel;
    private javax.swing.JComboBox<String> cmbFuelMod;
    private javax.swing.JComboBox<String> cmbMake;
    private javax.swing.JComboBox<String> cmbMakeMod;
    private javax.swing.JComboBox<String> cmbPrevO;
    private javax.swing.JComboBox<String> cmbPrevOwnerMod;
    private javax.swing.JComboBox<String> cmbRegYr;
    private javax.swing.JComboBox<String> cmbRegYrMod;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbStatusMod;
    private javax.swing.JComboBox<String> cmbVehiType;
    private javax.swing.JComboBox<String> cmbVehiTypeMod;
    private javax.swing.JComboBox<String> cmbYOM;
    private javax.swing.JComboBox<String> cmbYOMMod;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTabelRecordRec;
    private javax.swing.JTable jTableBill;
    private javax.swing.JTable jTableCost;
    private javax.swing.JTable jTableInv;
    private javax.swing.JTable jTableMod;
    private javax.swing.JTable jTableRem;
    private javax.swing.JTable jTableVehiRec;
    private javax.swing.JTable jTableView;
    private javax.swing.JLabel lblChasNoView;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblColorView;
    private javax.swing.JLabel lblConditionView;
    private javax.swing.JLabel lblCurTotCost;
    private javax.swing.JLabel lblEngNoView;
    private javax.swing.JLabel lblEngineCapView;
    private javax.swing.JLabel lblFuelView;
    private javax.swing.JLabel lblGradeView;
    private javax.swing.JLabel lblMakeView;
    private javax.swing.JLabel lblModelView;
    private javax.swing.JLabel lblPrevOwnView;
    private javax.swing.JLabel lblPurCost;
    private javax.swing.JLabel lblPurcPriceView;
    private javax.swing.JLabel lblRecDateView;
    private javax.swing.JLabel lblRegNoView;
    private javax.swing.JLabel lblRegYrView;
    private javax.swing.JLabel lblSerCost;
    private javax.swing.JLabel lblStatusView;
    private javax.swing.JLabel lblTotIncCost;
    private javax.swing.JLabel lblTypeView;
    private javax.swing.JLabel lblYOMView;
    private javax.swing.JTextArea txtAreaSPnote;
    private javax.swing.JTextField txtCNoBill;
    private javax.swing.JTextField txtChasisBill;
    private javax.swing.JTextField txtChasisCost;
    private javax.swing.JTextField txtChasisInv;
    private javax.swing.JTextField txtChasisMod;
    private javax.swing.JTextField txtChasisNo;
    private javax.swing.JTextField txtChasisNoMod;
    private javax.swing.JTextField txtChasisRec;
    private javax.swing.JTextField txtChasisRem;
    private javax.swing.JTextField txtChasisView;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtColorMod;
    private javax.swing.JTextField txtCostRec;
    private javax.swing.JTextField txtCusNameBill;
    private javax.swing.JTextField txtDateRec;
    private javax.swing.JTextField txtEngCC;
    private javax.swing.JTextField txtEngCCMod;
    private javax.swing.JTextField txtEngNo;
    private javax.swing.JTextField txtEngNoMod;
    private javax.swing.JTextField txtEstimCost;
    private javax.swing.JTextArea txtFieldDiscView;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtGradeMod;
    private javax.swing.JTextField txtImgMod;
    private javax.swing.JTextField txtImgPath;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtModelMod;
    private javax.swing.JTextField txtNICBill;
    private javax.swing.JTextField txtOdoRec;
    private javax.swing.JTextField txtPurcPriceMod;
    private javax.swing.JTextField txtPurchPrice;
    private javax.swing.JTextField txtRegInv;
    private javax.swing.JTextField txtRegNo;
    private javax.swing.JTextField txtRegNoBill;
    private javax.swing.JTextField txtRegNoCost;
    private javax.swing.JTextField txtRegNoMod;
    private javax.swing.JTextField txtRegNoModField;
    private javax.swing.JTextField txtRegNoRec;
    private javax.swing.JTextField txtRegNoRem;
    private javax.swing.JTextField txtRegNoView;
    private javax.swing.JTextField txtSellPriceBill;
    private javax.swing.JTextField txtSubjectRec;
    private javax.swing.JTextField txtWarrnBill;
    // End of variables declaration//GEN-END:variables

}
