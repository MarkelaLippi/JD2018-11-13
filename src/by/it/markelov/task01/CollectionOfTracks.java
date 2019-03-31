package by.it.markelov.task01;

import java.util.ArrayList;

public class CollectionOfTracks {
    private ArrayList<Track> trackArrayList;

    public CollectionOfTracks() {
        trackArrayList = new ArrayList<>();
    }

    public CollectionOfTracks(ArrayList<Track> tracks) {
        trackArrayList = tracks;
    }

    public ArrayList<Track> getTrackArrayList() {
        return trackArrayList;
    }

    public void setTrackArrayList(ArrayList<Track> trackArrayList) {
        this.trackArrayList = trackArrayList;
    }

    public void add(Track track) {
        trackArrayList.add(track);
    }

}

