package LanguageBasics;

import java.util.Arrays;

public class File4ConditionalsLoopsRecursion {

    public static void main(String[] args) {
        int[] a = {1,2,4,56,1,5,99};
        Arrays.sort(a);
        System.out.println(arraySum(a,0));
        System.out.println(binarySearch(99,0,a.length,a));

        System.out.println(arraySum(new int[]{1,2,4},0));

        boolean b = 1==4;
        if(b){

        }
        else {

        }
        // etc && || 
        int x = 10;
        switch (x) {
            case 1:
                
                break;
            case 2:

                break;
            default:
                break;
        }


        int i;
        for(i = 0; i<10; i++){

        }

        while(i<50){
            
            i++;
        }

        do{
            i+=10;
        }while(i<100);

        String[] strs = {"hi", "bye"};
        for(String str : strs) {
            System.out.println(str);
        }


    }

    
    public static int arraySum(int[] a, int i){
        if(i == a.length) return 0;
        return a[i] + arraySum(a,i+1);
    }



    public static int binarySearch(int e, int start, int end, int a[]){
        if(start > end) return -1;
        int mid = (start+end)/2;
        if(a[mid] > e){ // search left
            return binarySearch(e, start, mid-1, a);
        }
        else if(a[mid] < e) { // search right
            return binarySearch(e, mid+1, end, a);
        }
        return mid;
    }

}

/*
 * 
 * 1. Iterative vs. Recursive Approach => rec is simpler to read and code but harder for pc
    2. Memory Utilization of a Recursive Approach => new stack frame per call => Tail Recusrion sometimes is more optimised
    3. Maintaining Intermediate Results while Using Recursion => sumArr(arr,i,currSum) and return currSum on baseCase
    4. Constructing the Recursive Calls and Determining the Base Case => when to stop?

 */