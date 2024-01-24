package rivenexpresslogistics;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MainFrame extends javax.swing.JFrame {
    public MainFrame() {
        initComponents();}
    //Arraylist for table  
  public ArrayList RawMaterialsArrayList()
    {
         ArrayList<RawMaterials> rmNEW= new ArrayList<>();
     RawMaterials pd1 = new RawMaterials(1000000001,"Baking Powder", 9000, "Kilogram(KG)");
     RawMaterials pd2 = new RawMaterials(1000000002,"Baking Soda", 10000, "Kilogram(KG)");
     RawMaterials pd3 = new RawMaterials(1000000003,"Cheese", 7000, "Kilogram(KG)");
     RawMaterials pd4 = new RawMaterials(1000000004,"Chocolate Bar", 8000, "Kilogram(KG)");
     RawMaterials pd5 = new RawMaterials(1000000005,"Powdered Sugar", 9000, "Kilogram(KG)");
     RawMaterials pd6 = new RawMaterials(1000000006,"Cornstarch", 10000, "Kilogram(KG)");
     RawMaterials pd7 = new RawMaterials(1000000007,"Flour", 9700, "Kilogram(KG)");
     RawMaterials pd8 = new RawMaterials(1000000008,"Fruits", 7900, "Kilogram(KG)");
     RawMaterials pd9 = new RawMaterials(1000000009,"Granulated Sugar", 9500, "Kilogram(KG)");
     RawMaterials pd10 = new RawMaterials(1000000010,"Nuts", 10500, "Kilogram(KG)");
     RawMaterials pd11 = new RawMaterials(1000000011,"Butter", 11000, "Kilogram(KG)");
     RawMaterials pd12 = new RawMaterials(1000000012,"Butter Milk", 10000, "Kilogram(KG)");
     RawMaterials pd13 = new RawMaterials(1000000013,"Eggs", 15000, "Kilogram(KG)");
     RawMaterials pd14 = new RawMaterials(1000000014,"Flavor Extract", 18000, "Kilogram(KG)");
     RawMaterials pd15 = new RawMaterials(1000000015,"Milk", 12000, "Kilogram(KG)");
     RawMaterials pd16 = new RawMaterials(1000000016,"Vegetable Oil", 9900, "Kilogram(KG)");
     RawMaterials pd17 = new RawMaterials(1000000017,"Yogurt", 11500, "Kilogram(KG)");
     RawMaterials pd18 = new RawMaterials(1000000018,"Icing", 9000, "Kilogram(KG)");
     RawMaterials pd19 = new RawMaterials(1000000019,"Heavy Cream", 9500, "Kilogram(KG)");
     RawMaterials pd20 = new RawMaterials(1000000020,"Melted Chocolate", 16000, "Kilogram(KG)");
     RawMaterials pd21 = new RawMaterials(1000000021,"Boxes", 50000, "Pieces(PC)");
     RawMaterials pd22 = new RawMaterials(1000000022,"Bucket", 45000, "Pieces(PC)");
     RawMaterials pd23 = new RawMaterials(1000000023,"Container", 20000, "Pieces(PC)");
     RawMaterials pd24 = new RawMaterials(1000000024,"E-Crates", 60000, "Pieces(PC)");
     RawMaterials pd25 = new RawMaterials(1000000025,"G-Crates", 60000, "Pieces(PC)");
     RawMaterials pd26 = new RawMaterials(1000000026,"Garbage Bag", 35000, "Pieces(PC)");
     RawMaterials pd27 = new RawMaterials(1000000027,"Palette", 26000, "Pieces(PC)");
     RawMaterials pd28 = new RawMaterials(1000000028,"Plastic", 46000, "Pieces(PC)");
     RawMaterials pd29 =  new  RawMaterials(1000000029,"Rag", 38000, "Pieces(PC)");
     RawMaterials pd30 = new RawMaterials(1000000030,"Towels", 50000, "Pieces(PC)");
     rmNEW.add(pd1);
     rmNEW.add(pd2);
     rmNEW.add(pd3);
     rmNEW.add(pd4);
     rmNEW.add(pd5);
     rmNEW.add(pd6);
     rmNEW.add(pd7);
     rmNEW.add(pd8);
     rmNEW.add(pd9);
     rmNEW.add(pd10);
     rmNEW.add(pd11);
     rmNEW.add(pd12);
     rmNEW.add(pd13);
     rmNEW.add(pd14);
     rmNEW.add(pd15);
     rmNEW.add(pd16);
     rmNEW.add(pd17);
     rmNEW.add(pd18);
     rmNEW.add(pd19);
     rmNEW.add(pd20);
     rmNEW.add(pd21);
     rmNEW.add(pd22);
     rmNEW.add(pd23);
     rmNEW.add(pd24);
     rmNEW.add(pd25);
     rmNEW.add(pd26);
     rmNEW.add(pd27);
     rmNEW.add(pd28);
     rmNEW.add(pd29);
     rmNEW.add(pd30);
        return rmNEW;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMAIN = new javax.swing.JTable();
        btnASC = new javax.swing.JButton();
        btnIMPORT = new javax.swing.JButton();
        btnEXPORT = new javax.swing.JButton();
        btnADDMATS = new javax.swing.JButton();
        btnSEARCH = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDESC = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("WAREHOUSE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(890, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 740, 1150, 60));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/redribbon.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REMAINING STOCKS ");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 320, 30));

        jTableMAIN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTableMAIN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MATERIAL ID", "MATERIAL NAME", "QUANTITY", "KG/PC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMAIN.setGridColor(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(jTableMAIN);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 570, 560));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 590, 600));

        btnASC.setBackground(new java.awt.Color(255, 0, 0));
        btnASC.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnASC.setForeground(new java.awt.Color(255, 255, 255));
        btnASC.setText("Ascending");
        btnASC.setIconTextGap(1);
        btnASC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASCActionPerformed(evt);
            }
        });
        getContentPane().add(btnASC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 120, 30));

        btnIMPORT.setBackground(new java.awt.Color(255, 0, 0));
        btnIMPORT.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        btnIMPORT.setForeground(new java.awt.Color(255, 255, 255));
        btnIMPORT.setText("IMPORT");
        btnIMPORT.setBorder(null);
        btnIMPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPORTActionPerformed(evt);
            }
        });
        getContentPane().add(btnIMPORT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 230, 60));

        btnEXPORT.setBackground(new java.awt.Color(255, 0, 0));
        btnEXPORT.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        btnEXPORT.setForeground(new java.awt.Color(255, 255, 255));
        btnEXPORT.setText("EXPORT ");
        btnEXPORT.setBorder(null);
        btnEXPORT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXPORTActionPerformed(evt);
            }
        });
        getContentPane().add(btnEXPORT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 230, 60));

        btnADDMATS.setBackground(new java.awt.Color(255, 0, 0));
        btnADDMATS.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        btnADDMATS.setForeground(new java.awt.Color(255, 255, 255));
        btnADDMATS.setText("ADD NEW ");
        btnADDMATS.setBorder(null);
        btnADDMATS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDMATSActionPerformed(evt);
            }
        });
        getContentPane().add(btnADDMATS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 230, 60));

        btnSEARCH.setBackground(new java.awt.Color(255, 0, 0));
        btnSEARCH.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        btnSEARCH.setForeground(new java.awt.Color(255, 255, 255));
        btnSEARCH.setText("SEARCH ");
        btnSEARCH.setBorder(null);
        btnSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEARCHActionPerformed(evt);
            }
        });
        getContentPane().add(btnSEARCH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 680, 230, 60));

        btnDELETE.setBackground(new java.awt.Color(255, 0, 0));
        btnDELETE.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        btnDELETE.setForeground(new java.awt.Color(255, 255, 255));
        btnDELETE.setText("DELETE ROW");
        btnDELETE.setIconTextGap(1);
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });
        getContentPane().add(btnDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 230, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/export.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/view.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/delete.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 590, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/add.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/search.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 670, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/import.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        btnDESC.setBackground(new java.awt.Color(255, 0, 0));
        btnDESC.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnDESC.setForeground(new java.awt.Color(255, 255, 255));
        btnDESC.setText(" Descending");
        btnDESC.setIconTextGap(1);
        btnDESC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDESCActionPerformed(evt);
            }
        });
        getContentPane().add(btnDESC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 130, 30));

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("        VIEW ALL");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rivenexpresslogistics/icons/bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1140, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnASCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASCActionPerformed
        //All the data/components in the array list will display
        DefaultTableModel rmmodel = (DefaultTableModel)jTableMAIN.getModel();
        rmmodel.setNumRows(0);
         ArrayList<RawMaterials>rmOLD =  RawMaterialsArrayList();
        Object rowData1[] = new Object[4];
        for(int i = 0; i<rmOLD.size();i++)
        {
            rowData1[0] = rmOLD.get(i).getproductID();
            rowData1[1] = rmOLD.get(i).getproductName();
            rowData1[2] = rmOLD.get(i).getQty();
            rowData1[3] = rmOLD.get(i).getKilo();
            rmmodel.addRow(rowData1);
        }
    }//GEN-LAST:event_btnASCActionPerformed
 //Instance JTextField for importing,exporting existing materials
    private JTextField matIDfield;
    private JTextField qtyfield;
 //instance JTextField for adding new materials;
    private JTextField matName;
    private JTextField matUnit;
 
    private void btnIMPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPORTActionPerformed
        //calling the method ImportButton
        ImportButton();
    }//GEN-LAST:event_btnIMPORTActionPerformed

    private void btnEXPORTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXPORTActionPerformed
     //calling the method ExportButton
        ExportButton();
    }//GEN-LAST:event_btnEXPORTActionPerformed

    private void btnADDMATSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDMATSActionPerformed
    //calling the method AddButton
        AddButton();
    }//GEN-LAST:event_btnADDMATSActionPerformed

    private void btnSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEARCHActionPerformed
    //calling the method SearchButton
        SearchButton();
    }//GEN-LAST:event_btnSEARCHActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        //Code blocks when user want to delete rows
    int selectedRow = jTableMAIN.getSelectedRow();
    if(selectedRow >=0 )
    {
        DefaultTableModel rmmodel = (DefaultTableModel) jTableMAIN.getModel();
        rmmodel.removeRow(selectedRow);
        JOptionPane.showMessageDialog(null, "Deleted Successfully");
    }
    else JOptionPane.showMessageDialog(null,"Please select a row to delete","Notice",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnDESCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDESCActionPerformed
     DefaultTableModel rmmodel = (DefaultTableModel) jTableMAIN.getModel();
rmmodel.setNumRows(0);
ArrayList<RawMaterials> rmOLD = RawMaterialsArrayList();

// Sort the ArrayList in reverse (descending) order based on productID
Collections.sort(rmOLD, new Comparator<RawMaterials>() {
    @Override
    public int compare(RawMaterials rm1, RawMaterials rm2) {
   
        return Integer.compare(rm2.getproductID(), rm1.getproductID());
    }
});
Object rowData1[] = new Object[4];
for (int i = 0; i < rmOLD.size(); i++) {
    rowData1[0] = rmOLD.get(i).getproductID();
    rowData1[1] = rmOLD.get(i).getproductName();
    rowData1[2] = rmOLD.get(i).getQty();
    rowData1[3] = rmOLD.get(i).getKilo();
    rmmodel.addRow(rowData1);
}
    }//GEN-LAST:event_btnDESCActionPerformed
//=======START OF METHODS OF JFRAMES=========  
  public void ImportButton(){
        jFrame1.setSize(400,250);
//Panel
       JPanel bgpanel = new JPanel();
       bgpanel.setBackground(Color.red);
       bgpanel.setLayout(null);
//Label for title
       JLabel importTitle = new JLabel("IMPORT MATERIALS");
       importTitle.setForeground(Color.RED);
       importTitle.setFont(new Font("Segoe UI Black",Font.BOLD,19));
       importTitle.setBounds(90,5,220,20);
//Label for Raw materials ID
       JLabel importID = new JLabel("MATERIAL ID: ");
       importID.setForeground(Color.RED);
       importID.setFont(new Font("Segoe UI Black",Font.BOLD,14));
       importID.setBounds(50,65,180,20);
//Label for Raw materials Quantity
      JLabel importQTY = new JLabel("QUANTITY : ");
        importQTY.setForeground(Color.RED);
        importQTY.setFont(new Font("Segoe UI Black",Font.BOLD,14));
        importQTY.setBounds(50,110,180,20);
//TEXTFIELD
         matIDfield = new JTextField(20);
         matIDfield.setBounds(170,60,120,40);
         qtyfield = new JTextField(20);
         qtyfield.setBounds(170,110,120,40);
//BUTTON
         JButton importButton = new JButton("IMPORT");
          bgpanel.add(importQTY);     
          bgpanel.setVisible(true);
          bgpanel.setBackground(new Color(255,253,208));
          bgpanel.setLayout(null);  
          bgpanel.add(importButton);
          bgpanel.setSize(400,250);
//Frame settings
          jFrame1.add(bgpanel);
          jFrame1.setResizable(false);
          jFrame1.setVisible(true); 
          jFrame1.setDefaultCloseOperation(HIDE_ON_CLOSE);  importButton.setSize(80,40);
          importButton.setForeground(Color.WHITE);
          importButton.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          importButton.setBounds(100,165,180,40);
          importButton.setFocusable(true);
          importButton.setBackground(Color.RED);
//adding to the panel
            bgpanel.add(matIDfield);
            bgpanel.add(qtyfield);
            bgpanel.add(importTitle);
            bgpanel.add(importID);
            bgpanel.add(importQTY);     
            bgpanel.setVisible(true);
            bgpanel.setBackground(new Color(255,253,208));
            bgpanel.setLayout(null);  
            bgpanel.add(importButton);
            bgpanel.setSize(400,250);
//Frame settings
          jFrame1.add(bgpanel);
          jFrame1.setResizable(false);
          jFrame1.setVisible(true); 
          jFrame1.setDefaultCloseOperation(HIDE_ON_CLOSE); 
             importButton.addActionListener((ActionEvent e) -> 
        {
          //calling the method Import
                 Import();
        });
  }
  public void ExportButton(){
//-------START OF MANUAL CODING FOR EXPORT JFRAME------------------
        jFrame2.setSize(400,250);
       //Panel
      JPanel bgpanel = new JPanel();
       bgpanel.setBackground(Color.red);
       bgpanel.setLayout(null);
      //Label for title
      JLabel exportTitle = new JLabel("EXPORT MATERIALS");
       exportTitle.setForeground(Color.RED);
       exportTitle.setFont(new Font("Segoe UI Black",Font.BOLD,19));
       exportTitle.setBounds(90,5,220,20);
      //Label for Raw materials ID
      JLabel exportID = new JLabel("MATERIAL ID: ");
          exportID.setForeground(Color.RED);
          exportID.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          exportID.setBounds(50,65,180,20);
      //Label for Raw materials Quantity
      JLabel exportQTY = new JLabel("QUANTITY : ");
          exportQTY.setForeground(Color.RED);
          exportQTY.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          exportQTY.setBounds(50,110,180,20);
         //TEXTFIELD
        matIDfield = new JTextField(20);
         matIDfield.setBounds(170,60,120,40);
         qtyfield = new JTextField(20);
         qtyfield.setBounds(170,110,120,40);
            //BUTTON
         JButton exportButton = new JButton("EXPORT");
         exportButton.setSize(80,40);
         exportButton.setForeground(Color.WHITE);
         exportButton.setFont(new Font("Segoe UI Black",Font.BOLD,14));
         exportButton.setBounds(100,165,180,40);
         exportButton.setFocusable(true);
         exportButton.setBackground(Color.RED);
          //adding to the panel
            bgpanel.add(matIDfield);
            bgpanel.add(qtyfield);
            bgpanel.add(exportTitle);
            bgpanel.add(exportID);
            bgpanel.add(exportQTY);     
            bgpanel.setVisible(true);
            bgpanel.setBackground(new Color(255,253,208));
            bgpanel.setLayout(null);  
            bgpanel.add(exportButton);
          bgpanel.setSize(400,250);
          //Frame settings
          jFrame2.add(bgpanel);
          jFrame2.setResizable(false);
          jFrame2.setVisible(true); 
           jFrame2.setDefaultCloseOperation(HIDE_ON_CLOSE);
             exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           //calling the method Export
                 Export();
             } });
//-------END OF MANUAL CODING FOR EXPORT JFRAME------------------
  }
  public void AddButton(){
//-------START OF MANUAL CODING FOR ADDING NEW MATERIAL JFRAME------------------
        jFrame3.setSize(400,350);
//Panel
      JPanel bgpanel = new JPanel();
       bgpanel.setBackground(Color.red);
       bgpanel.setLayout(null);
//Label for title
      JLabel addTitle = new JLabel("ADD NEW MATERIALS");
       addTitle.setForeground(Color.RED);
       addTitle.setFont(new Font("Segoe UI Black",Font.BOLD,19));
       addTitle.setBounds(80,5,250,20);
//Label for Raw material ID
      JLabel addID = new JLabel("MATERIAL ID: ");
          addID.setForeground(Color.RED);
          addID.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          addID.setBounds(40,65,180,20);
//Label for Raw material name
         JLabel addName = new JLabel("MATERIAL NAME : ");
          addName.setForeground(Color.RED);
          addName.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          addName.setBounds(40,115,180,20);
 //Label for Raw materials Quantity
        JLabel addQty = new JLabel("QUANTITY: ");
          addQty.setForeground(Color.RED);
          addQty.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          addQty.setBounds(40,170,180,20);
 //Label for Raw materials Quantity
        JLabel addUnit = new JLabel("UNIT(Kilogram/PC): ");
          addUnit.setForeground(Color.RED);
          addUnit.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          addUnit.setBounds(40,220,180,20);
 //TEXTFIELD
        matIDfield = new JTextField(20);
        matIDfield.setBounds(200,60,120,40);
        matName = new JTextField(20);
        matName.setBounds(200,110,120,40);
        qtyfield = new JTextField(20);
        qtyfield.setBounds(200,160,120,40);
        matUnit = new JTextField(20);
        matUnit.setBounds(200,210,120,40);
 //BUTTON
         JButton addButton = new JButton("ADD");
         addButton.setSize(80,40);
         addButton.setForeground(Color.WHITE);
         addButton.setFont(new Font("Segoe UI Black",Font.BOLD,14));
         addButton.setBounds(100,265,180,40);
         addButton.setFocusable(true);
         addButton.setBackground(Color.RED);
//adding to the panel
            bgpanel.add(matIDfield);
            bgpanel.add(qtyfield);
            bgpanel.add(matName);
            bgpanel.add(matUnit);
            bgpanel.add(addTitle);
            bgpanel.add(addID);
            bgpanel.add(addQty);
            bgpanel.add(addName);
            bgpanel.add(addUnit);
            bgpanel.setVisible(true);
            bgpanel.setBackground(new Color(255,253,208));
            bgpanel.setLayout(null);  
            bgpanel.add(addButton);
            bgpanel.setSize(400,350);
//Frame settings
          jFrame3.add(bgpanel);
          jFrame3.setResizable(false);
          jFrame3.setVisible(true); 
          jFrame3.setDefaultCloseOperation(HIDE_ON_CLOSE);
          addButton.addActionListener((ActionEvent e) -> {
          int txtfID = Integer.parseInt(matIDfield.getText());
          String txtNAME = matName.getText();
          int txtfQTY = Integer.parseInt(qtyfield.getText());
          String txtfUNIT =  matUnit.getText();
                  ArrayList<RawMaterials>rmNEW =  new ArrayList();
                  RawMaterials pd31 = new RawMaterials(txtfID,txtNAME,txtfQTY,txtfUNIT);
                  rmNEW.add(pd31);
                     DefaultTableModel rmmodel = (DefaultTableModel)jTableMAIN.getModel();
                    for(int i=0;i<rmNEW.size();i++)
                    {
                    RawMaterials raw = rmNEW.get(i);
                    Object[] j = new Object[4];
                    j[0] = raw.getproductID();
                    j[1] = raw.getproductName();
                    j[2] = raw.getQty();
                    j[3] = raw.getKilo();
                    rmmodel.addRow(j);
                    }
                    JOptionPane.showMessageDialog(null, "Added Succesfully! ", 
                            "Notice", JOptionPane.INFORMATION_MESSAGE);
        });//end of action performed method   
  }
  public void SearchButton(){
 //-------START OF MANUAL CODING FOR SEARCH MATERIAL JFRAME------------------
         jFrame4.setSize(400,250);
//Panel
         JPanel bgpanel = new JPanel();
         bgpanel.setBackground(Color.red);
         bgpanel.setLayout(null);
//Label for title
         JLabel searchTitle = new JLabel("SEARCH FOR MATERIALS");
         searchTitle.setForeground(Color.RED);
         searchTitle.setFont(new Font("Segoe UI Black",Font.BOLD,19));
         searchTitle.setBounds(80,5,270,20);
//Label for Raw materials ID
          JLabel searchName = new JLabel("MATERIAL NAME: ");
          searchName.setForeground(Color.RED);
          searchName.setFont(new Font("Segoe UI Black",Font.BOLD,14));
          searchName.setBounds(40,90,180,20);
//TEXTFIELD
          matName = new JTextField(20);
          matName.setBounds(190,80,120,40);
//BUTTON
            JButton searchButton = new JButton("SEARCH");
            searchButton.setSize(80,40);
            searchButton.setForeground(Color.WHITE);
            searchButton.setFont(new Font("Segoe UI Black",Font.BOLD,14));
            searchButton.setBounds(100,165,180,40);
            searchButton.setFocusable(true);
            searchButton.setBackground(Color.RED);
//adding to the panel
            bgpanel.add(searchName);
            bgpanel.add(searchTitle);
            bgpanel.add(matName);
            bgpanel.setVisible(true);
            bgpanel.setBackground(new Color(255,253,208));
            bgpanel.setLayout(null);  
            bgpanel.add(searchButton);
            bgpanel.setSize(400,250);
//Frame settings
           jFrame4.add(bgpanel);
           jFrame4.setResizable(false);
           jFrame4.setVisible(true); 
           jFrame4.setDefaultCloseOperation(HIDE_ON_CLOSE);
             searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String nameTOsearch = matName.getText();
                 SearchbyName(nameTOsearch);
                 JOptionPane.showMessageDialog(null, nameTOsearch +" Found Succesfully!", "Notice", JOptionPane.INFORMATION_MESSAGE);
              
             } });//end of action performed method   
  }
//=======END OF METHODS OF JFRAMES=========  
//method in importing material
  public void Import(){
        int matfield = Integer.parseInt(matIDfield.getText());
        int qtfield = Integer.parseInt(qtyfield.getText());    
         ArrayList<RawMaterials>rmOLD =  RawMaterialsArrayList();
        boolean foundRawMats = false;
        for (RawMaterials item : rmOLD)
        {//start of foreach loop
           if (item.getproductID() == matfield) 
                {//start of if condition
               int rmcurrentQty = item.getQty();
               int rmnewQty = rmcurrentQty + qtfield;
               item.setQty(rmnewQty);
              JOptionPane.showMessageDialog(null, 
                      "Imported Succesfully! The new Quantity of Material ID - "+matfield +" is : " + rmnewQty);
              foundRawMats = true;
              break; // if the Material ID is found, No need to continue searching
                }//end of if condition
         }//end of foreach loop
            if (!foundRawMats)  // if the Material ID is not found
            {
             JOptionPane.showMessageDialog(null, "Please Enter a valid Material ID", 
            "Notice", JOptionPane.ERROR_MESSAGE, null);
            }
          DefaultTableModel rmmodel = (DefaultTableModel)jTableMAIN.getModel();
          rmmodel.setNumRows(0);
        for (RawMaterials item : rmOLD) 
        {
             Object rowData12[] = new Object[4];
            rowData12[0] = item.getproductID();
            rowData12[1] = item.getproductName();
            rowData12[2] = item.getQty();
            rowData12[3] = item.getKilo();
            rmmodel.addRow(rowData12);     
        }
    }
//method in exporting material
  public void Export(){
        //Method to search and export the quantity for RawMaterialsArraylist
        int matfield = Integer.parseInt(matIDfield.getText());
        int qtfield = Integer.parseInt(qtyfield.getText());    
         ArrayList<RawMaterials>rmOLD =  RawMaterialsArrayList();
        boolean foundRawMats = false;
        for (RawMaterials item : rmOLD)
        {//start of foreach loop
           if (item.getproductID() == matfield) 
                {//start of if condition
               int rmcurrentQty = item.getQty();
               int rmnewQty = rmcurrentQty - qtfield;
               item.setQty(rmnewQty);
              JOptionPane.showMessageDialog(null
                      , "Exported Succesfully! The new Quantity of Material ID - "+matfield +" is : " + rmnewQty);
              foundRawMats = true;
              break; // if the Material ID is found, No need to continue searching
                }//end of if condition
         }//end of foreach loop
            if (!foundRawMats)  // if the Material ID is not found
            {
             JOptionPane.showMessageDialog(null, "Please Enter a valid Material ID", 
            "Notice", JOptionPane.ERROR_MESSAGE, null);
            }
              DefaultTableModel rmmodel = (DefaultTableModel)jTableMAIN.getModel();
          rmmodel.setNumRows(0);
        for (RawMaterials item : rmOLD) 
        {
             Object rowData12[] = new Object[4];
            rowData12[0] = item.getproductID();
            rowData12[1] = item.getproductName();
            rowData12[2] = item.getQty();
            rowData12[3] = item.getKilo();
            rmmodel.addRow(rowData12);     
        }
    }
  //method in searching
  public int SearchbyName(String name) {
        DefaultTableModel rmmodel = (DefaultTableModel)jTableMAIN.getModel();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(rmmodel);
        jTableMAIN.setRowSorter(rowSorter);
        rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" +name));
        jTableMAIN.clearSelection();
        return 0;
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADDMATS;
    private javax.swing.JButton btnASC;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnDESC;
    private javax.swing.JButton btnEXPORT;
    private javax.swing.JButton btnIMPORT;
    private javax.swing.JButton btnSEARCH;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableMAIN;
    // End of variables declaration//GEN-END:variables
}
