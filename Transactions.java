/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_project;
/**
 *
 * @author AutoRun
 */
public class Transactions {
    String action,date;
    
    public String getAction() {
        return action;
    }

    public void set(String action,String date) {
        this.action = action;
        this.date = date;
    }

    

    @Override
    public String toString() {
        return "Transactions:" + "The Action Performed is " + action + "   in date & time " + date ;
    }

    


   
    
    
}
