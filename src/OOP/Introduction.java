package OOP;

import java.util.ArrayList;

class DefaultClassAllowed{

}
public class Introduction {
    /*
     * Classes are blueprints that define structure and behavior of object
     * Objects are instances / specefic occurrence of a class
     */
    
    public static void main(String[] args) {
        // instantiated => space in memory
        ArrayList<Integer> a = new ArrayList<>();

        // garbage collector frees it when not referenced anymore
        // local variables die with method returns, yet what they reference stays alive if its referenced somewhere else

        /*Access Modifiers
         * public: anywhere
         * default: inside current package
         * protected: inside current class and subclasses
         * private: inside current class only
         */

        /* Classes can have attributes/methods
         * -instance specific
         * -static ( shared over class )
         */

        /*
         * Constructors :
         * - default
         * - parameterized
         *
         */
    }
    private int outerVariable;
    private static int staticOuterVariable;

    // Inner class (non-static nested class)
    /*
     * To instantiate
     * Outer o = new Outer();
     * Outer.Inner inner = o.new Inner(); 

     */
    class Inner {  // instance specific
        void display() {
            System.out.println("Inner class method");
            System.out.println("Outer variable: " + outerVariable);
        }
    }

    static class InnerStatic {  // Shared over class => 
        void display() {
            System.out.println("Inner class method");
            System.out.println("Outer variable: " + staticOuterVariable);
        }
    }

    // Method with a local class ( limited functionality )
    void localClassExample() {
        class Local {
            void display() {
                System.out.println("Local class method");
            }
        }

        Local local = new Local();
        local.display();
    }

    // Method with an anonymous class (Not to be referenced elsewhere)
    void anonymousClassExample() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class implementation of Runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }


    private String s;
    public String getS(){
        return s; // user cannot change this
    }
    /* Accessor ( Getter ) 
    *  Are an example of encapsulation, thus hiding implementation details and enforcing validation rules
        (notice: getter of List allows manipulation)
    */


    /*
     * Final Class => Can't be extended
     * Final Method=> Can't be overriden
     */


    /* Enum: ds to allow set of named values and enhance readability */
    /* DayOfWeek.MONDAY */
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    /*Can associate some value like MONDAY("hi"); String s; and in constructor set it
     * nevermind
     */
    }
}
