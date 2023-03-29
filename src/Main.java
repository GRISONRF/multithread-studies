public class Main {
    public static void main(String[] args) {


        //create a new instance of the thread class
        //this can be executed in its own path of execution and it runs in parallel to the main thread
        ThreadClass thread1 = new ThreadClass(1);

        // A thread can be run by calling its run method directly. But that's not how it should be done, because, then, it'll not behave as a thread. Instead, lets use the method start() -> this will kick off that thread and proceed to the next line without waiting for that thread to execute
        thread1.start();  //Here we can see 1 2 3 4 5 printed in the terminal

        //This print random numbers from three threads that run at the same time. Every time I run the program they will be printed in a different order.
        for(int count = 1; count<=3; count++){
            ThreadClass thread2 = new ThreadClass(count);
            thread2.start();

        }



        //RunnableInterface needs a thread to execute the behavior it defines
        RunnableInterface runnableInterface = new RunnableInterface();
        //now I need to tell the thread that it should execute the behavior defined by RunnableInterface by passing runnableInterface object as an argument to the construct of the thread class
        Thread thread = new Thread(runnableInterface);
        thread.start();

    }
}