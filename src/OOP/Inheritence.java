package OOP;

public class Inheritence {
    /* Fundamental Concept in OOP where child/subclass inherits attributes and methods of parent and can extend its functionality */
    /* It enables code reuse, extensibility, and the creation
     of hierarchical relationships between classes.
     - Modularity
     - Polymorphism
     - Reusability
      */

    /*
     * public class Shape{
     *  String color;
     * 
     * }
     * public class Circle extends Shape {
     * int radius;
     *  public Circle(){
     *     super() // found automatically
     *  }
     *  // has attribute color as well
     * }
     */

    /*
     * types of inheritence:
     * Single Inheritence A->B
     * Multiple Inheritence(Unsupported in Java): A->B,C
     * MultiLevel Inheritence: A->B->C
     * Hierarchical Inheritence: B,C,D->A
     */

    /*Multiple Inheritence Problem:
     * ((diamond problem))
     * 
     * C,D->A (inheriting and overriding method foo())
     * B->C,D
     * if b.foo(), which foo() would be called? D or C? None
     * 
     * 
     * NOOO PROBLEM IS IN INSTANCE VARS AND METHODS
     */


    /*
     * Object Class
     * Parent of All Classes 
     * .toString()
     * .hashCode()
     * .equals()
     * .clone()
     * .getClass()
     * ..
     * 
     */


    /*
        Is-A Relationship and Casting
     * Animal a = new Dog(); // implicit casting
     * if(a instanceof Dog) true;
     * 
     * Dog d = (Dog) a; // explicit casting after making sure a is instanceof dog
     */
}
