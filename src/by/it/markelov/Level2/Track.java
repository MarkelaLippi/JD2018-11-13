package by.it.markelov.Level2;

public class Track {
    private String name;
    private double duration;

    public Track(String name, int minLength, int maxLength) {
        this.name = name;
        this.duration = minLength + (int) (Math.random() * (maxLength + 1));
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
