package by.it.markelov.task01;

public class Track {
    private String name;
    private int duration;

    public Track(String name, int minLength, int maxLength) {
        this.name = name;
        this.duration = Util.random(minLength, maxLength);
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


}
