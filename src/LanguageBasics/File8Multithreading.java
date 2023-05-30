package LanguageBasics;


public class File8Multithreading{
    public static void main(String[] args) {
        // Process: Program under execution => instance of program so independent.
        // It has its own memory space and resources

        /* Thread:  thread is a lightweight unit of execution within a process. 
        It allows concurrent execution of multiple tasks within the same program.
        Threads share the same memory space and resources of the process.
        Examples of threads include the main thread in a Java application and 
        additional threads created using the Thread class or the Runnable interface */


        /*
         * 
         * Fork/Join: Fork/Join is a programming paradigm used for parallel execution. 
         * It involves breaking a task into smaller subtasks (forking) and then merging
         *  the results (joining) to obtain the final result. It is particularly useful
         *  in divide-and-conquer algorithms. Java provides the ForkJoinPool and
         *  RecursiveTask or RecursiveAction classes to facilitate fork/join-style 
         * parallelism.
         */


        /*
         * Mutex: Mutex stands for "mutual exclusion." It is a synchronization mechanism used to control access to shared resources in multi-threaded programs. 
         * A mutex ensures that only one thread can access the shared resource at a time, preventing data corruption or inconsistencies. 
         * Java provides the synchronized keyword and the Lock interface for implementing mutex synchronization.
         * 
        Race Condition: A race condition occurs when the behavior of a program depends on the relative timing or
         interleaving of multiple threads. It happens when two or more threads access shared resources or variables
          concurrently without proper synchronization. Race conditions can lead to unexpected and incorrect results. 
         *
         */
    }
}