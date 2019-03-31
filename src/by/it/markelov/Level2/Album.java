package by.it.markelov.Level2;

public class Album {
    private String name;
    private CollectionOfTracks collectionOfTracks;

    public Album(String name, CollectionOfTracks collectionOfTracks) {
        this.name = name;
        this.collectionOfTracks = collectionOfTracks;
    }

    public String getName() {
        return name;
    }

    public CollectionOfTracks getCollectionOfTracks() {
        return collectionOfTracks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollectionOfTracks(CollectionOfTracks collectionOfTracks) {
        this.collectionOfTracks = collectionOfTracks;
    }
}