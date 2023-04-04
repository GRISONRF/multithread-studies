/*
* Contains code that represents the voting process.
* It will keep track of what cake designs are getting votes
* ----
* implement the voting runnable class by the runnable interface, override the run method to print out that voting is going on for each design, adding one vote to the list of votes for that design.
* */
public class VotingRunnable implements Runnable {

    private Design d;
    //boolean flag to handle the stopping of the task
    protected boolean doStop = false;
    public VotingRunnable(Design d) {
        this.d = d;
    }

    @Override
    public void run() {
        while(!doStop) {
            System.out.println("Voting going on for design " + d.getName());
            d.getVotes().add(1L);

            //generate a random number between 0 - 1000
            Double sleepFor = Math.random() * 1000;

            //pause the thread for this random amount of time
            try {
                Thread.sleep(sleepFor.longValue());
            } catch(InterruptedException e){
                e.printStackTrace();
            }


        }




    }
}
