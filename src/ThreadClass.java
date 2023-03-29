
//this is a subclass of the thread class, it gives all the attributes and the behavior that it should have to become a Java thread.
public class ThreadClass extends Thread {

    private int number;

    public ThreadClass(int number) {
        this.number = number;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " from the thread " + number);
        }
    }

}
