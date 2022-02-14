/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author apurvazawar
 */
public class Car {
    
    private String brand;
    private String model;
    private int serialNum;
    private String color;
    private int year;
    private String engineNo;
    private int seatsNo;
    private String licensePlate;
    private String oName;
    private int oTel;
    private String oEmail;
    private int oLicense;
    private int oSSN;
    private String oAddress;
    private int warrantyYear;
    private String photo;
    private String available;
    private String maintainenceExpiry;
    private String city;
    private int modelNum;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getMaintainenceExpiry() {
        return maintainenceExpiry;
    }

    public void setMaintainenceExpiry(String maintainenceExpiry) {
        this.maintainenceExpiry = maintainenceExpiry;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(int seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public int getoTel() {
        return oTel;
    }

    public void setoTel(int oTel) {
        this.oTel = oTel;
    }

    public String getoEmail() {
        return oEmail;
    }

    public void setoEmail(String oEmail) {
        this.oEmail = oEmail;
    }

    public int getoLicense() {
        return oLicense;
    }

    public void setoLicense(int oLicense) {
        this.oLicense = oLicense;
    }

    public int getoSSN() {
        return oSSN;
    }

    public void setoSSN(int oSSN) {
        this.oSSN = oSSN;
    }

    public String getoAddress() {
        return oAddress;
    }

    public void setoAddress(String oAddress) {
        this.oAddress = oAddress;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}