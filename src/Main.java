public class Main {
    public static void main(String[] args) {


        //create a new instance of the thread class
        //this can be executed in its own path of execution and it runs in parallel to the main thread
        ThreadClass thread1 = new ThreadClass(1);

        // A thread can be run by calling its run method directly. But that's not how it should be done, because, then, it'll not behave as a thread. Instead, lets use the method start() -> this will kick off that thread and proceed to the next line without waiting for that thread to execute
//        thread1.start();  //Here we can see 1 2 3 4 5 printed in the terminal

        //This print random numbers from three threads that run at the same time. Every time I run the program they will be printed in a different order.
        for(int count = 1; count<=3; count++){
            ThreadClass thread2 = new ThreadClass(count);
//            thread2.start();

        }



        //RunnableInterface needs a thread to execute the behavior it defines
        RunnableInterface runnableInterface = new RunnableInterface();
        //now I need to tell the thread that it should execute the behavior defined by RunnableInterface by passing runnableInterface object as an argument to the construct of the thread class
        Thread thread = new Thread(runnableInterface);
//        thread.start();



        /*Start of the code for the cake design competition
        * ----------------------------------------------------------
        * For all three designs, need to create and start two threads each for voting and for counting.
        * To do that, first instantiate the voting runnable and counting runnable, then create two threads, one for voting and one for counting, passing in the correct runnable instance. And finally, start the threads.
         * */

        Design d1 = new Design(1, "D1");

        //create an obj of the VotingRunnable and CountingRunnable for design1
        VotingRunnable votingRunnableD1 = new VotingRunnable(d1);
        CountingRunnable countingRunnableD1 = new CountingRunnable(d1);

        //create a new thread instance, passing in the VotingRunnable obj
        Thread votingD1 = new Thread(votingRunnableD1);

        //create a new  thread instance, passing in the CountingRunnable obj
        Thread countingD1 = new Thread(countingRunnableD1);

        //start the voting thread for design1
        votingD1.start();

        //start the counting thread for design1
        countingD1.start();

        //do the same for the other designs

        Design d2 = new Design(2, "D2");
        VotingRunnable votingRunnableD2 = new VotingRunnable(d2);
        CountingRunnable countingRunnableD2 = new CountingRunnable(d2);
        Thread votingD2 = new Thread(votingRunnableD2);
        Thread countingD2 = new Thread(countingRunnableD2);
        votingD2.start();
        countingD2.start();

        Design d3 = new Design(3, "D3");
        VotingRunnable votingRunnableD3 = new VotingRunnable(d3);
        CountingRunnable countingRunnableD3 = new CountingRunnable(d3);
        Thread votingD3 = new Thread(votingRunnableD3);
        Thread countingD3 = new Thread(countingRunnableD3);
        votingD3.start();
        countingD3.start();

    }
}