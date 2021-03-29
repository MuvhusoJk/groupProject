/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class PhoneNumber {
    
   public int Home;
   public int Mobile;
   public int Office;
    
    //Parameterized Constructor
    public PhoneNumber(int Home, int Mobile,int Office)
    {
        super();
        this.Home = Home;
        this.Mobile = Mobile;
        this.Office = Office;
        
    }
 
    public int getHome() {
    return Home;
    }
 
    public int getMobile() {
    return Mobile;
    }
 
    public int getOffice() {
    return Office;
    }
            
    
}
