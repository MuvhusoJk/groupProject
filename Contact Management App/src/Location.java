/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Location {
    
    public String Country;
    public String State;
    public String Address;
    
    //Parameterized Constructor
    public Location (String Country, String State,String Address)
    {
       super();
       this.Country = Country;
       this.State = State;
       this.Address = Address;
    
    }
    public String getCountry() 
    {
       return Country;
    }
    public String getState() {
    return State;
    }
 
    public String getAddress() {
    return Address;
    }
    
}
    

