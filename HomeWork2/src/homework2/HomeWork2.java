/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework2;

 import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
            
         Set <String> names = new HashSet<>(); // list of csv file rows randomly
         Map<String, ArrayList<String>> groups = new HashMap<>();  // dictionary for groups and their 20 values

         String fileName = "/C://Users//canif//Desktop/IT/Year2Java/homework %4 2/MOCK_DATA.csv"; 
         BufferedReader reader = new BufferedReader(new FileReader(fileName));
         //run the block
        try  {
            String line;
            while ((line = reader.readLine()) != null) { // if there is a next line run the block at below
                names.add(line);//adding row of the file randomly
            }//catch the error and print it 
        } catch (IOException e) {
            System.out.println(e);
        }
        
        int count = 0;
        // creating name of the key of groups 
        for(int i = 0 ; i<5 ; i++){
            String keyName = "Group" + i; // creating a keyword with values of "i"
            ArrayList<String> groupUser = new ArrayList<>(); //arraylist for 20 names
            
            
           
            //we have to create a copy of "names" hashset and loop is working with copy hashset because we can't modife the 
                //orginal set with remove method while loop is running
            for (String name : new HashSet<>(names)){
                
                
                //if loop worked 20 times, break it
                if (count == 20){
                    break;
                }  
                
                
              
                groupUser.add(name); //add name into arraylist till loop run 20 time
                names.remove(name); // remove the name from orginal hashset.
                count++;
                
        }
            //set the keyname and group
          groups.put(keyName, groupUser);  
            
        //when 20 name choosen and another group is starting then reset the count
        count = 0;
        }
        
        
            
          System.out.println(groups.get("Group1"));
          System.out.println(groups.get("Group2"));
        
        
        
        
    }   
        }
