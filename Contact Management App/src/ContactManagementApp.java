/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.util.*;
public class ContactManagementApp 
{

   
    public static void main(String[] args) throws Exception
    {
        
     List<Location> list = new ArrayList<Location>();
     
    
     list.add(new Location("South Africa", "Joburg","Protea Glen ext 21"));
     list.add(new Location("Uganda", "East London","Kensington 1243"));
     list.add(new Location("America", "Campton","Weast Coast 45"));
     
    
 
        for (Location s : list)//Iterates as long as there are elements in the list. An object s is created of type Employee class.
        //for (Name n : obj)
        {
            System.out.print("Country, State and Address is : ");
            System.out.println(s.getCountry()+","+s.getState()+"," +s.getAddress());
            
          
        }
        
        List<Name> obj = new ArrayList<Name>();
        
        
     obj.add(new Name("Andzani", "Cornelius","Baloyi"));
     obj.add(new Name("Mesut", "Ozil","Kane"));
     obj.add(new Name("Kevin", "Prince","Khoza"));
     
      for (Name n : obj)
        {
             System.out.print("First name, middle name and last name is : ");
            System.out.println(n.getFirstName()+","+n.getMiddleName()+"," +n.getLastName());
        }
        
        
    }//End of main() method
}//end of DisplayArrayList class
        

  