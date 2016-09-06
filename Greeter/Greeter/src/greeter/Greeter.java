/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author almay
 */
public class Greeter {

    /**
     * 
     * @param aName a string that stores the name of a person to be greeted
     */
    public Greeter(String aName) {
        name = aName;
    }
    
    /**
     * 
     * @return a sentence greeting the person by name
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }
   
    
    public void setName(String aName) {
        name = aName;
    }
    
    /**
     * 
     * @param other another Greeter with which this and other shall switch names
     */
    public void swapNames(Greeter other) {
        String otherNameRunner = other.name;
        other.setName(this.name);
        this.setName(otherNameRunner);
        
    }
    
    private String name; 
    
    /**
     * 
     * @param args runs the program that creates a Greeter named World to whom
     * "Hello" is said
     */
     public static void main(String[] args) {
        Greeter helloWorldGreeter = new Greeter("World");
        Greeter nameGreeter = new Greeter("Insert Name Here");
        String greeting = helloWorldGreeter.sayHello();
        System.out.println(nameGreeter.sayHello());
        System.out.println(greeting);
        System.out.println("Swapping names...");
        nameGreeter.swapNames(helloWorldGreeter);
        System.out.println(nameGreeter.sayHello());
        System.out.println(helloWorldGreeter.sayHello());
        
    }
    
}
class GreeterApp {
    
   public static void main() {
       Greeter dudeGreeter = new Greeter("Dude");
        Greeter dudeGreeterReference = dudeGreeter;
        dudeGreeter.setName("Elagabalus");
        dudeGreeterReference.sayHello();
   }
}
