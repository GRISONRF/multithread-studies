/*
* Contains code that represents the voting process.
* It will keep track of what cake designs are getting votes
* ----
* implement the voting runnable class by the runnable interface, override the run method to print out that voting is going on for each design, adding one vote to the list of votes for that design.
* */
public class VotingRunnable implements Runnable {

    private Design d;
    public VotingRunnable(Design d) {
        this.d = d;
    }

    @Override
    public void run() {
        System.out.println("Voting going on for design " + d.getName());
        d.getVotes().add(1L);
    }
}
