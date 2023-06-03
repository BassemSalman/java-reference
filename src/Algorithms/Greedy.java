package Algorithms;


import java.util.HashMap;

public class Greedy {
    /* Greedy Algorithms make locally optimal choices at each step
     * (hoping to find global optimum)
     * 
     * Do best choice at the moment
     * (not always optimal)
     */

    /*
     * All greedy algorithms follow a basic structure: 
        Declare an empty result = 0.
        We make a greedy choice to select, If the choice is feasible add it to the final result.
        return the result.
     */

    /* example */
    public int minimumNumberOfPapers(int money) {
        // Remove 100ks first, then 50k, then  .. 
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(100, 50);
        map.put(50,20);
        map.put(20, 10);
        map.put(10, 5);
        map.put(5, 1);

        int currentPaper = 100;
        int papers = 0;
        while(money != 0) {
            if(money - currentPaper < 0) currentPaper = map.get(currentPaper);
            else papers++;
        }
        return papers;
    }
}