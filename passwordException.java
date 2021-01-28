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
public class passwordException extends Exception {

    /**
     * Creates a new instance of <code>passwordException</code> without detail
     * message.
     */
    public passwordException() {
        super("Password Is Not Valid");
    }

    /**
     * Constructs an instance of <code>passwordException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public passwordException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage(); 
    }
    
}
