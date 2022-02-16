/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Car;
import model.CarList;

/**
 *
 * @author apurvazawar
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    Car car;
    CarList history;
    
    public CreateJPanel(Car car, CarList history) {
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

        brand = new javax.swing.JLabel();
        seatNo = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        engineNo = new javax.swing.JLabel();
        modelNum = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        available = new javax.swing.JLabel();
        maintainenceExpiry = new javax.swing.JLabel();
        serialNum = new javax.swing.JLabel();
        licencePlate = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtSeatNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtEngineNo = new javax.swing.JTextField();
        txtLicencePlate = new javax.swing.JTextField();
        txtSerialNum = new javax.swing.JTextField();
        txtModelNum = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();

        brand.setText("Brand");

        seatNo.setText("Seat No.");

        city.setText("City");

        engineNo.setText("Engine No.");

        modelNum.setText("Model No.");

        model.setText("Model");

        year.setText("Year");

        available.setText("Available");

        maintainenceExpiry.setText("Maintainence Expiry");

        serialNum.setText("Serial No.");

        licencePlate.setText("Licence Plate");

        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        title.setText("Create Car Record");

        color.setText("Color");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Yes");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("No");

        jCheckBox3.setText("Yes");

        jCheckBox4.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(title)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(engineNo)
                                .addGap(386, 386, 386)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(licencePlate)
                                            .addComponent(modelNum)
                                            .addComponent(available)
                                            .addComponent(city)))
                                    .addComponent(year)
                                    .addComponent(model)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brand)
                                    .addComponent(seatNo)
                                    .addComponent(serialNum)
                                    .addComponent(maintainenceExpiry)
                                    .addComponent(color))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtColor)
                                    .addComponent(txtSeatNo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox2)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicencePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox4)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(title)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(brand)
                    .addComponent(model)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seatNo)
                    .addComponent(city)
                    .addComponent(txtSeatNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(engineNo)
                        .addComponent(txtEngineNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(licencePlate)
                        .addComponent(txtLicencePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelNum)
                    .addComponent(serialNum)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintainenceExpiry)
                    .addComponent(available)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4))
                .addGap(58, 58, 58)
                .addComponent(btnSave)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private static boolean isAlphabetOrDigits(String str) {
        return str.codePoints().allMatch(ch -> Character.isAlphabetic(ch) || Character.isDigit(ch));
    }

    private static boolean isAlphabet(String str) {
        return str.codePoints().allMatch(ch -> Character.isAlphabetic(ch));
    }
     
    public static boolean isDateValid(String date) {
        try {
            DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            df.setLenient(false);
            Date dt0 = df.parse(date);
            Date dt1 = df.parse("01-01-1990");
            String currentDate = df.format(new Date());
            Date dt2 = df.parse(currentDate);
            if(dt0.after(dt1) && dt0.before(dt2)){
                return true;
            } else {
                return false;
            }
        } catch (ParseException e) {
            return false;
        }
    }
    
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        boolean saveCar=true;
        Car carDetails = history.addNewCar();
        
        if(txtBrand.getText().length() > 0 && isAlphabet(txtBrand.getText())){
            carDetails.setBrand(txtBrand.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter brand name in alphabets!");
            saveCar=false;
        }
        
        if(txtModel.getText().length() > 0 && isAlphabetOrDigits(txtModel.getText())){
            carDetails.setModel(txtModel.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter a valid model name!");
            saveCar=false;
        }
        
        if(txtColor.getText().length() > 0 && isAlphabet(txtColor.getText())){
           carDetails.setColor(txtColor.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter the color in alphabets!");
            saveCar=false;
        }
               
        if(txtYear.getText().length() > 0 && Integer.parseInt(txtYear.getText()) > 1989 && Integer.parseInt(txtYear.getText()) < 2023){
            carDetails.setYear(Integer.parseInt(txtYear.getText()));
        } else {
            JOptionPane.showMessageDialog(null,"Please enter the year between 1989 to 2023!");
            saveCar=false;
        }
        
        if(txtSeatNo.getText().length() > 0 && Integer.parseInt(txtSeatNo.getText()) > 1 && Integer.parseInt(txtSeatNo.getText()) < 10){
            carDetails.setSeatsNo(Integer.parseInt(txtSeatNo.getText()));
        } else {
            JOptionPane.showMessageDialog(null,"Please enter seat number between 2 to 10!");
            saveCar=false;
        }
         
        if(txtCity.getText().length() > 0 && isAlphabet(txtCity.getText())){
           carDetails.setCity(txtCity.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter the city in alphabets!");
            saveCar=false;
        }
        
        if(txtEngineNo.getText().length() > 0 && isAlphabetOrDigits(txtEngineNo.getText())){
            carDetails.setEngineNo(txtEngineNo.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter valid Engine no.!");
            saveCar=false;
        }

        if(txtLicencePlate.getText().length() > 0 && isAlphabetOrDigits(txtLicencePlate.getText())){
            carDetails.setLicensePlate(txtLicencePlate.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter correct Licence plate number!");
            saveCar=false;
        }
        
        if(txtSerialNum.getText().length() > 0 && isAlphabetOrDigits(txtSerialNum.getText()) && txtSerialNum.getText().length() > 11 && txtSerialNum.getText().length() < 18){
            car.setSerialNum(txtSerialNum.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter correct Serial number!");
            saveCar=false;
        }
            
        if(txtModelNum.getText().length() > 0 && isAlphabetOrDigits(txtModelNum.getText()) && txtModelNum.getText().length() == 17){
            car.setModelNum(txtModelNum.getText());
        } else {
            JOptionPane.showMessageDialog(null,"Please enter 17 digit Model number!");
            saveCar=false;
        }
        
        Boolean expiryYes = jCheckBox1.isSelected();
        Boolean expiryNo = jCheckBox2.isSelected();
        
        if(expiryYes == true && expiryNo == false){
            carDetails.setMaintainenceExpiry("yes");
        } else {
            carDetails.setMaintainenceExpiry("no");
        }
        
        if((expiryYes == false && expiryNo == false) || (expiryYes == true && expiryNo == true)) {
            JOptionPane.showMessageDialog(null,"Please select the Maintainence Expiry");
            saveCar=false;
        }
        
        Boolean availableYes = jCheckBox3.isSelected();
        Boolean availableNo = jCheckBox4.isSelected();
        
        if(availableYes == true && availableNo == false){
            carDetails.setAvailable("yes");
        } else {
            carDetails.setAvailable("no");
        }

        if((availableYes == false && availableNo == false) || (availableYes == true && availableNo == true)) {
            JOptionPane.showMessageDialog(null,"Please select the availability");
            saveCar=false;
        }

        if(saveCar) {
            JOptionPane.showMessageDialog(this, "Car saved successfully!!");
            
            txtBrand.setText("");
            txtModel.setText("");
            txtColor.setText("");
            txtYear.setText("");
            txtSeatNo.setText("");
            txtCity.setText("");
            txtEngineNo.setText("");
            txtLicencePlate.setText("");
            txtSerialNum.setText("");
            txtModelNum.setText("");
            jCheckBox1.setSelected(false);
            jCheckBox2.setSelected(false);
            jCheckBox3.setSelected(false);
            jCheckBox4.setSelected(false);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel available;
    private javax.swing.JLabel brand;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel city;
    private javax.swing.JLabel color;
    private javax.swing.JLabel engineNo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel licencePlate;
    private javax.swing.JLabel maintainenceExpiry;
    private javax.swing.JLabel model;
    private javax.swing.JLabel modelNum;
    private javax.swing.JLabel seatNo;
    private javax.swing.JLabel serialNum;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNo;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtSeatNo;
    private javax.swing.JTextField txtSerialNum;
    private javax.swing.JTextField txtYear;
    private javax.swing.JLabel year;
    // End of variables declaration//GEN-END:variables
}
