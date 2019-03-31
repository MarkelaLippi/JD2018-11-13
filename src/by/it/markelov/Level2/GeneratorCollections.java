package by.it.markelov.Level2;

public class GeneratorCollections {
    public static CollectionOfAlbums generatorAlbumCollection(int amountAlbums, int amountTracks, int minLength,
             int maxLength) {

        CollectionOfAlbums collectionOfAlbums = new CollectionOfAlbums();
        for (int i = 0; i < amountAlbums; i++) {
            CollectionOfTracks collectionOfTracks = new CollectionOfTracks();
            for (int j = 0; j < amountTracks; j++)
                collectionOfTracks.add(new Track("Track: " + j, minLength, maxLength));

        collectionOfAlbums.add(new Album("Album: "+i, collectionOfTracks));
        }
        return null;
    }
}
