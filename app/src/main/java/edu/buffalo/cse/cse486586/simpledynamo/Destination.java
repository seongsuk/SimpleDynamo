package edu.buffalo.cse.cse486586.simpledynamo;

/**
 * Created by seongsu on 2015-04-18.
 */
public class Destination {
    int pred;
    int succ;
    int original;

    public Destination(int original, int pred, int succ) {
        this.pred = pred;
        this.succ = succ;
        this.original = original;
    }

    public int getOriginal() {
        return original;
    }

    public void setOriginal(int original) {
        this.original = original;
    }

    public int getPred() {
        return pred;
    }

    public void setPred(int pred) {
        this.pred = pred;
    }

    public int getSucc() {
        return succ;
    }

    public void setSucc(int succ) {
        this.succ = succ;
    }
}
