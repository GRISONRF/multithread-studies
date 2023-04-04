/*
*This class represents a wedding cake design and has a code, name, and a list of votes.
 */


import java.util.ArrayList;
import java.util.List;

public class Design {

    private int code;
    private String name;
    private List<Long> votes;

    public Design(int code, String name) {
        this.code = code;
        this.name = name;
        this.votes = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getVotes() {
        return votes;
    }

    public void setVotes(List<Long> votes) {
        this.votes = votes;
    }
}
