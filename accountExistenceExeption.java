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
public class accountExistenceExeption extends Exception {

    /**
     * Creates a new instance of <code>accountExistenceExeption</code> without
     * detail message.
     */
    public accountExistenceExeption() {
        super("This Account Is Not Exist");
    }

    /**
     * Constructs an instance of <code>accountExistenceExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public accountExistenceExeption(String msg) {
        super(msg);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
