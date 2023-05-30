package LanguageBasics;
import java.util.ArrayList;

public class File2Method {

    public void method(){ /*method signature */

    }

    public static int mult(int a, int b){ // Method.multiply(1,2) - static method
        return a*b;
    }

    public void passByValue(int a){ // methodObject.passByValue()  -  instance method
        a=10; // doesnt change it
    }
    
    public void passByReference(ArrayList<Integer> a) {
        a.add(1);
    }


    public void mathOperations(int a, int b){
        double r = Math.random(); // 0-1
        Math.sqrt(8);
        Math.pow(1,2);
        //etc
    }
}
