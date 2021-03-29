/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Name {
    
    public String FirstName;
    public String MiddleName;
    public String LastName;
    
    //Parameterized Constructor
    public Name(String FirstName, String MiddleName,String LastName)
    {
       super();
       this.FirstName = FirstName;
       this.MiddleName = MiddleName;
       this.LastName = LastName;
    
    }
    public String getFirstName() 
    {
       return FirstName;
    }
    public String getMiddleName() {
    return MiddleName;
    }
 
    public String getLastName() {
    return LastName;
    }
    
}
