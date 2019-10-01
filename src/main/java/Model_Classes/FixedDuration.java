package Model_Classes;

import java.util.Date;

public class FixedDuration extends Event {
    private int duration;
    private Date at;


    public FixedDuration(String description, Date at, int duration) {
        super(description, at);
        this.duration = duration;
    }


    @Override
    public String toString() {
        return super.toString() + " (done in: " + duration + " seconds )"; }
}