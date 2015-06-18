package edu.buffalo.cse.cse486586.simpledynamo;

/**
 * Created by seongsu on 2015-04-21.
 */
public class TargetCursor {
    private String first;
    private String second;

    public TargetCursor(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
