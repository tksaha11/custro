
package custro;

import Class.IpQrCode;
import Class.Sql.Order;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class DashBoard extends javax.swing.JFrame {

    int x,y;
    
    public DashBoard() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        sidePane = new javax.swing.JPanel();
        frameTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        listLinkConnect = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        listLinkNewOrder = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        listLinkOList = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dashPane = new javax.swing.JPanel();
        showPanel = new javax.swing.JPanel();
        newOrderPanel = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textPhoneNo = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textAddress = new javax.swing.JTextField();
        textPName = new javax.swing.JTextField();
        textQty = new javax.swing.JTextField();
        pUPrice = new javax.swing.JTextField();
        btnOSubmit = new javax.swing.JButton();
        dashHeader = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        orderListPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainOrderTable = new javax.swing.JTable();
        newProductPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        productListPanel = new javax.swing.JPanel();
        connectPanel = new javax.swing.JPanel();
        lableShowCneec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(970, 500));
        setResizable(false);

        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidePane.setBackground(new java.awt.Color(255, 102, 0));
        sidePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        frameTitle.setBackground(new java.awt.Color(235, 131, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/custro/Icon/frameIcon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Custro");

        javax.swing.GroupLayout frameTitleLayout = new javax.swing.GroupLayout(frameTitle);
        frameTitle.setLayout(frameTitleLayout);
        frameTitleLayout.setHorizontalGroup(
            frameTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameTitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        frameTitleLayout.setVerticalGroup(
            frameTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        sidePane.add(frameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        listLinkConnect.setBackground(new java.awt.Color(230, 122, 41));
        listLinkConnect.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        listLinkConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listLinkConnectMouseClicked(evt);
            }
        });
        listLinkConnect.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/custro/Icon/connect.png"))); // NOI18N
        listLinkConnect.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Connect");
        listLinkConnect.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 30));

        sidePane.add(listLinkConnect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 50));

        listLinkNewOrder.setBackground(new java.awt.Color(230, 122, 41));
        listLinkNewOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        listLinkNewOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listLinkNewOrderMouseClicked(evt);
            }
        });
        listLinkNewOrder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/custro/Icon/order.png"))); // NOI18N
        listLinkNewOrder.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("New Order");
        listLinkNewOrder.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 30));

        sidePane.add(listLinkNewOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 50));

        listLinkOList.setBackground(new java.awt.Color(230, 122, 41));
        listLinkOList.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        listLinkOList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listLinkOListMouseClicked(evt);
            }
        });
        listLinkOList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/custro/Icon/rderList.png"))); // NOI18N
        listLinkOList.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Order List");
        listLinkOList.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 150, 30));

        sidePane.add(listLinkOList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 50));

        mainPane.add(sidePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 510));

        dashPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showPanel.setBackground(new java.awt.Color(255, 255, 255));

        newOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        newOrderPanel.setMaximumSize(new java.awt.Dimension(730, 480));
        newOrderPanel.setMinimumSize(new java.awt.Dimension(730, 480));
        newOrderPanel.setPreferredSize(new java.awt.Dimension(730, 480));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Name:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Phone No:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Product Name:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Unit Price:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Qty:");

        textPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneNoActionPerformed(evt);
            }
        });

        btnOSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnOSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOSubmit.setForeground(new java.awt.Color(255, 102, 0));
        btnOSubmit.setText("Submit");
        btnOSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newOrderPanelLayout = new javax.swing.GroupLayout(newOrderPanel);
        newOrderPanel.setLayout(newOrderPanelLayout);
        newOrderPanelLayout.setHorizontalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addComponent(btnOSubmit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(41, 41, 41)
                                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pUPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textPName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newOrderPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(35, 35, 35)
                                .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))))
        );
        newOrderPanelLayout.setVerticalGroup(
            newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newOrderPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel22)
                    .addComponent(textPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newOrderPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newOrderPanelLayout.createSequentialGroup()
                        .addComponent(textAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(textPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pUPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnOSubmit)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout showPanelLayout = new javax.swing.GroupLayout(showPanel);
        showPanel.setLayout(showPanelLayout);
        showPanelLayout.setHorizontalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(showPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(newOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        showPanelLayout.setVerticalGroup(
            showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(showPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(showPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(newOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dashPane.add(showPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 480));

        dashHeader.setBackground(new java.awt.Color(214, 107, 26));
        dashHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dashHeaderMouseDragged(evt);
            }
        });
        dashHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dashHeaderMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dashHeaderLayout = new javax.swing.GroupLayout(dashHeader);
        dashHeader.setLayout(dashHeaderLayout);
        dashHeaderLayout.setHorizontalGroup(
            dashHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashHeaderLayout.createSequentialGroup()
                .addGap(0, 708, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dashHeaderLayout.setVerticalGroup(
            dashHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        dashPane.add(dashHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

        orderListPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderListPanel.setMaximumSize(new java.awt.Dimension(730, 480));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        mainOrderTable.setAutoCreateRowSorter(true);
        mainOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Date", "Name", "Phone No", "Product Name", "Unit Price", "QTY", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mainOrderTable);

        javax.swing.GroupLayout orderListPanelLayout = new javax.swing.GroupLayout(orderListPanel);
        orderListPanel.setLayout(orderListPanelLayout);
        orderListPanelLayout.setHorizontalGroup(
            orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        orderListPanelLayout.setVerticalGroup(
            orderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        dashPane.add(orderListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 480));

        newProductPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("New Product");

        javax.swing.GroupLayout newProductPanelLayout = new javax.swing.GroupLayout(newProductPanel);
        newProductPanel.setLayout(newProductPanelLayout);
        newProductPanelLayout.setHorizontalGroup(
            newProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProductPanelLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        newProductPanelLayout.setVerticalGroup(
            newProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newProductPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        dashPane.add(newProductPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 480));

        productListPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout productListPanelLayout = new javax.swing.GroupLayout(productListPanel);
        productListPanel.setLayout(productListPanelLayout);
        productListPanelLayout.setHorizontalGroup(
            productListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        productListPanelLayout.setVerticalGroup(
            productListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        dashPane.add(productListPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 480));

        connectPanel.setBackground(new java.awt.Color(255, 255, 255));

        lableShowCneec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lableShowCneec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout connectPanelLayout = new javax.swing.GroupLayout(connectPanel);
        connectPanel.setLayout(connectPanelLayout);
        connectPanelLayout.setHorizontalGroup(
            connectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connectPanelLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lableShowCneec, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        connectPanelLayout.setVerticalGroup(
            connectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connectPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lableShowCneec, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        dashPane.add(connectPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 480));

        mainPane.add(dashPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 730, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //for window drag
    private void dashHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashHeaderMousePressed
        // TODO add your handling code here:
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_dashHeaderMousePressed

    private void dashHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashHeaderMouseDragged
        // TODO add your handling code here:
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_dashHeaderMouseDragged
    //for window drag end
    
    //close window
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void listLinkOListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listLinkOListMouseClicked
        // TODO add your handling code here:
        swithPanel(orderListPanel);
//        mainOrderTable  mainOrderTable
    }//GEN-LAST:event_listLinkOListMouseClicked

    private void listLinkNewOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listLinkNewOrderMouseClicked
        // TODO add your handling code here:
        swithPanel(newOrderPanel);
    }//GEN-LAST:event_listLinkNewOrderMouseClicked

    private void listLinkConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listLinkConnectMouseClicked
        // TODO add your handling code here:
        swithPanel(connectPanel);
        IpQrCode qr=new IpQrCode();
        
        lableShowCneec.setIcon(qr.getQr());
    }//GEN-LAST:event_listLinkConnectMouseClicked

    private void textPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneNoActionPerformed

    private void btnOSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOSubmitActionPerformed
        // TODO add your handling code here:
        Order or=new Order(textName.getText(),
                            textPhoneNo.getText(),
                            textAddress.getText(),
                            textPName.getText(),
                            textQty.getText(),
                            pUPrice.getText());
        try {
            if(or.insertOrder()==true){
                textName.setText("");
                textPhoneNo.setText("");
                textAddress.setText("");
                textPName.setText("");
                textQty.setText("");
                pUPrice.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOSubmitActionPerformed
    //showing the panels end
    
    //method for switing panela
    private void swithPanel(JPanel pan){
        showPanel.removeAll();
        showPanel.add(pan);
        showPanel.repaint();
        showPanel.revalidate();
    }
    public static void setPhoneNo(String msg) throws SQLException{
        textPhoneNo.setText(msg);
        
        Order ord=new Order();
        
        ord.getPhnODet(msg);
        textName.setText(ord.getName());
        textAddress.setText(ord.getAddress());
        
    }
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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        DashBoard dash=new DashBoard();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dash.setLocationRelativeTo(null);
                dash.showPanel.removeAll();
                dash.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOSubmit;
    private javax.swing.JPanel connectPanel;
    private javax.swing.JPanel dashHeader;
    private javax.swing.JPanel dashPane;
    private javax.swing.JPanel frameTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableShowCneec;
    private javax.swing.JPanel listLinkConnect;
    private javax.swing.JPanel listLinkNewOrder;
    private javax.swing.JPanel listLinkOList;
    private javax.swing.JTable mainOrderTable;
    private javax.swing.JPanel mainPane;
    private javax.swing.JPanel newOrderPanel;
    private javax.swing.JPanel newProductPanel;
    private javax.swing.JPanel orderListPanel;
    private javax.swing.JTextField pUPrice;
    private javax.swing.JPanel productListPanel;
    private javax.swing.JPanel showPanel;
    private javax.swing.JPanel sidePane;
    private static javax.swing.JTextField textAddress;
    private static javax.swing.JTextField textName;
    private javax.swing.JTextField textPName;
    private static javax.swing.JTextField textPhoneNo;
    private javax.swing.JTextField textQty;
    // End of variables declaration//GEN-END:variables
}
