/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author jharnadoda
 */
public class CarHistory {
    
    private ArrayList<Car> history;
    private Timestamp lastModified;
    
    //constructor
    public CarHistory()
    {
        this.history=new ArrayList<Car>();
        
        Car car1=new Car();
        car1.setCompany("Toyota");
        car1.setManufacturing_year(2020);
        car1.setMin_seats(1);
        car1.setMax_seats(4);
        car1.setSerial_no(1);
        car1.setModel_no("1234");
        car1.setCity("Boston");
        car1.setMaintenance_certi("Expired");
        car1.setAvailability("Available");
        history.add(car1);
        
        Car car2=new Car();
        car2.setCompany("Honda");
        car2.setManufacturing_year(2019);
        car2.setMin_seats(1);
        car2.setMax_seats(5);
        car2.setSerial_no(2);
        car2.setModel_no("5678");
        car2.setCity("Miami");
        car2.setMaintenance_certi(" Not Expired");
        car2.setAvailability("Not available");
        history.add(car2);
        
        Car car3=new Car();
        car3.setCompany("BMW");
        car3.setManufacturing_year(2020);
        car3.setMin_seats(1);
        car3.setMax_seats(4);
        car3.setSerial_no(3);
        car3.setModel_no("1234");
        car3.setCity("Chicago");
        car3.setMaintenance_certi("Not Expired");
        car3.setAvailability("Available");
        history.add(car3);
        
         Car car4=new Car();
        car4.setCompany("GM");
        car4.setManufacturing_year(2018);
        car4.setMin_seats(1);
        car4.setMax_seats(2);
        car4.setSerial_no(4);
        car4.setModel_no("7899");
        car4.setCity("Boston");
        car4.setMaintenance_certi("Expired");
        car4.setAvailability("Not Available");
        history.add(car4);
        

}

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addCar()
    {
      Car c = new Car();
      history.add(c);
      return c;
    }
    
    
    
}
