package OOP;

public class AbstractClassesAndInterfaces {
    /*Polymorphism can be achieved:
     * 0-100% through abstract classes
     * 100% through interfaces
     */

    /*
     * abstraction: focusing on hiding internal details of system/object exposing essential features only 
     * promotes: readability - complexity - modularity
     * 
     * abstract class: a class that cant be instantiated => blueprint for other classes
     * Used to define common atributes and behaviors, where methods could or could not be abstract
     * 
     * public abstract MyClass {
     *  protected int x;
     *  public abstract void hi();
     *  public static int add(int a, int b) {return a + b;}
     * }
     * 
     * subclasses SHOULD override hi() but MAY override add()
     * usually add() would be a method with a shared implementation
     */

    /*
     * Abstract Method: 
     * Declared in Abstract Class / Interface with no implementation
     * Subclass / Implementation Class SHOULD implement it 
     * (subclass not implementing it would become abstract too)
     * 
     */


    /*
     * Interface: collection of abstract methods and CONSTANT values
     * It defines what a class should do but not how it does it
     * 
     * => no instance variables
     * => full abstraction
     * => no method bodies
     * => class can implement multiple interfaces
     *
     * 
     * default method:
     * method in interface with default implementation => body
     * default void method(){
     * ...
     * }
     * 
     * => can add methods to interfaces without needing to edit all implementing classes
     */


    /*
     * Abstract Class: is-a :: loose coupling => Runnable, Comparable, ..
     * Interface: defines behavior :: Animal must have the following methods and attributes for example
     */

}
