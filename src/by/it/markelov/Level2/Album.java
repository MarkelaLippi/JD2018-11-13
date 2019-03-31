package by.it.markelov.Level2;

public class Album {
    private String name;
    private CollectionOfTracks collectionOfTrack;

    public Album(String name, CollectionOfTracks collectionOfTrack) {
        this.name = name;
        this.collectionOfTrack = collectionOfTrack;
    }

    public String getName() {
        return name;
    }

    public CollectionOfTracks getCollectionOfTrack() {
        return collectionOfTrack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollectionOfTrack(CollectionOfTracks collectionOfTrack) {
        this.collectionOfTrack = collectionOfTrack;
    }
}
