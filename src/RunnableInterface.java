//When RunnableInterface class implements the Runnable interface and overrides the run method, it gets that running behavior.
//So an instance of the RunnableInterface class encapsulates the running behavior that my thread needs to execute.


public class RunnableInterface implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}
