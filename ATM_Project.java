/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author AutoRun
 */
public class ATM_Project {
    public static ArrayList<Client> clients=new ArrayList<Client>();
    /**
     * @param args the command line arguments
     */
    static String displayInfo (double acountNumber)throws accountExistenceExeption{
           Client c=new Client();
           for(int i=0;i<clients.size();i++){
               c=clients.get(i);
               if(c.accountNumber==acountNumber){
                   return ""+c;
               }
           }
           throw new accountExistenceExeption();
     //return "This AccountNo Is Not Exist";
    }
    public static void main(String[] args) {
        
        Client c1=new Client("ahmed",1234,35000,126788499);
        Client c2=new Client("amira",1244,30000,126788999);
        Client c3=new Client("marina",1134,95000,126788409);
        Client c4=new Client("mohamed",3334,43000,267884990);
        Client c5=new Client("Angel",1444,60000,129988499);
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);
        clients.add(c5);
        System.out.println("enter your acount and your pass");
        int pass;
        double acount;
        Scanner s=new Scanner(System.in);
        pass=s.nextInt();
        acount=s.nextDouble();
        try {
            System.out.println("your info is "+displayInfo(acount));
        } catch (accountExistenceExeption ex) {
            Logger.getLogger(ATM_Project.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            c1.checkPassword(pass);
        } catch (Exception ex) {
            Logger.getLogger(ATM_Project.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        System.out.println(c2.add(7000));
        try {
            System.out.println(c3.withdraw(100000));
        } catch (withdrawException ex) {
            Logger.getLogger(ATM_Project.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    

}
