/*
* Contains code that represents the counting process
* It will keep counting the number of votes each cake design is getting
* -------
* implement the counting runnable class by the runnable interface and override the run method to print out how many votes the given design has got so far.
* * */

public class CountingRunnable implements Runnable {

    private Design d;
    public CountingRunnable(Design d) {
        this.d = d;
    }

    @Override
    public void run() {
        System.out.println("Design " + d.getName() + " has " + d.getVotes().size() + " votes.");
    }
}
