package by.it.markelov.Level2;

public class GeneratorOfCollections {

    public static CollectionOfTracks generateCollectionOfTracks(int amountOfTracks, int minTrackDuration,
                                                                int maxTrackDuration) {
        CollectionOfTracks collectionOfTracks = new CollectionOfTracks();
        String nameOfTrack = "Track: ";
        for (int i = 0; i < amountOfTracks; i++) {
            collectionOfTracks.add(new Track(nameOfTrack + i, minTrackDuration, maxTrackDuration));
        }
        return collectionOfTracks;
    }

    public static CollectionOfAlbums generateCollectionOfAlbums(int n, int m, int minLength,
                                                                int maxLength) {

        CollectionOfAlbums collectionOfAlbums = new CollectionOfAlbums();
        String nameOfAlbum = "Album: ";
        for (int i = 0; i < n; i++) {
            CollectionOfTracks collectionOfTracks = generateCollectionOfTracks(m, minLength, maxLength);
            collectionOfAlbums.add(new Album(nameOfAlbum, collectionOfTracks));
        }
        return collectionOfAlbums;
    }
}
