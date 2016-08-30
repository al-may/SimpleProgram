/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleprogram;

/**
 *
 * @author almay
 */
public class SimpleProgram {

    private String name;
    /**
     * 
     * @param aName a string that a name
     */
    
    SimpleProgram(String aName) {
        this.name = aName;
    }
    
    public void sayHi() {
    System.out.println("Hi " + this.name + "!");
    /**
     * @return returns nothing, prints the name stored in this.name
     */
    }
            
    
    public static void main(String[] args) {
        SimpleProgram coolName = new SimpleProgram("Cool Name");
        coolName.sayHi();
    }
    
}
