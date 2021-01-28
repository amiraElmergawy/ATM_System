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
public class withdrawException extends Exception {

    /**
     * Creates a new instance of <code>withdraw</code> without detail message.
     */
    public withdrawException() {
        super("The Sum you entered is greater than your available money... ");
    }

    /**
     * Constructs an instance of <code>withdraw</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public withdrawException(String msg) {
        super(msg);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
    
   
}
