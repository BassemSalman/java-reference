package Algorithms;


public class DivideAndConquer {
    /*Divide and Conquer is a paradigm where problem is solved using the Divide, Conquer, and Combine strategy. 
     * Divide: This involves dividing the problem into smaller sub-problems.
        Conquer: Solve sub-problems by calling recursively until solved.
        Combine: Combine the sub-problems to get the final solution of the whole problem

        examples: quicksort, mergesort ( covered in files )
    */

    /*given array of points p[], find the 2 closest points */

    /*Brute force O(n**2) */

    public double calculate(Point a, Point b) {
        return Math.sqrt(Math.pow(a.x-b.x,2) + Math.pow(a.y-b.y,2));
    }
    public Point[] closestGreedy(Point[] points){
        int indexP1=0;
        int indexP2=1; 
        double minimumDistance = Double.MAX_VALUE;
        Point[] result = new Point[2];
        for(int i = 0; i<points.length; i++){
            for(int j = 0; j<points.length; j++){
                if(i!=j && minimumDistance < calculate(points[i], points[j])) 
                    minimumDistance = calculate(points[i], points[j]);
            }
        }
        result[0] = points[indexP1];
        result[1] = points[indexP2];
        return result;
    }


    /*Divide and Conquer Aproach
     * 
     * Sort points based on x
     * 
     * 
    */
}
