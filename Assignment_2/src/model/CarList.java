/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author apurvazawar
 */
public class CarList {
    
    private ArrayList<Car> history;
    private String lastUpdated;

    public CarList(){
        this.history = new ArrayList<>();
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
     
    public Car addNewCar(boolean isNewCar, int selectedRow, Car carRecord){  
        DateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss.SSS a");
        String today = formatter.format(new Date());
        carRecord.setTimestamp(today);
        lastUpdated = today;
        
        if(isNewCar){
            history.add(carRecord);
        } else {
            history.set(selectedRow, carRecord);
        }
        return carRecord;
    }
    
    //Find the first available passenger car.
    public ArrayList<Car> filterByFirstCar(){
         ArrayList<Car> list = new ArrayList<>();
         for(Car cd : history){
             if(cd.getAvailable().equalsIgnoreCase("yes")){
                 list.add(cd);
                 break;
            }
        }
         return list;
    }
    
    //How many cars are currently available.
    public ArrayList<Car> filterByAvailability(){
     ArrayList<Car> list = new ArrayList<>();
     int count=0;
     int count2 = 0;
        for(Car cd : history){
            if(cd.getAvailable().equalsIgnoreCase("yes")){
                count++;
                list.add(cd);
            }else if(cd.getAvailable().equalsIgnoreCase("no")){
                count2++;
            }
        }
        JOptionPane.showMessageDialog(null, " Cars Available = " + count + "\n" + " Cars Not Available = " + count2);
        return list;
    }
    
    //List all cars that are made by Toyota, GM, etc.
    public ArrayList<Car> filterByBrand(String brandName){
        ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(cd.getBrand().contains(brandName)){
                list.add(cd);
            }
        }
        return list;
    }
    
    //List all cars that were manufactured in a given year, ‘x’.
    public ArrayList<Car> filterByYear(String year){
        ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(String.valueOf(cd.getYear()).contains(year)){
                list.add(cd);
            }
        }
        return list;
    }
    
    //List all cars with a minimum of x seats but no more than y seats.
    public ArrayList<Car> filterBySeats(String seat1,String seat2){
         ArrayList<Car> list = new ArrayList<>();
         for(Car cd : history){
            int maxCount = Integer.parseInt(String.valueOf(cd.getSeatsNo()));
            int count1 = Integer.parseInt(String.valueOf(seat1));
            int count2 = Integer.parseInt(String.valueOf(seat2));
            if(maxCount >= count1 && maxCount <= count2){
                list.add(cd);
            }
        }
         return list;
    }
    
    //Find a car with the given serial number. List the attributes of the found car.
    public ArrayList<Car> filterBySerialNum(String serial){
        ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(String.valueOf(cd.getSerialNum()).contains(serial)){
                list.add(cd);
            }
        }
        return list;
    }
    
    //List all cars given the model number.
    public ArrayList<Car> filterByModelNum(String model){
     ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(String.valueOf(cd.getModelNum()).contains(model)){
                list.add(cd);
            }
        }
        return list;
    }
    
    //List all the car manufacturers used by (this) Uber.
    public ArrayList<Car> filterByShowAllCars(){
        ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(true){
                list.add(cd);
            }
        }
        return list;
    }
    
    //When was the last time the fleet catalog was updated
    public String filterByLastUpdate(){
        return lastUpdated;
    }
    
    //List all cars that are available in a given city.
    public ArrayList<Car> filterByCity(String city){
     ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(cd.getCity().contains(city) && cd.getAvailable().equalsIgnoreCase("yes")){
                list.add(cd);
            }
        }
        return list;
    }
    
    //List all cars that have expired maintenance certificates.
    public ArrayList<Car> filterByExpiry(){
     ArrayList<Car> list = new ArrayList<>();
        for(Car cd : history){
            if(cd.getMaintainenceExpiry().equalsIgnoreCase("yes")){
                list.add(cd);
            }
        }
        JOptionPane.showMessageDialog(null,"Showing cars having expired certificate");
        return list;
    }

}
