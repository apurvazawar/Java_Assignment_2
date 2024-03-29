/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarList;

/**
 *
 * @author apurvazawar
 */
public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    Car car;
    CarList history;
    
    public SearchJPanel(Car car, CarList history) {
        initComponents();
        this.car = car;
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        btnFirstAvailableCar = new javax.swing.JButton();
        btnCurrentAval = new javax.swing.JButton();
        btnFilterByBrand = new javax.swing.JButton();
        btnFilterByYear = new javax.swing.JButton();
        btnFilterBySeat = new javax.swing.JButton();
        btnFilterBySerial = new javax.swing.JButton();
        btnFilterByModelNum = new javax.swing.JButton();
        btnFilterByManufacturer = new javax.swing.JButton();
        btnLastUpdated = new javax.swing.JButton();
        btnFilterByCity = new javax.swing.JButton();
        btnAllRecords = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Output = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 36, 63));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        title.setBackground(new java.awt.Color(22, 36, 63));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Search");

        btnFirstAvailableCar.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFirstAvailableCar.setText("Find the first available passenger car");
        btnFirstAvailableCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailableCarActionPerformed(evt);
            }
        });

        btnCurrentAval.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnCurrentAval.setText("How many cars are currently available");
        btnCurrentAval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentAvalActionPerformed(evt);
            }
        });

        btnFilterByBrand.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterByBrand.setText("List all cars that are made by Toyota and GM");
        btnFilterByBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterByBrandActionPerformed(evt);
            }
        });

        btnFilterByYear.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterByYear.setText("List all cars that were manufactured in a given year, ‘x’");
        btnFilterByYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterByYearActionPerformed(evt);
            }
        });

        btnFilterBySeat.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterBySeat.setText("List all cars with a minimum of x seats but no more than y seats");
        btnFilterBySeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterBySeatActionPerformed(evt);
            }
        });

        btnFilterBySerial.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterBySerial.setText("Find a car with the given serial number");
        btnFilterBySerial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterBySerialActionPerformed(evt);
            }
        });

        btnFilterByModelNum.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterByModelNum.setText("List all cars given the model number");
        btnFilterByModelNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterByModelNumActionPerformed(evt);
            }
        });

        btnFilterByManufacturer.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterByManufacturer.setText("List all the car manufacturers used by (this) Uber");
        btnFilterByManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterByManufacturerActionPerformed(evt);
            }
        });

        btnLastUpdated.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnLastUpdated.setText("When was the last time the fleet catalog was updated");
        btnLastUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastUpdatedActionPerformed(evt);
            }
        });

        btnFilterByCity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFilterByCity.setText("List all cars that are available in a given city");
        btnFilterByCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterByCityActionPerformed(evt);
            }
        });

        btnAllRecords.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnAllRecords.setText("List all cars that have expired maintenance certificates");
        btnAllRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllRecordsActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(22, 36, 63));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "Color", "Year", "Seats", "City", "Engine No.", "Licence plate", "Serial No.", "Model No.", "Maintainence Expiry", "Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(70);
        }

        Output.setBackground(new java.awt.Color(22, 36, 63));
        Output.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        Output.setForeground(new java.awt.Color(255, 255, 255));
        Output.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Output)
                    .addComponent(title)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFirstAvailableCar)
                            .addComponent(btnFilterByYear)
                            .addComponent(btnFilterByModelNum)
                            .addComponent(btnFilterByCity)
                            .addComponent(btnFilterByBrand)
                            .addComponent(btnLastUpdated))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCurrentAval)
                            .addComponent(btnFilterBySeat)
                            .addComponent(btnFilterByManufacturer)
                            .addComponent(btnAllRecords)
                            .addComponent(btnFilterBySerial)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1353, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(title)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstAvailableCar)
                    .addComponent(btnCurrentAval))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilterByYear)
                    .addComponent(btnFilterBySeat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilterByModelNum)
                    .addComponent(btnFilterByManufacturer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilterByCity)
                    .addComponent(btnAllRecords))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilterBySerial)
                    .addComponent(btnFilterByBrand))
                .addGap(18, 18, 18)
                .addComponent(btnLastUpdated)
                .addGap(50, 50, 50)
                .addComponent(Output)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFirstAvailableCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailableCarActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> list = history.filterByFirstCar();
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFirstAvailableCarActionPerformed

    private void btnCurrentAvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentAvalActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> list = history.filterByAvailability();
        populateTable(list);
    }//GEN-LAST:event_btnCurrentAvalActionPerformed

    private void btnFilterByBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterByBrandActionPerformed
        // TODO add your handling code here:
        String brand1 = null;
        String brand = JOptionPane.showInputDialog(null,"Enter the car brand", brand1);
        ArrayList<Car> list = history.filterByBrand(brand);
        populateTable(list);
    }//GEN-LAST:event_btnFilterByBrandActionPerformed

    private void btnFilterByYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterByYearActionPerformed
        // TODO add your handling code here:
        String year1 = null;
        String year = JOptionPane.showInputDialog(null,"Enter the year", year1);
        ArrayList<Car> list = history.filterByYear(year);
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFilterByYearActionPerformed

    private void btnFilterBySeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterBySeatActionPerformed
        // TODO add your handling code here:
        String seat1 = null;
        String seat2 = null;
        String seatf = JOptionPane.showInputDialog(null,"Enter the minimum number of seats", seat1);
        String seatl = JOptionPane.showInputDialog(null,"Enter the maximum number of seats", seat2);
        ArrayList<Car> list = history.filterBySeats(seatf,seatl);
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFilterBySeatActionPerformed

    private void btnFilterBySerialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterBySerialActionPerformed
        // TODO add your handling code here:
        String serial1 = null;
        String serial = JOptionPane.showInputDialog(null,"Enter the serial", serial1);
        ArrayList<Car> list = history.filterBySerialNum(serial);
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFilterBySerialActionPerformed

    private void btnFilterByModelNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterByModelNumActionPerformed
        // TODO add your handling code here:
        String model1 = null;
        String model = JOptionPane.showInputDialog(null,"Enter the model number", model1);
        ArrayList<Car> list = history.filterByModelNum(model);
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFilterByModelNumActionPerformed

    private void btnFilterByManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterByManufacturerActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> list = history.filterByShowAllCars();
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFilterByManufacturerActionPerformed

    private void btnLastUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastUpdatedActionPerformed
        // TODO add your handling code here:
        String lastUpdated = history.filterByLastUpdate();
        JOptionPane.showMessageDialog(null,"The fleet was updated at " + lastUpdated);
    }//GEN-LAST:event_btnLastUpdatedActionPerformed

    private void btnFilterByCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterByCityActionPerformed
        // TODO add your handling code here:
        String city1 = null;
        String city = JOptionPane.showInputDialog(null,"Enter the city", city1);
        ArrayList<Car> list = history.filterByCity(city);
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnFilterByCityActionPerformed

    private void btnAllRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllRecordsActionPerformed
        // TODO add your handling code here:
        ArrayList<Car> list = history.filterByExpiry();
        System.out.print(list);
        populateTable(list);
    }//GEN-LAST:event_btnAllRecordsActionPerformed

    private void populateTable(ArrayList<Car> list) {
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(Car cd: list){
      
           Object[] row = new Object[12];
           row[0] = cd.getBrand();
           row[1] = cd.getModel();
           row[2] = cd.getColor();
           row[3] = cd.getYear();
           row[4] = cd.getSeatsNo();
           row[5] = cd.getCity();
           row[6] = cd.getEngineNo();
           row[7] = cd.getLicensePlate();
           row[8] = cd.getSerialNum();
           row[9] = cd.getModelNum();
           row[10] = cd.getMaintainenceExpiry();
           if(cd.getAvailable() == "yes"){
               row[11] = "Yes";
           }else{
               row[11] = "No";
           }
           row[11] = cd.getAvailable();
           model.addRow(row);

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Output;
    private javax.swing.JButton btnAllRecords;
    private javax.swing.JButton btnCurrentAval;
    private javax.swing.JButton btnFilterByBrand;
    private javax.swing.JButton btnFilterByCity;
    private javax.swing.JButton btnFilterByManufacturer;
    private javax.swing.JButton btnFilterByModelNum;
    private javax.swing.JButton btnFilterBySeat;
    private javax.swing.JButton btnFilterBySerial;
    private javax.swing.JButton btnFilterByYear;
    private javax.swing.JButton btnFirstAvailableCar;
    private javax.swing.JButton btnLastUpdated;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
