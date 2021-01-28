/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author AutoRun
 */
public class Client {

    String name;
    int password;
    double availableMoney, accountNumber;
    ArrayList<Transactions> transactions = new ArrayList<Transactions>();

    public Client() {
    }
    public Client(String name, int password, double availableMoney, 
            double accountNumber) {
        this.name = name;
        this.password = password;
        this.availableMoney = availableMoney;
        this.accountNumber = accountNumber;
    } 

    @Override
    public String toString() {
        return "Client{" + "name: " + name + 
                ", availableMoney: " + availableMoney + 
                ", accountNumber: " + accountNumber + ", "
                + "transactions: " + transactions + '}';
    }
    

    //the main form is appeared
    void checkPassword(int password) throws passwordException, Exception {
        int count = 3;
        while (count <0) //this check is to count #Trials
        {
            try {
                
            if (this.password != password) {
                //JOptionPane for the exception
                throw new passwordException("your Password dosn't Match with "
                        + this.accountNumber+" and you have "+count+" trials");
            }
            else System.out.println("true " +count);
                //show the form of withdraw and add
                //nameframe.setvisible(true)&& mainframe.visible(false)
                //and invoking fn we want

            
            } catch (passwordException e) {
                //JOptionPane.showMessageDialog(e,"Invalid password");
            }finally{count--;}
        }
        //this.dispose(); if the user enter invalid pass more than 3 times

    }
    String getCurrentTimeDate(){
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        //to get the dateTime with this format 2018/12/01 01/06/50
	Date date = new Date();
        return ""+dateFormat.format(date);
    }
	

    String add(double m) {
        Transactions t = new Transactions();
        String time;
        time = getCurrentTimeDate();
        t.set(m + " has been added to your account", time);
        
        transactions.add(t);
        this.availableMoney += m;
        
        return "The Process is done Successfully";
    }

    String withdraw(double m)throws withdrawException{
        if (m < this.availableMoney) {
            Transactions t = new Transactions();
            String time;
            time = getCurrentTimeDate();
            t.set(m + "has been withdrawn from your account", time);
            this.availableMoney -= m;
            transactions.add(t);
            return "The Process is done Successfully";
        } else {//in alerm window
            throw new withdrawException("The Sum you entered is greater "
                    + "than your available "
                    + "money... \n your available Money is "
                    + this.availableMoney);
        }
    }

    String  displayLastTransactions(){
        String s="";
        for (int i=transactions.size();i>transactions.size()-5;i--){
            s+=transactions.get(i);
        }
        return s;
    }
}
